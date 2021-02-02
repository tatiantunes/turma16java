package exemplos;
import java.util.Scanner;
import entidades.Cliente;
public class ServicoCliente
{
	public static void main(String[] args)
	{
	Cliente cliente1 = new Cliente();
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Digite seu nome");
	cliente1.nome = leia.next();
	System.out.println("Digite o genero M-Masculino F-Feminino e O-Outros: ");
	cliente1.genero = leia.next().toUpperCase().charAt(0);
	System.out.println("Digite o ano de serviço: ");
	cliente1.anos = leia.nextInt();
	
	System.out.printf("%s %s os %d anos na nossa empresa te gratificaram com desconto R$ %f e queremos dizer %s", cliente1.statusGenero(cliente1.genero), cliente1.nome,cliente1.anos, cliente1.Contadodesconto(), cliente1.statusDesconto());
	
	}
}
