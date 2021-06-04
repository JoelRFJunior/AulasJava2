package bloco1;

import java.util.Scanner;

public class IdadeDasPessoas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade, cont21 = 0, cont50 = 0, contmeio = 0;
		Scanner ler = new Scanner(System.in);
		/*
		 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		 * 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		 * idade for =-99. (WHILE)
		 */
		System.out.println("\n digite a idade do novo usuário ");
		idade = ler.nextInt();
		while (idade != -99) {
			if (idade <= 21) {
				cont21++;
			} else if (idade >= 50) {
				cont50++;
			} else {
				contmeio++;
			}

			System.out.println("\n digite a idade do novo usuário ");
			idade = ler.nextInt();
		}

		System.out.println("o numero de pessoas de idade menor de 21 anos é: "+ cont21 );
		System.out.println("o numero de pessoas de idade maior de 50 anos é: "+ cont50 );
		System.out.println("o numero de pessoas de idade entre essas "+ contmeio );
	}

}
