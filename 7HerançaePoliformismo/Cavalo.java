package bloco1;

public class Cavalo extends Animal {

	private String cor;
	private boolean sela;

	public Cavalo(String nome, int idade, String cor, boolean sela) {
		super(nome, idade);
		this.cor = cor;
		this.sela = sela;

	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public boolean isSela() {
		return sela;
	}

	public void setSela(boolean sela) {
		this.sela = sela;
	}
	
	@Override
	public void emitirSom() {
		System.out.println(" um cavalo relinchando faz:  hiin..in..in..hinir");
		System.out.println("um cavalo andando faz um barulho parecido com pocot�..pocot�");
		
	}
	
	@Override
	public void correr() {
		System.out.println("um cavalo corre em media 88km/h");
		
	}
	
	 public void infoCavalo() {
		 String pode;
		 
		 if(isSela()) {
			 pode = " tem sela pode ser montado ";
		 }else {
			 pode = " n�o tem sela n�o pode ser montado ";
		 }
		 
		 	System.out.println(" O cavalo de nome: "+getNome());
			System.out.println(" tem: "+getIdade()+" anos");
			System.out.println(" de cor  " + cor);
			System.out.println(pode);
	 }
	
	
	

}
