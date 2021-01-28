package lista3;
import java.util.Scanner;
/*
 * Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
 */
public class Numerospareseimpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int contadorPares = 0 ;
		int contadorImpares = 0;
		int num;
		
		for (int x = 1 ; x<=10;x++)
		{
			System.out.println("Digite um numero: ");
			num = leia.nextInt();
			if (num%2==0)
			{
				contadorPares++; 
			}
			else
			{
				contadorImpares++;
			 
			}
		}
		
		System.out.printf("Os numeros pares lidos foram %d e os numeros impares lidos foram %d", contadorPares, contadorImpares);
	}

}
