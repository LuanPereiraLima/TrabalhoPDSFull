/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufc.projeto.visao.fabricas;

import java.awt.Point;
import java.util.HashMap;

/**
 *
 * @author Loopback
 */
public abstract class FrabricaMapaPosicoesTabuleiroGui{
    protected HashMap<Point, Integer> mapaPosicoes;

    public FrabricaMapaPosicoesTabuleiroGui() {
        mapaPosicoes = new HashMap<>();
    }
    
    //mudar posicoes
    public HashMap<Point, Integer> obterHashMapaPosicoes(){
        preenchendoPosicoes();
        return mapaPosicoes;
    }
    
    public abstract void preenchendoPosicoes();
}
