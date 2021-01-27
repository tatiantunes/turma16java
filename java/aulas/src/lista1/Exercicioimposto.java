package lista1;

import java.util.Scanner;

public class Exercicioimposto {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		

		double impostos;
		double precof;
		double custototal;


		System.out.println("\nQual foi o custo da fabrica do carro ");
		precof = leia.nextDouble();

		custototal = precof + (precof* 0.28) + (precof * 0.45);
		System.out.println("\nO custo total é " + custototal);
			
		}
}
