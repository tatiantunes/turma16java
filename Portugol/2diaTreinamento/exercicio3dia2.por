programa
{
	inclua biblioteca Matematica --> mat
	//Desenvolva um sistema em que:
//Leia 4 (quatro) números;
//Calcule o quadrado de cada um;
//Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
//Caso contrário, imprima os valores lidos e seus respectivos quadrados.

	
	funcao inicio()
	{
		inteiro num1, num2, num3, num4, equac1, equac2, equac3, equac4
		escreva("\nDigite o primeiro numero: ")
		leia(num1)
		equac1 = mat.potencia(num1, 2.0)
		escreva(equac1)
		escreva("\nDigite o segundo numero: ")
		leia(num2)
		equac2 = mat.potencia(num2, 2.0)
		escreva(equac2)
		escreva("\nDigite o terceiro numero: ")
		leia(num3)
		equac3 = mat.potencia(num3, 2.0)
		escreva(equac3)
		escreva("\nDigite o quarto numero: ")
		leia(num4)
		equac4 = mat.potencia(num4, 2.0)
		escreva(equac4)

		se(equac3 >= 1000)
		{
			escreva("\n O terceiro valor da equação é maior que 1000, pois deu "+ equac3)	  	
		}senao se (equac3 <=1000){
			
		
		  	escreva("\n O primeiro numero escolhido " +num1+ " o valor da equação foi "+ equac1)
		  	escreva("\n O segundo numero escolhido " +num2+ " o valor da equação foi "+ equac2)
		  	escreva("\n O terceiro numero escolhido " +num3+ " o valor da equação foi "+ equac3)
		  	escreva("\n O quarto numero escolhido " +num4+ " o valor da equação foi "+ equac4)
		  	}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1293; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */