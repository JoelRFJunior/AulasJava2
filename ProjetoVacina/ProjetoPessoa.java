package Teste;

public abstract class ProjetoPessoa {

	private String nomeCompleto;
	private String cpf;
	private String dataDeNascimento;
	private String genero;
	
	abstract void imprimirInfo();
	
	public ProjetoPessoa(String nomeCompleto, String cpf, String genero, int diaDeNascimento, int mesDeNascimento,
			int anoDeNascimento) {

		super();
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.genero = genero;
		this.dataDeNascimento = (diaDeNascimento + "/" + mesDeNascimento + "/" + anoDeNascimento);

	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	public void validarCpf()
    {
        if(getCpf().length()!=11)
        {
            System.out.println("\n--CPF inválido--");
        }
        else
        {
            System.out.println("\n--CPF Válido--"); 
        }
    }
}
