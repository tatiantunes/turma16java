package lista3;
/*
 * Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)
 */
import java.util.Scanner;
public class Numerosresto5 
{

	public static void main(String[] args)
   {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int contador = 0 ;
		System.out.println("Ver numeros que divididos por 11 obtemos resto igual a 5");
		for (int x = 1000 ; x <1999;x++)
		{
			if(x%11 == 5 )
			{	
				System.out.println(x);
				contador ++;
			}
		}
		
		System.out.printf("Os numeros lidos que quando divididos por 11 obtem o resto igual a 5 são %d " ,contador);
	}

}
