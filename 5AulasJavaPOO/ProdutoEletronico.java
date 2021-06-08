package bloco1;

public class ProdutoEletronico {
	private String nome;
	private float preco;
	private int estoque;

	public ProdutoEletronico(String nome, float preco, int estoque) {
		this.nome = nome;
		this.preco = preco;
		this.estoque = estoque;
	}

	public void produtoInfo() {
		System.out.println("\n o produto " + nome + " esta com o preço " + preco + " e tem " + estoque + " em estoque");
	}

}
