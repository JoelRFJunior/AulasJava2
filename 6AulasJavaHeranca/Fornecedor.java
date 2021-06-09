package bloco1;

public class Fornecedor extends Pessoa {

	private double valorCredito;
	private double valorDivida;

	public Fornecedor(String nome, String endereco, String cpf, int telefone, int idade, double valorCredito,
			double valorDivida) {
		super(nome, endereco, cpf, telefone, idade);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}

	public void imprimirInfo() {
		System.out.println("\nNome do empregado: " + getNome() + "\nCPF: " + getCpf() + "\nIdade: " + getIdade()
				+ "\nTelefone: " + getTelefone() + "\nEndereço: " + getEndereco() + "\nValor crédito: " + valorCredito
				+ "\nValor divida: " + valorDivida);

	}

	public void validarCpf() {
		if (getCpf().length() != 11) {
			System.out.println("\n--CPF Inválido--");
		} else {
			System.out.println("\n--CPF Válido--");
		}
	}

	public void obterSaldo() {
		double diferencacd = valorCredito - valorDivida;
		System.out.println("\nO saldo referente ao fornecedor é igual a: " + diferencacd);
	}

}
