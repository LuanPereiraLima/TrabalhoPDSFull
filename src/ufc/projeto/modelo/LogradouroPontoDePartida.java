package ufc.projeto.modelo;

import java.net.URL;
import ufc.projeto.excecoes.LogradouroSemPrecoException;
import ufc.projeto.excecoes.LogradouroSemTaxaException;
import ufc.projeto.excecoes.PropriedadeJaAdquiridaException;
import ufc.projeto.excecoes.LogradouroNaoPodeSerAdquiridoException;
import ufc.projeto.excecoes.*;

public class LogradouroPontoDePartida extends Logradouro{
    private double saldoAcrescentar;

    public LogradouroPontoDePartida(URL urlImagem, String nome, String descricao,
                    boolean adquirivel, double saldoAcrescentar) {
            super(urlImagem, nome, descricao, adquirivel);
            this.saldoAcrescentar = saldoAcrescentar;
    }

    @Override
    public void realizarAcao(Jogador jogador) throws JogadorSemSaldoException, PropriedadeJaAdquiridaException {
        jogador.creditarSaldo(saldoAcrescentar);
    }

    @Override
    public void adquirirPropriedade(Jogador jogador) throws LogradouroNaoPodeSerAdquiridoException, JogadorSemSaldoException, PropriedadeJaAdquiridaException {
        throw new LogradouroNaoPodeSerAdquiridoException();
    }

    @Override
    public boolean ePropriedadeAdquirida() throws LogradouroNaoPodeSerAdquiridoException {
        throw new LogradouroNaoPodeSerAdquiridoException();
    }

    @Override
    public void passeiPorEsseLogradouro(Jogador jogador) {	
        jogador.creditarSaldo(saldoAcrescentar);
    }

    @Override
    public double obterPreco() throws LogradouroSemPrecoException {
        throw new LogradouroSemPrecoException();
    }
    
    @Override
    public Jogador obterProprietario() throws LogradouroNaoPodeSerAdquiridoException{
        throw new LogradouroNaoPodeSerAdquiridoException();
    }

    @Override
    public double obterTaxa() throws LogradouroSemTaxaException {
        throw new LogradouroSemTaxaException();
    }

}
