package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;

/**
 * 
 * @author Denis Dias
 *
 */
public class TestaConta {

	public static void main(String[] args) {
		// Conta conta = new Conta();
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		
		
		System.out.println(cc.getTitular() + " Tinha em sua conta " + cc.getSaldo());
		cc.deposita(10000.00);
		System.out.println(cc.getTitular() + " Depois de trabalhar com Java tem em sua conta " + cc.getSaldo());

	}

}
