package ufc.projeto.visao;

import ufc.projeto.modelo.enumeracoes.Dialogos;
import ufc.projeto.modelo.Logradouro;

public class CriadorPainelDialogo implements FabricaPainelDialogo{
   
    @Override
    public PainelLogradouro obterDialogo(int tipoInformacao, Logradouro logradouro){
        if(tipoInformacao == Dialogos.DIALOGO_VENDA_LOGRADOURO.obterValor())
            return new PainelVendaLogradouro(logradouro);
        if(tipoInformacao == Dialogos.DIALOGO_MOSTRAR_INFORMACAO.obterValor())
            return new PainelMostrarLogradouro(logradouro);
        if(tipoInformacao == Dialogos.DIALOGO_COBRAR_TAXA.obterValor())
            return new PainelCobrarLogradouro(logradouro);
        return null;
    }
}
