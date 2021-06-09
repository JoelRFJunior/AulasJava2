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
		
		if("Pregui�a-comum"==preguica) {
			extincao ="menor preocupa��o";
		}else if("Pregui�a-de-coleira"==preguica) {
			extincao = "situa��o vulner�vel";
		}else if("Pregui�a-an�-de-tr�s-dedos"==preguica) {
			extincao = "criticamente em perigo";
		}else {
			extincao= "esp�cie n�o especificada";
		}
		
		System.out.println(" a pregui�a de nome: "+getNome());
		System.out.println(" tem: "+getIdade()+" anos");
		System.out.println(" ela  " + descanso);
		System.out.println(" risco de extin��o: "+extincao);
	}

}
