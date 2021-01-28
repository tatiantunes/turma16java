package aulas;
/*
 * A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
a) média do salário da população; 
b) média do número de filhos; 
c) maior salário; 
d) percentual de pessoas com salário até R$100,00

 */
import java.util.Scanner;
public class Prefeitura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);	
		
			
				//PROGRAMA: OBJETIVO
				/*
				 * 1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus
				 * habitantes, coletando dados sobre o salário e número de filhos.
				 * A prefeitura deseja saber:
				a) média do salário da população;
				b) média do número de filhos;
				c) maior salário;
				d) percentual de pessoas com salário até R$100,00.
				 */
				//INICIO
				//VARIAVEIS
				final int HABITANTES = 3 ;// quantidade de vezes
				
				double salario = 0.00;
				int numeroFilhos = 0;
				double mediaSalarios = 0.00;
				double mediaFilhos = 0.00;
				double maiorSalario = 0.00;
				double PercentualSalario100 = 0.00;
				double totalSalarios = 0.00;
				int totalFilhos = 0;
				double contadorValor100 = 0.00;
				
				
				for (int giro=1; giro<=HABITANTES; giro++)
				{
					//ENTRADAS
					System.out.print("Digite o salario do habitante "+giro+" :");
					salario = leia.nextDouble();
					System.out.print("Digite o numero de filhos deste habitante: ");
					numeroFilhos= leia.nextInt();	
					//PROCESSAMENTOS
					totalSalarios = totalSalarios + salario; //totalizar o salario
					totalFilhos = totalFilhos + numeroFilhos;
					//totalFilhos += numeroFilhos
					if (salario > maiorSalario)
					{
						maiorSalario = salario	;
					}
					if (salario <= 100)
					{
						//contadorValor100 = contadorValor100 + 1
						//contadorValor100 += 1
						contadorValor100++; //geral usa esse!!!
						
					}
					
				}
				//processamentos tb
				mediaSalarios = totalSalarios / HABITANTES;
				mediaFilhos = totalFilhos / HABITANTES;
				//PercentualSalario100 = (contadorValor100 / HABITANTES)*100.00
				PercentualSalario100 = ((contadorValor100 / HABITANTES)*100);
				
				//SAIDAS
				System.out.println("Media salarial : R$ " +mediaSalarios+"\n");
				System.out.println("Media de filhos baseado no total de "+totalFilhos+" é igual a "+mediaFilhos+"\n");
				System.out.println("O maior salario informado foi :"+maiorSalario+"\n");
				System.out.println("Numero de pessoas que ganham até R$ 100 = "+contadorValor100+" sendo um percentual total de :"+PercentualSalario100+"%\n");
				System.out.println("Obrigado pela ajuda! Fim de programa!!");
				//FIM
				
			}
		}

	


