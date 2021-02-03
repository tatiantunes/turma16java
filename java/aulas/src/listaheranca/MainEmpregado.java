package listaheranca;

import java.util.Scanner;

public class MainEmpregado 
{
//Escreva um programa de teste adequado para a classe Empregado. 
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		String nome,  endereco, telefone;
		double salarioBase,  impostos;
		int codigoSetor;
		System.out.println("Ola Fornecedor!!");
		System.out.println("Digite o seu nome ");
		nome = leia.nextLine().toUpperCase();
		System.out.println("Digite o seu endereço ");
		endereco = leia.nextLine();
		System.out.println("Digite o seu telefone ");
		
		telefone = leia.nextLine();
		System.out.println("Digite seu codigo do setor");
		codigoSetor =leia.nextInt();
		System.out.println("Digite o valor do Salario ");
		salarioBase = leia.nextDouble();
		System.out.println("Digite o valor do imposto ");
		impostos = leia.nextDouble();
		
		
		Empregado cliente1 = new Empregado(nome,endereco,telefone,codigoSetor, salarioBase, impostos);
		System.out.println("Setor" +cliente1.getCodigoSetor() + " :" + cliente1.getNome());
		cliente1.ObterSalario();
		
	}
}
