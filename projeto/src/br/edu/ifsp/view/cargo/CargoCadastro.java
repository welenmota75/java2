package br.edu.ifsp.view.cargo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.ifsp.controller.FuncionarioController;
import br.edu.ifsp.model.cargo.Cargo;
import br.edu.ifsp.model.departamento.Departamento;

public class CargoCadastro {
    static Scanner entrada = new Scanner(System.in);
    
    public static void exibeInterface() {
        String descricao;
        int idDepartamento;

        System.out.println("\nCADASTRO DE CARGO:");
        System.out.print("DESCRIÇÃO: ");
        descricao = entrada.nextLine();
        System.out.print("ID DO DEPARTAMENTO: ");
        idDepartamento = Integer.parseInt(entrada.nextLine());

        Cargo cargo = new Cargo();
        cargo.setDescricao(descricao);
        Departamento departamento = new Departamento();
        departamento.setId(idDepartamento);
        cargo.setDepartamento(departamento);

        List<String> erros = new ArrayList<String>();
        erros = new FuncionarioController().insereCargo(cargo);

        if (erros.get(0) == null) {
            System.out.println("Cargo cadastrado com sucesso.\n");
        } else {
            String mensagem = "Não foi possível cadastrar o cargo:\n";
            for (String e : erros)
                mensagem = mensagem + e + "\n";
            System.out.println(mensagem);
        }
    }
}
