package bloco1;

import java.util.Scanner;

public class VetoresExercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2- Fa�a um programa que receba 6 n�meros inteiros e mostre:
		� Os n�meros pares digitados;
		� A soma dos n�meros pares digitados;
		� Os n�meros �mpares digitados;
		� A quantidade de n�meros �mpares digitados.
		 */
		int [] numeros = new int[6]; //oat [] notas = new float[y];
		Scanner leia =new Scanner(System.in);
		int somapar=0, contimpar=0;
		for(int x=0;x<numeros.length;x++) {
			System.out.println("\n Digite um numero inteiro");
			numeros[x] = leia.nextInt();
			if(numeros[x]%2==0) {
				somapar+=numeros[x];
			}else {
				contimpar++;
			}
							
		}
		System.out.println("\n a array ficou assim");
		for(int x=0;x<6;x++) {
			System.out.print(" " + numeros[x]);
		}
		System.out.println("\n a soma de seus numeros pares �: " + somapar);
		System.out.println("\n a quantidade de seus numeros �mpares �: " + contimpar);
	}

}
