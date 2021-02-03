programa

{
	/*Elabore um programa que calcule o que deve ser pago por um produto, considerando o preço normal 
de etiqueta e a escolha da condição de pagamento. Utilize os códigos da tabela a seguir para ler qual 
a condição de pagamento escolhida e efetuar o cálculo adequado. 
Código Condição de pagamento 
1 À vista em dinheiro ou cheque, recebe 20% de desconto 
2 À vista no cartão de crédito, recebe 15% de desconto 
3 Em duas vezes, preço normal de etiqueta sem juros 
4 Em três vezes, preço normal de etiqueta mais juros de 10%
*/
	
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		real preco
		caracter opcao
		caracter opcao2
		real precocalculo = 0.00
		real precoTotal
		escreva("Olá digite o preço do produto: ")
		leia(preco)
		escreva("\nOlá digite a condiçao de pagamento como 1 - cheque, 2 - dinheiro, 3 -cartao de credito ")
		leia(opcao)
		enquanto (opcao != '1' e opcao != '2' e opcao != '3' )
			{
				escreva("\nEscolha de pagamento incorreto, 1 - cheque, 2 - dinheiro, 3 -cartao de credito :")
				leia(opcao) //saida do loop
			}
		se(opcao == '1')
			{
				precocalculo = preco*0.2
				precoTotal = preco - precocalculo
				escreva("Olá inicialmente o preço do produto foi " +preco + " R$" + 
				"\n A escolha do pagamento foi cheque "+ "com isso o desconto do seu produto foi " 
				+ precocalculo + " R$" +  "\n Sendo assim o preço total é "+ precoTotal + " R$" )
			}
		se(opcao == '2')
			{
				precocalculo = preco*0.2
				precoTotal = preco - precocalculo
				escreva("Olá inicialmente o preço do produto foi " +preco + " R$" + 
				"\n A escolha do pagamento foi em dinheiro "+ "com isso o desconto do seu produto foi " 
				+ precocalculo + " R$" +  "\n Sendo assim o preço total é "+ precoTotal + " R$" )
			}
		se(opcao == '3')
			{
				escreva("\nOlá voce está no setor da opção de credito")
				escreva("\nDigite 1- pagar em vista , 2 - parcelar duas vezes , 3 - parcelas tres vezes: ")
				leia(opcao2)
				enquanto (opcao2 != '1' e opcao2 != '2' e opcao2 != '3' )
				{
				escreva("\nEscolha de pagamento incorreto, 1- pagar em vista , 2 - parcelar duas vezes , 3 - parcelas tres vezes :")
				leia(opcao2) 
				}

				se(opcao2 == '1')
				{
					precocalculo = preco*0.15
					precoTotal = preco - precocalculo
					escreva("Olá inicialmente o preço do produto foi " +preco + " R$" + 
				"\n A escolha do pagamento foi cartao a vista "+ "com isso o desconto do seu produto foi " 
				+ mat.arredondar(precocalculo,2) + " R$" +  "\n Sendo assim o preço total é "+ precoTotal + " R$" )
				}
				se(opcao2 == '2')
				{
					precoTotal = preco/2
					escreva("Olá inicialmente o preço do produto foi " +preco + " R$" + 
				"\n A escolha do pagamento foi 2 parcelas no cartao "+ "com isso o desconto do seu produto foi " 
				+ mat.arredondar(precocalculo,2) + " R$" +  "\n Sendo assim vc vai pagar 3 parcelas de "+precoTotal + " R$" )
				}

				se(opcao2 == '3')
				{
					precoTotal = ((preco + preco*0.10)/3)
					escreva("Olá inicialmente o preço do produto foi " +preco + " R$" + 
				"\n A escolha do pagamento foi 2 parcelas no cartao "+ "com isso o desconto do seu produto foi " 
				+ mat.arredondar(precocalculo,2) + " R$" +  "\n Sendo assim vc vai pagar 3 parcelas de "+ mat.arredondar(precoTotal,2) + " R$" )
				}
				
			}
				
	}

		

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1922; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */