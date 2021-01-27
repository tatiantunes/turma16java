package lista1;

import java.util.Scanner;

public class Exerciciodiasdevida {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int dias,anos,meses, resultado;
		System.out.println("Qual seria sua idade em anos ");
		anos = in.nextInt();
		System.out.println("Qual seria sua idade em meses ");
		meses = in.nextInt();
		System.out.println("Qual seria sua idade em dias ");
		dias = in.nextInt();
		resultado = ((anos*365)+(meses*30)+dias);
		System.out.println("Os dias de vida são: " +resultado + " dias");
			
		}
}
