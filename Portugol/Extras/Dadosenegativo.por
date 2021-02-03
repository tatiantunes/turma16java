programa
{/*Escrever um programa que leia uma quantidade desconhecida de números e conte quantos deles estão 
nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. 
A entrada de dados deve terminar quando for lido um número negativo.
*/
	
	funcao inicio()
	{
		inteiro num 
		inteiro contador1 = 0
		inteiro contador2 = 0
		inteiro contador3 = 0
		inteiro contador4 = 0
		
		faca
		{
			escreva("Digite um numero e caso queira sair do programa digite um numero negativo ")
			leia(num)
			se (num>0 e num<=25)
			{
				contador1++	
			}
			se (num>25 e num<=50)
			{
				contador2++	
			}
			se (num>50 e num<=75)
			{
				contador3++	
			}
			se (num>75 e num<=100)
			{
				contador4++	
			}
			
			
		}enquanto(num>0)
		
		escreva("\nOs numero lidos no intervalo de 0 - 25 foram " +contador1 + 
				"\nOs numero lidos no intervalo de 26 - 50 foram " +contador2 +
				"\nOs numero lidos no intervalo de 51 - 75 foram " +contador3 +
				"\nOs numero lidos no intervalo de 76 - 100 foram " +contador4 )
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 675; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */