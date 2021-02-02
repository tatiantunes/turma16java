package exemplos;
import java.util.Scanner;
import entidades.Paciente;
public class ServicodePaciente {

	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		Paciente cliente1 = new Paciente();
		System.out.println("Digite seu nome");
		cliente1.nome = leia.next();
		System.out.println("Digite o genero M-Masculino F-Feminino e O-Outros: ");
		cliente1.genero = leia.next().toUpperCase().charAt(0);
		System.out.println("Qual seu estado 1- Normal , 2 - Com covid , 3 - Inconsciente");
		cliente1.estado = leia.nextInt();
		while(cliente1.estado <1 || cliente1.estado >3)
		{
			System.out.println("Digitou errado!!!");
			System.out.println("Qual seu estado 1- Normal , 2 - Com covid , 3 - Inconsciente");
			cliente1.estado  = leia.nextInt();
		}
		System.out.println("Digite sua idade");
		cliente1.idade = leia.nextInt();
		
		System.out.printf(" %s %s\n %s", cliente1.statusGenero(cliente1.genero), cliente1.nome,cliente1.estadoEmocional(cliente1.estado,cliente1.idade));

		

	}

}
