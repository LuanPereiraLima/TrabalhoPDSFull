package ufc.projeto.gui.dialogos;

import javax.swing.JFrame;
import ufc.projeto.gui.enumeracoes.Dialogos;
import ufc.projeto.modelo.Logradouro;

public class DialogoMostrarLogradouro extends DialogoLogradouro{
    public DialogoMostrarLogradouro(JFrame telaPorTras,Logradouro logradouro) {
        super(telaPorTras, new FabricaPainelDialogo().obterDialogo(Dialogos.DIALOGO_MOSTRAR_INFORMACAO.obterValor(),logradouro), logradouro);
    }
}
