package ufc.projeto.visao;

import javax.swing.JFrame;
import ufc.projeto.modelo.enumeracoes.Dialogos;
import ufc.projeto.modelo.Logradouro;

public class DialogoMostrarLogradouro extends DialogoLogradouro{
    public DialogoMostrarLogradouro(JFrame telaPorTras,Logradouro logradouro) {
        super(telaPorTras, new CriadorPainelDialogo().obterDialogo(Dialogos.DIALOGO_MOSTRAR_INFORMACAO.obterValor(),logradouro), logradouro);
    }
}
