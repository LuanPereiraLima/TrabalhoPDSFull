/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufc.projeto.visao;

import java.awt.GraphicsEnvironment;
import java.util.logging.Level;
import java.util.logging.Logger;
import ufc.projeto.visao.controlador.midia.ControladorDeAudio;
import ufc.projeto.visao.enumeracoes.MidiaBotoes;

/**
 *
 * @author Loopback
 */
public class AjudaGui extends javax.swing.JFrame {

    /**
     * Creates new form CreditosGui
     */
    public AjudaGui() {
        initComponents();
        setLocationRelativeTo(null);
          //funcao responsavel por redimensionar a tela de acordo com a resoloucao.
        GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDisplayMode() ;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBVoltar = new javax.swing.JButton();
        textoAjuda = new javax.swing.JLabel();
        JLBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(919, 727));
        setMinimumSize(new java.awt.Dimension(919, 727));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(919, 727));
        setResizable(false);
        getContentPane().setLayout(null);

        JBVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ufc/projeto/imagens/botoes/BotaoVoltar.png"))); // NOI18N
        JBVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBVoltarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBVoltarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBVoltarMouseExited(evt);
            }
        });
        JBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(JBVoltar);
        JBVoltar.setBounds(730, 650, 115, 35);

        textoAjuda.setText("<html><center><h1>Começando a jogar.</h1><br><h2>Você pode começar escolhendo a opção \"Jogar\" na primeira tela que lhe aparece, logo depois será mostrada uma tela com a escolha dos personagens, você pode usar as setas abaixo de cada um dos personagens mostrados para muda-lós de acordo com sua preferencia. <br> Logo depois aparecerá a tela de jogo, o lado esquerdo estará o jogador 1, e o direito o 2 com suas respectivas imagens.<br> Logo acima delas é mostrado dois campos com numeros, esses são os dados, são eles que decidem quantas casas você andará naquela partida.<br> Logo após escolher os valores clique no botão \"jogar rodada\".<br> Quando um personagem se movimenta, será mostrado uma tela que mostrará o efeito que a casa em que ele se encontra causará sobre ele.<br> Pode ser visualizado o que cada casa faz clicando com o mouse sobre elas.<br> Pode ser visualizado todas as posses do jogador em \"Posses\" que fica no lado esquerdo inferior para o jogador 1, e direito inferior para o jogador 2.</h2><center></html>");
        getContentPane().add(textoAjuda);
        textoAjuda.setBounds(120, 20, 700, 490);

        JLBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ufc/projeto/imagens/background/fundoAjuda.png"))); // NOI18N
        getContentPane().add(JLBackground);
        JLBackground.setBounds(0, 0, 919, 730);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBVoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBVoltarMouseEntered
       JBVoltar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    }//GEN-LAST:event_JBVoltarMouseEntered

    private void JBVoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBVoltarMouseExited
       JBVoltar.setBorder(null);
    }//GEN-LAST:event_JBVoltarMouseExited

    private void JBVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBVoltarMouseClicked
       
        
    }//GEN-LAST:event_JBVoltarMouseClicked

    private void JBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBVoltarActionPerformed
         new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    new ControladorDeAudio(MidiaBotoes.CAMINHO_SOM_BOTAO_MADEIRA.obterCaminho()).start();
                    Thread.sleep(300);
                    new InicioGui().setVisible(true);
                } catch (InterruptedException ex) {
                    Logger.getLogger(SelecionaJogadoresGui.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();
        
        dispose();
    }//GEN-LAST:event_JBVoltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBVoltar;
    private javax.swing.JLabel JLBackground;
    private javax.swing.JLabel textoAjuda;
    // End of variables declaration//GEN-END:variables
}
