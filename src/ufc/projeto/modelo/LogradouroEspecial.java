/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ufc.projeto.modelo;

import java.net.URL;
import ufc.projeto.modelo.excecoes.JogadorSemSaldoException;
import ufc.projeto.modelo.excecoes.LogradouroNaoPodeSerAdquiridoException;
import ufc.projeto.modelo.excecoes.LogradouroSemPrecoException;
import ufc.projeto.modelo.excecoes.LogradouroSemTaxaException;

/**
 *
 * @author S2
 */
public class LogradouroEspecial extends Logradouro{
    private final AcoesLogradourosEspeciais acaoLogradouro;
    
    public LogradouroEspecial(URL urlImagem, String nome, String descricao, AcoesLogradourosEspeciais acaoLogradouro) {
        super(urlImagem , nome, descricao, false);
        this.acaoLogradouro = acaoLogradouro;
    }
    
    @Override
    public void realizarAcao(Jogador jogador) throws JogadorSemSaldoException {
            acaoLogradouro.AcaoASerRealizada(jogador);
    }

    @Override
    public void adquirirPropriedade(Jogador jogador) throws LogradouroNaoPodeSerAdquiridoException {
            throw new LogradouroNaoPodeSerAdquiridoException();
    }

    @Override
    public boolean ePropriedadeAdquirida() throws LogradouroNaoPodeSerAdquiridoException {
            throw new LogradouroNaoPodeSerAdquiridoException();
    }

    @Override
    public void passeiPorEsseLogradouro(Jogador jogador){}

    @Override
    public double obterPreco() throws LogradouroSemPrecoException {
            throw new LogradouroSemPrecoException();
    }

    @Override
    public Jogador obterProprietario() throws LogradouroNaoPodeSerAdquiridoException {
        throw new LogradouroNaoPodeSerAdquiridoException();
    }

    @Override
    public double obterTaxa() throws LogradouroSemTaxaException {
        return this.acaoLogradouro.obterValorDaAcaoEnvolvida();
    }

}
