package lista1;

import java.util.Scanner;

public class Exerciciodiasconversao {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int dias,anos,meses, idadePessoa;
		System.out.println("\nQual sua idade em dias? ");
		idadePessoa = leia.nextInt();
		anos = (idadePessoa/365);
		meses = (idadePessoa % 365)/30;
		dias = (idadePessoa % 365) %30;
		System.out.println("\nSua idade é " + anos +" anos " + meses +" meses " + dias+ " dias " );
			
		}
}
