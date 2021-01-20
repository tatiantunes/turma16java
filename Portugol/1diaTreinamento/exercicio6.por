programa
	// Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula 
	{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		real x1, y1, x2, y2 
		real equacao
		real raiz
		escreva("\nDigite uma entrada para x1 ")
		leia(x1)
		escreva("\nDigite uma entrada para y1 ")
		leia(y1)
		escreva("\nDigite uma entrada para x2 ")
		leia(x2)
		escreva("\nDigite uma entrada para y2 ")
		leia(y2)

		equacao = (x2 - x1)*(x2 - x1) + (y2 -y1)*(y2 - y1)
		
		
		raiz = mat.raiz(equacao, 2.0)

		escreva("\nA raiz quadrada dessa operação é " +raiz)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 629; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */