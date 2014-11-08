package ufc.projeto.gui.dialogos;

import javax.swing.JFrame;
import ufc.projeto.gui.enumeracoes.Dialogos;
import ufc.projeto.modelo.Logradouro;

public class FabricaDialogo {
    public DialogoLogradouro obterDialogo(JFrame telaPorTras,int tipoInformacao, Logradouro logradouro){
        if(tipoInformacao == Dialogos.DIALOGO_VENDA_LOGRADOURO.obterValor())
            return new DialogoVendaLogradouro(telaPorTras, logradouro);
        if(tipoInformacao == Dialogos.DIALOGO_MOSTRAR_INFORMACAO.obterValor())
            return new DialogoMostrarLogradouro(telaPorTras, logradouro);
        if(tipoInformacao == Dialogos.DIALOGO_COBRAR_TAXA.obterValor())
            return new DialogoCobrarLogradouro(telaPorTras, logradouro);
        return null;
    }
}
