package br.edu.ifsp.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifsp.model.departamento.Departamento;
import br.edu.ifsp.model.funcionario.Funcionario;

public class DepartamentoDao extends GenericDao {
    private PreparedStatement comando;
    private ResultSet registros;
    private static String excecao = null;

    public List<Departamento> recuperaDepartamentos() {
        List<Departamento> departamentos = new ArrayList<Departamento>();
        String instrucaoSql = "SELECT * FROM DEPARTAMENTO";

        try {
            excecao = ConnectionDatabase.conectaBd();
            if (excecao == null) {
                comando = ConnectionDatabase.getConexaoBd().prepareStatement(instrucaoSql);
                registros = comando.executeQuery();

                while (registros.next()) {
                    Departamento departamento = new Departamento();
                    departamento.setId(registros.getInt("Id"));
                    departamento.setNomeDepto(registros.getString("nomeDepto"));
                    Funcionario gerente = new Funcionario();
                    gerente.setId(registros.getInt("idFuncionario"));
                    gerente.setNome(registros.getString("nomeGerente"));
                    departamento.setGerente(gerente);
                    departamentos.add(departamento);
                }

                registros.close();
                comando.close();
                ConnectionDatabase.getConexaoBd().close();
            }
        } catch (Exception e) {
        	excecao = "Tipo de Exce��o: " + e.getClass().getSimpleName() + "\nMensagem: " + e.getMessage();
            departamentos = null;
        }

        return departamentos;
    }
    
    public String insereDepartamento(Departamento departamento) {
        String instrucaoSql = "INSERT INTO DEPARTAMENTO (nomeDepto, gerente) VALUES (?,?,?,?,?)";
        return insere(instrucaoSql, departamento.getNomeDepto(), departamento.getGerente());
    }

    // Método para buscar um departamento no banco de dados pelo seu id
    public Departamento buscaDepartamento(int idDepartamento) {
        Departamento departamento = null;
        String instrucaoSql = "SELECT * FROM DEPARTAMENTO WHERE id = ?";

        try {
            String excecao = ConnectionDatabase.conectaBd();
            if (excecao == null) {
                comando = ConnectionDatabase.getConexaoBd().prepareStatement(instrucaoSql);
                comando.setInt(1, idDepartamento);
                registros = comando.executeQuery();

                if (registros.next()) {
                    departamento = new Departamento();
                    departamento.setId(registros.getInt("Id"));
                    departamento.setNomeDepto(registros.getString("nomeDepto"));
                    Funcionario gerente = new Funcionario();
                    gerente.setId(registros.getInt("idFuncionario"));
                    gerente.setNome(registros.getString("nomeGerente"));
                    departamento.setGerente(gerente);
                }

                registros.close();
                comando.close();
                ConnectionDatabase.getConexaoBd().close();
            }
        } catch (Exception e) {
        	excecao = "Tipo de Exce��o: " + e.getClass().getSimpleName() + "\nMensagem: " + e.getMessage();
            departamento = null;
        }

        return departamento;
    }
    
    public String getExcecao() {
		return excecao;
	}
    
}