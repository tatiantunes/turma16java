package entidades;
import java.util.Scanner;
public class CadFun {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int matricula,horas;
		int matricula2,horas2;
		String nome,nome2;
		double valorHora,valorHora2;
		double acrescimo;
		System.out.println("Olá Empregado!!");
		System.out.println("Digite sua matricula: ");
		matricula = leia.nextInt();
		leia.nextLine();
		System.out.println("Digite seu nome: ");
		nome = leia.nextLine();
		System.out.println("Digite as horas que trabalhou ");
		horas = leia.nextInt();
		System.out.println("Digite o valor por hora");
		valorHora = leia.nextDouble();
		
		System.out.println("Olá Empregado numero 2!!");
		System.out.println("Digite sua matricula: ");
		matricula2 = leia.nextInt();
		leia.nextLine();
		System.out.println("Digite seu nome: ");
		nome2 = leia.nextLine();
		System.out.println("Digite as horas que trabalhou ");
		horas2 = leia.nextInt();
		System.out.println("Digite o valor por hora");
		valorHora2 = leia.nextDouble();
		System.out.println("Digite o acrescimo do valor por fora");
		acrescimo = leia.nextDouble();
		
		Empregado cliente1 = new Empregado(nome,matricula,horas,valorHora );
		Terceiro cliente2 = new Terceiro(horas,valorHora,acrescimo);
		System.out.println("O salario do primeiro Empregado é " + cliente1.Salario(cliente1.getHora()));
		System.out.println("O salario do segundo Empregado é " + cliente2.Salario(cliente2.getHora()));
		
		
	}
}
