/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufc.projeto.visao;

import java.awt.GraphicsEnvironment;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import ufc.projeto.visao.controlador.midia.ControladorDeAudio;
import ufc.projeto.visao.enumeracoes.MidiaBotoes;

/**
 *
 * @author Loopback
 */
public class CreditosGui extends javax.swing.JFrame {

    /**
     * Creates new form CreditosGui
     */
    public CreditosGui() {
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
        JLBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1376, 728));
        setUndecorated(true);
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
        getContentPane().add(JBVoltar);
        JBVoltar.setBounds(930, 460, 115, 35);

        JLBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ufc/projeto/imagens/background/Creditos.jpg"))); // NOI18N
        getContentPane().add(JLBackground);
        JLBackground.setBounds(0, 0, 1376, 730);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBVoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBVoltarMouseEntered
       JBVoltar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    }//GEN-LAST:event_JBVoltarMouseEntered

    private void JBVoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBVoltarMouseExited
       JBVoltar.setBorder(null);
    }//GEN-LAST:event_JBVoltarMouseExited

    private void JBVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBVoltarMouseClicked
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    new ControladorDeAudio(MidiaBotoes.CAMINHO_SOM_BOTAO_MADEIRA.obterCaminho()).start();
                    Thread.sleep(300);
                } catch (InterruptedException ex) {
                    Logger.getLogger(SelecionaJogadoresGui.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();
        
        dispose();
        
    }//GEN-LAST:event_JBVoltarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBVoltar;
    private javax.swing.JLabel JLBackground;
    // End of variables declaration//GEN-END:variables
}
