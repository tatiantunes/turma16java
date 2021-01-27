programa
{// A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e número de filhos.
//A prefeitura deseja saber:   
//a) média do salário da população; 
//b) média do número de filhos; 
//c) maior salário; 
//d) percentual de pessoas com salário até R$100,00

	
	funcao inicio()
	{
		real salario
		inteiro filho
		inteiro dividendo =3
		inteiro x	
		real medSalario =0
		inteiro medfilhos = 0
		
		para(x=1; x<=dividendo;x++){
			escreva("\nDigite o salario: ")
			leia(salario)
			escreva("\nDigite a quantidade de filhos")
			leia(filho)
			medSalario +=salario
			medfilhos +=filho
		}
			medSalario = medSalario/dividendo
			medfilhos = medfilhos/dividendo
			escreva("\nO salario total é: " +medSalario)
			escreva("\nO A media de numero de filhos  é: " + medfilhos)
			

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 835; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */