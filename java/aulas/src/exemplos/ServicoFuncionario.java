package exemplos;
import java.util.Scanner;
import entidades.Funcionario;

public class ServicoFuncionario 
{

	public static void main(String[] args) 
	{
		
		
		// TODO Auto-generated method stub
		Funcionario cliente1 = new Funcionario();
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite seu nome");
		cliente1.nome = leia.next();
		System.out.println("Digite o genero M-Masculino F-Feminino e O-Outros: ");
		cliente1.genero = leia.next().toUpperCase().charAt(0);
		System.out.println("Qual area 1 Suporte 2 Marketing 3 Desenvolvimento");
		cliente1.area = leia.nextInt();
		while(cliente1.area <1 || cliente1.area >3)
		{
			System.out.println("Digitou errado!!!");
			System.out.println("Qual area 1 Suporte 2 Marketing 3 Desenvolvimento");
			cliente1.area  = leia.nextInt();
		}
		System.out.println("Digite os anos de serviço: ");
		cliente1.anosdeTrabalho = leia.nextInt();
		
		System.out.printf("%s : %s %s\n Os %d anos na nossa empresa e queremos dizer que %s", cliente1.statusEntrega(cliente1.area),cliente1.statusGenero(cliente1.genero), cliente1.nome,cliente1.anosdeTrabalho, cliente1.statusPromocao(cliente1.anosdeTrabalho));

	}

}
