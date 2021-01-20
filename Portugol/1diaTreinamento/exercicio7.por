programa
{// a, b, c, d, e, f
	
	funcao inicio()
	{
		real a, b, c, d, iteme, f, x, y

		escreva("\nDigite um valor para a: ")
		leia(a)
		escreva("\nDigite um valor para b: ")
		leia(b)
		escreva("\nDigite um valor para c: ")
		leia(c)
		escreva("\nDigite um valor para d: ")
		leia(d)
		escreva("\nDigite um valor para e: ")
		leia(iteme)
		escreva("\nDigite um valor para f: ")
		leia(f)

		x = ((c*iteme)-(b*f))/((a*iteme) -(b*d))

		escreva("\nO valor do x é " +x)
		y = ((a*f)-(c*d))/((a*iteme)-(b*d))
		escreva("\nO valor do y é " +y)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 526; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */