package ufc.projeto.modelo;


public class DiretorLogradouro extends CriadorLogradouros{

	@Override
	public void criarLogradouros() {
            	getLogradouros().add(new LogradouroPontoDePartida(getClass().getResource("/ufc/projeto/imagens/background/olho-de-sauron.jpg"), 
                        "Inicio", "Você passou por cima do logradouro inicio! por isso foi premiado com 100 de saldo.", false, 100));
	
		getLogradouros().add(new Imovel(getClass().getResource("/ufc/projeto/imagens/background/olho-de-sauron.jpg"), 
                        "Casa 1", "Essa casa nao faz porra nenhuma", 200, 80));
		getLogradouros().add(new Empresa(getClass().getResource("/ufc/projeto/imagens/background/olho-de-sauron.jpg"), 
                        "Maconha", "Saporra nao e pra fumar de verdade", 500, 40));
		getLogradouros().add(new Imovel(getClass().getResource("/ufc/projeto/imagens/background/olho-de-sauron.jpg"), 
                        "Casa 2", "Aqui vc n vai encontrar muita coisa, meu amiguiho!", 100, 40));
		getLogradouros().add(new LogradourosEspeciais(getClass().getResource("/ufc/projeto/imagens/background/olho-de-sauron.jpg"), 
                        "Tesouro Perdido.", "voce encontrou um tesouro!", new AcaoModificarDinheiroPositivamente(300)));
		
		getLogradouros().add(new Imovel(getClass().getResource("/ufc/projeto/imagens/background/olho-de-sauron.jpg"), 
                        "Casa 3", "Casinha da mamae!", 70, 20));
		getLogradouros().add(new Empresa(getClass().getResource("/ufc/projeto/imagens/background/olho-de-sauron.jpg"),
                        "Google!", "O que isso ta fazendo aqui?", 1000, 250));
		getLogradouros().add(new Imovel(getClass().getResource("/ufc/projeto/imagens/background/olho-de-sauron.jpg"), 
                        "Casa 4", "Saporra nao e pra fumar de verdade", 180, 40));
		getLogradouros().add(new LogradourosEspeciais(getClass().getResource("/ufc/projeto/imagens/background/olho-de-sauron.jpg"), 
                        "Olho de sauron.", "voce foi encontrado!", new AcaoModificarDinheiroNegativamente(200)));
		
		getLogradouros().add(new Imovel(getClass().getResource("/ufc/projeto/imagens/background/olho-de-sauron.jpg"), 
                        "Casa 5", "Essa casa e o cabare da chicabeira.", 100, 50));
		getLogradouros().add(new Imovel(getClass().getResource("/ufc/projeto/imagens/background/olho-de-sauron.jpg"), 
                        "Casa 6", "vadia de luxo", 80, 20));
		getLogradouros().add(new Empresa(getClass().getResource("/ufc/projeto/imagens/background/olho-de-sauron.jpg"), 
                        "Maconha", "Saporra nao e pra fumar de verdade", 125, 40));
		getLogradouros().add(new LogradourosEspeciais(getClass().getResource("/ufc/projeto/imagens/background/olho-de-sauron.jpg"), 
                        "Grupo de Ends.", "voce encontrou um grupo de ends! voce ira se movimentar duas casas!", new AcaoMoverJogador(2)));
		
		getLogradouros().add(new Empresa(getClass().getResource("/ufc/projeto/imagens/background/olho-de-sauron.jpg"), 
                        "Saronitass", "WHATAFUCK?", 400, 15));
		getLogradouros().add(new Imovel(getClass().getResource("/ufc/projeto/imagens/background/olho-de-sauron.jpg"), 
                        "Casa 7", "casinha dos lols", 120, 10));
		getLogradouros().add(new Imovel(getClass().getResource("/ufc/projeto/imagens/background/olho-de-sauron.jpg"), 
                        "Casa 8", "Saporra nao e pra fumar de verdade", 230, 40));
		getLogradouros().add(new LogradourosEspeciais(getClass().getResource("/ufc/projeto/imagens/background/olho-de-sauron.jpg"), 
                        "Grupo de Orcs.", "voce foi emboscado por um grupo de orcs! ", new AcaoModificarDinheiroNegativamente(230)));
                
		getLogradouros().add(new Imovel(getClass().getResource("/ufc/projeto/imagens/background/olho-de-sauron.jpg"), 
                        "Casa 9", "Saporra nao e pra fumar de verdade", 140, 19));
		getLogradouros().add(new Imovel(getClass().getResource("/ufc/projeto/imagens/background/olho-de-sauron.jpg"), 
                        "Casa 10", "Saporra nao e pra fumar de verdade", 240, 25));
		getLogradouros().add(new Imovel(getClass().getResource("/ufc/projeto/imagens/background/olho-de-sauron.jpg"), 
                        "Casa 11", "Saporra nao e pra fumar de verdade", 312, 35));	
	}

}
