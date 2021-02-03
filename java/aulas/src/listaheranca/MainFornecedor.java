package listaheranca;

import java.util.Scanner;

/*
 * Depois de implementada a classe Fornecedor, crie um programa de teste adequado que lhe permita verificar o 
 * funcionamento dos métodos implementados na classe Fornecedor e os herdados da classe Pessoa. 
 */
public class MainFornecedor {
//String nome, String endereco, String telefone,double valorCredito, double valorDivida
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		String nome,  endereco, telefone;
		double valorCredito,  valorDivida;
		System.out.println("Ola Fornecedor!!");
		System.out.println("Digite o seu nome ");
		nome = leia.nextLine();
		System.out.println("Digite o seu endereço ");
		endereco = leia.nextLine();
		System.out.println("Digite o seu telefone ");
		telefone = leia.nextLine();
		System.out.println("Digite o valor do Credito ");
		valorCredito = leia.nextDouble();
		System.out.println("Digite o valor da Divida ");
		valorDivida = leia.nextDouble();
		Fornecedor cliente1 = new Fornecedor(nome,endereco, telefone, valorCredito,  valorDivida);
		
		
		cliente1.ObterSaldo();
		
	}

}
