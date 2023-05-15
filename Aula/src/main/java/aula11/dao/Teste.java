package aula11.dao;

public class Teste {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno(0, "John Lenon", "09/10/1940");
		AlunoDAO aDAO = new AlunoDAO();
		aDAO.create(aluno1);
		
	}

}
