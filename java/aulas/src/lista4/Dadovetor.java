package lista4;
import java.util.Scanner;
import java.util.Random;
//\nUm dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere um vetor 
//\ncom os lançamentos, escreva esse vetor. A seguir determine e imprima a média aritmética dos lançamentos,
//\ncontabilize e apresente também quantas foram as ocorrências da maior pontuação.
	

public class Dadovetor
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		Random random = new Random();
		int lancamento[] = new int [10];
		int num;
		int x;
		int soma = 0;
		int maiorNum = 0;
		int contador = 0;
		for( x= 0 ;x<10;x++)
		{
			lancamento[x] = random.nextInt(6);
			

			soma +=lancamento[x];
			if(lancamento[x] > maiorNum)
			{
		 		maiorNum = lancamento[x];
			}			
			
			
		}
		System.out.println("\nA sequencia de lançamentos é: " )	;
		for (x = 0; x<10 ;x++)
		{
			System.out.println("\t" + lancamento[x]+"\t" );	
				
		}
		
		for (x= 0;x<10;x++)
		{
			if(lancamento[x]==maiorNum)
			{
				contador ++;
			}
		
		}
		
		soma = soma/10;
		System.out.println ("\nA media foi " + soma);	
		System.out.println("\nO maior numero foi " + maiorNum + "\nE apareceu " + contador + " vezes");


	}
}	
