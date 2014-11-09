/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufc.projeto.modelo;

import java.util.Iterator;
import java.util.List;
import ufc.projeto.visao.enumeracoes.Dialogos;

import ufc.projeto.excecoes.JogadorSemSaldoException;
import ufc.projeto.excecoes.LogradouroNaoPodeSerAdquiridoException;
import ufc.projeto.excecoes.LogradouroSemPrecoException;
import ufc.projeto.excecoes.PosicaoIvalidaParaLogradouroException;
import ufc.projeto.excecoes.PropriedadeJaAdquiridaException;
import ufc.projeto.visao.enumeracoes.Jogadores;

/**
 *
 * @author S2
 */
public class ImpleBancoImobiliario implements BancoImobiliario{
    private final List<Jogador> listaJogadores;
    private final Tabuleiro tabuleiro;
    private final AcoesDoJogo acoesDoJogo;
    private Jogador jogadorDestaVez;

    public ImpleBancoImobiliario(List<Jogador> listaJogadores, Tabuleiro tabuleiro, AcoesDoJogo acoesDoJogo) {
        this.listaJogadores = listaJogadores;
        this.tabuleiro = tabuleiro;
        this.acoesDoJogo = acoesDoJogo;
        jogadorDestaVez = listaJogadores.get(Jogadores.JOGADOR_1.obterValor());
        acoesDoJogo.mudarJogadores(jogadorDestaVez);
        acoesDoJogo.atualizarJogo(listaJogadores.iterator());
    }
   
    @Override
    public void jogarAVez(int numeroDados) throws LogradouroNaoPodeSerAdquiridoException, PropriedadeJaAdquiridaException, LogradouroSemPrecoException, PosicaoIvalidaParaLogradouroException{
        //Obtendo a proixma posicao até a que ele se moverá
        int posicaoAFrenteJogador = jogadorDestaVez.obterPosicaoAtual()+1;
        
        //mudando posicao do jogador
        jogadorDestaVez.setarPosicaoAtual(numeroDados);
        
        //modificando o valor atual dos dados!
        tabuleiro.setarValorDados(numeroDados);
        
        //mandando um sinal para interface mudar o jogador
        acoesDoJogo.andarCasas(jogadorDestaVez, numeroDados);
        
        //Realizando todas as ações ao passar por logradouro
        executandoAcoesDoPasseiPorCimaDoLogradouro(posicaoAFrenteJogador, jogadorDestaVez.obterPosicaoAtual());
      
        //obtendo o logradouro
        Logradouro logradouroAtual = getInformacaoLogradoEscolhido(jogadorDestaVez.obterPosicaoAtual());
        //executando acão sobre logradouro que esta encima
        executandoAcoesDoLogradouro(logradouroAtual);
        
        acoesDoJogo.jogoTerminado(jogadorDestaVez);
                      
        //chamada a interface para que os campos sejam atualizados
        acoesDoJogo.atualizarJogo(listaJogadores.iterator());
        
        //mudando a vez do jogador
        mudarVezJogador();
    }   
    
    private void executandoAcoesDoPasseiPorCimaDoLogradouro(int posicaoAFrenteJogador, int posicaoAtual) throws PosicaoIvalidaParaLogradouroException{
        int posicaoCorrespondente = tabuleiro.posicaoCircularCorrespondente(posicaoAFrenteJogador);
        while(posicaoCorrespondente!=posicaoAtual){
            Logradouro logradouroMomentaneo = getInformacaoLogradoEscolhido(tabuleiro.posicaoCircularCorrespondente(posicaoCorrespondente));
            logradouroMomentaneo.passeiPorEsseLogradouro(jogadorDestaVez);
            posicaoCorrespondente = tabuleiro.posicaoCircularCorrespondente(++posicaoCorrespondente);
        } 
    }
    
    private void executandoAcoesDoLogradouro(Logradouro logradouroAtual) throws LogradouroNaoPodeSerAdquiridoException, PropriedadeJaAdquiridaException, LogradouroSemPrecoException, PosicaoIvalidaParaLogradouroException{
          //verificando se o logradouro é adquirivel
        if(logradouroAtual.eAdquirivel()){
        	
            //verificando se a propriedade já está adquirida
            if(!logradouroAtual.ePropriedadeAdquirida()){
                //lougradouro de compra ativado, chama o o acionado perguntando se quer ser comprado ou não
                boolean resposta = acoesDoJogo.logradouroAcionado(logradouroAtual, Dialogos.DIALOGO_VENDA_LOGRADOURO.obterValor());
                if(resposta){
                        try{
                            logradouroAtual.adquirirPropriedade(jogadorDestaVez);
                        }catch(JogadorSemSaldoException e){
                            acoesDoJogo.jogoTerminado(jogadorDestaVez);
                        }
                }
            }else{
                //Já está adquirida, a propriedade vai somente acionar a acao encima do jogador da vez
                if(!jogadorDestaVez.equals(logradouroAtual.obterProprietario()))
                    acoesDoJogo.logradouroAcionado(logradouroAtual, Dialogos.DIALOGO_COBRAR_TAXA.obterValor());

                //realizando a ação do logradouro
                try{
                    logradouroAtual.realizarAcao(jogadorDestaVez);
                }catch(JogadorSemSaldoException e){
                    
                }
            }
            
        //se não for adquirivel ele apenas realiza a ação encima do jogador
        }else{
            int posicaoJogadorAFrente = jogadorDestaVez.obterPosicaoAtual()+1;
            
            //Guardo de informação, isso vai fazer com que se saiba se o jogador se movimentou ou não, depois de ser realizado a ação sobre ele.
            acoesDoJogo.logradouroAcionado(logradouroAtual, Dialogos.DIALOGO_MOSTRAR_INFORMACAO.obterValor());
            try{
                logradouroAtual.realizarAcao(jogadorDestaVez);
            }catch(JogadorSemSaldoException e){
                acoesDoJogo.jogoTerminado(jogadorDestaVez);   
            }
            
            executandoAcoesDoPasseiPorCimaDoLogradouro(posicaoJogadorAFrente, jogadorDestaVez.obterPosicaoAtual());
            
            acoesDoJogo.andarCasas(jogadorDestaVez, jogadorDestaVez.quantidadeVezesAndadaNaUltimaAcao());
            
            if(jogadorDestaVez.quantidadeVezesAndadaNaUltimaAcao()!=0){
                Logradouro logradouroAtualizado = getInformacaoLogradoEscolhido(jogadorDestaVez.obterPosicaoAtual());
                executandoAcoesDoLogradouro(logradouroAtualizado);
            }
        }
    }
   
    private void mudarVezJogador(){
        int posicaoDoAtualJogadorDaVezNaLista = listaJogadores.indexOf(jogadorDestaVez);
        int proximaPosicao = posicaoDoAtualJogadorDaVezNaLista+1;
        int posicaoDoProximoJogador = (proximaPosicao%listaJogadores.size());
        jogadorDestaVez = listaJogadores.get(posicaoDoProximoJogador);
        acoesDoJogo.mudarJogadores(jogadorDestaVez);
    }

    @Override
    public Logradouro getInformacaoLogradoEscolhido(int posicao) throws PosicaoIvalidaParaLogradouroException{
	return tabuleiro.getLogradouroEspecifico(posicao);
    }
	
    @Override
    public Iterator<Logradouro> getLogradouros(){
        return tabuleiro.getListaLogradouros();
    }
        
    
}