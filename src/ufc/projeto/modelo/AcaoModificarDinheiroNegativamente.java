/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ufc.projeto.modelo;

import ufc.projeto.modelo.excecoes.JogadorSemSaldoException;

/**
 *
 * @author S2
 */
public class AcaoModificarDinheiroNegativamente extends AcaoModificarSaldo{

    public AcaoModificarDinheiroNegativamente(double valor) {
        super(valor);
    }
    
    @Override
    public void AcaoASerRealizada(Jogador jogador) throws JogadorSemSaldoException{
    	if(jogador.obterSaldo() >= getValor()){
    		jogador.debitarSaldo(this.getValor());
    	}else{
    		throw new JogadorSemSaldoException();
    	}
    }
    
}
