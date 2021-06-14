package Teste;


import javax.swing.JOptionPane;

public class AgenteDaSaude extends ProjetoPessoa {

	private int id;
	private int senha;
	
	public AgenteDaSaude(String nomeCompleto, String cpf, String genero, int diaDeNascimento, int mesDeNascimento,
			int anoDeNascimento, int id,int senha) {
		
		super(nomeCompleto, cpf, genero, diaDeNascimento, mesDeNascimento, anoDeNascimento);
		this.id=id;
		this.senha=senha;
		
	}
	@Override
	public void imprimirInfo() {
		JOptionPane.showMessageDialog(null,
				"\n\nNome: "+getNomeCompleto() + "\n\nCpf: "+getCpf() + "\n\nData de nascimento: "+getDataDeNascimento()
						+ "\n\nGenero: "+getGenero()+ "\n\nusuarioId: "+id);
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
				
	}
	
		
}
