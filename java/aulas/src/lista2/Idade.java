package lista2;

import java.util.Scanner;

//27/01/2021
/*
* Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual categoria 
* ela se encontra:
10-14 infantil
15-17 juvenil
18-25 adulto

*/
public class Idade {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade;
		
		
		System.out.print("Digite sua idade: ");
		idade = leia.nextInt();
		
		if(idade>=10 && idade<=14)
		{
			System.out.println("Sua idade � " + idade + " anos, logo assim voce est� na categoria infantil");
		}
		
		if(idade>=15 && idade<=17)
		{
			System.out.println("Sua idade � " + idade + " anos, logo assim voce est� na categoria juvenil");
		}
		if(idade>=18 && idade<=25)
		{
			System.out.println("Sua idade � " + idade + " anos, logo assim voce est� na categoria adulto");
		}
		if(idade<10 || idade>25)
		{
			
			System.out.println("Sua idade � " + idade + " anos e sua idade n�o est� em nenhuma categoria");
			
		}
			

	}

}
