/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufc.projeto.visao.controladores.midia;

/**
 *
 * @author Loopback
 */
public enum Audio {
     LEFT(1), RIGHT(2), NORMAL(3), EXTERNAL_BUFFER_SIZE(524288);
     
    private final int valor;

    private Audio(int valor) {
        this.valor = valor;
    }
     
    public int obterValor(){
        return this.valor;
    }
}
