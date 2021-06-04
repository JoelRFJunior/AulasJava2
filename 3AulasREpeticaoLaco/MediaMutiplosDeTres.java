package bloco1;

import java.util.Scanner;

public class MediaMutiplosDeTres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  valor,  soma = 0;
		double media = 0, contador = 0;
		Scanner ler = new Scanner(System.in);

		do {
			System.out.println("\ndigite o um numero inteiro");
			valor = ler.nextInt();
			if (valor % 3 == 0 && valor!=0) {
				soma += valor;
				contador ++;
			}

		} while (valor != 0);
		if(contador==0) {
			contador=1;
		}
		media = soma / contador;

		System.out.println("a media dos valores digitados multiplos de 3 é: " + media);
		
	}

}
