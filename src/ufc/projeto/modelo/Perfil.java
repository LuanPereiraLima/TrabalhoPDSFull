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
public interface Perfil {
    
    public URL obterUrlNome();
    public URL obterUrlImagem();
    public List<URL> obterUtlGif();
}
