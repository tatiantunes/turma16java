package exemplos;
import java.util.Scanner;
import entidades.Pessoa;
public class Adega {

	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		Pessoa cliente1 = new Pessoa();
		String status;
		System.out.println("Digite o nome: ");
		cliente1.nome = leia.next();
		System.out.println("Digite o genero M-Masculino F-Feminino e O-Outros: ");
		cliente1.genero = leia.next().toUpperCase().charAt(0);
		System.out.println("Digite o ano de nascimento: ");
		cliente1.anoNascimento = leia.nextInt();
		status = cliente1.statusIdade();
		if(cliente1.idade()<18)
		{
			System.out.printf("%s %s, voce nao pode comprar bebida alcoolica pois voce é uma %s ", cliente1.statusGenero(cliente1.genero), cliente1.nome, status);
		}
		else 
		{
			System.out.printf("%s %s, voce esta disponivel para comprar bebida alcoolica pois voce é uma %s ", cliente1.statusGenero(cliente1.genero), cliente1.nome, status);
		}
	}

}
