programa
{//Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa em dias
//1 ano tem 12 meses                    
// 1 ano tem 365 dias
	funcao inicio()
	{
		inteiro dias,anos,meses, resultado
		escreva("Qual seria sua idade em anos ")
		leia(anos)
		escreva("Qual seria sua idade em meses ")
		leia(meses)
		escreva("Qual seria sua idade em dias ")
		leia(dias)
		resultado = ((anos*365)+(meses*30)+dias)
		escreva("Os dias de vida são: " +resultado + " dias")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 511; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */