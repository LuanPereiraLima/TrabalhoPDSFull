/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufc.projeto.modelo;

import java.net.URL;

/**
 *
 * @author Loopback
 */
public class Perfil {
    private URL urlNome;
    private URL urlImagem;
    private URL utlGif;

    public Perfil(URL urlNome, URL urlImagem, URL urlGif) {
        this.urlNome = urlNome;
        this.urlImagem = urlImagem;
        this.utlGif = urlGif;
    }

    public URL getUrlNome() {
        return urlNome;
    }

    public URL getUrlImagem() {
        return urlImagem;
    }

    public URL getUtlGif() {
        return utlGif;
    }
}
