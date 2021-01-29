package lista4;
import java.util.Scanner;
//Crie um programa que receba valores do usuário para preencher uma matriz 3X3, 
//e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal, 
//ou seja, diagonal principal.


public class DiagonalMatriz
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int[][] valores = new int[3][3];
		double somaValores = 0.0;
		double somaDiagonal = 0.0;
		for(int y = 0; y<3; y++)
		{
			for(int x = 0; x <3;x++)
			{
				System.out.println("Os valores são ");
				valores[y][x] = leia.nextInt();
				somaValores +=valores[y][x];

				if(x == y )
				{
					somaDiagonal +=valores[y][x];
				}
			
			}
			
			
			
		}
		System.out.println("\nA soma deu " + somaValores);
		System.out.println("\nA soma diagonal " + somaDiagonal);
	}

}
