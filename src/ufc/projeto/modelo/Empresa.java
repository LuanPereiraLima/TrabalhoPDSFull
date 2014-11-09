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
public class Empresa extends LogradourosAdquirivel{
    public Empresa(URL urlImagem, String nome, String descricao, double preco, double taxa) {
        super(urlImagem, nome, descricao, preco, taxa);
    }

    @Override
    public void realizarAcao(Jogador jogador) throws JogadorSemSaldoException, PropriedadeJaAdquiridaException, LogradouroNaoPodeSerAdquiridoException {
    	if(ePropriedadeAdquirida()){
            
            if(!jogador.equals(obterProprietario())){
            double valorCobrarAdquirir = obterTaxa()*jogador.obterValorDados();
            if(jogador.obterSaldo() >= valorCobrarAdquirir){
                jogador.debitarSaldo(valorCobrarAdquirir);
                obterProprietario().creditarSaldo(valorCobrarAdquirir);
            }else
                throw new JogadorSemSaldoException();
        }
    }
}
}
