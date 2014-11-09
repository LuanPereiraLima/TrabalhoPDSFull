/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufc.projeto.visao.criacao;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import ufc.projeto.visao.enumeracoes.Midia;

/**
 *
 * @author Loopback
 */
public class ImagensDoGifParaPerfilLegolas implements ImagensDoGifParaPerfil{
    private final List<URL> imagens;

    public ImagensDoGifParaPerfilLegolas() {
        imagens = new ArrayList<>();
    }
    
    @Override
    public List<URL> obterImagens() {
        imagens.add(getClass().getResource(Midia.IMAGEM_LEGOLAS_GIF_FRENTE_PARADO.obterCaminho()));
        imagens.add(getClass().getResource(Midia.IMAGEM_LEGOLAS_GIF_COSTAS_MOVIMENTACAO.obterCaminho()));
        imagens.add(getClass().getResource(Midia.IMAGEM_LEGOLAS_GIF_DIREITA_MOVIMENTACAO.obterCaminho()));
        imagens.add(getClass().getResource(Midia.IMAGEM_LEGOLAS_GIF_FRENTE_MOVIMENTACAO.obterCaminho()));
        imagens.add(getClass().getResource(Midia.IMAGEM_LEGOLAS_GIF_ESQUERDA_MOVIMENTACAO.obterCaminho()));
        return imagens;
    }
}
