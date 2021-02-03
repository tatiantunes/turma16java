programa
{  /*O IMC – Índice de Massa Corporal é um critério da Organização Mundial de Saúde para dar uma indicação sobre a condição de peso de uma pessoa adulta. A fórmula é IMC = peso / ( altura )2 
Elabore um programa que leia o peso e a altura de um adulto e mostre sua condição de acordo com a tabela abaixo. 
IMC em adultos Condição 
Abaixo de 18,5 Abaixo do peso 
Entre 18,5 e 25 Peso normal 
Entre 25 e 30 Acima do peso 
Acima de 30 obeso
*/
	
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		real altura
		real peso
		real IMC
		real IMC2

		escreva("Olá digite seu peso: ")
		leia(peso)
		escreva("Olá digite sua altura: ")
		leia(altura)

		IMC2 = altura * altura
		IMC = peso/IMC2
		escreva("\nOlá seu peso IMC é " + mat.arredondar(IMC,2))
		se(IMC < 18.5)
		{
			escreva("\nVocê esta abaixo do peso previsto pelo IMC")	
		}senao se(IMC >=18.5 e IMC <25.0)
			{
				escreva("\nSeu peso está normal comparado ao IMC")
					
			}
		senao se (IMC >= 25.0 e IMC <30.0)
			{
				escreva("\nVocê está acima do peso previsto pelo IMC")		
			}
		senao se(IMC >= 30.0)
			{
				escreva("\nVocê está obeso previsto pelo IMC ")
			}
			
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 722; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */