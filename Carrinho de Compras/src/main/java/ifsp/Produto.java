package ifsp;

public class Produto {

	private String nome;
	private String descricao;
	private Double preco;
	private String imagem;
	
	public Produto() {
		this.nome = "";
		this.descricao = "";
		this.preco = 0.0;
		this.imagem = "";
	}
	public Produto( String nome, String descricao, Double preco, String imagem ) {
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.imagem = imagem;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", descricao=" + descricao + ", preco=" + preco + ", imagem=" + imagem + "]";
	}
	
		
}
