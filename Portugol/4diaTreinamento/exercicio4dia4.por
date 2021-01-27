programa
//  Crie um programa que receba valores do usuário para preencher uma matriz 3X3, 
// e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal, 
// ou seja, diagonal principal.

{	
	funcao inicio()
	{
		inteiro valores[3][3]
		real somaValores = 0.0
		real somaDiagonal = 0.0
		
		para(inteiro y = 0; y<3; y++)
		{
			para(inteiro x = 0; x <3;x++)
			{
			escreva("Os valores são ")
			leia(valores[y][x])
			somaValores +=valores[y][x]

			se(x == y )
			{
			somaDiagonal +=valores[y][x]
			}
			}
		}
		escreva("\nA soma deu " + somaValores)
		escreva ("\nA soma diagonal " + somaDiagonal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 403; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {valores, 9, 10, 7};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */