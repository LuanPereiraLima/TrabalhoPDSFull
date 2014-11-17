package ufc.projeto.visao;
import java.awt.Point;
import javax.swing.JDialog;
import javax.swing.JFrame;
import ufc.projeto.modelo.Logradouro;


public abstract class DialogoLogradouro extends JDialog implements EventosDialogo{
	private boolean confirmacao;
	
	public DialogoLogradouro(JFrame telaPorTras,PainelLogradouro painel, Logradouro logradouro) {
            super(telaPorTras);
            painel.setarEventosDialogo(this);
            this.setContentPane(painel);
            iniciarComponentes();
	}
	
	public boolean obterConfirmacao(){
            return this.confirmacao;
	}

	@Override
	public void cliqueBotao1() {
            this.confirmacao = true;
            this.dispose();
	}

	@Override
	public void cliqueBotao2() {
            this.confirmacao = false;
            this.dispose();
	}
        
        private void iniciarComponentes(){
            this.setModal(true);
            this.setSize(480, 310);
            this.setLocationRelativeTo(null);
            this.setUndecorated(true);
            this.setVisible(true);
            this.pack(); 
        }
}
