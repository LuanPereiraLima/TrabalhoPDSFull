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
public enum Dialogos {
    DIALOGO_VENDA_LOGRADOURO(1), DIALOGO_MOSTRAR_INFORMACAO(2), DIALOGO_COBRAR_TAXA(3), DIALOGO_FIM_JOGO(4);
    
    private final int valor; 
	
    private Dialogos(int valor) {
        this.valor = valor;
    }
    
  
    public int obterValor(){
        return this.valor;
    }
}
