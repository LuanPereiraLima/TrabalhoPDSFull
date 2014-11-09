/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufc.projeto.visao.fabricas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ufc.projeto.modelo.Perfil;

/**
 *
 * @author Loopback
 */
public abstract class FabricaDePerfilEscolhaPersonagens {
    protected List<Perfil> imagens;

    public FabricaDePerfilEscolhaPersonagens() {
        imagens = new ArrayList<>();
        preenchendoImagens();
    }
    
    public Iterator<Perfil> obterImagens(){
        return imagens.iterator();
    }
    
    public abstract void preenchendoImagens();
}
