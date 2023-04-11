package br.edu.ifsp.lp2a4;

public class OperadorContaCorrente implements Runnable{

	private ContaCorrente contaCorrente;
	private double valor;

	public OperadorContaCorrente(ContaCorrente contaCorrente, double valor) {
		this.contaCorrente = contaCorrente;
		this.valor = valor;
	}

	private boolean lancamento() {
		boolean lancado = false;
		double saldo = contaCorrente.getSaldo();
		if (saldo >= 0) {
			contaCorrente.debito(valor);
			lancado = true;
		}
		return lancado;
	}
	
	@Override
	public void run() {
		System.out.println("Sucesso? " + lancamento());
	}

}
