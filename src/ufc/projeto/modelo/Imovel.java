/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ufc.projeto.modelo;

import java.net.URL;
import ufc.projeto.modelo.excecoes.JogadorSemSaldoException;
import ufc.projeto.modelo.excecoes.LogradouroNaoPodeSerAdquiridoException;
import ufc.projeto.modelo.excecoes.PropriedadeJaAdquiridaException;

/**
 *
 * @author S2
 */
public class Imovel extends LogradouroAdquirivel{

    public Imovel(URL urlImagem, String nome, String descricao, double preco, double taxa) {
        super(urlImagem, nome, descricao, preco, taxa);
    }

    @Override
    public void realizarAcao(Jogador jogador) throws PropriedadeJaAdquiridaException, JogadorSemSaldoException, LogradouroNaoPodeSerAdquiridoException {
       
    	if(ePropriedadeAdquirida()){
            if(!jogador.equals(obterProprietario())){
            	if(jogador.obterSaldo() >= obterTaxa()){
            		jogador.debitarSaldo(obterTaxa());
                	obterProprietario().creditarSaldo(obterTaxa());
            	}else{
            		throw new JogadorSemSaldoException();
            	}
            }
        }
    }
}
