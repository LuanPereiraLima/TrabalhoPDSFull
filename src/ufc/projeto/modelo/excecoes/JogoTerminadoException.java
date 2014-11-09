/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufc.projeto.modelo.excecoes;

/**
 *
 * @author Loopback
 */
class JogoTerminadoException extends Exception {

    @Override
    public String getMessage() {
        return "Fim de Jogo.";
    }

    
    
}
