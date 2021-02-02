package exemplos;
import java.util.Scanner;
import entidades.Aviao;

public class ServicoAviao {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Aviao cliente1 = new Aviao();
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu nome");
		cliente1.nome = leia.next();
		System.out.println("Digite o genero M-Masculino F-Feminino e O-Outros: ");
		cliente1.genero = leia.next().toUpperCase().charAt(0);
		System.out.println("Digite a escolha do servico 1-Plano economico, 2- Classe executiva , 3 -Primeira Classe: ");
		cliente1.escolhadoPlano = leia.nextInt();
		while(cliente1.escolhadoPlano <1 || cliente1.escolhadoPlano>3)
		{
			System.out.println("Digitou errado!!!");
			System.out.println("Digite a escolha do servico 1-Plano economico, 2- Classe executiva , 3 -Primeira Classe: ");
			cliente1.escolhadoPlano = leia.nextInt();
		}
		
		System.out.printf("%s %s %s e logo assim voce %s", cliente1.statusGenero(cliente1.genero), cliente1.nome,cliente1.statusPlano(cliente1.escolhadoPlano),cliente1.statusComida(cliente1.escolhadoPlano));
		
	}

}
