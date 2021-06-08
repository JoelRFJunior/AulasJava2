package bloco1;

public class Cliente {

	private String nome;
	private int idade;
	private String genero;
	private String compra;

	public Cliente(String nome, int idade, String genero, String compra) {
				this.nome = nome;
				this.idade = idade;
				this.genero = genero;
				this.compra = compra;
	}
	public void infoDeCompra() {
		System.out.println("\n O cliente : " + nome);
		System.out.println("\n com a idade : " + idade);
		System.out.println("\n do genero : " + genero);
		System.out.println("\n comprou : " + compra);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCompra() {
		return compra;
	}
	public void setCompra(String compra) {
		this.compra = compra;
	}
	
	

}
