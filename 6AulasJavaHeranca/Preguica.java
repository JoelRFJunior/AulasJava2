package bloco1;

public class Preguica extends Animal {
	
		private String especie;
		private boolean dormindo;
	
	public Preguica(String nome,int idade,String especie,boolean dormindo) {
		
		super(nome, idade);
		this.especie=especie;
		this.dormindo=dormindo;
		
	// TODO Auto-generated constructor stub
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public boolean isDormindo() {
		return dormindo;
	}

	public void setDormindo(boolean dormindo) {
		this.dormindo = dormindo;
	}
	
	public void infoPreguica() {
		String preguica= getEspecie();
		String descanso,extincao;
		if(isDormindo()) {
			descanso="esta dormindo";
		}else {
			descanso="esta acordada";
		}
		
		if(preguica.equals("Preguiça-comum")) {
			extincao ="menor preocupação";
		}else if(preguica.equals("Preguiça-de-coleira")) {
			extincao = "situação vulnerável";
		}else if(preguica.equals("Preguiça-anã-de-três-dedos")) {
			extincao = "criticamente em perigo";
		}else {
			extincao= "espécie não especificada";
		}
		
		System.out.println(" a preguiça de nome: "+getNome());
		System.out.println(" tem: "+getIdade()+" anos");
		System.out.println(" ela  " + descanso);
		System.out.println(" risco de extinção: "+extincao);
	}

}
