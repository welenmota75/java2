package br.edu.ifsp.view.departamento;

import java.util.List;

import br.edu.ifsp.controller.DepartamentoController;
import br.edu.ifsp.model.departamento.Departamento;

public class DepartamentoConsulta {
	public static void exibeInterface() {
		String excecaoDepartamentos = null;
		
		List<Departamento> departamentos = new DepartamentoController().consultaDepartamento();
		excecaoDepartamentos = new DepartamentoController().getExcecao();
		String formato = "%1$-6s %2$-20s %3$-7s";
		
		if (excecaoDepartamentos != null) // Caso ocorra qualquer tipo de exce��o.
			System.out.println("N�o foi poss�vel recuperar os dados dos departamentos:\n" + excecaoDepartamentos);
		else {
			System.out.println("\nCONSULTA DE CARGOS:");
			System.out.printf(formato, "CÓDIGO", " | NOME DEPTO", " | GERENTE");
			
			for (Departamento c : departamentos) {
				System.out.printf(formato, c.getId(), 
						           " | " + c.getNomeDepto(),
						           " | " + c.getGerente());
			}
			System.out.println();
		}
	}
}
