package lista3;
/*
 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
 * Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
 */
import java.util.Scanner;
public class Idadequantidade
{
	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		int idade;
		int contador21 = 0;
		int contador50 = 0;
		System.out.println("Qual sua idade");
		System.out.println("Para sair do programa utilize -99");
		idade = leia.nextInt();
		while(idade != -99) 
		{
			if (idade <=21)
			{
				contador21++;
			}else if (idade >= 50) 
			{
				contador50 ++;
			}
			System.out.println("Qual sua idade");
			System.out.println("Para sair do programa utilize -99");
			idade = leia.nextInt();
			
		}
		System.out.printf("Os numeros de idade lidas menor que 21 são %d e os numeros de idade lidas maior que 50 foram %d", contador21, contador50);
     }
}
