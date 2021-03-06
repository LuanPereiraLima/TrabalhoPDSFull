/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufc.projeto.visao.enumeracoes;

/**
 *
 * @author Loopback
 */
public enum MidiaBotoes {
    TEMPO_CRIAR_SOM_BOTAO(100),CAMINHO_SOM_BOTAO_MADEIRA("src/ufc/projeto/midia/somBotaoNormal.wav"),CAMINHO_SOM_BOTAO_N_MADEIRA("src/ufc/projeto/midia/somBotaoNormal.wav"),
    CAMINHO_SOM_PERSONAGEM_ANDANDANDO("src/ufc/projeto/midia/somAndando.wav"),
    IMAGEM_JOGAR_ESCURO("/ufc/projeto/imagens/botoes/JogarEscuro.png"), IMAGEM_JOGAR_NORMAL("/ufc/projeto/imagens/botoes/JogarNormal.png"), 
    IMAGEM_JOGAR_CLARO("/ufc/projeto/imagens/botoes/JogarClaro.png"), IMAGEM_SAIR_ESCURO("/ufc/projeto/imagens/botoes/SairEscuro.png"),
    IMAGEM_SAIR_CLARO("/ufc/projeto/imagens/botoes/SairClaro.png"), IMAGEM_SAIR_NORMAL("/ufc/projeto/imagens/botoes/SairNormal.png"),
    IMAGEM_CREDITO_ESCURO("/ufc/projeto/imagens/botoes/CreditosEscuro.png"), IMAGEM_CREDITO_NORMAL("/ufc/projeto/imagens/botoes/CreditosNormal.png"),
    IMAGEM_CREDITO_CLARO("/ufc/projeto/imagens/botoes/CreditosClaro.png"),  IMAGEM_VOLTAR_ESCURO("/ufc/projeto/imagens/botoes/VoltarEscuro.jpg"),
    IMAGEM_VOLTAR_CLARO("/ufc/projeto/imagens/botoes/VoltarClaro.jpg"), IMAGEM_VOLTAR_NORMAL("/ufc/projeto/imagens/botoes/VoltarNormal.jpg"),
    IMAGEM_JOGAR_RODADA_CLARO("/ufc/projeto/imagens/botoes/JogarRodadaClaro.png"),IMAGEM_JOGAR_RODADA_ESCURO("/ufc/projeto/imagens/botoes/JogarRodadaEscuro.png"),
    IMAGEM_JOGAR_RODADA_NORMAL("/ufc/projeto/imagens/botoes/JogarRodadaNormal.png"),IMAGEM_JOGAR_NOVAMENTE_CLARO("/ufc/projeto/imagens/botoes/JogarNovamenteClaro.png"),
    IMAGEM_JOGAR_NOVAMENTE_ESCURO("/ufc/projeto/imagens/botoes/JogarNovamenteEscuro.png"),IMAGEM_JOGAR_NOVAMENTE_NORMAL("/ufc/projeto/imagens/botoes/JogarNovamenteNormal.png"),
    IMAGEM_SAIR_JOGO_CLARO("/ufc/projeto/imagens/botoes/SairDoJogoClaro.png"), IMAGEM_SAIR_JOGO_ESCURO("/ufc/projeto/imagens/botoes/SairDoJogoEscuro.png"),
    IMAGEM_SAIR_JOGO_NORMAL("/ufc/projeto/imagens/botoes/SairDoJogoNormal.png");
    
    private String caminho;
    private int valor;

    private MidiaBotoes(String caminho) {
        this.caminho = caminho;
    }

    private MidiaBotoes(int valor) {
        this.valor = valor;
    }
    
    public String obterCaminho(){
        return this.caminho;
    }
    
    public int obterValor(){
        return this.valor;
    }
}
