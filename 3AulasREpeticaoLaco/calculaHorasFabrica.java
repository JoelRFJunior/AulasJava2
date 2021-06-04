package bloco1;

import java.util.Scanner;

//import java.util.Scanner;

public class calculaHorasFabrica {
	public static void main(String[] args) {
	int horas, minutos, segundos, segundostotais;
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("\nescreva quanto tempo em segundos os evento dura");
	
	segundostotais = leia.nextInt();
	horas = segundostotais/3600;
	minutos = (segundostotais%3600)/60;
	segundos = (segundostotais%3600)%60;
		
	System.out.println("\no evento vai durar "+ horas+ "horas "+minutos+" minutos "+ segundos+ " segundos" );
	
	}
}
