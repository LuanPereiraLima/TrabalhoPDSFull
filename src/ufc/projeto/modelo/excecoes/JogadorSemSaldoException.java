package ufc.projeto.modelo.excecoes;

public class JogadorSemSaldoException extends Exception{

	@Override
	public String getMessage() {
		return "Jogador sem saldo.";
	}
}
