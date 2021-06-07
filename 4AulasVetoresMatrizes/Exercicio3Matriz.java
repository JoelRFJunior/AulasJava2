package bloco1;

import java.util.Scanner;

public class Exercicio3Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz = new int[3][3];
		Scanner leia = new Scanner(System.in);
		int l, c, cont10 = 0;

		for (l = 0; l < 3; l++) {
			for (c = 0; c < 3; c++) {
				System.out.println("\n Digite um numero inteiro");
				matriz[l][c] = leia.nextInt();
				if (matriz[l][c] >= 10) {
					cont10++;
				}
			}
		}
		System.out.println("\n a array ficou assim");
		for (l = 0; l < 3; l++) {
			for (c = 0; c < 3; c++) {
				System.out.print(" " + matriz[l][c]);
			}
			System.out.println();
		}

		System.out.println("\n Ela possui " + cont10 + " valores maiores ou iguais que 10");

	}
}
