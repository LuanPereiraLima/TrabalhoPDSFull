/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufc.projeto.gui.controlador.midia;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ufc.projeto.modelo.Perfil;

/**
 *
 * @author Loopback
 */
public class FabricaDeImagens {
    private final List<Perfil> imagens;

    public FabricaDeImagens() {
        imagens = new ArrayList<>();
        preenchendoImagens();
    }
    
    public Iterator<Perfil> obterImagens(){
       return  imagens.listIterator();
    }
    
    private void preenchendoImagens(){
        imagens.add(new Perfil(getClass().getResource("/ufc/projeto/imagens/background/FrodoNome.png"), 
                getClass().getResource("/ufc/projeto/imagens/personagens/Frodo.png"), 
                getClass().getResource("/ufc/projeto/imagens/personagens/Frodo.png")));
        imagens.add(new Perfil(getClass().getResource("/ufc/projeto/imagens/background/LegolasNome.png"), 
                getClass().getResource("/ufc/projeto/imagens/personagens/Legolas.png"), 
                getClass().getResource("/ufc/projeto/imagens/personagens/Legolas.png")));
        imagens.add(new Perfil(getClass().getResource("/ufc/projeto/imagens/background/GandalfNome.png"), 
                getClass().getResource("/ufc/projeto/imagens/personagens/Gandalf.png"), 
                getClass().getResource("/ufc/projeto/imagens/personagens/Gandalf.png")));
        imagens.add(new Perfil(getClass().getResource("/ufc/projeto/imagens/background/ArwenNome.png"), 
                getClass().getResource("/ufc/projeto/imagens/personagens/Arwen.png"), 
                getClass().getResource("/ufc/projeto/imagens/personagens/Arwen.png")));
    }
}
