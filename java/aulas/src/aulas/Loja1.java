package aulas;
import java.util.Scanner;
public class Loja1 {

		
		public static void main(String[] args)
		{
		
			Scanner leia = new Scanner(System.in);
			String nomedoUsuario;
			char sexodoUsuario;
			String codigo[] = new String[10];
			String produtosnaloja[] = {"FinalFantasy","CS","Call of Duty","Pokemon","Castlevania","League of Legends","MU- Online","GTAV","Mortal Kombat","Free Fire"};
			double preconoproduto[] = {30.00,10.00,20.00,20.00,50.00,10.00,10.00,30.00,50.00,10.00};
			int estoque = 10;
			System.out.println("**************************************************************************************************************************************************");
			System.out.println("LOJA BOA");
			System.out.println("É BOA MESMO");
			System.out.println("**************************************************************************************************************************************************");
			System.out.println("Obrigada pela escolha da loja");
			System.out.println("Qual seu nome? ");
			nomedoUsuario = leia.nextLine();
			System.out.println("Digite seu sexo? F - Feminino,  M - Masculino, O - Outros)");
			sexodoUsuario = leia.nextLine().toUpperCase().charAt(0);
			while(sexodoUsuario != 'F' && sexodoUsuario != 'M' && sexodoUsuario != 'O')
			{	
				System.out.println("Voce digitou errado ");
				System.out.println("Digite seu sexo? F - Feminino,  M - Masculino, O - Outros)");
				sexodoUsuario = leia.nextLine().toUpperCase().charAt(0);
			}
			if (sexodoUsuario == 'M')
			{
				System.out.println("Olá Sr  " + nomedoUsuario + "\nNossa Loja de Games, confira nossos produtos ");
			}else if (sexodoUsuario == 'F')
			{
				System.out.println("Olá Sra  " + nomedoUsuario + "\nNossa Loja de Games, confira nossos produtos ");
			}else if(sexodoUsuario == 'O')
			{
				System.out.println("Olá especial  " + nomedoUsuario + "\nNossa Loja de Games, confira nossos produtos ");
			}
			
			System.out.println("**************************************************************************************************************************************************");
			System.out.println("Codigo\t\t\t\t Estoque\t\t\t\t Valor \t\t\t\t Descriçao do Produto");
			System.out.println("**************************************************************************************************************************************************");
			System.out.print("\n");
			for (int i = 0 ; i <10;i++ )
			{
				codigo[i] = "LB-" +(i+1);
				System.out.println(codigo[i] + "\t\t\t\t\t" + estoque + "\t\t\t\t\t" + "R$"+ preconoproduto[i] + "\t\t\t\t\t" + produtosnaloja[i] );
			}
}
