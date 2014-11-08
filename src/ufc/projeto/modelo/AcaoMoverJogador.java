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
public class AcaoMoverJogador extends AcoesLogradourosEspeciais{
    private int quantidadeDeCasasAMovimentar;

    public AcaoMoverJogador(int posicao) {
        this.quantidadeDeCasasAMovimentar = posicao;
    }
    
    @Override
    public void AcaoASerRealizada(Jogador jogador) {
        jogador.setarPosicaoAtual(quantidadeDeCasasAMovimentar);
    }

    @Override
    public double obterValorDaAcaoEnvolvida() {
        return this.quantidadeDeCasasAMovimentar;
    }
}
