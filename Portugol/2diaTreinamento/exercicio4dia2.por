programa
{//Faça um sistema que leia um número inteiro e mostre uma mensagem indicando 
//se este número é par ou ímpar, e se é positivo ou negativo.
	
	funcao inicio()
	{
		inteiro num1
		escreva("Digite um numero ")
		leia(num1)
		
		se(num1 > 0)
		{
			se(num1 % 2 == 0){
				escreva("Esse numero é positivo e par")
			}senao
			escreva ("\nEsse numero é positivo e impar")
			
		} 
			se(num1 < 0 )
				{
				se(num1 % 2 == 0){
					escreva("Esse numero é negativo e par")
					}senao
				escreva ("\nEsse numero é negativo e impar")
				}
			se (num1 == 0)
		     escreva("\n Numero neutro")
				
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 390; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */