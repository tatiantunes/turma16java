programa
{
	inclua biblioteca Util//\nUm dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere um vetor 
//\ncom os lançamentos, escreva esse vetor. A seguir determine e imprima a média aritmética dos lançamentos,
//\ncontabilize e apresente também quantas foram as ocorrências da maior pontuação.
	
	funcao inicio()
	{
		inteiro lancamento[10]
		inteiro num
		inteiro x
		inteiro soma = 0
		inteiro maiorNum = 0
		inteiro contador = 0

		para( x= 0 ;x<10;x++)
		{
			lancamento[x] = Util.sorteia(1,6)
			

			soma +=lancamento[x]
			se(lancamento[x] > maiorNum){
		 		maiorNum = lancamento[x]
		 	}			
				}
			escreva("\nA sequencia de lançamentos é: " )
		para (x = 0; x<10 ;x++)
		{
			escreva ("\t" + lancamento[x]+"\t" )	
				
		}
		para (x= 0;x<10;x++)
		{
			se(lancamento[x]==maiorNum)
			{
				contador ++
			}
		
		}

		
			soma = soma/10
			escreva ("\nA media foi " + soma)	
			escreva("\nO maior numero foi " + maiorNum + "\nE apareceu " + contador + " vezes")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 852; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */