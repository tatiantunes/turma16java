programa
{//Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas trabalhadas de um operário. 
//E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. Quando o número de horas exceder a 50 calcule 
//o excesso de pagamento armazenando-o na variável E, caso contrário zerar tal variável. 
//A hora excedente de trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário excedente.
//variavel C e N e E
//N >50 
// 
	funcao inicio()
	{

			inteiro codigo,nHoras,calculo,cTotal
			inteiro excesso = 0
			inteiro calculo2 = 500 // salario para o operario que trabalhou alem das horas recomendadas
			escreva("\nDigite seu codigo: ")
			leia(codigo)
			escreva("\nDigite as horas trabalhadas: ")
			leia(nHoras)
			se(nHoras>50)
				{
					excesso = nHoras - 50
					escreva("Olá " + codigo + "\nSuas horas de excesso ao trabalho foram " + excesso + " horas")
					calculo = excesso*20
					escreva("\nSeu salario excedente é " + calculo +"R$")
					cTotal = calculo2 + calculo
					escreva("\nSeu salario total é " + cTotal +"R$")
				}senao se (nHoras<50){
					
				
				     cTotal = nHoras*10
				     escreva("Olá " + codigo + "\nSuas horas de excesso ao trabalho foram " + excesso + " horas" + "\nSeu salario total é " + cTotal +"R$")
					}
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 665; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */