/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ufc.projeto.visao;

import static java.lang.Thread.sleep;
import java.net.URL;
import java.util.ArrayList;
import ufc.projeto.visao.controlador.midia.ControladorDeAudio;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import ufc.projeto.visao.enumeracoes.Midia;
import ufc.projeto.modelo.Perfil;
import ufc.projeto.visao.enumeracoes.MidiaBotoes;

/**
 *
 * @author Robson Cavalcante
 */
public class SelecionaJogadoresGui extends javax.swing.JFrame {

    /**
     * Creates new form TelaConfigurarJogadores
     */
    
    private Iterator<Perfil> imagensJogador1;
    private Iterator<Perfil> imagensJogador2;
    private URL perfilJg1SelecionadoComparar;
    private URL perfilJg2SelecionadoComparar;
    private Perfil perfilSelecionadoJg1;
    private Perfil perfilSelecionadoJg2;
    
    public SelecionaJogadoresGui() {
        initComponents();
        setLocationRelativeTo(null);
    
        imagensJogador1 = new ImplePerfilEscolhaPersonagens().obterImagens();
        imagensJogador2 = new ImplePerfilEscolhaPersonagens().obterImagens();
        
        if(imagensJogador1.hasNext()){
            Perfil perfil = imagensJogador1.next();
            perfilJg1SelecionadoComparar = perfil.obterUrlImagem();
            perfilSelecionadoJg1 = perfil;
            imagemJogador1.setIcon(new ImageIcon(perfil.obterUrlImagem()));
            jLNomeDoPersonagem1.setIcon(new ImageIcon(perfil.obterUrlNome()));
            jLGifPersonagens1.setIcon(new ImageIcon(perfil.obterUtlGif().get(Midia.IMAGEM_GIF_FRENTE_MOVIMENTACAO_VALOR.obterValor())));
        }
        
        if(imagensJogador2.hasNext()){
            imagensJogador2.next();
            Perfil perfil = imagensJogador2.next();
            perfilSelecionadoJg2 = perfil;
            perfilJg2SelecionadoComparar = perfil.obterUrlImagem();
            imagemJogador2.setIcon(new ImageIcon(perfil.obterUrlImagem()));
            jLNomeDoPersonagem2.setIcon(new ImageIcon(perfil.obterUrlNome()));
            jLGifPersonagens2.setIcon(new ImageIcon(perfil.obterUtlGif().get(Midia.IMAGEM_GIF_FRENTE_MOVIMENTACAO_VALOR.obterValor())));
        }
        
            
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    private void ModificarPerfilJogador1(){
        if(imagensJogador1.hasNext()){
            Perfil perfil = imagensJogador1.next();
            if(!perfilJg2SelecionadoComparar.equals(perfil.obterUrlImagem())){
                perfilJg1SelecionadoComparar = perfil.obterUrlImagem();
                perfilSelecionadoJg1 = perfil;
                imagemJogador1.setIcon(new ImageIcon(perfil.obterUrlImagem()));
                jLNomeDoPersonagem1.setIcon(new ImageIcon(perfil.obterUrlNome()));
                jLGifPersonagens1.setIcon(new ImageIcon(perfil.obterUtlGif().get(Midia.IMAGEM_GIF_FRENTE_MOVIMENTACAO_VALOR.obterValor())));
            }else{
                ModificarPerfilJogador1();
            }
        }
        else{
            imagensJogador1 = new ImplePerfilEscolhaPersonagens().obterImagens();
            Perfil perfil = imagensJogador1.next();
            if(!perfilJg2SelecionadoComparar.equals(perfil.obterUrlImagem())){
                perfilJg1SelecionadoComparar = perfil.obterUrlImagem();
                perfilSelecionadoJg2 = perfil;
                imagemJogador1.setIcon(new ImageIcon(perfil.obterUrlImagem()));
                jLNomeDoPersonagem1.setIcon(new ImageIcon(perfil.obterUrlNome()));
                jLGifPersonagens1.setIcon(new ImageIcon(perfil.obterUtlGif().get(Midia.IMAGEM_GIF_FRENTE_MOVIMENTACAO_VALOR.obterValor())));
            }else{
                ModificarPerfilJogador1();
            }
        }
    }
    
        
    private void ModificarPerfilJogador2(){
        if(imagensJogador2.hasNext()){
            Perfil perfil = imagensJogador2.next();
            if(!perfilJg1SelecionadoComparar.equals(perfil.obterUrlImagem())){
                perfilJg2SelecionadoComparar = perfil.obterUrlImagem();
                perfilSelecionadoJg1 = perfil;
                imagemJogador2.setIcon(new ImageIcon(perfil.obterUrlImagem()));
                jLNomeDoPersonagem2.setIcon(new ImageIcon(perfil.obterUrlNome()));
                jLGifPersonagens2.setIcon(new ImageIcon(perfil.obterUtlGif().get(Midia.IMAGEM_GIF_FRENTE_MOVIMENTACAO_VALOR.obterValor())));
            }else{
                ModificarPerfilJogador2();
            }
        }else{
            imagensJogador2 = new ImplePerfilEscolhaPersonagens().obterImagens();
            Perfil perfil = imagensJogador2.next();
            if(!perfilJg1SelecionadoComparar.equals(perfil.obterUrlImagem())){
                perfilJg2SelecionadoComparar = perfil.obterUrlImagem();
                perfilSelecionadoJg2 = perfil;
                imagemJogador2.setIcon(new ImageIcon(perfil.obterUrlImagem()));
                jLNomeDoPersonagem2.setIcon(new ImageIcon(perfil.obterUrlNome()));
                jLGifPersonagens2.setIcon(new ImageIcon(perfil.obterUtlGif().get(Midia.IMAGEM_GIF_FRENTE_MOVIMENTACAO_VALOR.obterValor())));
            }else{
                ModificarPerfilJogador2();
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLGifPersonagens1 = new javax.swing.JLabel();
        jLGifPersonagens2 = new javax.swing.JLabel();
        jLNomeDoPersonagem2 = new javax.swing.JLabel();
        jLNomeDoPersonagem1 = new javax.swing.JLabel();
        btVoltar = new javax.swing.JButton();
        btIniciar = new javax.swing.JButton();
        btProximaImagemJogador1 = new javax.swing.JButton();
        btProximaImagemJogador2 = new javax.swing.JButton();
        imagemJogador2 = new javax.swing.JLabel();
        imagemJogador1 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1376, 728));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jLGifPersonagens1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ufc/projeto/imagens/personagens/FrodoMGifFrente.gif"))); // NOI18N
        getContentPane().add(jLGifPersonagens1);
        jLGifPersonagens1.setBounds(260, 70, 50, 85);

        jLGifPersonagens2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ufc/projeto/imagens/personagens/ArwenMGifFrente.gif"))); // NOI18N
        getContentPane().add(jLGifPersonagens2);
        jLGifPersonagens2.setBounds(1090, 70, 50, 85);

        jLNomeDoPersonagem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ufc/projeto/imagens/background/ArwenNome.png"))); // NOI18N
        getContentPane().add(jLNomeDoPersonagem2);
        jLNomeDoPersonagem2.setBounds(1190, 230, 90, 20);

        jLNomeDoPersonagem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ufc/projeto/imagens/background/FrodoNome.png"))); // NOI18N
        getContentPane().add(jLNomeDoPersonagem1);
        jLNomeDoPersonagem1.setBounds(110, 230, 90, 20);

        btVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ufc/projeto/imagens/botoes/VoltarNormal.jpg"))); // NOI18N
        btVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btVoltarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btVoltarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btVoltarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btVoltarMouseReleased(evt);
            }
        });
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btVoltar);
        btVoltar.setBounds(1130, 580, 170, 50);

        btIniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ufc/projeto/imagens/botoes/JogarNormal.png"))); // NOI18N
        btIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btIniciarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btIniciarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btIniciarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btIniciarMouseReleased(evt);
            }
        });
        btIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIniciarActionPerformed(evt);
            }
        });
        getContentPane().add(btIniciar);
        btIniciar.setBounds(60, 580, 170, 50);

        btProximaImagemJogador1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ufc/projeto/imagens/botoes/setaBotaoPassar.jpg"))); // NOI18N
        btProximaImagemJogador1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btProximaImagemJogador1.setBorderPainted(false);
        btProximaImagemJogador1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btProximaImagemJogador1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btProximaImagemJogador1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btProximaImagemJogador1MouseExited(evt);
            }
        });
        btProximaImagemJogador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProximaImagemJogador1ActionPerformed(evt);
            }
        });
        getContentPane().add(btProximaImagemJogador1);
        btProximaImagemJogador1.setBounds(100, 270, 110, 30);

        btProximaImagemJogador2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ufc/projeto/imagens/botoes/setaBotaoPassar.jpg"))); // NOI18N
        btProximaImagemJogador2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btProximaImagemJogador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProximaImagemJogador2ActionPerformed(evt);
            }
        });
        getContentPane().add(btProximaImagemJogador2);
        btProximaImagemJogador2.setBounds(1180, 270, 110, 30);

        imagemJogador2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ufc/projeto/imagens/personagens/Arwen.png"))); // NOI18N
        getContentPane().add(imagemJogador2);
        imagemJogador2.setBounds(1130, 100, 170, 130);

        imagemJogador1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ufc/projeto/imagens/personagens/Frodo.png"))); // NOI18N
        getContentPane().add(imagemJogador1);
        imagemJogador1.setBounds(50, 100, 190, 140);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ufc/projeto/imagens/background/TelaDeSeleçãoDePersonagens.png"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 1380, 730);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIniciarActionPerformed
        btIniciar.setIcon(new ImageIcon(getClass().getResource(MidiaBotoes.IMAGEM_JOGAR_ESCURO.obterCaminho())));
        
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    new ControladorDeAudio(MidiaBotoes.CAMINHO_SOM_BOTAO_MADEIRA.obterCaminho()).start();
                    Thread.sleep(MidiaBotoes.TEMPO_CRIAR_SOM_BOTAO.obterValor());
                    btIniciar.setIcon(new ImageIcon(getClass().getResource(MidiaBotoes.IMAGEM_JOGAR_NORMAL.obterCaminho())));
                    
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
                    List<Perfil> lista = new ArrayList<>();
                    lista.add(perfilSelecionadoJg1);
                    lista.add(perfilSelecionadoJg2);
                    dispose();
                   //new  DialogoFimDeJogo(null, perfilSelecionadoJg1);
                    new BancoImobiliarioGui(lista).setVisible(true);
                } catch (InterruptedException ex) {
                    Logger.getLogger(InicioGui.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();
    }//GEN-LAST:event_btIniciarActionPerformed

    private void btIniciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btIniciarMouseEntered
        btIniciar.setIcon(new ImageIcon(getClass().getResource(MidiaBotoes.IMAGEM_JOGAR_CLARO.obterCaminho())));
    }//GEN-LAST:event_btIniciarMouseEntered

    private void btIniciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btIniciarMouseExited
        btIniciar.setIcon(new ImageIcon(getClass().getResource(MidiaBotoes.IMAGEM_JOGAR_NORMAL.obterCaminho())));
    }//GEN-LAST:event_btIniciarMouseExited

    private void btIniciarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btIniciarMousePressed
        
    }//GEN-LAST:event_btIniciarMousePressed

    private void btIniciarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btIniciarMouseReleased
        
    }//GEN-LAST:event_btIniciarMouseReleased

    private void btProximaImagemJogador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProximaImagemJogador2ActionPerformed
        ModificarPerfilJogador2();
    }//GEN-LAST:event_btProximaImagemJogador2ActionPerformed

    private void btProximaImagemJogador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProximaImagemJogador1ActionPerformed
        ModificarPerfilJogador1();
    }//GEN-LAST:event_btProximaImagemJogador1ActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
         btVoltar.setIcon(new ImageIcon(getClass().getResource(MidiaBotoes.IMAGEM_VOLTAR_ESCURO.obterCaminho())));
        
          new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    new ControladorDeAudio(MidiaBotoes.CAMINHO_SOM_BOTAO_MADEIRA.obterCaminho()).start();
                    Thread.sleep(MidiaBotoes.CAMINHO_SOM_BOTAO_MADEIRA.obterValor());
                    btVoltar.setIcon(new ImageIcon(getClass().getResource(MidiaBotoes.IMAGEM_VOLTAR_NORMAL.obterCaminho())));
                    dispose();
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
                    new InicioGui().setVisible(true);
                } catch (InterruptedException ex) {
                    Logger.getLogger(InicioGui.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btVoltarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btVoltarMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btVoltarMouseReleased

    private void btVoltarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btVoltarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btVoltarMousePressed

    private void btVoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btVoltarMouseExited
         btVoltar.setIcon(new ImageIcon(getClass().getResource(MidiaBotoes.IMAGEM_VOLTAR_NORMAL.obterCaminho())));
    }//GEN-LAST:event_btVoltarMouseExited

    private void btVoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btVoltarMouseEntered
        btVoltar.setIcon(new ImageIcon(getClass().getResource(MidiaBotoes.IMAGEM_VOLTAR_CLARO.obterCaminho())));
    }//GEN-LAST:event_btVoltarMouseEntered

    private void btProximaImagemJogador1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btProximaImagemJogador1MouseEntered
        btProximaImagemJogador1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    }//GEN-LAST:event_btProximaImagemJogador1MouseEntered

    private void btProximaImagemJogador1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btProximaImagemJogador1MouseExited
        btProximaImagemJogador1.setBorder(null);
    }//GEN-LAST:event_btProximaImagemJogador1MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btIniciar;
    private javax.swing.JButton btProximaImagemJogador1;
    private javax.swing.JButton btProximaImagemJogador2;
    private javax.swing.JButton btVoltar;
    private javax.swing.JLabel imagemJogador1;
    private javax.swing.JLabel imagemJogador2;
    private javax.swing.JLabel jLGifPersonagens1;
    private javax.swing.JLabel jLGifPersonagens2;
    private javax.swing.JLabel jLNomeDoPersonagem1;
    private javax.swing.JLabel jLNomeDoPersonagem2;
    // End of variables declaration//GEN-END:variables
}
