/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufc.projeto.visao;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import ufc.projeto.visao.enumeracoes.Midia;

/**
 *
 * @author Loopback
 */
public class ImagensDoGifParaPerfilGandolf implements ImagensDoGifParaPerfil{
   private final List<URL> imagens;

    public ImagensDoGifParaPerfilGandolf() {
        imagens = new ArrayList<>();
    }
    
    @Override
    public List<URL> obterImagens() {
        imagens.add(getClass().getResource(Midia.IMAGEM_GANDALF_GIF_FRENTE_PARADO.obterCaminho()));
        imagens.add(getClass().getResource(Midia.IMAGEM_GANDALF_GIF_COSTAS_MOVIMENTACAO.obterCaminho()));
        imagens.add(getClass().getResource(Midia.IMAGEM_GANDALF_GIF_DIREITA_MOVIMENTACAO.obterCaminho()));
        imagens.add(getClass().getResource(Midia.IMAGEM_GANDALF_GIF_FRENTE_MOVIMENTACAO.obterCaminho()));
        imagens.add(getClass().getResource(Midia.IMAGEM_GANDALF_GIF_ESQUERDA_MOVIMENTACAO.obterCaminho()));
        return imagens;
    }
}
