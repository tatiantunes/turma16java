package exemplos;
import java.util.Scanner;
import entidades.ProdutoEletronico;

public class ServicoProdutoEletronico 
{

	public static void main(String[] args) 
	{
		
		ProdutoEletronico cliente1 = new ProdutoEletronico();
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu nome");
		cliente1.nome = leia.next();
		System.out.println("Digite o genero M-Masculino F-Feminino e O-Outros: ");
		cliente1.genero = leia.next().toUpperCase().charAt(0);
		System.out.println("Qual cor do produto");
		cliente1.cor= leia.next();
		System.out.println("Digite a escolha do servico 1-Casa, 2- Trabalho , 3 -Correios ");
		cliente1.escolhaEntrega = leia.nextInt();
		while(cliente1.escolhaEntrega <1 || cliente1.escolhaEntrega >3)
		{
			System.out.println("Digitou errado!!!");
			System.out.println("Digite a escolha do servico 1-Plano economico, 2- Classe executiva , 3 -Primeira Classe: ");
			cliente1.escolhaEntrega  = leia.nextInt();
		}
		
		System.out.printf("%s %s a cor escolhida do produto foi %s e seu produto %s ", cliente1.statusGenero(cliente1.genero), cliente1.nome,cliente1.cor, cliente1.statusEntrega(cliente1.escolhaEntrega));
		
		

	}

}
