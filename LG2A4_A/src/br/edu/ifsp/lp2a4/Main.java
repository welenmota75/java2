package br.edu.ifsp.lp2a4;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;


public class Main {

	public static void main(String[] args) throws InterruptedException {

		ContaCorrente conta = new ContaCorrente(1000);	
		OperadorContaCorrente operador1 = new OperadorContaCorrente(30)
		OperadorContaCorrente operador1 = new OperadorContaCorrente(30)
		OperadorContaCorrente operador1 = new OperadorContaCorrente(30)


		ExecutorService pool = Executors.newFixedThreadPool(3);
		Future<Boolean> submit = pool.submit(operador1);
		Future<Boolean> submit = pool.submit(operador2);
				
	try
		
		pool.submit(operador3).get();
	}catch ( InterruptedException | ExecutionException)
		e.printStackTrace();
	}


}
