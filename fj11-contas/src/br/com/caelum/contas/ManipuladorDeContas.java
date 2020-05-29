package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;
import br.com.caelum.javafx.api.util.Evento;

/**
 * 
 * @author Denis Dias
 *
 */
public class ManipuladorDeContas {

	private Conta conta;// Atributo ou Variavél de Instância
//Metodo 

	public void criaConta(Evento e) {
		String tipo = e.getSelecionadoNoRadio("tipo");
		if (tipo.equals("Conta Corrente")) {
			this.conta = new ContaCorrente();
		} else if (tipo.equals("Conta Poupança")) {
			this.conta = new ContaPoupanca();
		}
		this.conta.setAgencia(e.getString("agencia"));
		this.conta.setNumero(e.getInt("numero"));
		this.conta.setTitular(e.getString("titular"));

	}

	public void deposita(Evento e) {
		double valorDepositado = e.getDouble("valorOperacao");
		this.conta.deposita(valorDepositado);
	}

	public void saca(Evento e) {
		double valorDoSaque = e.getDouble("valorOperacao");
		this.conta.saca(valorDoSaque);
	}
	
	public void transfere(Evento e) {
		Conta destino = (Conta) e.getSelecionadoNoCombo("destino");
		this.conta.transfere(e.getDouble("valorTransferencia"), destino);
		}

}
