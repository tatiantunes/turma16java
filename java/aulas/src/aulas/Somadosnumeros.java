package aulas;
import java.util.Scanner;
public class Somadosnumeros 
{

	
	//Fa�a um programa que pegue um n�mero do teclado e calcule a soma de todos os n�meros  de 1 at� ele. 
	//Ex.: o usu�rio entra 7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28.
	public static void main(String[] args) 
		{
			
			Scanner leia = new Scanner(System.in);
			int num;
			int aux = 0;
			int resultado = 0;
			System.out.print("Digite um numero do seu teclado: : " );
			num= leia.nextInt();
			aux = num;
			do{			
				
				aux --;
				num +=aux;
				resultado = num;
				}while (aux != 0) ;
					
				
					System.out.println("A soma foi " + resultado);
				
		}
	}

