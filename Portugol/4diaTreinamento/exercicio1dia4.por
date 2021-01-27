programa
{//\nFaça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade

//e o escreva em seguida. Encontre após a maior pontuação e a apresente. 

	
	funcao inicio()
	{
		inteiro vetor[4] 
		
		inteiro maiorNum = 0  

		para(inteiro y = 0; y <4.;y++)
		{
			escreva("\nDigite um numero: ")
			leia(vetor[y])
			
			se(vetor[y] > maiorNum){
		 		maiorNum = vetor[y]
		 	}
		 	escreva("\nO valor do numero "+(y+1)+ " foi: "+ vetor[y])
		}
	
		escreva("\n A maior nota foi " + maiorNum)
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 402; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */