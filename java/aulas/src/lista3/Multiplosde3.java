package lista3;
/*
 * Escrever um programa que receba vários números inteiros no teclado.
 *  E no final imprimir a média dos números múltiplos de 3. 
 *  Para sair digitar 0(zero).(DO...WHILE)
 */
import java.util.Scanner;
public class Multiplosde3
{
	
		public static void main(String[] args)
		{
			Scanner leia = new Scanner(System.in);
			int num = 0;
			double somadosnumeros = 0;
			double media = 0.00;
			double contadorMultiplos = 0;
			do {
				System.out.println("Digite um numero: ");
				System.out.println("Para sair do sistema digite 0");
				num = leia.nextInt();
				if (num%3==0  &&  num !=0)
				{
					
					somadosnumeros += num;
					contadorMultiplos++;
				}
				
			}while(num != 0);
			
			if(contadorMultiplos !=0 ) {
				media = somadosnumeros/contadorMultiplos;
				System.out.println("A media dos multiplos de 3  é " + media);
			}else
			{
				System.out.println("Nenhum numero multiplo de 3 foi informado, nao existe media");
			}
			
		
		}

}
