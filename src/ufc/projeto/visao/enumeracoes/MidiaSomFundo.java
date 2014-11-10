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
public enum MidiaSomFundo {
    SOM_FUNDO_PRIMEIRA_TELA("src/ufc/projeto/midia/somAbertura.wav");
        
    private String caminho;

    private MidiaSomFundo(String caminho) {
        this.caminho = caminho;
    }
    
    public String obterCaminho(){
        return this.caminho;
    }
}
