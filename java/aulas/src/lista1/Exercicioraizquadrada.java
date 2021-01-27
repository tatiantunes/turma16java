package lista1;

import java.util.Scanner;

public class Exercicioraizquadrada {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		double x1, y1, x2, y2; 
		double equacao;
		double raiz;
		System.out.println("\nDigite uma entrada para x1 ");
		x1 = leia.nextDouble();
		System.out.println("\nDigite uma entrada para y1 ");
		y1 = leia.nextDouble();
		System.out.println("\nDigite uma entrada para x2 ");
		x2 = leia.nextDouble();
		System.out.println("\nDigite uma entrada para y2 ");
		y2 = leia.nextDouble();

		equacao = (x2 - x1)*(x2 - x1) + (y2 -y1)*(y2 - y1);
		
		
		raiz = Math.sqrt(equacao);

		System.out.println("\nA raiz quadrada dessa operação é " +raiz);
		
		
	}
}
