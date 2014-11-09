package ufc.projeto.visao.dialogos.criacao;

import ufc.projeto.visao.enumeracoes.Dialogos;
import ufc.projeto.modelo.Logradouro;
import ufc.projeto.visao.dialogos.PainelCobrarLogradouro;
import ufc.projeto.visao.dialogos.PainelLogradouro;
import ufc.projeto.visao.dialogos.PainelMostraLogradouro;
import ufc.projeto.visao.dialogos.PainelVendaLogradouro;

public class CriadorPainelDialogo implements FabricaPainelDialogo{
   
    @Override
    public PainelLogradouro obterDialogo(int tipoInformacao, Logradouro logradouro){
        if(tipoInformacao == Dialogos.DIALOGO_VENDA_LOGRADOURO.obterValor())
            return new PainelVendaLogradouro(logradouro);
        if(tipoInformacao == Dialogos.DIALOGO_MOSTRAR_INFORMACAO.obterValor())
            return new PainelMostraLogradouro(logradouro);
        if(tipoInformacao == Dialogos.DIALOGO_COBRAR_TAXA.obterValor())
            return new PainelCobrarLogradouro(logradouro);
        return null;
    }
}
