package listapolimorfismo;
import java.util.Scanner;
public class Zoologico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		char decisao,cansaco;
		String nome;
		double peso;
		boolean treinado = false;
		System.out.println("Ola digite qual animal voce quer ver no zoologico"  +"\n"+
						"1- Cavalo"+"\n"+
						"2- Cachorro"+"\n"+
						"3- Pregui�a");
		decisao = leia.nextLine().toUpperCase().charAt(0);
		
		if (decisao == '1')
			
		{	
			leia.nextLine();
			System.out.println("Qual nome desse cavalo? ");
			nome= leia.nextLine();
			System.out.println("Ola esse cavalo � treinado? S/N");
			decisao = leia.nextLine().toUpperCase().charAt(0);
			
			if (decisao == 'S')
			{
				treinado = true;
				
			}
			else 
			{
				 treinado = false;
			}
			 Animal animal1 = new Cavalo(nome,21.00,treinado);
			 System.out.println("O som do cavalo " + animal1.getNome() +" � " + animal1.emitirSom());
			 System.out.println(animal1.correr());
		}	
		
		
		if (decisao == '2')
		{	
			System.out.println("Qual nome desse cachorro? ");
			nome= leia.nextLine();
			System.out.println("Qual o peso desse cachorro? ");
			peso= leia.nextDouble();
			
			
			Animal animal1 = new Cachorro(nome,peso,10.00);
			System.out.println("O som do cachorro " + animal1.getNome() +" � " + animal1.emitirSom());
			 System.out.println(animal1.correr() + "e incrivelmente ele corre " + animal1.quantoCorre() + "km/h");
		}
		
		if(decisao == '3')
		{
			System.out.println("Qual nome dessa preguica? ");
			nome= leia.nextLine();
			System.out.println("Ola essa pregui�a esta cansado? S/N");
			cansaco = leia.nextLine().toUpperCase().charAt(0);
			
			Animal animal1 = new Preguica(nome,cansaco);
			System.out.println("O som do pregui�a " + animal1.getNome() +" � " + animal1.emitirSom());
			System.out.println("Sera que o animal consegue subir a arvore? " +" \n");
			System.out.print(".....");
			 System.out.println(animal1.devesubiremArvores());
		}
		
		
	}

}
