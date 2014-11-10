/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufc.projeto.visao;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import ufc.projeto.modelo.Perfil;
import ufc.projeto.visao.enumeracoes.Midia;
import ufc.projeto.visao.enumeracoes.MidiaBotoes;

/**
 *
 * @author Loopback
 */
public class PainelFimDeJogo extends javax.swing.JPanel {
    private final EventosDialogo mEventosDialogo;
    private final Perfil perfil;
    /**
     * Creates new form PainelDialogoFimDeJogo
     */
    public PainelFimDeJogo(Perfil perfil, EventosDialogo eventosDialogo) {
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
                    Logger.getLogger(PainelFimDeJogo.class.getName()).log(Level.SEVERE, null, ex);
                }
                    JLImagemGif.setLocation(JLImagemGif.getX()+1, JLImagemGif.getY());
  
                    if(JLImagemGif.getX()==980)
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
                        Logger.getLogger(PainelFimDeJogo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    JLImagemGif.setLocation(JLImagemGif.getX()-1, JLImagemGif.getY());
                    
                        if(JLImagemGif.getX()==390)
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

        btJogarNovamente = new javax.swing.JButton();
        btSairDoJogo = new javax.swing.JButton();
        JLImagemNome = new javax.swing.JLabel();
        JLImagemGif = new javax.swing.JLabel();
        JLImagemCampeao = new javax.swing.JLabel();
        JLMensagem = new javax.swing.JLabel();
        JLBackground = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1376, 728));
        setMinimumSize(new java.awt.Dimension(1376, 728));
        setPreferredSize(new java.awt.Dimension(1376, 728));
        setLayout(null);

        btJogarNovamente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ufc/projeto/imagens/botoes/JogarNovamenteNormal.png"))); // NOI18N
        btJogarNovamente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btJogarNovamente.setPreferredSize(new java.awt.Dimension(260, 50));
        btJogarNovamente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btJogarNovamenteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btJogarNovamenteMouseExited(evt);
            }
        });
        btJogarNovamente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btJogarNovamenteActionPerformed(evt);
            }
        });
        add(btJogarNovamente);
        btJogarNovamente.setBounds(450, 630, 260, 50);

        btSairDoJogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ufc/projeto/imagens/botoes/SairDoJogoNormal.png"))); // NOI18N
        btSairDoJogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSairDoJogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSairDoJogoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btSairDoJogoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btSairDoJogoMouseExited(evt);
            }
        });
        add(btSairDoJogo);
        btSairDoJogo.setBounds(720, 630, 260, 50);
        add(JLImagemNome);
        JLImagemNome.setBounds(510, 160, 100, 30);
        add(JLImagemGif);
        JLImagemGif.setBounds(390, 410, 50, 80);
        add(JLImagemCampeao);
        JLImagemCampeao.setBounds(370, 160, 180, 170);

        JLMensagem.setFont(new java.awt.Font("Trajan Pro", 1, 36)); // NOI18N
        JLMensagem.setText("<html>Parabéns!<br>Você Ganhou <br> o Jogo</html>");
        add(JLMensagem);
        JLMensagem.setBounds(770, 160, 240, 220);

        JLBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ufc/projeto/imagens/background/backgroundFimDeJogo.jpg"))); // NOI18N
        add(JLBackground);
        JLBackground.setBounds(0, 0, 1376, 720);
    }// </editor-fold>//GEN-END:initComponents

    private void btSairDoJogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSairDoJogoMouseClicked
        btSairDoJogo.setIcon(new ImageIcon(getClass().getResource(MidiaBotoes.IMAGEM_JOGAR_NOVAMENTE_ESCURO.obterCaminho())));
        new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    Thread.sleep(MidiaBotoes.TEMPO_CRIAR_SOM_BOTAO.obterValor());
                    mEventosDialogo.cliqueBotao2();
                } catch (InterruptedException ex) {
                    Logger.getLogger(PainelFimDeJogo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();
    }//GEN-LAST:event_btSairDoJogoMouseClicked

    private void btJogarNovamenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btJogarNovamenteActionPerformed
        btJogarNovamente.setIcon(new ImageIcon(getClass().getResource(MidiaBotoes.IMAGEM_JOGAR_NOVAMENTE_ESCURO.obterCaminho())));
        mEventosDialogo.cliqueBotao1();
    }//GEN-LAST:event_btJogarNovamenteActionPerformed

    private void btJogarNovamenteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btJogarNovamenteMouseEntered
        btJogarNovamente.setIcon(new ImageIcon(getClass().getResource(MidiaBotoes.IMAGEM_JOGAR_NOVAMENTE_CLARO.obterCaminho())));
    }//GEN-LAST:event_btJogarNovamenteMouseEntered

    private void btJogarNovamenteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btJogarNovamenteMouseExited
        btJogarNovamente.setIcon(new ImageIcon(getClass().getResource(MidiaBotoes.IMAGEM_JOGAR_NOVAMENTE_NORMAL.obterCaminho())));
    }//GEN-LAST:event_btJogarNovamenteMouseExited

    private void btSairDoJogoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSairDoJogoMouseEntered
        btSairDoJogo.setIcon(new ImageIcon(getClass().getResource(MidiaBotoes.IMAGEM_SAIR_JOGO_CLARO.obterCaminho())));
    }//GEN-LAST:event_btSairDoJogoMouseEntered

    private void btSairDoJogoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSairDoJogoMouseExited
        btSairDoJogo.setIcon(new ImageIcon(getClass().getResource(MidiaBotoes.IMAGEM_SAIR_JOGO_NORMAL.obterCaminho())));
    }//GEN-LAST:event_btSairDoJogoMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLBackground;
    private javax.swing.JLabel JLImagemCampeao;
    private javax.swing.JLabel JLImagemGif;
    private javax.swing.JLabel JLImagemNome;
    private javax.swing.JLabel JLMensagem;
    private javax.swing.JButton btJogarNovamente;
    private javax.swing.JButton btSairDoJogo;
    // End of variables declaration//GEN-END:variables
}