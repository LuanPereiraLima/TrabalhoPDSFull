/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufc.projeto.visao.dialogos.criacao;

import javax.swing.JFrame;
import ufc.projeto.modelo.Logradouro;
import ufc.projeto.visao.dialogos.DialogoLogradouro;

/**
 *
 * @author Loopback
 */
public interface FabricaDialogo{
    public DialogoLogradouro obterDialogo(JFrame telaPorTras,int tipoInformacao, Logradouro logradouro);
}
