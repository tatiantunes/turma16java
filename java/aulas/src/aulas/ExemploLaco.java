package aulas;
import java.util.Scanner;
public class ExemploLaco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// desvio condicional --> if /switch
		//para
		//enquanto
		//faça enquanto
		/*
		 * para (inteiro x = 0;x<10;x++)
		 * {
		 *   .... comandos
		 * }
		 */
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um numero para fazer linha ");
		int valor = leia.nextInt();
		for (int x =1 ; x <=valor;x++)
		{
			System.out.print("---");
						
		}

}
	
}
