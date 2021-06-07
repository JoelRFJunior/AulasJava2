package bloco1;

import java.util.Scanner;

public class Exercico4Matrizes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça
		 * ao usuário um menu de opções: (1) somar as duas matrizes (2) subtrair a
		 * primeira matriz da segunda (3) adicionar uma constante as duas matrizes (4)
		 * imprimir as matrizes Nas duas primeiras opções uma terceira matriz 2 x 2 deve
		 * ser criada. Na terceira opção o valor da constante deve ser lido e o
		 * resultado da adição da constante deve ser armazenado na própria matriz.
		 */
		float[][] matrizA = new float[2][2];
		float[][] matrizB = new float[2][2];
		float[][] matrizC = new float[2][2];
		Scanner leia = new Scanner(System.in);
		int l, c, op, constante;

		for (l = 0; l < 2; l++) {
			for (c = 0; c < 2; c++) {
				System.out.println("\n Digite um numero Para a primeira matriz");
				matrizA[l][c] = leia.nextFloat();

			}
		}
		for (l = 0; l < 2; l++) {
			for (c = 0; c < 2; c++) {
				System.out.println("\n Digite um numero Para a primeira matriz");
				matrizB[l][c] = leia.nextFloat();

			}
		}
		do {
			System.out.println("\n Digite o que fazer com essas Matrizes:");
			System.out.println("\n (1) somar as duas matrizes");
			System.out.println("\n (2) subtrair a primeira matriz da segunda");
			System.out.println("\n (3) adicionar uma constante as duas matrizes");
			System.out.println("\n (4) imprimir as matrizes");
			op = leia.nextInt();
		} while (op < 1 || op > 4);

		switch (op) {
		case (1):
			for (l = 0; l < 2; l++) {
				for (c = 0; c < 2; c++) {
					matrizC[l][c] = matrizA[l][c] + matrizB[l][c];
					System.out.print(" " + matrizC[l][c]);
				}
				System.out.println();
			}
			break;
		case (2):
			for (l = 0; l < 2; l++) {
				for (c = 0; c < 2; c++) {
					matrizC[l][c] = matrizA[l][c] - matrizB[l][c];
					System.out.print(" " + matrizC[l][c]);
				}
				System.out.println();
			}
			break;
		case (3):
			System.out.println("\n Digite a constante que quer usar: ");
			constante = leia.nextInt();
			for (l = 0; l < 2; l++) {
				for (c = 0; c < 2; c++) {
					matrizA[l][c] = matrizA[l][c] + constante;
					System.out.print(" " + matrizA[l][c]);
				}
				System.out.println();
			}
			System.out.println();
			for (l = 0; l < 2; l++) {
				for (c = 0; c < 2; c++) {
					matrizB[l][c] = matrizB[l][c] + constante;
					System.out.print(" " + matrizB[l][c]);
				}
				System.out.println();
			}
			break;
		case (4):
			for (l = 0; l < 2; l++) {
				for (c = 0; c < 2; c++) {
					System.out.print(" " + matrizA[l][c]);
				}
				System.out.println();
			}
		System.out.println();
			for (l = 0; l < 2; l++) {
				for (c = 0; c < 2; c++) {
					System.out.print(" " + matrizB[l][c]);
				}
				System.out.println();
			}
			break;

		}

	}

}
