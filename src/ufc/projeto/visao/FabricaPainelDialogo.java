/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufc.projeto.visao;

import ufc.projeto.modelo.Logradouro;
import ufc.projeto.visao.PainelLogradouro;

/**
 *
 * @author Loopback
 */
public interface FabricaPainelDialogo {
    public PainelLogradouro obterDialogo(int tipoInformacao, Logradouro logradouro);
}
