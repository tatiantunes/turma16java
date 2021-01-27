programa
{//Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
//a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
//b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.

	
	funcao inicio()
	{
		inteiro matN1[4][6]
		inteiro matN2[4][6]
		
		inteiro matM1[4][6]
		inteiro matM2[4][6]

		para(inteiro linha = 0; linha < 4 ; linha ++)
		{
			para( inteiro coluna = 0; coluna < 6 ;coluna ++)
			{
			escreva("Digite o valor para a matriz N1 ")
			leia(matN1[linha][coluna])
			}
		}

		para(inteiro linha = 0; linha < 4 ; linha ++)
		{
			para(inteiro coluna = 0; coluna < 6; coluna++)
			{
			escreva("Digite o valor para a matriz N2 ")
			leia(matN2[linha][coluna])
			
			}
		}

		para(inteiro linha = 0; linha < 4 ; linha ++)
		{
			para(inteiro coluna = 0; coluna < 6;coluna++)
			{
				matM1[linha][coluna] = matN1[linha][coluna] + matN2[linha][coluna]
				escreva("[" +matM1[linha][coluna] + " ]" )
			}
			escreva("\n")
		}
			
			
		para(inteiro linha = 0; linha < 4 ; linha ++)
		{
			para(inteiro coluna = 0; coluna < 6;coluna++)
			{
				matM2[linha][coluna] = matN1[linha][coluna] - matN2[linha][coluna]
				escreva("[" +matM2[linha][coluna] + " ]" )
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
 * @POSICAO-CURSOR = 1303; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matN1, 9, 10, 5}-{matN2, 10, 10, 5}-{matM1, 12, 10, 5}-{matM2, 13, 10, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */