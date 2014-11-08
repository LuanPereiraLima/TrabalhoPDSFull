/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ufc.projeto.modelo;

import java.net.URL;
import ufc.projeto.excecoes.JogadorSemSaldoException;
import ufc.projeto.excecoes.LogradouroNaoPodeSerAdquiridoException;
import ufc.projeto.excecoes.LogradouroSemPrecoException;
import ufc.projeto.excecoes.LogradouroSemTaxaException;
import ufc.projeto.excecoes.PropriedadeJaAdquiridaException;

/**
 *
 * @author S2
 */
public abstract class Logradouro {
        private String nome;
        private String descricao;
        private boolean adquirivel;
        private URL urlImagem;

    public Logradouro(URL imagem,String nome, String descricao, boolean adquirivel) {
        this.nome = nome;
        this.descricao = descricao;
        this.adquirivel = adquirivel;
        this.urlImagem = urlImagem;
    }  
   
    public boolean eAdquirivel(){
    	return this.adquirivel;
    }
    
    public String obterNome(){
    	return this.nome;
    }
    
     public String obterUrlUmagem(){
    	return this.nome;
    }
    
    public String obterDescriao(){
    	return this.descricao;
    }

    public abstract void realizarAcao(Jogador jogador) throws JogadorSemSaldoException, PropriedadeJaAdquiridaException, LogradouroNaoPodeSerAdquiridoException;
    public abstract void adquirirPropriedade(Jogador jogador) throws LogradouroNaoPodeSerAdquiridoException, JogadorSemSaldoException, PropriedadeJaAdquiridaException, LogradouroSemPrecoException;
    public abstract boolean ePropriedadeAdquirida() throws LogradouroNaoPodeSerAdquiridoException;
    public abstract void passeiPorEsseLogradouro(Jogador jogador);
    public abstract double obterPreco() throws LogradouroSemPrecoException;
    public abstract double obterTaxa() throws LogradouroSemTaxaException;
    public abstract Jogador obterProprietario() throws LogradouroNaoPodeSerAdquiridoException;
}
