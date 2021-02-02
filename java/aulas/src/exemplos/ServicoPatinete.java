package exemplos;
import entidades.Patinete;
import java.util.Scanner;
public class ServicoPatinete
{
	public static void main(String[] args)
	{
		Patinete cliente1 = new Patinete();
		Scanner leia = new Scanner(System.in);
	
		char escolha;
		System.out.println("Digite seu nome");
		cliente1.nome = leia.next();
		System.out.println("Digite o genero M-Masculino F-Feminino e O-Outros: ");
		cliente1.genero = leia.next().toUpperCase().charAt(0);
		System.out.println("Digite a cor do patinete");
		cliente1.cor = leia.next();
		System.out.println("Voce quer uma bicicleta em troca desse seu patinete S/N");
		escolha = leia.next().toUpperCase().charAt(0);
		if(escolha == 'S')
		{
			cliente1.Troca = true;
		}
		else {
			cliente1.Troca = false;
		}
		
		System.out.printf(" %s %s\n A cor do seu patinete é  %s %s", cliente1.statusGenero(cliente1.genero), cliente1.nome,cliente1.cor, cliente1.TrocadePatinete(cliente1.Troca));

	}
}
