/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufc.projeto.visao.dialogos;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import ufc.projeto.modelo.Perfil;
import ufc.projeto.visao.enumeracoes.Midia;

/**
 *
 * @author Loopback
 */
public class PainelDialogoFimDeJogo extends javax.swing.JPanel {
    private EventosDialogo mEventosDialogo;
    private Perfil perfil;
    /**
     * Creates new form PainelDialogoFimDeJogo
     */
    public PainelDialogoFimDeJogo(Perfil perfil, EventosDialogo eventosDialogo) {
        this.mEventosDialogo = eventosDialogo;
        this.perfil = perfil;
        initComponents();
        JLImagemCampeao.setIcon(new ImageIcon(perfil.obterUrlImagem()));
        JLImagemNome.setIcon(new ImageIcon(perfil.obterUrlNome()));
        JLImagemGif.setIcon(new ImageIcon(perfil.obterUtlGif().get(Midia.IMAGEM_GIF_DIREITA_MOVIMENTACAO_VALOR.obterValor())));
        personagemAndandoDireita();
    }
    
    private void personagemAndandoDireita(){
        new Thread(new Runnable() {
            @Override
            public void run() {
               JLImagemGif.setIcon(new ImageIcon(perfil.obterUtlGif().get(Midia.IMAGEM_GIF_DIREITA_MOVIMENTACAO_VALOR.obterValor())));
                while(true){
                     try {
                    Thread.sleep(5);
                } catch (InterruptedException ex) {
                    Logger.getLogger(PainelDialogoFimDeJogo.class.getName()).log(Level.SEVERE, null, ex);
                }
                    JLImagemGif.setLocation(JLImagemGif.getX()+1, JLImagemGif.getY());
  
                    if(JLImagemGif.getX()==1220)
                        break;
                }
                personagemAndandoEsquerda();
            }
        }).start();
    }
    
    private void personagemAndandoEsquerda(){
           new Thread(new Runnable() {
            @Override
            public void run() {
                JLImagemGif.setIcon(new ImageIcon(perfil.obterUtlGif().get(Midia.IMAGEM_GIF_ESQUERDA_MOVIMENTACAO_VALOR.obterValor())));
                while(true){
                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(PainelDialogoFimDeJogo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    JLImagemGif.setLocation(JLImagemGif.getX()-1, JLImagemGif.getY());
                    
                        if(JLImagemGif.getX()==120)
                            break;
                }
                personagemAndandoDireita();
            }
        }).start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        JLImagemGif = new javax.swing.JLabel();
        JLImagemCampeao = new javax.swing.JLabel();
        JLMensagem = new javax.swing.JLabel();
        JLImagemNome = new javax.swing.JLabel();
        JLBackground = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1376, 728));
        setMinimumSize(new java.awt.Dimension(1376, 728));
        setPreferredSize(new java.awt.Dimension(1376, 728));
        setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ufc/projeto/imagens/botoes/JogarNovamenteNormal.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(450, 630, 260, 50);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ufc/projeto/imagens/botoes/SairDoJogoNormal.png"))); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(720, 630, 260, 50);
        add(JLImagemGif);
        JLImagemGif.setBounds(130, 610, 50, 80);
        add(JLImagemCampeao);
        JLImagemCampeao.setBounds(200, 110, 190, 170);

        JLMensagem.setText("Parabéns! Você ganhou o jogo!");
        add(JLMensagem);
        JLMensagem.setBounds(423, 42, 151, 14);
        add(JLImagemNome);
        JLImagemNome.setBounds(340, 110, 100, 30);

        JLBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ufc/projeto/imagens/background/backgroundFimDeJogo.jpg"))); // NOI18N
        add(JLBackground);
        JLBackground.setBounds(0, 0, 1376, 720);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        mEventosDialogo.cliqueBotao2();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mEventosDialogo.cliqueBotao1();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLBackground;
    private javax.swing.JLabel JLImagemCampeao;
    private javax.swing.JLabel JLImagemGif;
    private javax.swing.JLabel JLImagemNome;
    private javax.swing.JLabel JLMensagem;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}
