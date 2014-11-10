/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ufc.projeto.visao;

import static java.lang.Thread.sleep;
import ufc.projeto.visao.controlador.midia.ControladorDeAudio;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import ufc.projeto.visao.enumeracoes.MidiaBotoes;
import ufc.projeto.visao.enumeracoes.MidiaSomFundo;

/**
 *
 * @author Robson Cavalcante
 */
public class InicioGui extends javax.swing.JFrame {

    /**
     * Creates new form telaInicial
     */
    
    private ControladorDeAudio controladorDeAudio;
    
    public InicioGui() {
        initComponents();
        setLocationRelativeTo(null);
        
        controladorDeAudio = new ControladorDeAudio(MidiaSomFundo.SOM_FUNDO_PRIMEIRA_TELA.obterCaminho());
        
        controladorDeAudio.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btSair = new javax.swing.JButton();
        btJogar = new javax.swing.JButton();
        jBBotaoCreditos = new javax.swing.JButton();
        jLCaixaMadeira = new javax.swing.JLabel();
        backGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setMinimumSize(new java.awt.Dimension(1376, 728));
        setUndecorated(true);
        getContentPane().setLayout(null);

        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ufc/projeto/imagens/botoes/SairNormal.png"))); // NOI18N
        btSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSairMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btSairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btSairMouseExited(evt);
            }
        });
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });
        getContentPane().add(btSair);
        btSair.setBounds(990, 440, 170, 50);

        btJogar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ufc/projeto/imagens/botoes/JogarNormal.png"))); // NOI18N
        btJogar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btJogarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btJogarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btJogarMousePressed(evt);
            }
        });
        btJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btJogarActionPerformed(evt);
            }
        });
        getContentPane().add(btJogar);
        btJogar.setBounds(990, 310, 170, 50);

        jBBotaoCreditos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ufc/projeto/imagens/botoes/CreditosNormal.png"))); // NOI18N
        jBBotaoCreditos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBBotaoCreditosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBBotaoCreditosMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jBBotaoCreditosMouseReleased(evt);
            }
        });
        jBBotaoCreditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBotaoCreditosActionPerformed(evt);
            }
        });
        getContentPane().add(jBBotaoCreditos);
        jBBotaoCreditos.setBounds(990, 370, 170, 50);

        jLCaixaMadeira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ufc/projeto/imagens/background/CaixaDaTelaDeEntrada.jpg"))); // NOI18N
        jLCaixaMadeira.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLCaixaMadeira);
        jLCaixaMadeira.setBounds(920, 240, 300, 320);

        backGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ufc/projeto/imagens/background/backgroundInicio.jpg"))); // NOI18N
        backGround.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(backGround);
        backGround.setBounds(0, 0, 1376, 730);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btJogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btJogarActionPerformed
        btJogar.setIcon(new ImageIcon(getClass().getResource(MidiaBotoes.IMAGEM_JOGAR_ESCURO.obterCaminho())));
        
          new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    new ControladorDeAudio(MidiaBotoes.CAMINHO_SOM_BOTAO_MADEIRA.obterCaminho()).start();
                    Thread.sleep(300);
                    btJogar.setIcon(new ImageIcon(getClass().getResource(MidiaBotoes.IMAGEM_JOGAR_NORMAL.obterCaminho())));
                } catch (InterruptedException ex) {
                    Logger.getLogger(SelecionaJogadoresGui.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();
          
          new Thread(new Runnable() {
          @Override
            public void run() {
               try {
                    sleep(500);
                    controladorDeAudio.stop();
                    dispose();
                    new SelecionaJogadoresGui().setVisible(true);
                    
                } catch (InterruptedException ex) {
                    Logger.getLogger(InicioGui.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
          }).start();
          
    }//GEN-LAST:event_btJogarActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        btSair.setIcon(new ImageIcon(getClass().getResource(MidiaBotoes.IMAGEM_SAIR_ESCURO.obterCaminho())));  
        
          new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    new ControladorDeAudio(MidiaBotoes.CAMINHO_SOM_BOTAO_MADEIRA.obterCaminho()).start();
                    Thread.sleep(MidiaBotoes.TEMPO_CRIAR_SOM_BOTAO.obterValor());
                    System.exit(0);
                } catch (InterruptedException ex) {
                    Logger.getLogger(SelecionaJogadoresGui.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();
        
    }//GEN-LAST:event_btSairActionPerformed
        
    private void btSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSairMouseEntered
         btSair.setIcon(new ImageIcon(getClass().getResource(MidiaBotoes.IMAGEM_SAIR_CLARO.obterCaminho())));
    }//GEN-LAST:event_btSairMouseEntered

    private void btSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSairMouseExited
         btSair.setIcon(new ImageIcon(getClass().getResource(MidiaBotoes.IMAGEM_SAIR_NORMAL.obterCaminho())));
    }//GEN-LAST:event_btSairMouseExited

    private void btJogarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btJogarMouseEntered
        btJogar.setIcon(new ImageIcon(getClass().getResource(MidiaBotoes.IMAGEM_JOGAR_CLARO.obterCaminho())));
    }//GEN-LAST:event_btJogarMouseEntered

    private void btJogarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btJogarMouseExited
        btJogar.setIcon(new ImageIcon(getClass().getResource(MidiaBotoes.IMAGEM_JOGAR_NORMAL.obterCaminho())));
    }//GEN-LAST:event_btJogarMouseExited

    private void btJogarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btJogarMousePressed

    }//GEN-LAST:event_btJogarMousePressed

    private void jBBotaoCreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBotaoCreditosActionPerformed
          jBBotaoCreditos.setIcon(new ImageIcon(getClass().getResource(MidiaBotoes.IMAGEM_CREDITO_ESCURO.obterCaminho())));
        
          new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    new ControladorDeAudio(MidiaBotoes.CAMINHO_SOM_BOTAO_MADEIRA.obterCaminho()).start();
                    Thread.sleep(300);
                    jBBotaoCreditos.setIcon(new ImageIcon(getClass().getResource(MidiaBotoes.IMAGEM_CREDITO_NORMAL.obterCaminho())));
                } catch (InterruptedException ex) {
                    Logger.getLogger(SelecionaJogadoresGui.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();
            
          new Thread(new Runnable() {

            @Override
            public void run() {
               try {
                    sleep(500);
                    new CreditosGui().setVisible(true);
                } catch (InterruptedException ex) {
                    Logger.getLogger(InicioGui.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();
    }//GEN-LAST:event_jBBotaoCreditosActionPerformed

    private void jBBotaoCreditosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBBotaoCreditosMouseReleased
       
    }//GEN-LAST:event_jBBotaoCreditosMouseReleased

    private void jBBotaoCreditosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBBotaoCreditosMouseEntered
        jBBotaoCreditos.setIcon(new ImageIcon(getClass().getResource(MidiaBotoes.IMAGEM_CREDITO_CLARO.obterCaminho())));
    }//GEN-LAST:event_jBBotaoCreditosMouseEntered

    private void jBBotaoCreditosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBBotaoCreditosMouseExited
        jBBotaoCreditos.setIcon(new ImageIcon(getClass().getResource(MidiaBotoes.IMAGEM_CREDITO_NORMAL.obterCaminho())));
    }//GEN-LAST:event_jBBotaoCreditosMouseExited

    private void btSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSairMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btSairMouseClicked
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InicioGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new InicioGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backGround;
    private javax.swing.JButton btJogar;
    private javax.swing.JButton btSair;
    private javax.swing.JButton jBBotaoCreditos;
    private javax.swing.JLabel jLCaixaMadeira;
    // End of variables declaration//GEN-END:variables
}
