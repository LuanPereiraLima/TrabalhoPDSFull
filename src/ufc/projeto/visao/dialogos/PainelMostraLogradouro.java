package ufc.projeto.visao.dialogos;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import ufc.projeto.modelo.Logradouro;


public class PainelMostraLogradouro extends PainelLogradouro{
        
        private JButton continuar;
        private JLabel JLNomeLogradouro, imagemDeFundo;
        private JTextArea JTADescricao;
        private Logradouro logradouro;
    
	public PainelMostraLogradouro(Logradouro logradouro) {
		super(logradouro);
                this.logradouro = logradouro;
                inicializaComponentes();
	}
        
        private void inicializaComponentes(){

        continuar = new javax.swing.JButton();
        JLNomeLogradouro = new javax.swing.JLabel();
        JTADescricao = new javax.swing.JTextArea();
        imagemDeFundo = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(480, 310));
        setMinimumSize(new java.awt.Dimension(480, 310));
        setPreferredSize(new java.awt.Dimension(480, 310));
        setLayout(null);

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
        continuar.setBounds(190, 250, 104, 37);

        JLNomeLogradouro.setText(logradouro.obterNome());
        JTADescricao.setText(logradouro.obterDescriao());
        
        add(JLNomeLogradouro);
        JLNomeLogradouro.setBounds(124, 20, 250, 14);

        JTADescricao.setEditable(false);
        JTADescricao.setColumns(20);
        JTADescricao.setLineWrap(true);
        JTADescricao.setRows(5);
        add(JTADescricao);
        JTADescricao.setBounds(120, 50, 260, 94);

        imagemDeFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ufc/projeto/imagens/background/PergaminhoDeMensagens.png"))); // NOI18N
        add(imagemDeFundo);
        imagemDeFundo.setBounds(0, 0, 480, 310);
    }    
}
