/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ufc.projeto.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ufc.projeto.modelo.enumeracoes.ValoresInicias;

/**
 *
 * @author S2
 */
public class ImpleJogador implements Jogador{
    private double saldo;
    private final Perfil perfil;
    private final List<LogradouroAdquirivel> logradourosAdquiridos;
    private int posicaoAtual;
    private final Tabuleiro tabuleiro;
    private int quantidadeVezesAndadaUltima;
    
    public ImpleJogador(Perfil perfil, Tabuleiro tabuleiro) {
        this.saldo = ValoresInicias.SALDO_INICIAL_JOGADORES.obterSaldo();
        this.perfil = perfil;
        this.posicaoAtual = 0;
        this.tabuleiro = tabuleiro;
        logradourosAdquiridos = new ArrayList<>();
    }
    
    @Override
    public void debitarSaldo(double valor){
        quantidadeVezesAndadaUltima = 0;
        this.saldo = this.saldo - valor;
    }
    
    @Override
    public void adicionarLogradouro(LogradouroAdquirivel logradourosAdquiriveis){
        this.logradourosAdquiridos.add(logradourosAdquiriveis);
    }
    
    @Override
    public void creditarSaldo(double valor){
        quantidadeVezesAndadaUltima = 0;
        this.saldo = this.saldo + valor;
    }
    
    @Override
    public int obterValorDados() {
        return tabuleiro.obterValorDados();
    }
    
    @Override
    public void setarPosicaoAtual(int numeroDePulos){
        this.quantidadeVezesAndadaUltima = numeroDePulos;
        this.posicaoAtual = tabuleiro.posicaoCircularCorrespondente(numeroDePulos+this.obterPosicaoAtual());
    }
    
    @Override
    public int obterPosicaoAtual(){
        return this.posicaoAtual;
    }

    @Override
    public double obterSaldo() {
        return saldo;
    }

    @Override
    public Iterator<LogradouroAdquirivel> obterLogradourosAdquiridos() {
        return logradourosAdquiridos.iterator();
    }

    @Override
    public int quantidadeVezesAndadaNaUltimaAcao() {
        return quantidadeVezesAndadaUltima;
    }

    @Override
    public Perfil obterPerfil() {
        return perfil;
    }

}

