package lista3;
/*
 * Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero.
 *  No final, mostre a soma dos n�meros digitados.(DO...WHILE)
 */
import java.util.Scanner;

public class Tecladonumero {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num;
		int resultado = 0;
		
		do {
		  System.out.println("Digite um numero");
		  System.out.println("Para sair do sistema digite 0");
		  num = leia.nextInt();
		  resultado +=num;
		
		}
			while(num != 0);
		// TODO Auto-generated method stub
		System.out.println("A soma dos numeros do teclado s�o " + resultado);
	}

}
