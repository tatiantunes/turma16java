programa
{/*
Faça um programa que leia um vetor de 5 posições para números reais e, depois,
um código inteiro. Se o código for zero, finalize o programa; 
se for 1, mostre o vetor na ordem direta; se for 2, mostre o vetor na ordem inversa. 
Caso, o código for diferente de 1 e 2, escreva uma mensagem informando que o código inválido.
*/
	
	funcao inicio()
	{
		caracter codigo
	 	real lista[5]
	 	real num

	 	para(inteiro x = 0; x<5; x++)
	 	{
	 		escreva("Digite um numero: ")
	 		leia(lista[x])
	 		
	 	}
		escreva("\nDigite um codigo para ser mostrado a lista de numeros")
		escreva("\n0 - Programa finalizado 1 - Ordem Direta - 2 - Ordem Inversa")
	 	leia(codigo)
	 	enquanto (codigo != '1' e codigo != '2' e codigo != '3' )
	 	{
	 		escreva("\nCodigo invalido!!!")
	 		escreva("\nDigite um codigo para ser mostrado a lista de numeros")
			escreva("\n0 - Programa finalizado 1 - Ordem Direta - 2 - Ordem Inversa")
			leia(codigo)
	 	}

	 	se(codigo == '1')
	 	{
	 		escreva("A lista direta dos numeros \n")
	 		para(inteiro x = 0; x<5; x++)
	 	{
	 		escreva("\t" +lista[x])
	 		
	 		
	 	}
	 	}
	 	se(codigo == '2')
	 	{
	 		escreva("A lista inversa dos numeros \n")
	 		para(inteiro x = 4; x>=0; x--)
	 	{
	 		escreva("\t" +lista[x])
	 		//escreva(x)
	 		
	 	}
	 	}
	 	se(codigo == '0')
	 	{
	 		escreva("FIM do Programa")
	 	}

	 	
	 	
	 	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1343; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */