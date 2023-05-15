package br.edu.ifsp.model.departamento;

import java.util.ArrayList;
import java.util.List;

public class DepartamentoValidacao {

    private static List<String> errosValidacao;

    public static List<String> validaDepartamento(Departamento departamento) {
        errosValidacao = new ArrayList<>();

        // Validação do campo NomeDepto.
        if (departamento.getNomeDepto() == null || departamento.getNomeDepto().isEmpty()) {
            errosValidacao.add("* O nome do departamento não foi informado.");
        } else if (departamento.getNomeDepto().length() < 5 || departamento.getNomeDepto().length() > 100) {
            errosValidacao.add("* O nome do departamento deve ter entre 5 e 100 caracteres.");
        }

        // Validação do campo Gerente.
        if (departamento.getGerente() == null) {
            errosValidacao.add("* O gerente do departamento não foi informado.");
        }

        return errosValidacao;
    }
}
