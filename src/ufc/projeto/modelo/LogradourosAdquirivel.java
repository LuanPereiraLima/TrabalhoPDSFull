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
import ufc.projeto.modelo.excecoes.PropriedadeJaAdquiridaException;

/**
 *
 * @author S2
 */
public abstract class LogradourosAdquirivel extends Logradouro{
    private double preco;
    private double taxa;
    private Jogador proprietario;
    
    public LogradourosAdquirivel(URL urlImagem, String nome, String descricao, double preco, double taxa) {
        super(urlImagem, nome, descricao, true);
        this.preco = preco;
        this.taxa = taxa;
    }
    
    @Override
    public boolean ePropriedadeAdquirida(){
        return proprietario != null;
    }
    
    @Override
    public void adquirirPropriedade(Jogador jogador) throws JogadorSemSaldoException, PropriedadeJaAdquiridaException{
        if(!ePropriedadeAdquirida()){
            if(jogador.obterSaldo() >= this.preco){
        	jogador.debitarSaldo(this.preco);
        	jogador.adicionarLogradouro(this);
        	setarProprietario(jogador);
        	}else{
                    throw new JogadorSemSaldoException();
        	}
        }else{
            throw new PropriedadeJaAdquiridaException();
        }
    }
    
    
    public void setarProprietario(Jogador proprietario){
        this.proprietario = proprietario;
    }

    @Override
    public Jogador obterProprietario() throws LogradouroNaoPodeSerAdquiridoException {
        return this.proprietario;
    }
    
    @Override
    public double obterPreco() throws LogradouroSemPrecoException {
    	return this.preco;
    }

    @Override
    public double obterTaxa(){
        return this.taxa;
    }
       
    @Override
    public void passeiPorEsseLogradouro(Jogador jogador) {}
}
