programa
{//João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de 
//seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento 
//do estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo excedente. 
//João precisa que você faça um sistema que leia a variável P (peso de tomates) 
//e verifique se há excesso. Se houver, gravar na variável E (Excesso) e 
//na variável M o valor da multa que João deverá pagar. Caso contrário mostrar tais 
//variáveis com o conteúdo ZERO
// >50 quilos = +4,00R$	
// variavel P = peso de tomates
// variavel E = quilo excedente
// variavel M = valor multa
	funcao inicio()
	{ 
		inteiro Peso
		inteiro Excesso = 0
		inteiro Multa = 0
		inteiro Calculo = 0

		escreva("Digite o peso dos tomates: ")
		leia(Peso)
		escreva ("\nO peso dos tomates foi "+ Peso +" kilos")
		se(Peso>50)
		{
		Calculo = Peso - 50
		Multa = Calculo*4	
		escreva("\nO peso dos tomates excedeu!!!!")
		escreva("\nForam exatamente " + Calculo + " a mais do que permitido")
		escreva ("\nLogo assim voce vai pagar a multa " +Multa+ "R$")
		
			
		}senao
		escreva("\nO peso dos tomates não excedeu!!!!" + "\nLogo assim sua multa é " +Multa +" R$")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1024; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */