package Teste;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProjetoVacina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op = -1, x = 0, tamanho;

		// Inicia os banco de dados para os testes
		ArrayList<AgenteDaSaude> bancoDeDados2 = new ArrayList<AgenteDaSaude>();
		AgenteDaSaude agente1 = new AgenteDaSaude("Luís Guerreiro", "10987654321", "Masculino", 01, 06, 1996, 10, 1234);
		bancoDeDados2.add(agente1);

		ArrayList<Paciente> bancoDeDados = new ArrayList<Paciente>();
		Paciente paciente1 = new Paciente("Bryan Santos", "10987654321", "Masculino", 02, 05, 1997, true, true, true,
				true, false);
		Paciente paciente2 = new Paciente("Rafael Silva", "43415700914", "Masculino", 03, 03, 1997, true, true, true,
				true, false);
		Paciente paciente3 = new Paciente("Nadya da Silva", "43615832411", "Feminino", 23, 8, 1996, false, false, false,
				false, false);
		Paciente paciente4 = new Paciente("Milena Teles", "41365458791", "Feminino", 26, 01, 2000, true, false, true,
				true, false);
		bancoDeDados.add(paciente1);
		bancoDeDados.add(paciente2);
		bancoDeDados.add(paciente3);
		bancoDeDados.add(paciente4);
		int id, senha, conta2 = -1, op2 = -1;
		// inicio do programa parte dos Agente de saude
		do {
			try {
				op2 = Integer.parseInt(JOptionPane.showInputDialog("\n\nDigite o numero da operação: "
						+ "\n\n1 - Fazer login \n\n2 - Adicionar agente da saúde \n\n3 - Alterar senha \n\n0 - Sair do Sistema"));
			} catch (NullPointerException e) {
				JOptionPane.showMessageDialog(null, "Informação Inválida, tente novamente");

			} catch (NumberFormatException a) {
				JOptionPane.showMessageDialog(null, "Informação Inválida, tente novamente");

			}
			switch (op2) {
			// Inicia o login no programa de vacinação
			case 1:
				id = Integer.parseInt(JOptionPane.showInputDialog("\n\nDigite o seu id: "));
				senha = Integer.parseInt(JOptionPane.showInputDialog("\n\nDigite a sua senha: "));
				for (int y = 0; y < bancoDeDados2.size(); y++) {
					if (bancoDeDados2.get(y).getId() == id && bancoDeDados2.get(y).getSenha() == senha) {
						conta2 = y;
					}
				}
				if (conta2 <= -1) {

					JOptionPane.showMessageDialog(null, "usuário ou senha invalida");

					break;
				} else {

					// Inicio do programa de Vacinação
					do {

						int dia = 0, mes = 0, ano = 0, polio = 0, tentano, hepatite, covid, TripliceViral, conta = -1,
								genero1;
						String nome = null, cpf = null, genero = null;
						boolean Vacina1 = false, Vacina2 = false, Vacina3 = false, Vacina4 = false, Vacina5 = false;
						try {
							op = Integer.parseInt(JOptionPane.showInputDialog("\n\nDigite o numero da operação: "
									+ "\n\n1 - Cadastrar Paciente \n\n2 - Procurar Cadastrado \n\n3 - Vacinar \n\n0 - Sair do Sistema"));
						} catch (NullPointerException e) {

							JOptionPane.showMessageDialog(null, "Informação Inválida, tente novamente");

						} catch (NumberFormatException a) {
							JOptionPane.showMessageDialog(null, "Informação Inválida, tente novamente");

						}
						switch (op) {
						// Vacinação Cadastro de Paciente
						case 1:
							try {
								nome = JOptionPane.showInputDialog("\n\nDigite o nome do Paciente ");
								nome = nome.substring(0, 1).toUpperCase().concat(nome.substring(1));

								do {
									cpf = JOptionPane.showInputDialog("\n\nDigite o CPF do Paciente: ");
								} while (cpf.length() != 11);
								for (int y = 0; y < bancoDeDados.size(); y++) {
									if (bancoDeDados.get(y).getCpf().equals(cpf)) {
										conta = y;
									}
								}
								if (conta > -1) {
									JOptionPane.showMessageDialog(null, "CPF já cadastrado");
									break;
								}
								do {
									genero1 = Integer
											.parseInt(JOptionPane.showInputDialog("\n\nDigite o numero da operação:"
													+ "\n\n1 - Masculino\n\n2 -Feminino \n\n3 -Outros"));
								} while (genero1 < 1 || genero1 > 3);
								if (genero1 == 1) {
									genero = "Masculino";
								}
								if (genero1 == 2) {
									genero = "Feminino";
								}
								if (genero1 == 3) {
									genero = "Outros";
								}
								do {
									dia = Integer.parseInt(
											JOptionPane.showInputDialog("\n\nDigite apenas o dia do nascimento: "));
								} while (dia < 1 || dia > 31);
								do {
									mes = Integer.parseInt(
											JOptionPane.showInputDialog("\n\nDigite apenas o mês do nascimento: "));
								} while (mes < 1 || mes > 12);
								do {
									ano = Integer.parseInt(
											JOptionPane.showInputDialog("\n\nDigite apenas o ano de nascimento: "));
								} while (ano < 1900 || ano > 2022);
								do {
									polio = Integer.parseInt(JOptionPane.showInputDialog(
											"\n\nJa tomou vacina da pólio: " + "\n\n1 - Sim\n\n2 -Não "));
								} while (polio < 1 || polio > 2);
								do {
									tentano = Integer.parseInt(JOptionPane.showInputDialog(
											"\n\nJa tomou vacina da tétano: " + "\n\n1 - Sim\n\n2 -Não "));
								} while (tentano < 1 || tentano > 2);
								do {
									hepatite = Integer.parseInt(JOptionPane.showInputDialog(
											"\n\nJa tomou vacina da hepatite: " + "\n\n1 - Sim\n\n2 -Não "));
								} while (hepatite < 1 || hepatite > 2);
								do {
									TripliceViral = Integer.parseInt(JOptionPane.showInputDialog(
											"\n\nJa tomou vacina da Triplice Viral: " + "\n\n1 - Sim\n\n2 -Não "));
								} while (TripliceViral < 1 || TripliceViral > 2);
								do {
									covid = Integer.parseInt(JOptionPane.showInputDialog(
											"\n\nJa tomou vacina da covid: " + "\n\n1 - Sim\n\n2 -Não "));
								} while (covid < 1 || covid > 2);

								Vacina1 = (polio == 1);
								Vacina2 = (tentano == 1);
								Vacina3 = (hepatite == 1);
								Vacina4 = (TripliceViral == 1);
								Vacina5 = (covid == 1);
								Paciente paciente5 = new Paciente(nome, cpf, genero, dia, mes, ano, Vacina1, Vacina2,
										Vacina3, Vacina4, Vacina5);
								bancoDeDados.add(paciente5);
								bancoDeDados.get(bancoDeDados.size() - 1).imprimirInfo();
							} catch (NullPointerException e) {
								JOptionPane.showMessageDialog(null, "Informação Inválida, tente novamente");
								break;
							} catch (NumberFormatException a) {
								JOptionPane.showMessageDialog(null, "Informação Inválida, tente novamente");
								break;
							}
							break;
						// Vacinação Localiza Paciente
						case 2:
							cpf = JOptionPane.showInputDialog("\n\nDigite o CPF do Paciente: ");
							for (int y = 0; y < bancoDeDados.size(); y++) {
								if (bancoDeDados.get(y).getCpf().equals(cpf)) {
									conta = y;
								}
							}
							if (conta > -1) {
								bancoDeDados.get(conta).imprimirInfo();
							} else {
								JOptionPane.showMessageDialog(null, "CPF não encontrado");
							}
							break;
						// Vacinar Paciente
						case 3:
							cpf = JOptionPane.showInputDialog("\n\nDigite o CPF do Paciente: ");
							for (int y = 0; y < bancoDeDados.size(); y++) {
								if (bancoDeDados.get(y).getCpf().equals(cpf)) {
									conta = y;
								}
							}
							if (conta > -1) {
								int ver = -1;
								try {
									ver = Integer
											.parseInt(JOptionPane.showInputDialog("\n\nDigite o numero da operação: "
													+ "\n\n1 - Vacina Pólio \n\n2 - Vacina Tétano \n\n3 - Vacina hepatite \n\n4 - Vacina Triplice Viral"
													+ "\n\n5 - Vacina Covid"));
								} catch (NullPointerException e) {
									JOptionPane.showMessageDialog(null, "Informação Inválida, tente novamente");
									break;
								} catch (NumberFormatException a) {
									JOptionPane.showMessageDialog(null, "Informação Inválida, tente novamente");
									break;
								}

								if (ver == 1) {
									bancoDeDados.get(conta).setVacinaPolio(true);
									bancoDeDados.get(conta).imprimirInfo();

								} else if (ver == 2) {
									bancoDeDados.get(conta).setVacinaTetano(true);
									bancoDeDados.get(conta).imprimirInfo();

								} else if (ver == 3) {
									bancoDeDados.get(conta).setVacinaHepatiteB(true);
									bancoDeDados.get(conta).imprimirInfo();

								} else if (ver == 4) {
									bancoDeDados.get(conta).setVacinaTripliceViral(true);
									bancoDeDados.get(conta).imprimirInfo();

								} else if (ver == 5) {
									bancoDeDados.get(conta).setVacinaCovid(true);
									bancoDeDados.get(conta).imprimirInfo();

								} else {
									JOptionPane.showMessageDialog(null, "Opção invalida, tente novamente");
								}

							}

							else {
								JOptionPane.showMessageDialog(null, "CPF não encontrado");
							}
							break;

						case 0:
							JOptionPane.showMessageDialog(null, "Deslogando do Sistema");
							break;
						default:
							JOptionPane.showMessageDialog(null, "Escolha uma opção valida");
							break;
						}
					} while (op != 0);
					// Vacinação deslogando dessa parte do programa
					break;
				}
				// Programa parte da adicionar um novo agente da saude
			case 2:
				try {
					id = Integer.parseInt(JOptionPane.showInputDialog("\n\nDigite o seu id: "));
					senha = Integer.parseInt(JOptionPane.showInputDialog("\n\nDigite a sua senha: "));
					for (int y = 0; y < bancoDeDados2.size(); y++) {
						if (bancoDeDados2.get(y).getId() == id && bancoDeDados2.get(y).getSenha() == senha) {
							conta2 = y;
						}
					}
					if (conta2 <= -1) {
						JOptionPane.showMessageDialog(null, "usuário ou senha invalido/a");
						break;
					} else {
						int dia = 0, mes = 0, ano = 0, conta = -1, genero1, usuarioId = 0, novaSenha = 0,
								novaSenha2 = 0;
						String nome = null, cpf = null, genero = null;

						nome = JOptionPane.showInputDialog("\n\nDigite o nome do novo usuário: ");
						nome = nome.substring(0, 1).toUpperCase().concat(nome.substring(1));
						do {
							cpf = JOptionPane.showInputDialog("\n\nDigite o CPF do novo usuário: ");
						} while (cpf.length() != 11);
						for (int y = 0; y < bancoDeDados2.size(); y++) {
							if (bancoDeDados2.get(y).getCpf().equals(cpf)) {
								conta = y;
							}
						}
						if (conta > -1) {
							JOptionPane.showMessageDialog(null, "CPF já cadastrado");
							break;
						}
						do {
							genero1 = Integer
									.parseInt(JOptionPane.showInputDialog("\n\nDigite o numero correspondente ao sexo:"
											+ "\n\n1 - Masculino\n\n2 -Feminino \n\n3 -Outros"));
						} while (genero1 < 1 || genero1 > 3);
						if (genero1 == 1) {
							genero = "Masculino";
						}
						if (genero1 == 2) {
							genero = "Feminino";
						}
						if (genero1 == 3) {
							genero = "Outros";
						}
						do {
							dia = Integer
									.parseInt(JOptionPane.showInputDialog("\n\nDigite apenas o dia do nascimento: "));
						} while (dia < 1 || dia > 31);
						do {
							mes = Integer
									.parseInt(JOptionPane.showInputDialog("\n\nDigite apenas o mês do nascimento: "));
						} while (mes < 1 || mes > 12);
						do {
							ano = Integer
									.parseInt(JOptionPane.showInputDialog("\n\nDigite apenas o ano de nascimento: "));
						} while (ano < 1900 || ano > 2022);
						usuarioId = Integer.parseInt(JOptionPane.showInputDialog("\n\nColoque a nova Id numérica: "));
						for (int y = 0; y < bancoDeDados2.size(); y++) {
							if (bancoDeDados2.get(y).getId() == usuarioId) {
								conta = y;
							}
						}
						if (conta > -1) {
							JOptionPane.showMessageDialog(null, "Id já cadastrado");
							break;
						}
						do {
							novaSenha = Integer
									.parseInt(JOptionPane.showInputDialog("\n\nDigite uma senha numérica: "));
							novaSenha2 = Integer.parseInt(JOptionPane.showInputDialog("\n\nRepita a senha numérica: "));
							if (novaSenha != novaSenha2) {
								JOptionPane.showMessageDialog(null, "Erro, senhas diferentes tente novamente: ");
							}
						} while (novaSenha != novaSenha2);
						AgenteDaSaude agente2 = new AgenteDaSaude(nome, cpf, genero, dia, mes, ano, usuarioId,
								novaSenha);
						bancoDeDados2.add(agente2);
						bancoDeDados2.get(bancoDeDados2.size() - 1).imprimirInfo();
					}
				} catch (NullPointerException e) {
					JOptionPane.showMessageDialog(null, "Informação Inválida, tente novamente");
				} catch (NumberFormatException a) {
					JOptionPane.showMessageDialog(null, "Informação Inválida, tente novamente");
				}
				break;
			// PArte de trocar senha a senha agente da Saude
			case 3:
				try {
					id = Integer.parseInt(JOptionPane.showInputDialog("\n\nDigite o seu id: "));
					senha = Integer.parseInt(JOptionPane.showInputDialog("\n\nDigite o sua senha: "));
					for (int y = 0; y < bancoDeDados2.size(); y++) {
						if (bancoDeDados2.get(y).getId() == id && bancoDeDados2.get(y).getSenha() == senha) {
							conta2 = y;
						}
					}
					if (conta2 >= -1) {
						int novaSenha, novaSenha2;
						do {
							novaSenha = Integer
									.parseInt(JOptionPane.showInputDialog("\n\nDigite uma nova senha numérica: "));
							novaSenha2 = Integer
									.parseInt(JOptionPane.showInputDialog("\n\nRepita a nova senha numérica: "));
							if (novaSenha != novaSenha2) {
								JOptionPane.showMessageDialog(null, "Erro, senhas diferentes tente novamente: ");
							}
						} while (novaSenha != novaSenha2);
						bancoDeDados2.get(conta2).setSenha(novaSenha2);
						break;
					} else {
						JOptionPane.showMessageDialog(null, "usuário ou senha invalida");
						break;
					}
				} catch (NullPointerException e) {
					JOptionPane.showMessageDialog(null, "Informação Inválida, tente novamente");
				} catch (NumberFormatException a) {
					JOptionPane.showMessageDialog(null, "Informação Inválida, tente novamente");
				}
				// finaliza o programa
			case 0:
				JOptionPane.showMessageDialog(null, "Saindo do Sistema");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Escolha uma opção valida");
				break;
			}
			// finaliza o programa
		} while (op2 != 0);
	}
}
