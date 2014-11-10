/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufc.projeto.visao;

import ufc.projeto.modelo.enumeracoes.Jogadores;

/**
 *
 * @author Loopback
 */
public class CriadorDeGifPerfil implements FabricaDeGifPerfil{

    @Override
    public ImagensDoGifParaPerfil criadorDeImagens(int tipo) {
        if(tipo == Jogadores.ARWEN.obterValor())
            return new ImagensDoGifParaPerfilArwen();
        if(tipo == Jogadores.FRODO.obterValor())
            return new ImagensDoGifParaPerfilFrodo();
        if(tipo == Jogadores.LEGOLAS.obterValor())
            return new ImagensDoGifParaPerfilLegolas();
        if(tipo == Jogadores.GANDALF.obterValor())
            return new ImagensDoGifParaPerfilGandolf();
        return null;
    }
    
}
