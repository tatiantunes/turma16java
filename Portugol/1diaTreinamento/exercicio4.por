programa
{//Escreva um sistema que leia tres numeros inteiros e positivos(A,B,C) e calcule a seguinte expressao
	
	funcao inicio()
	{
		inteiro a, b, c,r,s, resultado
		escreva("Digite o primeiro numero ")
		leia(a)
		escreva("\nDigite o segundo numero ")
		leia(b)
		escreva("\nDigite o terceiro numero ")
		leia(c)

		r = (a+b)*(a+b)
		s = (b+c)*(b+c)
		escreva ("A primeira operação é " + r)
		escreva("A segunda operação é " + s)
		resultado = ((r+s)/2)
		escreva("\nLogo assim nos temos " +resultado) 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 502; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */