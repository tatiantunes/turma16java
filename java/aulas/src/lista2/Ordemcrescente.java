package lista2;

import java.util.Scanner;

//27/01/2021
/*
* Faça um programa que entre com três números e coloque em ordem crescente.
*/
public class Ordemcrescente {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int x, x1, x2;
		
		System.out.print("Digite um numero: ");
		x = leia.nextInt();
		System.out.print("Digite um oto numero: ");
		x1 = leia.nextInt();
		System.out.print("Digite mais um oto numero: ");
		x2 = leia.nextInt();
		
		System.out.println("A ordem cescente dos numeros lidos são ");
		if(x<=x1 && x<=x2)
		{
			
			System.out.print( x );
			if(x1<x2)
			{
				System.out.print ( "\t" + x1 +"\t" + x2 );
			}else
			{
				System.out.println("\t" +x2 +"\t" + x1 );
			}
			
		}
		
		if(x1<x && x1<x2)
		{
			
			System.out.print( x1 );
			if(x<x2)
			{
				System.out.print ( "\t" + x +"\t" + x2 );
			}else
			{
				System.out.println("\t" +x2 +"\t" + x );
			}
			
		}
		
		if(x2<x && x2<x)
		{
			
			System.out.print( x2 );
			if(x<x1)
			{
				System.out.print ("\t" + x +"\t" + x1 );
			}else
			{
				System.out.println("\t" +x1 +"\t" + x );
			}
			
		}
		

	}

}
