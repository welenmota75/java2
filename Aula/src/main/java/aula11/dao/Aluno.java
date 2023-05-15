package aula11.dao;

public class Aluno {

	private String nome;
	private int idAluno;
	private String nascimento;
	
	
	
	public Aluno(int idAluno, String nome, String nascimento) {
		this.nome = nome;
		this.idAluno = idAluno;
		this.nascimento = nascimento;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(int idAluno) {
		this.idAluno = idAluno;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	
	
}
