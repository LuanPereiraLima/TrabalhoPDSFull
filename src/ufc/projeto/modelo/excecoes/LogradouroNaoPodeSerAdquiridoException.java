package ufc.projeto.modelo.excecoes;

public class LogradouroNaoPodeSerAdquiridoException extends Exception{
	@Override
	public String getMessage() {
		return "Esse logradouro nao pode ser adquirido.";
	}
}
