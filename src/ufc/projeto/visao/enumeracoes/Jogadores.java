/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufc.projeto.visao.enumeracoes;

/**
 *
 * @author Loopback
 */
public enum Jogadores {
    JOGADOR_1(0), JOGADOR_2(1), ARWEN(1), GANDALF(2), FRODO(3), LEGOLAS(4); 
    
    private int valor;

    private Jogadores(int valor) {
        this.valor = valor;
    }
    
    public int obterValor(){
        return this.valor;
    }
}
