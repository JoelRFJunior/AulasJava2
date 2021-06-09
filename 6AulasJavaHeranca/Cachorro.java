package bloco1;

public class Cachorro extends Animal {

	private boolean dono;
	private String raca;

	public Cachorro(String nome, int idade, String raca, boolean dono) {

		super(nome, idade);
		this.raca = raca;
		this.dono = dono;
	}

	public boolean isDono() {
		return dono;
	}

	public void setDono(boolean dono) {
		this.dono = dono;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public void infoCachorro() {
		String adocao;
		if (dono) {
			adocao = "Tem dono, n�o est� para ado��o";
		} else {
			adocao = "n�o tem dono, est� para ado��o";
		}
		System.out.println(" O cavalo de nome: " + getNome());
		System.out.println(" tem: " + getIdade() + " anos");
		System.out.println(" de ra�a  " + raca);
		System.out.println(adocao);

	}

}
