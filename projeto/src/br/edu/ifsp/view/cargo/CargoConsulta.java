package br.edu.ifsp.view.cargo;

import java.util.List;

import br.edu.ifsp.controller.CargoController;
import br.edu.ifsp.model.cargo.Cargo;

public class CargoConsulta {
	public static void exibeInterface() {
		String excecaoCargos = null;
		
		List<Cargo> cargos = new CargoController().consultaCargos();
		excecaoCargos = new CargoController().getExcecao();
		String formato = "%1$-6s %2$-20s %3$-7s";
		
		if (excecaoCargos != null) // Caso ocorra qualquer tipo de exce��o.
			System.out.println("N�o foi poss�vel recuperar os dados dos cargos\n" + excecaoCargos);
		else {
			System.out.println("\nCONSULTA DE CARGOS:");
			System.out.printf(formato, "CÓDIGO", " | DESCRIÇÃO", " | DEPARTAMENTO");
			
			for (Cargo c : cargos) {
				System.out.printf(formato, c.getId(), 
						           " | " + c.getDescricao(),
						           " | " + c.getDepartamento());
			}
			System.out.println();
		}
	}
}