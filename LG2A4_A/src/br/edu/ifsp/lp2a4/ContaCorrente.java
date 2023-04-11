package br.edu.ifsp.lp2a4;

public class ContaCorrente {

	private double saldo;

	public ContaCorrente(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public synchronized void debito(double valor) {
		saldo += valor;
	} 
}
