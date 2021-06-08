package bloco1;

import java.util.Scanner;

public class TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente consumidor1 = new Cliente("Joel Roberto",29,"Masculino","Iphone 7");
		Cliente consumidor2 = new Cliente("Camila",33,"Feminino","Cadeira de massagem");
		Cliente consumidor3 = new Cliente("Ariel",21,"Outros","Cadeira gamer X47");
		Cliente consumidor4 = new Cliente("Leticia",17,"Feminino","Mouse Razer 154x");
		
		consumidor1.infoDeCompra();
		System.out.println();
		consumidor2.infoDeCompra();
		System.out.println();
		consumidor3.infoDeCompra();
		System.out.println();
		consumidor4.infoDeCompra();
		System.out.println();
	}

}
