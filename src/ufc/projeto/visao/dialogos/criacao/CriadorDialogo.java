package ufc.projeto.visao.dialogos.criacao;

import javax.swing.JFrame;
import ufc.projeto.visao.enumeracoes.Dialogos;
import ufc.projeto.modelo.Logradouro;
import ufc.projeto.visao.dialogos.DialogoCobrarLogradouro;
import ufc.projeto.visao.dialogos.DialogoLogradouro;
import ufc.projeto.visao.dialogos.DialogoMostrarLogradouro;
import ufc.projeto.visao.dialogos.DialogoVendaLogradouro;

public class CriadorDialogo implements FabricaDialogo{
    
    @Override
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
