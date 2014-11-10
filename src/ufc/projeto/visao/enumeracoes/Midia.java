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
public enum Midia {
    TEMPO_CRIAR_SOM_BOTAO(100),CAMINHO_SOM_BOTOES("src/ufc/projeto/midia/somBotoes.wav"),
    IMAGEM_JOGAR_ESCURO("/ufc/projeto/imagens/botoes/JogarEscuro.png"), IMAGEM_JOGAR_NORMAL("/ufc/projeto/imagens/botoes/JogarNormal.png"), 
    IMAGEM_JOGAR_CLARO("/ufc/projeto/imagens/botoes/JogarClaro.png"), IMAGEM_SAIR_ESCURO("/ufc/projeto/imagens/botoes/SairEscuro.png"),
    IMAGEM_SAIR_CLARO("/ufc/projeto/imagens/botoes/SairClaro.png"), IMAGEM_SAIR_NORMAL("/ufc/projeto/imagens/botoes/SairNormal.png"),
    IMAGEM_CREDITO_ESCURO("/ufc/projeto/imagens/botoes/CreditosEscuro.png"), IMAGEM_CREDITO_NORMAL("/ufc/projeto/imagens/botoes/CreditosNormal.png"),
    IMAGEM_CREDITO_CLARO("/ufc/projeto/imagens/botoes/CreditosClaro.png"),  IMAGEM_VOLTAR_ESCURO("/ufc/projeto/imagens/botoes/VoltarEscuro.jpg"),
    IMAGEM_VOLTAR_CLARO("/ufc/projeto/imagens/botoes/VoltarClaro.jpg"), IMAGEM_VOLTAR_NORMAL("/ufc/projeto/imagens/botoes/VoltarNormal.jpg"),
    IMAGEM_JOGAR_RODADA_CLARO("/ufc/projeto/imagens/botoes/JogarRodadaClaro.png"),IMAGEM_JOGAR_RODADA_ESCURO("/ufc/projeto/imagens/botoes/JogarRodadaEscuro.png"),
    IMAGEM_JOGAR_RODADA_NORMAL("/ufc/projeto/imagens/botoes/JogarRodadaNormal.png"),IMAGEM_FRODO_NOME("/ufc/projeto/imagens/background/FrodoNome.png"),
    IMAGEM_FRODO("/ufc/projeto/imagens/personagens/Frodo.png"), 
    
    IMAGEM_FRODO_GIF_FRENTE_PARADO("/ufc/projeto/imagens/personagens/FrodoPGifFrente.png"),
    
    IMAGEM_FRODO_GIF_FRENTE_MOVIMENTACAO("/ufc/projeto/imagens/personagens/FrodoMGifFrente.gif"),
    IMAGEM_FRODO_GIF_ESQUERDA_MOVIMENTACAO("/ufc/projeto/imagens/personagens/FrodoMGifEsquerda.gif"), 
    IMAGEM_FRODO_GIF_DIREITA_MOVIMENTACAO("/ufc/projeto/imagens/personagens/FrodoMGifDireita.gif"),
    IMAGEM_FRODO_GIF_COSTAS_MOVIMENTACAO("/ufc/projeto/imagens/personagens/FrodoMGifCostas.gif"),
    
    IMAGEM_GANDALF_GIF_FRENTE_PARADO("/ufc/projeto/imagens/personagens/GandalfPGifFrente.png"),
    
    IMAGEM_GANDALF_GIF_FRENTE_MOVIMENTACAO("/ufc/projeto/imagens/personagens/GandalfMGifFrente.gif"),
    IMAGEM_GANDALF_GIF_ESQUERDA_MOVIMENTACAO("/ufc/projeto/imagens/personagens/GandalfMGifEsquerda.gif"), 
    IMAGEM_GANDALF_GIF_DIREITA_MOVIMENTACAO("/ufc/projeto/imagens/personagens/GandalfMGifDireita.gif"),
    IMAGEM_GANDALF_GIF_COSTAS_MOVIMENTACAO("/ufc/projeto/imagens/personagens/GandalfMGifCostas.gif"),
    
    IMAGEM_LEGOLAS_GIF_FRENTE_PARADO("/ufc/projeto/imagens/personagens/LegolasPGifFrente.png"),
    
    IMAGEM_LEGOLAS_GIF_FRENTE_MOVIMENTACAO("/ufc/projeto/imagens/personagens/LegolasMGifFrente.gif"),
    IMAGEM_LEGOLAS_GIF_ESQUERDA_MOVIMENTACAO("/ufc/projeto/imagens/personagens/LegolasMGifEsquerda.gif"), 
    IMAGEM_LEGOLAS_GIF_DIREITA_MOVIMENTACAO("/ufc/projeto/imagens/personagens/LegolasMGifDireita.gif"),
    IMAGEM_LEGOLAS_GIF_COSTAS_MOVIMENTACAO("/ufc/projeto/imagens/personagens/LegolasMGifCostas.gif"),
    
    IMAGEM_ARWEN_GIF_FRENTE_PARADO("/ufc/projeto/imagens/personagens/ArwenPGifFrente.png"),
    
    IMAGEM_ARWEN_GIF_FRENTE_MOVIMENTACAO("/ufc/projeto/imagens/personagens/ArwenMGifFrente.gif"),
    IMAGEM_ARWEN_GIF_ESQUERDA_MOVIMENTACAO("/ufc/projeto/imagens/personagens/ArwenMGifEsquerda.gif"), 
    IMAGEM_ARWEN_GIF_DIREITA_MOVIMENTACAO("/ufc/projeto/imagens/personagens/ArwenMGifDireita.gif"),
    IMAGEM_ARWEN_GIF_COSTAS_MOVIMENTACAO("/ufc/projeto/imagens/personagens/ArwenMGifCostas.gif"),
    
    IMAGEM_GIF_FRENTE_PARADO_VALOR(0),
    IMAGEM_GIF_COSTAS_MOVIMENTACAO_VALOR(1),IMAGEM_GIF_DIREITA_MOVIMENTACAO_VALOR(2),
    IMAGEM_GIF_FRENTE_MOVIMENTACAO_VALOR(3), IMAGEM_GIF_ESQUERDA_MOVIMENTACAO_VALOR(4),
    IMAGEM_LEGOLAS_NOME("/ufc/projeto/imagens/background/LegolasNome.png"), IMAGEM_LEGOLAS("/ufc/projeto/imagens/personagens/Legolas.png"), 
    IMAGEM_LEGOLAS_GIF("/ufc/projeto/imagens/personagens/Legolas.png"),IMAGEM_GANDALF_NOME("/ufc/projeto/imagens/background/GandalfNome.png"), 
    IMAGEM_GANDALF("/ufc/projeto/imagens/personagens/Gandalf.png"), IMAGEM_GANDALF_GIF("/ufc/projeto/imagens/personagens/Gandalf.png"),
    IMAGEM_ARWEN_NOME("/ufc/projeto/imagens/background/ArwenNome.png"), IMAGEM_ARWEN("/ufc/projeto/imagens/personagens/Arwen.png"), 
    IMAGEM_ARWEN_GIF("/ufc/projeto/imagens/personagens/Arwen.png");
    
    private String caminho;
    private int valor;

    private Midia(String caminho) {
        this.caminho = caminho;
    }

    private Midia(int valor) {
        this.valor = valor;
    }
    
    public String obterCaminho(){
        return this.caminho;
    }
    
    public int obterValor(){
        return this.valor;
    }
}
