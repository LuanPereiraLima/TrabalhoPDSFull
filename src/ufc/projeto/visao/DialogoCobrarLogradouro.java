package ufc.projeto.visao;

import javax.swing.JFrame;
import ufc.projeto.visao.enumeracoes.Dialogos;
import ufc.projeto.modelo.Logradouro;

public class DialogoCobrarLogradouro extends DialogoLogradouro{
    public DialogoCobrarLogradouro(JFrame telaPorTras,Logradouro logradouro) {
        super(telaPorTras, new CriadorPainelDialogo().obterDialogo(Dialogos.DIALOGO_COBRAR_TAXA.obterValor(),logradouro), logradouro);
    }
}
