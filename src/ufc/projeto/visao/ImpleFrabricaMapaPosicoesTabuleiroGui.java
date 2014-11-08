/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufc.projeto.visao;

import java.awt.Point;
import java.util.HashMap;

/**
 *
 * @author Loopback
 */
public class ImpleFrabricaMapaPosicoesTabuleiroGui implements FrabricaMapaPosicoes{
    private HashMap<Point, Integer> mapaPosicoes;

    public ImpleFrabricaMapaPosicoesTabuleiroGui() {
        mapaPosicoes = new HashMap<>();
    }
    
    
    //mudar posicoes
    @Override
    public HashMap<Point, Integer> obterHashMapaPosicoes(){
        mapaPosicoes.put(new Point(390, 630), 0);
        mapaPosicoes.put(new Point(390, 508), 1);
        mapaPosicoes.put(new Point(390, 386), 2);
        mapaPosicoes.put(new Point(390, 264), 3);
        mapaPosicoes.put(new Point(390, 142), 4);
        mapaPosicoes.put(new Point(390, 20), 5);
        mapaPosicoes.put(new Point(512, 20), 6);
        mapaPosicoes.put(new Point(634, 20), 7);
        mapaPosicoes.put(new Point(756, 20), 8);
        mapaPosicoes.put(new Point(878, 20), 9);
        mapaPosicoes.put(new Point(1000, 20), 10);
        mapaPosicoes.put(new Point(1000, 142), 11);
        mapaPosicoes.put(new Point(1000, 264), 12);
        mapaPosicoes.put(new Point(1000, 386), 13);
        mapaPosicoes.put(new Point(1000, 508), 14);
        mapaPosicoes.put(new Point(1000, 630), 15);
        mapaPosicoes.put(new Point(878, 630), 16);
        mapaPosicoes.put(new Point(756, 630), 17);
        mapaPosicoes.put(new Point(634, 630), 18);
        mapaPosicoes.put(new Point(512, 630), 19);
        
        return mapaPosicoes;
    }
}
