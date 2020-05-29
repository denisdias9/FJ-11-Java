package br.com.caelum.contas.modelo;

/**
 * 
 * @author Denis Dias
 *
 */
public abstract class Conta {
	private String titular;
	private String agencia; // Variavél de Instancia ou atributo
	private int numero;
	protected double saldo;

	public void saca(double valor) {
		this.saldo -= valor;// Acesso ao atributo saldo para acrescentar o valr
	}

	public void deposita(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Você tentou depositar" + " um valor negativo");
		} else {
			this.saldo += valor;
		}
	}

	public void transfere(double valor, Conta conta) {
		this.saldo += valor;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) { // agencia é variavél de parametro
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public abstract String getTipo();
	/**
	 * Teste JavaDoc Nois
	 */
}
