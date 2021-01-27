programa
{//Elaborar um programa que efetue a leitura sucessiva de valores numéricos e 
//apresente no final o total do somatório, a média e o total de valores lidos.
//O programa deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores positivos. 
//Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		inteiro Soma = 0
		inteiro x = 0
		inteiro divisor = 0
		inteiro media 
		
		
		enquanto(x >= 0)
		{	escreva("\nPara parar o sistema digite um numero negativo")
			escreva("\nDigite um valor: ")
			leia(x)
			se(x > 0){
				Soma +=x
				divisor = divisor +1
				}
			
		}

		media = Soma/divisor
		escreva("\nO total dos valores lidos foi " +divisor+"\nA media dos valores foi " +media +"\nA soma dos valores lidos foi " + Soma)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 388; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */