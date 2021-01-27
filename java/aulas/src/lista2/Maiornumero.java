package lista2;
//27/01/2021
/*
 * Faça um programa que receba três inteiros e diga qual deles é o maior.
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
			System.out.println("Maior numero é : " + x );
		}
		else if (x1>x && x1>x2)
		{
			System.out.println("Maior numero é : " + x1 );
		}else {
			System.out.println("Maior numero é : " + x2 );
		}
		
		
	}

}
