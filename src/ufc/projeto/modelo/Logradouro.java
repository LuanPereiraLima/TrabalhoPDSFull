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
import ufc.projeto.modelo.excecoes.PropriedadeJaAdquiridaException;

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
        this.urlImagem = imagem;
    }  
   
    public boolean eAdquirivel(){
    	return this.adquirivel;
    }
    
    public String obterNome(){
    	return this.nome;
    }
    
     public URL obterUrlImagem(){
    	return this.urlImagem;
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
