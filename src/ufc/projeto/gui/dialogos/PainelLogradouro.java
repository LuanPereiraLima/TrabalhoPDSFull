package ufc.projeto.gui.dialogos;
import javax.swing.JPanel;
import ufc.projeto.modelo.Logradouro;


public abstract class PainelLogradouro extends JPanel{
	protected EventosDialogo eventosDialogo;
	
	public PainelLogradouro(Logradouro logradouro) {
		this.eventosDialogo = null;
	}
	
	public void setarEventosDialogo(EventosDialogo eventosDialogo){
		this.eventosDialogo = eventosDialogo;
	}
}
