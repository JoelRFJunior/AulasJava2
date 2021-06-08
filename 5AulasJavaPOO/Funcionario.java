package bloco1;

public class Funcionario {
	private String nome;
	private float salario;
	private boolean bonusMensal;
	
	 public Funcionario(String nome,float salario,boolean bonusMensal) {
		 this.nome = nome;
		 this.salario = salario;
		 this.bonusMensal = bonusMensal;
				
	 }
	 
	 public void infoFuncionario() {
		 System.out.println("nome do funcionario: "+nome);
		 System.out.println("salario: "+salario);
		 System.out.println("direito a bonus: "+bonusMensal);
	 }

}
