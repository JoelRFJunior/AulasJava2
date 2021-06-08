package bloco1;

public class ContaBancaria {
	private int conta;
	private String cliente;
	private double saldo;
	private boolean bloqueio;
	
	public ContaBancaria(int c,String cliente, double s,boolean b) {
		this.setConta(c);
		this.setCliente(cliente);
		this.setSaldo(s);
		this.setBloqueio(b);
		
	}
	
	public void extrato() {
		System.out.println("o cliente :"+ cliente);
		System.out.println("o numero da conta é: "+ conta);
		System.out.println("o saldo bancario é: "+ saldo);
		System.out.println("a conta está bloqueada?:"+ bloqueio);
	}
	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isBloqueio() {
		return bloqueio;
	}

	public void setBloqueio(boolean bloqueio) {
		this.bloqueio = bloqueio;
	}
	

}
