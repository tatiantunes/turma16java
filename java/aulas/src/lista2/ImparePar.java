package lista2;
//27/01/2021
/*
* Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par 
* ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for ímpar 
* exiba o número elevado ao quadrado.
*/

import java.util.Scanner;

public class ImparePar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);	
		
		
		double x , resultado;
		System.out.println("Digite um numero");
		x= leia.nextInt();
		
		if(x%2 == 0)
		{
			System.out.println("Equação do par");
			resultado = Math.pow(x,2);
			System.out.println("O resultado é : " + resultado);
			
		}
		
		else {
			System.out.println("Equação do impar");
			resultado = Math.sqrt(x);
			System.out.println("O resultado é : " + resultado);
			
		}
	}

}
