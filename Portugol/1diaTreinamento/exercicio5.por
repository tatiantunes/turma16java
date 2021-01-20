programa
{//Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. 
//Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente. 
// media = (n1*p1 + n2*p2 + n3*p3)/(p1+p2+p3);

	
	funcao inicio()
	{
		real nota1, nota2, nota3 
		real media
		//p1 = 2
		//p2 = 3
		//p3 = 5
		escreva("\nDigite a primeira nota")
		leia(nota1)
		escreva("\nDigite a segunda nota")
		leia(nota2)
		escreva("\nDigite a terceira nota")
		leia(nota3)

		media = (nota1*2 + nota2*3 + nota3*5)/(2+3+5)

		escreva("\n A media do aluno é " + media)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 584; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */