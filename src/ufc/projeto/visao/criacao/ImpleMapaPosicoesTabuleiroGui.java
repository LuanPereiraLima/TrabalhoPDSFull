/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufc.projeto.visao.criacao;

import java.awt.Point;
import java.util.HashMap;

/**
 *
 * @author Loopback
 */
public class ImpleMapaPosicoesTabuleiroGui implements MapaPosicoesTabuleiroGui{
    private final HashMap<Point, Integer> mapaPosicoes;

    public ImpleMapaPosicoesTabuleiroGui() {
        mapaPosicoes = new HashMap<>();
    }
   
    @Override
    public HashMap<Point, Integer> obterPosicoes() {
        mapaPosicoes.put(new Point(330, 604), 0);
        mapaPosicoes.put(new Point(330, 484), 1);
        mapaPosicoes.put(new Point(330, 364), 2);
        mapaPosicoes.put(new Point(330, 244), 3);
        mapaPosicoes.put(new Point(330, 124), 4);
        mapaPosicoes.put(new Point(330, 4), 5);
        mapaPosicoes.put(new Point(450, 4), 6);
        mapaPosicoes.put(new Point(570, 4), 7);
        mapaPosicoes.put(new Point(690, 4), 8);
        mapaPosicoes.put(new Point(810, 4), 9);
        mapaPosicoes.put(new Point(930, 4), 10);
        mapaPosicoes.put(new Point(930, 124), 11);
        mapaPosicoes.put(new Point(930, 244), 12);
        mapaPosicoes.put(new Point(930, 364), 13);
        mapaPosicoes.put(new Point(930, 484), 14);
        mapaPosicoes.put(new Point(930, 604), 15);
        mapaPosicoes.put(new Point(810, 604), 16);
        mapaPosicoes.put(new Point(690, 604), 17);
        mapaPosicoes.put(new Point(570, 604), 18);
        mapaPosicoes.put(new Point(450, 604), 19); 
        return mapaPosicoes;
    }
}
