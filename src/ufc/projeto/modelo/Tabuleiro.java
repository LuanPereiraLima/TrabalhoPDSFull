package ufc.projeto.modelo;

import java.util.Iterator;

public interface Tabuleiro {

    public Logradouro getLogradouroEspecifico(int posicao) throws ArrayIndexOutOfBoundsException;
    public int tamanhoDoTabuleiro();
    public Iterator<Logradouro> getListaLogradouros();
    public int posicaoCircularCorrespondente(int valorDaPosicao);
    public int obterValorDados();
    public void setarValorDados(int valor);
}
