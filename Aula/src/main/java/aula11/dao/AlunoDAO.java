package aula11.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlunoDAO {

		protected Connection conn;
		protected final String url = "jdbc:mysql://localhost:3306/estudante";
		protected final String usuario = "estudante";
		protected final String senha = "1234";
		
		public AlunoDAO() {
			try {
				conn = DriverManager.getConnection(url, usuario, senha);	
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		public void create(Aluno aluno){
			String sql = "INSERT INTO alunos(nome, nascimento) VALUES(?,?)";
			try {
				PreparedStatement stmt = conn.prepareStatement(sql);
				stmt.setString(1, aluno.getNome());
				stmt.setString(2, aluno.getNascimento());
				stmt.executeUpdate();
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
}
