package listaheranca;

import java.util.Scanner;

public class MainOperario 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		String nome,  endereco, telefone;
		double valorProducao,comissao;
		int quantidade;
		System.out.println("Ola Operario!!");
		System.out.println("Digite o seu nome ");
		nome = leia.nextLine().toUpperCase();
		System.out.println("Digite o seu endereço ");
		endereco = leia.nextLine();
		System.out.println("Digite o seu telefone ");
		telefone = leia.nextLine();
		System.out.println("Digite o valor da Producao");
		valorProducao =leia.nextDouble();
		System.out.println("Digite o valor da comissao por cada produto");
		comissao = leia.nextDouble();
		System.out.println("Digite a quantidade de venda desse produto ");
		quantidade = leia.nextInt();
		Operario cliente1 = new Operario(nome, endereco, telefone, valorProducao,comissao);
		
		System.out.println("Olá " + cliente1.getNome());
		cliente1.ValorProducao(quantidade);
	
	
	
	
	
	}
	
}
