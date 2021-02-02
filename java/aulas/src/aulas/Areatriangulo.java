package aulas;
import java.util.Locale;
import java.util.Scanner;
public class Areatriangulo 
{

	public static void main(String[] args) 
		{
		// TODO Auto-generated method stub
		
				Locale.setDefault(Locale.US); //define o tipo de padronização
				//area = base * altura / 2
				Scanner leia = new Scanner(System.in);//instaciar = criar
				double base, altura, area;
				double base2, altura2, area2;
				double base3, altura3, area3;
				
				System.out.println("Digite a base do triangulo: ");
				base = leia.nextDouble();
				System.out.println("Digite a altura do triangulo: ");
				altura = leia.nextDouble();
				System.out.println("Digite a base do 2 triangulo: ");
				base2 = leia.nextDouble();
				System.out.println("Digite a altura do 2 triangulo: ");
				altura2 = leia.nextDouble();
				System.out.println("Digite a base do 3 triangulo: ");
				base3 = leia.nextDouble();
				System.out.println("Digite a altura do 3 triangulo: ");
				altura3 = leia.nextDouble();
				
				
				area = ((base * altura) / 2 );
				area2 = ((base2 * altura2) / 2 );
				area3 = ((base3 * altura3) / 2 );
				
				if(area>area2 && area>area3)
				{
					System.out.println("Maior area é : " + area + " ou seja foi os primeiros valores de base e altura");
				}
				else if (area2>area && area2>area3)
				{
					System.out.println("Maior area é : " + area2 + " ou seja foi os segundos valores de base e altura" );
				}else {
					System.out.println("Maior area é : " + area3 + " ou seja foi os terceiros valores de base e altura");
				}
				

		}


	

}
