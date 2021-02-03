programa
{/*
Faça um programa que lê um vetor de 3 elementos e uma matriz de 3 x 3 elementos. 
Em seguida o programa deve fazer a multiplicação do vetor pelas colunas da matriz.
*/


	
	funcao inicio()
	{
		inteiro lista[3]
		inteiro matriz[3][3]
		inteiro matriz1[3][3]		
		para(inteiro x=0;x<3;x++)
		{
			escreva("Digite o valor do vetor: " + "\n")
			leia(lista[x])
			
			
		}
		para(inteiro linha = 0; linha < 3 ; linha ++)
		{
			para( inteiro coluna = 0; coluna < 3 ;coluna ++)
			{
			escreva("\nDigite o valor para a matriz 3x3 ")
			leia(matriz[linha][coluna])
			}
		}
		escreva("\nA matriz nova multiplicada por esse valores nas colunas\n")
		para(inteiro x=0;x<3;x++)
		{
			
			escreva ("\t" +lista[x])
			
			
		}

		escreva("\n")
			
		para(inteiro linha = 0; linha < 3 ; linha ++)
		{
			para(inteiro coluna = 0; coluna < 3; coluna++)
			{
				matriz1[linha][coluna] = matriz[linha][coluna] * lista[linha]
				escreva( "\t"+"[" +matriz1[linha][coluna] + " ]" )
			}	
			escreva("\n")
		}	
			
			
		
		
	
	
	
	}
	








	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 937; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 12, 10, 6}-{matriz1, 13, 10, 7};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */