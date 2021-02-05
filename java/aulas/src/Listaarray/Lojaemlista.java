
package Listaarray;

/*
 * Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:
Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Empregado;

public class Lojaemlista
{
	public static void main(String[] args) 
	
	{
		
			Scanner leia = new Scanner(System.in);
			
			//usar uma interface
			List<Produto> loja = new ArrayList<>();
			/*
			loja.add(new Produto("FinalFantasy","LB-001",30.00,10));
			loja.add(new Produto("CS","LB-002",10.00,10));
			loja.add(new Produto("Call of duty","LB-003",20.00,10));
			loja.add(new Produto("Pokemon","LB-004",20.00,10));
			loja.add(new Produto("Castlevania","LB-005",50.00,10));
			loja.add(new Produto("League of Legends","LB-006",10.00,10));
			loja.add(new Produto("MU- Online","LB-007",10.00,10));
			loja.add(new Produto("GTAV","LB-008",30.00,10));
			loja.add(new Produto("Mortal Kombat","LB-009",50.00,10));
			loja.add(new Produto("Free Fire","LB-010",10.00,10));
			*/
			
			System.out.println(
					"**************************************************************************************************************************************************");
			System.out.println("Olá meu caro estocador da loja BOA");
			System.out.println("É BOA MESMO");
			System.out.println(
					"**************************************************************************************************************************************************");
			
			
	
	


		
		
		
		System.out.println("Digite o numero de produtos que vai estocar");
		int numero = leia.nextInt();
		
		
		for (int x=1;x<=numero; x++)
		{
			leia.nextLine();
			System.out.println("Digite o nome do produto");
			String nomeProduto = leia.nextLine().toUpperCase();
			System.out.println("Digite o preco do produto");
			double precoUni = leia.nextDouble();
			loja.add(new Produto(nomeProduto, precoUni));
		}
		
		System.out.println("PRODUTOS PARA COMPRA");
		System.out.println("Descriçao do Produto\t\t\t\t Valor");
		System.out.println(
				"**************************************************************************************************************************************************");
		
		System.out.print("\n");
		for (Produto loj : loja) 
		{
			System.out.println(loj.getNomeProduto()+"\t\t\t\t\t"+ loj.getPrecoUni());
		}
		
		leia.nextLine();
		System.out.println("Voce quer remover algo da loja S/N");
		char decisao2 = leia.nextLine().toUpperCase().charAt(0);
		
		if (decisao2 == 'S')
		{	
			System.out.println("Qual nome seria");
			String nome = leia.nextLine().toUpperCase();
			
			for (int i = 0; i < loja.size(); i++) 
			{
				    if (loja.get(i).getNomeProduto().equals(nome)) 
				    {
				      loja.remove(i);
				    }
			}
			
			System.out.print("\n");

			System.out.println("PRODUTOS ATUALIZADOS PARA COMPRA");
			System.out.println("Descriçao do Produto\t\t\t\t Valor");
			System.out.println(
					"**************************************************************************************************************************************************");
			
			for (Produto loj : loja) 
			{
				System.out.println(loj.getNomeProduto()+"\t\t\t\t\t\t"+ loj.getPrecoUni());
			}
			
		}
		else 
			{
				System.out.println("Obrigada pelo uso");
			}
		
		
	}
		

}
