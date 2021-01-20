//A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de indústrias
//que são altamente poluentes do meio ambiente. O índice de poluição aceitável varia de 0,05 até 0,25.
//Se o índice sobe para 0,3 as indústrias do 1º grupo são intimadas a suspenderem suas atividades,
//se o índice crescer para 0,4 as industrias do 1º e 2º grupo são intimadas a suspenderem suas atividades,
//se o índice atingir 0,5 todos os grupos devem ser notificados a paralisarem suas atividades. 
//Faça um sistema que leia o índice de poluição medido e emita a notificação 
//adequada aos diferentes grupos de empresas.

// poluição aceitavel = 0,05 --- 0,25
//poluiçao nao tao boa = 0,3
//poluicao  n          = 0,4
//poluicao             = 0, 5
programa
{
	
	funcao inicio()
	{
		real indPoluicao
		escreva("Digite o indice de poluição na sua empresa: ")
		leia(indPoluicao)
		escreva ("O indice da sua empresa é: " + indPoluicao)
		se(indPoluicao > 0.05 e indPoluicao < 0.25)
		{
			escreva("\nAceitável ")
		}
		senao se(indPoluicao >= 0.3 e indPoluicao <= 0.4)
			{
			escreva("\nNão é aceitavel,as industrias do 1º grupo é necessario suspender suas atividade")	
			}
			senao se(indPoluicao > 0.4 e indPoluicao <= 0.5)
			{
			escreva("\nNão é aceitavel, as industrias do 1º e 2º grupo são intimadas a suspenderem suas atividade")	
			}
			senao se(indPoluicao > 0.5)
			{
			escreva("\nNão é aceitavel,  todos os grupos devem ser notificados a paralisarem suas atividades.")	
			}
		

	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1065; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */