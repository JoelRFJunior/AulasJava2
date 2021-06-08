package bloco1;

public class Paciente {
	
		private String nome;
		private String doenca;
		private int diasInternado;
		
		public Paciente(String nome,String doenca,int d ) {
			this.nome = nome;
			this.doenca= doenca;
			this.diasInternado = d;
		}
		public void infoPaciente() {
			System.out.println("o paciente :" + nome);
			System.out.println("tem a doenca" + doenca);
			System.out.println("está internado a " + diasInternado+ " dias");
		}
		
}
