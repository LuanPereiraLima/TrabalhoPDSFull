package ufc.projeto.gui.dialogos;

import javax.swing.JFrame;
import ufc.projeto.gui.enumeracoes.Dialogos;
import ufc.projeto.modelo.Logradouro;

public class DialogoCobrarLogradouro extends DialogoLogradouro{
    public DialogoCobrarLogradouro(JFrame telaPorTras,Logradouro logradouro) {
        super(telaPorTras, new FabricaPainelDialogo().obterDialogo(Dialogos.DIALOGO_COBRAR_TAXA.obterValor(),logradouro), logradouro);
    }
}