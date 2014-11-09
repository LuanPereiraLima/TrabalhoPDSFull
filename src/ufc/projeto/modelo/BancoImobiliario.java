/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ufc.projeto.modelo;

import java.util.Iterator;

import ufc.projeto.modelo.excecoes.JogadorSemSaldoException;
import ufc.projeto.modelo.excecoes.LogradouroNaoPodeSerAdquiridoException;
import ufc.projeto.modelo.excecoes.LogradouroSemPrecoException;
import ufc.projeto.modelo.excecoes.PosicaoIvalidaParaLogradouroException;
import ufc.projeto.modelo.excecoes.PropriedadeJaAdquiridaException;

/**
 *
 * @author S2
 */
public interface BancoImobiliario {
    
    public void jogarAVez(int numeroDados) throws LogradouroNaoPodeSerAdquiridoException, JogadorSemSaldoException, PropriedadeJaAdquiridaException, LogradouroSemPrecoException, PosicaoIvalidaParaLogradouroException;
    public Logradouro getInformacaoLogradoEscolhido(int posicao) throws PosicaoIvalidaParaLogradouroException;
    public Iterator<Logradouro> getLogradouros();
}
