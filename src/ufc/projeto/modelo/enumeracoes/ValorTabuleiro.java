/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufc.projeto.modelo.enumeracoes;

/**
 *
 * @author Loopback
 */
public enum ValorTabuleiro {
    QUANTIDADE_DE_LOGRADOUROS(20);
    
    private int valor;

    private ValorTabuleiro(int valor) {
        this.valor = valor;
    }
    
    public int obterSaldo(){
        return valor;
    }
}
