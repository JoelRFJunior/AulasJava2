package bloco1;

public class Aviao {
	
	private String companhiaAerea;
	private boolean bagagem;
	private int vooDoDia;
	
	public Aviao(String companhiaAerea,boolean bagagem,int vooDoDia)
	{
		this.companhiaAerea = companhiaAerea;
		this.bagagem = bagagem;
		this.vooDoDia = vooDoDia;
	}
		
	public void imprimirVoo() {
		System.out.println("o passageiro vai pegar o voo da :"+companhiaAerea);
		System.out.println("tem bagagem :"+bagagem);
		System.out.println("seria o voo de numeros "+vooDoDia+" do Dia");
	}
	

}
