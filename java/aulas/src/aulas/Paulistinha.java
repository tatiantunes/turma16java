package aulas;
	
import java.util.Scanner;

public class Paulistinha {

	public static void main(String[] args) {
		
		
				Scanner leia = new Scanner(System.in);
				//PAULISTINHA
				// 0 - CORITHIANS, 1 - PALMEIRAS, 2 - SANTOS, 3 - SPFC
				// PONTOS - INTEIRO - 4
				// GANHA - 3 PONTOS
				// PERDE - 0 PONTO
				// EMPATA - 1 PONTO
				// FAÇA UM PROGRAMA QUE PEÇA SE O CADA TIME G-GANHOU, P-PERDEU
				// OU EMPATOU  EM 4 RODADAS, AO FINAL MOSTRA O NOME DE CADA TIME
				// E SEUS RESPECTIVOS PONTOS
				//CORINTHIANS - G-ganhou P-perdeu ou E-empatou [G/P/E]:
				String times[] = {"CORITHIANS","PALMEIRAS","SANTOS","SPFC"};
				int pontos[] = new int [4];
				String resposta;
				char c;
				int escolha;
				boolean condicao;
				int decisao;
				//inteiro matriz[2][2]
				for (int x = 0; x<4; x++)
				{
					System.out.println("Rodada "+(x+1)+"\n");
					for (int y = 0; y<4; y++)
					{
						System.out.println(times[y]+" G-ganhou P-perdeu ou E-empatou [G/P/E]: ");
						c = leia.next().charAt(0);
						
						c = Character.toUpperCase(c);
						if (c == 'G')
						{
							pontos[y] = pontos[y]+3;
						}
						else if (c == 'E')
						{
							pontos[y] = pontos[y]+1;
						}
						else if (c == 'P')
						{
							pontos[y]= pontos[y]+0;
						}
					}
					System.out.println("\n");
					
				
				}
				System.out.println("\n");
				do {

					System.out.println("Qual Time voce quer ver os pontos:");
					System.out.println("0 - CORITHIANS, 1 -PALMEIRAS 2 - SANTOS ,3 -SPFC");
					escolha = leia.nextInt();
					System.out.println(times[escolha]+" na rodada " + " ficou com "+pontos[escolha]+" pontos.\n");
					
					
					System.out.println("Voce quer ver o outro time (S/N)");
					decisao = leia.next().charAt(0);
					decisao = Character.toUpperCase(decisao);
					if (decisao == 'S')
						{
					 	condicao = true;
					 	
						}
					else
						{
						condicao = false;
						System.out.println("Obrigada pela preferencia!");
						}
					}while (condicao == true);
				
				
				
			}
		}
	


