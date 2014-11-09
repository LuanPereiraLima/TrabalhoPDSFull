/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufc.projeto.modelo;

import java.net.URL;
import java.util.List;

/**
 *
 * @author Loopback
 */
public class ImplePerfil implements Perfil{
    private URL urlNome;
    private URL urlImagem;
    private List<URL> utlGif;

    public ImplePerfil(URL urlNome, URL urlImagem, List<URL> urlGif) {
        this.urlNome = urlNome;
        this.urlImagem = urlImagem;
        this.utlGif = urlGif;
    }

    @Override
    public URL obterUrlNome() {
        return urlNome;
    }

    @Override
    public URL obterUrlImagem() {
        return urlImagem;
    }

    @Override
    public List<URL> obterUtlGif() {
        return utlGif;
    }
}
