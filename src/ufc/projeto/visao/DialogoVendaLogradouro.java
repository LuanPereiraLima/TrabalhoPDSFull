package ufc.projeto.visao;

import javax.swing.JFrame;
import ufc.projeto.modelo.enumeracoes.Dialogos;
import ufc.projeto.modelo.Logradouro;

public class DialogoVendaLogradouro extends DialogoLogradouro{

    public DialogoVendaLogradouro(JFrame telaPorTras, Logradouro logradouro) {
        super(telaPorTras,new CriadorPainelDialogo().obterDialogo(Dialogos.DIALOGO_VENDA_LOGRADOURO.obterValor(), logradouro), logradouro);
    }
}
