package lista2;
//27/01/2021
/*
* Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par 
* ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar 
* exiba o n�mero elevado ao quadrado.
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
			System.out.println("Equa��o do par");
			resultado = Math.pow(x,2);
			System.out.println("O resultado � : " + resultado);
			
		}
		
		else {
			System.out.println("Equa��o do impar");
			resultado = Math.sqrt(x);
			System.out.println("O resultado � : " + resultado);
			
		}
	}

}
