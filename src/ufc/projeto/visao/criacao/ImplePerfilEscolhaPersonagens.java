/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufc.projeto.visao.criacao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ufc.projeto.modelo.ImplePerfil;
import ufc.projeto.modelo.Perfil;
import ufc.projeto.visao.enumeracoes.Jogadores;
import ufc.projeto.visao.enumeracoes.Midia;

/**
 *
 * @author Loopback
 */
public class ImplePerfilEscolhaPersonagens implements PerfilEscolhaPersonagens{
    private final List<Perfil> imagens;

    public ImplePerfilEscolhaPersonagens() {
        imagens = new ArrayList<>();
    }

    @Override
    public Iterator<Perfil> obterImagens() {
        imagens.add(new ImplePerfil(getClass().getResource(Midia.IMAGEM_FRODO_NOME.obterCaminho()),
            getClass().getResource(Midia.IMAGEM_FRODO.obterCaminho()), new CriadorDeGifPerfil().criadorDeImagens(Jogadores.FRODO.obterValor()).obterImagens()));
        imagens.add(new ImplePerfil(getClass().getResource(Midia.IMAGEM_LEGOLAS_NOME.obterCaminho()), 
            getClass().getResource(Midia.IMAGEM_LEGOLAS.obterCaminho()), new CriadorDeGifPerfil().criadorDeImagens(Jogadores.LEGOLAS.obterValor()).obterImagens()));
        imagens.add(new ImplePerfil(getClass().getResource(Midia.IMAGEM_GANDALF_NOME.obterCaminho()), 
            getClass().getResource(Midia.IMAGEM_GANDALF.obterCaminho()), new CriadorDeGifPerfil().criadorDeImagens(Jogadores.GANDALF.obterValor()).obterImagens()));
        imagens.add(new ImplePerfil(getClass().getResource(Midia.IMAGEM_ARWEN_NOME.obterCaminho()), 
            getClass().getResource(Midia.IMAGEM_ARWEN.obterCaminho()), new CriadorDeGifPerfil().criadorDeImagens(Jogadores.ARWEN.obterValor()).obterImagens()));
        return imagens.iterator();
    }
}
