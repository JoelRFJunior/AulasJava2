package Teste;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

	public class ContagemAno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		Date data = new Date();
		Date data2 = new Date();

		SimpleDateFormat getYearFormat2 = new SimpleDateFormat("MM");
		String mesCorrente = getYearFormat2.format(data2);

		SimpleDateFormat getYearFormat = new SimpleDateFormat("yyyy");

		String anoAtual = getYearFormat.format(data);

		System.out.println(anoAtual);
		System.out.println(mesCorrente);

		int i = Integer.parseInt(anoAtual);
		int m2 = Integer.parseInt(mesCorrente);

		int m = leia.nextInt();
		m = m - m2;

		int a = leia.nextInt();
		int teste = 0;

		if (m <= 0) {
			teste = i - a;
		} else {
			teste = i - a - 1;
		}

		System.out.println(teste);
	}
}
