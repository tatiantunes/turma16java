programa
{// Desenvolver um sistema que efetue a soma de todos os números ímpares que são  múltiplos de três 
//e que se encontram no conjunto dos números de 1 até 500.
	
	funcao inicio()
	{
		inteiro dividendo = 500
		inteiro nImpar = 0
		inteiro x 
		para(x = 1; x<=dividendo; x++){
			se(x%2!=0)
			{
				se(x%3 ==0){
					
				
				nImpar +=x
				
				
				}
			}
			
			
		}
		escreva("\nA soma foi: " +nImpar)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 415; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */