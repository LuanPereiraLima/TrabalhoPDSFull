package ufc.projeto.modelo.excecoes;

public class PosicaoIvalidaParaLogradouroException extends Exception{
	
		@Override
		public String getMessage() {
			return "Posicao invalida para logradouro";
		}

}
