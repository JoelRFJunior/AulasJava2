package bloco1;

import java.util.Scanner;

public class SomarAteZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int soma = 0, valor;
		Scanner ler = new Scanner(System.in);

		do {
			System.out.println("\ndigite o um numero inteiro");
			valor = ler.nextInt();
			soma += valor;

		} while (valor != 0);

		System.out.println("a soma dos valores digitados é:" + soma);
	}

}
