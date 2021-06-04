package bloco1;

import java.util.Scanner;

public class PesquisaEmpresaPsicologica {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		int idade, sexo, nerv40 = 0, calmo18 = 0, mulhnerv = 0, homemagre = 0, pessoas = 0, outroscalmo = 0,
				pessoascalma = 0, humor = 0;
		Scanner ler = new Scanner(System.in);
		
		while (pessoas <= 150) {
			System.out.println("\ndigite o numero correspondente ao seu sexo :");
			System.out.println("\n sexo (1-feminino / 2-masculino / 3-Outros)");
			sexo = ler.nextInt();
			System.out.println("\ndigite a sua idade :");
			idade = ler.nextInt();
			System.out.println("\ndigite o numero correspondente ao seu humor :");
			System.out
					.println("\n 1: se a pessoa era calma; 2: se a pessoa era nervosa e 3: se a pessoa era agressiva");
			humor = ler.nextInt();

			if (humor >= 1 && humor <= 3 && sexo >= 1 && sexo <= 3 && idade > 0) {
				if (humor == 1) {
					pessoascalma++;
				}
				if (sexo == 1 && humor == 2) {
					mulhnerv++;
				}
				if (sexo == 1 && humor == 3) {
					homemagre++;
				}
				if (sexo == 3 && humor == 1) {
					outroscalmo++;
				}
				if (idade >= 40 && humor == 2) {
					nerv40++;

				}
				if (idade <= 18 && humor == 1) {
					calmo18++;
				}
				pessoas++;

			} else {
				System.out.println("\ndigite opções validas");
				System.out.println("\nrecomece");
			}

		}
		System.out.println("\no numero de pessoas calmas é: " + pessoascalma);
		System.out.println("\no número de mulheres nervosas é: " + mulhnerv);
		System.out.println("\no número de homens agressivos é: " + homemagre);
		System.out.println("\no número de outros calmos é: " + outroscalmo);
		System.out.println("\no número de pessoas nervosas com mais de 40 anos é: " + nerv40);
		System.out.println("\no número de pessoas calmas com menos de 18 anos é: " + calmo18);

	}

}
