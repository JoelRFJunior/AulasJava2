package bloco1;

public class Patinete {
	private String marca;
	private String cor;

	public Patinete(String marca, String cor) {
		this.marca = marca;
		this.cor = cor;

	}

	public void printPatinete() {
		System.out.println("o patinete é da marca: " + marca + " e da cor " + cor);
	}

}
