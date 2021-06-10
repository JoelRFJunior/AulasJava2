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
	
	@Override
	public void emitirSom() {

		System.out.println("o cachorro quando uiva faz: auuuuuuuuuu");
		System.out.println("o cachorro late faz: au...auu..auu");
		System.out.println("o cachorro quando uiva rosna faz: Grrrrrr...");
	}

	@Override
	public void correr() {
		int velocidade;
		String raca1 = getRaca();
		if (raca1.equals("Greyhound")) {
			velocidade = 72;
		} else if (raca1.equals("Saluki")) {
			velocidade = 68;
		} else if (raca1.equals("Galgo afegão")) {
			velocidade = 65;
		} else if (raca1.equals("Vizsla")) {
			velocidade = 65;
		} else if (raca1.equals("Jack russell terrier")) {
			velocidade = 61;
		} else {
			velocidade = 48;
		}

	}

	public void infoCachorro() {
		String adocao;
		if (dono) {
			adocao = "Tem dono, não está para adoção";
		} else {
			adocao = "não tem dono, está para adoção";
		}
		System.out.println(" O cavalo de nome: " + getNome());
		System.out.println(" tem: " + getIdade() + " anos");
		System.out.println(" de raça  " + raca);
		System.out.println(adocao);

	}

}
