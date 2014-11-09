/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufc.projeto.visao.fabricas;

import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Loopback
 */
public abstract class FabricaDeImagensDoGifParaPerfil {
    List<URL> imagens;

    public FabricaDeImagensDoGifParaPerfil() {
        imagens = new ArrayList<>();
        preenchendoImagens();
    }
    
    public List<URL> obterImagens(){
        return imagens;
    }
    
    public abstract void preenchendoImagens();
}
