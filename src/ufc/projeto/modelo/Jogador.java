package ufc.projeto.modelo;

import java.util.Iterator;

public interface Jogador {
    
    public int quantidadeVezesAndadaNaUltimaAcao();
	
    public void debitarSaldo(double valor);
    
    public void adicionarLogradouro(LogradouroAdquirivel logradourosAdquiriveis);
    
    public void creditarSaldo(double valor);
    
    public int obterValorDados();
    
    public void setarPosicaoAtual(int casasAPular);
    
    public int obterPosicaoAtual();

    public double obterSaldo();
    
    public Perfil obterPerfil();
    
    public Iterator<LogradouroAdquirivel> obterLogradourosAdquiridos();
}
