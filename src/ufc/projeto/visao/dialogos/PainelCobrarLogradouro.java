package ufc.projeto.visao.dialogos;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import ufc.projeto.excecoes.LogradouroSemTaxaException;
import ufc.projeto.modelo.Logradouro;


public class PainelCobrarLogradouro extends PainelLogradouro{
        
        private JButton continuar;
        private JLabel JLNomeLogradouro, imagemDeFundo, JLInformacao, JLValor;
        private JTextArea JTADescricao;
        private Logradouro logradouro;
    
	public PainelCobrarLogradouro(Logradouro logradouro) {
		super(logradouro);
                this.logradouro = logradouro;
                inicializaComponentes();
	}
        
        private void inicializaComponentes(){

        JLNomeLogradouro = new javax.swing.JLabel();
        JLInformacao = new javax.swing.JLabel();
        JTADescricao = new javax.swing.JTextArea();
        JLValor = new javax.swing.JLabel();
        continuar = new javax.swing.JButton();
        imagemDeFundo = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(480, 310));
        setMinimumSize(new java.awt.Dimension(480, 310));
        setPreferredSize(new java.awt.Dimension(480, 310));
        setLayout(null);

        JLNomeLogradouro.setText(logradouro.obterNome());
        JTADescricao.setText(logradouro.obterDescriao());
        add(JLNomeLogradouro);
        JLNomeLogradouro.setBounds(124, 20, 250, 14);

        JLInformacao.setText("Taxa a pagar:");
            try {
                JLValor.setText(logradouro.obterTaxa()+"");
            } catch (LogradouroSemTaxaException ex) {
                Logger.getLogger(PainelCobrarLogradouro.class.getName()).log(Level.SEVERE, null, ex);
            }
        add(JLInformacao);
        JLInformacao.setBounds(120, 170, 70, 20);

        JTADescricao.setEditable(false);
        JTADescricao.setColumns(20);
        JTADescricao.setLineWrap(true);
        JTADescricao.setRows(5);
        add(JTADescricao);
        JTADescricao.setBounds(120, 50, 260, 94);
        add(JLValor);
        JLValor.setBounds(200, 170, 60, 20);

        continuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ufc/projeto/imagens/botoes/Continuar.jpg"))); // NOI18N
        continuar.addMouseListener(new MouseListener() {

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
                continuar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                continuar.setBorder(null);
            }
        });
        add(continuar);
        continuar.setBounds(200, 240, 104, 37);

        imagemDeFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ufc/projeto/imagens/background/PergaminhoDeMensagens.png"))); // NOI18N
        add(imagemDeFundo);
        imagemDeFundo.setBounds(0, 0, 480, 310);
    }   
  
}
