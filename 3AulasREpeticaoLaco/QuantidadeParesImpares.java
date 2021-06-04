package bloco1;

import java.util.Scanner;

public class QuantidadeParesImpares {

	public static void main(String[] args) {
		
		int numero,contpar=0,contimpar=0;
		Scanner ler = new Scanner(System.in);

		for (int x = 0; x < 10; x++) {
			System.out.println("\ndigite um numero");
			numero = ler.nextInt();
			if(numero%2==0) {
				contpar++;
			}else {
				contimpar++;
			}
			
		}
		System.out.println("\nVoce digitou "+ contpar +" numeros pares");
		System.out.println("\nVoce digitou "+ contimpar +" numeros ímpares");
		// TODO Auto-generated method stub

	}

}
