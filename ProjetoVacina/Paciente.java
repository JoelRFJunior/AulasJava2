package Teste;

import javax.swing.JOptionPane;

public class Paciente extends ProjetoPessoa {

	private boolean vacinaPolio;
	private boolean vacinaTetano;
	private boolean vacinaHepatiteB;
	private boolean vacinaTripliceViral;
	private boolean vacinaCovid;

	public Paciente(String nomeCompleto, String cpf, String genero, int diaDeNascimento, int mesDeNascimento,
			int anoDeNascimento, boolean vacinaPolio, boolean vacinaTetano, boolean vacinaHepatiteB,
			boolean vacinaTripliceViral, boolean vacinaCovid) {

		super(nomeCompleto, cpf, genero, diaDeNascimento, mesDeNascimento, anoDeNascimento);

		this.vacinaPolio = vacinaPolio;
		this.vacinaTetano = vacinaTetano;
		this.vacinaHepatiteB = vacinaHepatiteB;
		this.vacinaTripliceViral = vacinaTripliceViral;
		this.vacinaCovid = vacinaCovid;

	}
	@Override
	public void imprimirInfo() {
		String polio, tetano, hepa, triple, covid;
		if (vacinaPolio) {
			polio = "Sim";
		} else {
			polio = "Não";
		}
		if (vacinaTetano) {
			tetano = "Sim";
		} else {
			tetano = "Não";
		}
		if (vacinaHepatiteB) {
			hepa = "Sim";
		} else {
			hepa = "Não";
		}
		if (vacinaTripliceViral) {
			triple = "Sim";
		} else {
			triple = "Não";
		}
		if (vacinaCovid) {
			covid = "Sim";
		} else {
			covid = "Não";
		}
		JOptionPane.showMessageDialog(null,
				"\n\nNome: "+getNomeCompleto() + "\n\nCpf: "+getCpf() + "\n\nData de nascimento: "+getDataDeNascimento()
						+ "\n\nGenero: "+getGenero()+ "\n\nTomou vacina Pólio: "+polio+ "\n\nTomou vacina Tetano: "
						 +tetano+ "\n\nTomou vacina HepatiteB: "+hepa+ "\n\nTomou vacina Triplice Viral: "+triple
						+ "\n\nTomou vacina Covid: "+covid);
	}

	public boolean isVacinaPolio() {
		return vacinaPolio;
	}

	public void setVacinaPolio(boolean vacinaPolio) {
		this.vacinaPolio = vacinaPolio;
	}

	public boolean isVacinaTetano() {
		return vacinaTetano;
	}

	public void setVacinaTetano(boolean vacinaTetano) {
		this.vacinaTetano = vacinaTetano;
	}

	public boolean isVacinaHepatiteB() {
		return vacinaHepatiteB;
	}

	public void setVacinaHepatiteB(boolean vacinaHepatiteB) {
		this.vacinaHepatiteB = vacinaHepatiteB;
	}

	public boolean isVacinaTripliceViral() {
		return vacinaTripliceViral;
	}

	public void setVacinaTripliceViral(boolean vacinaTripliceViral) {
		this.vacinaTripliceViral = vacinaTripliceViral;
	}

	public boolean isVacinaCovid() {
		return vacinaCovid;
	}

	public void setVacinaCovid(boolean vacinaCovid) {
		this.vacinaCovid = vacinaCovid;
	}
}
