package br.edu.ifsp.view.departamento;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.ifsp.controller.DepartamentoController;
import br.edu.ifsp.controller.FuncionarioController;
import br.edu.ifsp.model.departamento.Departamento;

public class DepartamentoCadastro {
    static Scanner entrada = new Scanner(System.in);

    public static void exibeInterface() {
        String nome;

        System.out.println("\nCADASTRO DE DEPARTAMENTO:");
        System.out.print("NOME: ");
        nome = entrada.nextLine();

        List<String> erros = new ArrayList<String>();
        Departamento departamento = new Departamento();
        departamento.setNomeDepto(nome);

        // Envia os dados do departamento (informados no formulário) ao controller.
        // O controller retorna então um ArrayList contendo os erros encontrados.
        erros = new FuncionarioController().insereDepartamento(departamento);

        if (erros.get(0) == null) { // Se o primeiro elemento do ArrayList for null.
            System.out.println("Departamento cadastrado com sucesso.\n");
        } else { // Se o primeiro elemento do ArrayList não for null.
            String mensagem = "Não foi possível cadastrar o departamento:\n";
            for (String e : erros) // Cria uma mensagem contendo todos os erros armazenados no ArrayList.
                mensagem = mensagem + e + "\n";
            System.out.println(mensagem);
        }
    }
}
