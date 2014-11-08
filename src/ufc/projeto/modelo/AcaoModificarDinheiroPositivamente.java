/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ufc.projeto.modelo;

/**
 *
 * @author S2
 */
public class AcaoModificarDinheiroPositivamente extends AcaoModificarSaldo{

    public AcaoModificarDinheiroPositivamente(double valor) {
        super(valor);
    }
    
    @Override
    public void AcaoASerRealizada(Jogador jogador) {
        jogador.creditarSaldo(this.getValor());
    }
    
}
