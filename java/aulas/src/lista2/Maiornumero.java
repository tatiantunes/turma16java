package lista2;
//27/01/2021
/*
 * Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
 */
import java.util.Scanner;

public class Maiornumero {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int x, x1, x2;
		
		
		System.out.print("Digite um numero: ");
		x = leia.nextInt();
		System.out.print("Digite um oto numero: ");
		x1 = leia.nextInt();
		System.out.print("Digite mais um oto numero: ");
		x2 = leia.nextInt();
		
		
		if(x>x1 && x>x2)
		{
			System.out.println("Maior numero � : " + x );
		}
		else if (x1>x && x1>x2)
		{
			System.out.println("Maior numero � : " + x1 );
		}else {
			System.out.println("Maior numero � : " + x2 );
		}
		
		
	}

}
