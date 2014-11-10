/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ufc.projeto.modelo;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author S2
 */
public class ImpleTabuleiro implements Tabuleiro{
    private final List<Logradouro> listaLogradouros;
    private int valorDados;
    
    public ImpleTabuleiro() {
        listaLogradouros = new DiretorLogradouro().getLogradouros();
    }
    
    @Override
    public Logradouro getLogradouroEspecifico(int posicao) throws ArrayIndexOutOfBoundsException{
            return listaLogradouros.get(posicao);
    }
    
    @Override
    public int tamanhoDoTabuleiro(){
        return listaLogradouros.size();
    }
    
    @Override
    public Iterator<Logradouro> getListaLogradouros(){
        return listaLogradouros.iterator();
    }
    
    //Se a posição passada for extrapolada, o array vai se comportar como um circular, retonando um valor correspondente, formando um circulo
    @Override
    public int posicaoCircularCorrespondente(int valorDaPosicao) {
        int totalDePosicoes = this.tamanhoDoTabuleiro();
        return valorDaPosicao%totalDePosicoes;
    }

    @Override
    public int obterValorDados() {
        return valorDados;
    }

    @Override
    public void setarValorDados(int valor) {
        this.valorDados = valor;
    }
    
}
