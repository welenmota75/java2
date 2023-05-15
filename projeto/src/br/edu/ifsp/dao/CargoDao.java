package br.edu.ifsp.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifsp.model.cargo.Cargo;
import br.edu.ifsp.model.departamento.Departamento;
import br.edu.ifsp.model.funcionario.Funcionario;

public class CargoDao extends GenericDao {
    private PreparedStatement comando;
    private ResultSet registros;
    private static String excecao = null;

    public List<Cargo> recuperaCargos() {
        List<Cargo> cargos = new ArrayList<Cargo>();
        String instrucaoSql = "SELECT * FROM CARGO";

        try {
        	excecao = ConnectionDatabase.conectaBd();
            if (excecao == null) {
                comando = ConnectionDatabase.getConexaoBd().prepareStatement(instrucaoSql);
                registros = comando.executeQuery();

                while (registros.next()) {
                	Cargo cargo = new Cargo();
                    cargo.setId(registros.getInt("id"));
                    cargo.setDescricao(registros.getString("descricao"));
                    Departamento departamento = new Departamento();
                    departamento.setId(registros.getInt("idDepto"));
                    departamento.setNomeDepto(registros.getString("nomeDepto"));
                    Funcionario gerente = new Funcionario();
                    gerente.setId(registros.getInt("idFuncionario"));
                    gerente.setNome(registros.getString("nomeGerente"));
                    departamento.setGerente(gerente);
                    cargo.setDepartamento(departamento);
                    cargos.add(cargo);
                }

                registros.close();
                comando.close();
                ConnectionDatabase.getConexaoBd().close();
            }
        } catch (Exception e) {
        	excecao = "Tipo de Exce��o: " + e.getClass().getSimpleName() + "\nMensagem: " + e.getMessage();
            cargos = null;
        }

        return cargos;
    }
    
    public String insereCargo(Cargo cargo) {
        String instrucaoSql = "INSERT INTO CARGO (Descricao) VALUES (?)";
        return insere(instrucaoSql, cargo.getDescricao());
    }
    
    public List<Cargo> consultaCargos() {
        Cargo cargo;
        List<Cargo> cargos = new ArrayList<Cargo>();
        String instrucaoSql = "SELECT * FROM CARGO";
        
        try {
            // Obtém os dados de conexão com o banco de dados e prepara a instrução SQL.
            PreparedStatement comando = ConnectionDatabase.getConexaoBd().prepareStatement(instrucaoSql);
                
            // Executa a instrução SQL e retorna os dados ao objeto ResultSet.
            ResultSet registros = comando.executeQuery();
                
            if (registros.next()) { // Se for retornado pelo menos um registro.
                registros.beforeFirst(); // Retorna o cursor para antes do 1º registro.
                while (registros.next()) {
                    // Atribui o Id e a Descrição do cargo ao objeto Cargo por meio dos métodos set e
                    // adiciona este objeto ao ArrayList cargos.
                    cargo = new Cargo();
                    cargo.setId(registros.getInt("Id"));
                    cargo.setDescricao(registros.getString("Descricao"));
                    cargos.add(cargo);
                }
            }
            registros.close(); // Libera os recursos usados pelo objeto ResultSet.
            comando.close(); // Libera os recursos usados pelo objeto PreparedStatement.
            // Libera os recursos usados pelo objeto Connection e fecha a conexão com o banco de dados.
            ConnectionDatabase.getConexaoBd().close(); 
        } catch (Exception e) {
            cargos = null; // Caso ocorra qualquer exceção.
        }
        return cargos; // Retorna o ArrayList de objetos Cargo.
    }

    
    public String getExcecao() {
		return excecao;
	}
}