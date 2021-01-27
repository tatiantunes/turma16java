package lista1;

import java.util.Scanner;

public class Exercicioresultado {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int a, b, c,r,s, resultado;
		System.out.println("Digite o primeiro numero ");
		a=leia.nextInt();
		System.out.println("\nDigite o segundo numero ");
		b=leia.nextInt();
		System.out.println("\nDigite o terceiro numero ");
		c=leia.nextInt();

		r = (a+b)*(a+b);
		s = (b+c)*(b+c);
		System.out.println ("A primeira operação é " + r);
		System.out.println("A segunda operação é " + s);
		resultado = ((r+s)/2);
		System.out.println("\nLogo assim nos temos " +resultado) ;
		}
}
