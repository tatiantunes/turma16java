package lista4;
import java.util.Scanner;

//Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
//a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
//b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.


public class SomaeDifMatriz
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int[][] matN1 = new int[4][6];
		int[][] matN2 = new int[4][6];
		int[][] matM1 = new int[4][6];
		int[][] matM2 = new int[4][6];
		
		for(int linha = 0; linha < 4 ; linha ++)
		{
			for( int coluna = 0; coluna < 6 ;coluna ++)
			{
				System.out.println("Digite o valor para a matriz N1 ");
				matN1[linha][coluna] = leia.nextInt();
			
			}
		}
		
		for(int linha = 0; linha < 4 ; linha ++)
		{
			for( int coluna = 0; coluna < 6 ;coluna ++)
			{
				System.out.println("Digite o valor para a matriz N2 ");
				matN2[linha][coluna] = leia.nextInt();
			
			}
		}
		System.out.println("Matriz soma");
		
		for(int linha = 0; linha < 4 ; linha ++)
		{
			for( int coluna = 0; coluna < 6 ;coluna ++)
			{
				matM1[linha][coluna] = matN1[linha][coluna] + matN2[linha][coluna];
				System.out.print("[" +matM1[linha][coluna] + " ]" );
				
			}
			System.out.print("\n");
		}
		System.out.println("Matriz diferença");
		for(int linha = 0; linha < 4 ; linha ++)
		{
			for( int coluna = 0; coluna < 6 ;coluna ++)
			{
				matM2[linha][coluna] = matN1[linha][coluna] - matN2[linha][coluna];
				System.out.print("[" +matM2[linha][coluna] + " ]" );
				
			}
			System.out.print("\n");
		}



	}

}
