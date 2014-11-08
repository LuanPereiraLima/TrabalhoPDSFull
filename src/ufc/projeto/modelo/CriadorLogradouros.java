package ufc.projeto.modelo;

import java.util.ArrayList;
import java.util.List;
	

public abstract class CriadorLogradouros {
	private final List<Logradouro> listaLogradouros; 
	
	public CriadorLogradouros() {
		listaLogradouros = new ArrayList<>();
		criarLogradouros();
	}

	public abstract void criarLogradouros();
	
	public List<Logradouro> getLogradouros(){
		return listaLogradouros;
	}
	
}
