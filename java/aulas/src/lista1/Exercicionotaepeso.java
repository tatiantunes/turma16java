package lista1;

import java.util.Scanner;

public class Exercicionotaepeso {
	
public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	double nota1, nota2, nota3; 
	double media;
	//p1 = 2
	//p2 = 3
	//p3 = 5
	System.out.println("\nDigite a primeira nota");
	nota1 = leia.nextDouble();
	System.out.println("\nDigite a segunda nota");
	nota2 = leia.nextDouble();
	System.out.println("\nDigite a terceira nota");
	nota3 = leia.nextDouble();

	media = (nota1*2 + nota2*3 + nota3*5)/(2+3+5);

	System.out.printf("\n A media do aluno é %2f" ,media);
		
		
	}
}
