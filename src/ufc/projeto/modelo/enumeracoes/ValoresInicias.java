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
public enum ValoresInicias {
    SALDO_INICIAL_JOGADORES(1000);
    
    private double valor;

    private ValoresInicias(double valor) {
        this.valor = valor;
    }
    
    public double obterSaldo(){
        return valor;
    }
}
