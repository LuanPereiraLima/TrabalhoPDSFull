/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ufc.projeto.modelo;

import ufc.projeto.excecoes.JogadorSemSaldoException;

/**
 *
 * @author S2
 */
public abstract class AcoesLogradourosEspeciais {
    public abstract void AcaoASerRealizada(Jogador jogador) throws JogadorSemSaldoException;
    public abstract double obterValorDaAcaoEnvolvida();
}

