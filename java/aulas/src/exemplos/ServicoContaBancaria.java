package exemplos;
import java.util.Scanner;
import entidades.ContaBancaria;
public class ServicoContaBancaria {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		ContaBancaria cliente1 = new ContaBancaria();
		
		System.out.println("Digite seu nome");
		cliente1.nome = leia.next();
		System.out.println("Digite o genero M-Masculino F-Feminino e O-Outros: ");
		cliente1.genero = leia.next().toUpperCase().charAt(0);
		System.out.println("Digite o tipo de conta 1 Conta Corrente e 2 Conta Poupança");
		cliente1.escolhadaConta =  leia.nextInt();
		while(cliente1.escolhadaConta <1 || cliente1.escolhadaConta>2)
		{
			System.out.println("Digitou errado!!!");
			System.out.println("Digite o tipo de conta 1 Conta Corrente e 2 Conta Poupança");
			cliente1.escolhadaConta= leia.nextInt();
		}
		System.out.println("Digite o valor que voce quer colocar: ");
		cliente1.valor = leia.nextDouble();
		
		System.out.printf(" %s %s\\n A escolha da conta foi %s", cliente1.statusGenero(cliente1.genero), cliente1.nome,cliente1.tipodeConta(cliente1.escolhadaConta));
		System.out.print("\n");
		cliente1.valordaConta();
		
	}

}
