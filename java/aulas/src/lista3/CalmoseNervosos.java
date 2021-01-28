package lista3;
/*
 * Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas psicol�gicas dos indiv�duos de uma regi�o.
 *  Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), 
 *  e as op��es (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
 *  Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
o n�mero de pessoas calmas; 
o n�mero de mulheres nervosas; 
o n�mero de homens agressivos; 
o n�mero de outros calmos;
o n�mero de pessoas nervosas com mais de 40 anos; 
o n�mero de pessoas calmas com menos de 18 anos.

 */

import java.util.Scanner;
public class CalmoseNervosos 
{
	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		int idade;
		int sexo;
		int opcoes;
		int contadorPessoas = 0;
		int contadorPessoasCalmas = 0;
		int contadorMulheresNervosa = 0;
		int contadorHomensAgressivos = 0;
		int contadoroutroscalmos = 0;
		int contadorpessoasnervosasMaior40 = 0;
		int contadorpessoascalmasMenor18 = 0;
		
		
		System.out.println("Qual sua idade ");
		idade = leia.nextInt();
		System.out.println("Qual seu sexo, digite sexo (1-feminino / 2-masculino / 3-Outros) ");
		sexo = leia.nextInt();
		System.out.println("Qual seu estado emocional , digite (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva)");
		opcoes = leia.nextInt();
	
		while(contadorPessoas != 3)
		{	
			if(opcoes == 1) 
			{
				contadorPessoasCalmas++;
			}
			if(sexo == 1 && opcoes == 2)
			{
				contadorMulheresNervosa++;
				
			}
			if(sexo == 2 && opcoes == 3)
			{
				contadorHomensAgressivos++; 
			}
			
			if(sexo == 3 && opcoes == 1)
			{
				contadoroutroscalmos++;
			}
			
			if (opcoes == 2 && idade >40)
			{
				contadorpessoasnervosasMaior40++;
			}
			if(opcoes == 1 && idade<18)
			{
				contadorpessoascalmasMenor18++;
			}
			contadorPessoas ++;
			System.out.println("Qual sua idade ");
			idade = leia.nextInt();
			System.out.println("Qual seu sexo, digite sexo (1-feminino / 2-masculino / 3-Outros) ");
			sexo = leia.nextInt();
			System.out.println("Qual seu estado emocional , digite (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva)");
			opcoes = leia.nextInt();
			
			
		}
		System.out.println("O n�mero de pessoas calmas: " + contadorPessoasCalmas);
		System.out.println("O n�mero de mulheres nervosas: " + contadorMulheresNervosa);
		System.out.println("O n�mero de homens agressivos:  "+ contadorHomensAgressivos );
		System.out.println("O n�mero de outros calmos: "+ contadoroutroscalmos);
		System.out.println("O n�mero de pessoas nervosas com mais de 40 anos: "+ contadorpessoasnervosasMaior40);
		System.out.println("O n�mero de pessoas calmas com menos de 18 anos."+ contadorpessoascalmasMenor18);
	

}
}

