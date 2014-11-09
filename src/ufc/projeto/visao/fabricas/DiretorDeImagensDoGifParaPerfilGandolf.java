/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufc.projeto.visao.fabricas;

import ufc.projeto.visao.enumeracoes.Midia;

/**
 *
 * @author Loopback
 */
public class DiretorDeImagensDoGifParaPerfilGandolf extends FabricaDeImagensDoGifParaPerfil{

    @Override
    public void preenchendoImagens(){
        imagens.add(getClass().getResource(Midia.IMAGEM_GANDALF_GIF_FRENTE_PARADO.obterCaminho()));
        imagens.add(getClass().getResource(Midia.IMAGEM_GANDALF_GIF_COSTAS_MOVIMENTACAO.obterCaminho()));
        imagens.add(getClass().getResource(Midia.IMAGEM_GANDALF_GIF_DIREITA_MOVIMENTACAO.obterCaminho()));
        imagens.add(getClass().getResource(Midia.IMAGEM_GANDALF_GIF_FRENTE_MOVIMENTACAO.obterCaminho()));
        imagens.add(getClass().getResource(Midia.IMAGEM_GANDALF_GIF_ESQUERDA_MOVIMENTACAO.obterCaminho()));
    }
}
