/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufc.projeto.visao;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import ufc.projeto.modelo.Logradouro;
import ufc.projeto.modelo.excecoes.LogradouroNaoPodeSerAdquiridoException;
import ufc.projeto.modelo.excecoes.LogradouroSemTaxaException;

/**
 *
 * @author Loopback
 */
public class PainelCobrarLogradouro extends PainelLogradouro {

    /**
     * Creates new form PCobrarlogradouro
     */
    
    private Logradouro logradouro;
    
    public PainelCobrarLogradouro(Logradouro logradouro) {
        super(logradouro);
        this.logradouro = logradouro;
        initComponents();
        preencherLabels();
    }
    
    
    private void preencherLabels(){
        try {
            JLNomeProprietario.setIcon(new ImageIcon(logradouro.obterProprietario().obterPerfil().obterUrlImagem()));
        } catch (LogradouroNaoPodeSerAdquiridoException ex) {
            Logger.getLogger(PainelCobrarLogradouro.class.getName()).log(Level.SEVERE, null, ex);
        }
        LJNome.setText(logradouro.obterNome());
        
        try {
            JLTaxa.setText(logradouro.obterTaxa()+"");
        } catch (LogradouroSemTaxaException ex) {
            Logger.getLogger(PainelCobrarLogradouro.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LJNome = new javax.swing.JLabel();
        JLNomeProprietario = new javax.swing.JLabel();
        BTContinuar = new javax.swing.JButton();
        JLModeloTaxa = new javax.swing.JLabel();
        LBModeloProprietario = new javax.swing.JLabel();
        JLTaxa = new javax.swing.JLabel();
        JLBackground = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(480, 310));
        setMinimumSize(new java.awt.Dimension(480, 310));
        setPreferredSize(new java.awt.Dimension(480, 310));
        setLayout(null);

        LJNome.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        LJNome.setText("LOGRADOURO");
        add(LJNome);
        LJNome.setBounds(80, 20, 190, 30);
        add(JLNomeProprietario);
        JLNomeProprietario.setBounds(260, 10, 170, 130);

        BTContinuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ufc/projeto/imagens/botoes/Continuar.jpg"))); // NOI18N
        BTContinuar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTContinuar.setMaximumSize(new java.awt.Dimension(104, 37));
        BTContinuar.setMinimumSize(new java.awt.Dimension(104, 37));
        BTContinuar.setPreferredSize(new java.awt.Dimension(104, 37));
        BTContinuar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTContinuarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTContinuarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTContinuarMouseExited(evt);
            }
        });
        add(BTContinuar);
        BTContinuar.setBounds(190, 250, 104, 37);

        JLModeloTaxa.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        JLModeloTaxa.setText("Você precisa pagar: ");
        add(JLModeloTaxa);
        JLModeloTaxa.setBounds(60, 180, 170, 20);

        LBModeloProprietario.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        LBModeloProprietario.setText("Proprietario");
        add(LBModeloProprietario);
        LBModeloProprietario.setBounds(170, 110, 110, 30);

        JLTaxa.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        JLTaxa.setText("152");
        add(JLTaxa);
        JLTaxa.setBounds(235, 182, 70, 14);

        JLBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ufc/projeto/imagens/background/PergaminhoDeMensagens.png"))); // NOI18N
        add(JLBackground);
        JLBackground.setBounds(0, 0, 480, 310);
    }// </editor-fold>//GEN-END:initComponents

    private void BTContinuarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTContinuarMouseEntered
        BTContinuar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    }//GEN-LAST:event_BTContinuarMouseEntered

    private void BTContinuarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTContinuarMouseExited
        BTContinuar.setBorder(null);
    }//GEN-LAST:event_BTContinuarMouseExited

    private void BTContinuarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTContinuarMouseClicked
        eventosDialogo.cliqueBotao1();
    }//GEN-LAST:event_BTContinuarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTContinuar;
    private javax.swing.JLabel JLBackground;
    private javax.swing.JLabel JLModeloTaxa;
    private javax.swing.JLabel JLNomeProprietario;
    private javax.swing.JLabel JLTaxa;
    private javax.swing.JLabel LBModeloProprietario;
    private javax.swing.JLabel LJNome;
    // End of variables declaration//GEN-END:variables
}
