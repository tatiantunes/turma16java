package lista4;

//\nFaça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade

//e o escreva em seguida. Encontre após a maior pontuação e a apresente. 



import java.util.Scanner;
public class MaiorNumeroVetor
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int vetor[] = new int [4];
		int maiorNum = 0;
		for (int y = 0; y <4; y++)
		{
			System.out.println("Digite um numero: ");
			vetor[y] = leia.nextInt();
			
			if(vetor[y] > maiorNum)
			{
		 		maiorNum = vetor[y];
		 	}
			
			System.out.println("\nO valor do numero "+(y+1)+ " foi: "+ vetor[y]);
				
		}
		System.out.println("\n A maior nota foi " + maiorNum);
	}

}
