package ufc.projeto.gui.dialogos;

import javax.swing.JFrame;
import ufc.projeto.gui.enumeracoes.Dialogos;
import ufc.projeto.modelo.Logradouro;

public class DialogoVendaLogradouro extends DialogoLogradouro{

    public DialogoVendaLogradouro(JFrame telaPorTras, Logradouro logradouro) {
        super(telaPorTras,new FabricaPainelDialogo().obterDialogo(Dialogos.DIALOGO_VENDA_LOGRADOURO.obterValor(), logradouro), logradouro);
    }
}
