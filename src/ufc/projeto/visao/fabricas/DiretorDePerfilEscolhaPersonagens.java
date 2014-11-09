/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufc.projeto.visao.fabricas;

import ufc.projeto.modelo.Perfil;
import ufc.projeto.visao.enumeracoes.Midia;

/**
 *
 * @author Loopback
 */
public class DiretorDePerfilEscolhaPersonagens extends FabricaDePerfilEscolhaPersonagens{

    @Override
    public void preenchendoImagens(){
        
        imagens.add(new Perfil(getClass().getResource(Midia.IMAGEM_FRODO_NOME.obterCaminho()),
            getClass().getResource(Midia.IMAGEM_FRODO.obterCaminho()), new DiretorDeImagensDoGifParaPerfilFrodo().obterImagens()));
        imagens.add(new Perfil(getClass().getResource(Midia.IMAGEM_LEGOLAS_NOME.obterCaminho()), 
            getClass().getResource(Midia.IMAGEM_LEGOLAS.obterCaminho()), new DiretorDeImagensDoGifParaPerfilLegolas().obterImagens()));
        imagens.add(new Perfil(getClass().getResource(Midia.IMAGEM_GANDALF_NOME.obterCaminho()), 
            getClass().getResource(Midia.IMAGEM_GANDALF.obterCaminho()), new DiretorDeImagensDoGifParaPerfilGandolf().obterImagens()));
        imagens.add(new Perfil(getClass().getResource(Midia.IMAGEM_ARWEN_NOME.obterCaminho()), 
            getClass().getResource(Midia.IMAGEM_ARWEN.obterCaminho()), new DiretorDeImagensDoGifParaPerfilArwen().obterImagens()));
    }
}
