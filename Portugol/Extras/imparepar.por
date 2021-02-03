programa
{//numero natural par ou impar
// mensagens desculpas	
	funcao inicio()
	{
		inteiro num1
		escreva("Digite um numero ")
		leia(num1)
		
		se(num1 % 2 == 0 e num1 > 0 )
		{
		escreva("Esse numero é par ")
		}
		
		senao se (num1 < 0)
		{
		escreva("Esse numero é negativo")		
		}
		senao se (num1 == 0)
		{
		escreva("Esse numero é neutro")	
		}
		senao
		escreva("Esse numero é impar ")

	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 181; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */