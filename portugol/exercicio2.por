programa
{ // Faça um sistema que mostre que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos,meses e dias
//1 ano tem 12 meses                    
// 1 ano tem 365 dias

	funcao inicio()
	{
		inteiro dias,anos,meses, idadePessoa
		escreva("\nQual sua idade em dias? ")
		leia(idadePessoa)
		anos = (idadePessoa/365)
		meses = (idadePessoa % 365)/30
		dias = (idadePessoa % 365) %30
		escreva("\nSua idade é " + anos +" anos " + meses +" meses " + dias+ " dias " )
		
	}
}	
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 252; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */