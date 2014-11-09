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
public enum MovimentacaoPersonagemGui {
    POSICAO_INICIAl_JG1(340),SOMATORIA_PULOS(122), POSICAO_INICIAl_JG2(390),POSICAO_DIFERENCIAL_JG1(950),
    POSICAO_DIFERENCIAL_JG2(1000), POSICAO_MINIMA_CORDENADA_Y(20), POSICAO_MAXIMA_CORDENADA_Y(630),
    TEMPO_DE_UM_PASSO(5);
    
    private int valor; 
	
    private MovimentacaoPersonagemGui(int valor) {
        this.valor = valor;
    }
    
    public int obterValor(){
        return this.valor;
    }
}
