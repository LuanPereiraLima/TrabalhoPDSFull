package ufc.projeto.visao.dialogos;

import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import ufc.projeto.excecoes.LogradouroSemPrecoException;
import ufc.projeto.modelo.Logradouro;


public class PainelVendaLogradouro extends PainelLogradouro{

    private JButton comprar;
    private JButton cancelar;
    private Logradouro logradouro;
    private JLabel JLNomeLogradouro, JLInformacao, JLValor, imagemDeFundo;
    private JTextArea JTADescricao;


    public PainelVendaLogradouro(Logradouro logradouro) {
            super(logradouro);
            this.logradouro = logradouro;
            iniciarComponentes();
    }
    
    public void eventoBotaoComprar(MouseEvent evt){
        eventosDialogo.cliqueBotao1();
    }
    
    public void eventoBotaoNComprar(MouseEvent evt){
        eventosDialogo.cliqueBotao2();
    }
                        
   private void iniciarComponentes() {

        cancelar = new javax.swing.JButton();
        JLNomeLogradouro = new javax.swing.JLabel();
        JLInformacao = new javax.swing.JLabel();
        JTADescricao = new javax.swing.JTextArea();
        JLValor = new javax.swing.JLabel();
        comprar = new javax.swing.JButton();
        imagemDeFundo = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(480, 310));
        setMinimumSize(new java.awt.Dimension(480, 310));
        setPreferredSize(new java.awt.Dimension(480, 310));
        setLayout(null);

        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ufc/projeto/imagens/botoes/NaoComprarDoPergaminho.png"))); // NOI18N
        cancelar.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                eventosDialogo.cliqueBotao2();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                cancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                cancelar.setBorder(null);
            }
        });
        add(cancelar);
        cancelar.setBounds(250, 240, 122, 37);

        JLNomeLogradouro.setText(""+logradouro.obterNome());
        try {
            JLValor.setText(""+logradouro.obterPreco());
        } catch (LogradouroSemPrecoException ex) {
            Logger.getLogger(PainelVendaLogradouro.class.getName()).log(Level.SEVERE, null, ex);
        }
        JTADescricao.setText(logradouro.obterDescriao());
        add(JLNomeLogradouro);
        JLNomeLogradouro.setBounds(124, 20, 250, 14);

        JLInformacao.setText("Preço:");
        add(JLInformacao);
        JLInformacao.setBounds(120, 170, 40, 14);

        JTADescricao.setEditable(false);
        JTADescricao.setColumns(20);
        JTADescricao.setLineWrap(true);
        JTADescricao.setRows(5);
        add(JTADescricao);
        JTADescricao.setBounds(120, 50, 260, 94);
        add(JLValor);
        JLValor.setBounds(170, 170, 60, 15);

        comprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ufc/projeto/imagens/botoes/ComprarDoPergaminho.jpg"))); // NOI18N
        comprar.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                eventosDialogo.cliqueBotao1();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                comprar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                comprar.setBorder(null);
            }
        });
        add(comprar);
        comprar.setBounds(130, 240, 104, 37);

        imagemDeFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ufc/projeto/imagens/background/PergaminhoDeMensagens.png"))); // NOI18N
        add(imagemDeFundo);
        imagemDeFundo.setBounds(0, 0, 480, 310);
    }// </editor-fold>
        
}
