package aulas;

import java.util.Scanner;
import java.text.DecimalFormat;
public class BancoFuncao 
{
	
	
	public static void main(String[] args) 
	{
		//variaveis
		Scanner leia = new Scanner(System.in);
		char opcao;
		int contagem = 0;
		int contaSelecionada;
		int escolhadaTransacao;
		String descricaodaTransacao[] = new String[2];		
		int parcelaTalao = 0;
		double saldocomTalao = 0.00;
		double saldo = 0.00;
		double saldomuitos[] = new double [2];
		double valor = 0.00;
		double saldoTemporario = 0.00;
		double saldoAtual = 0.0;
		double limite = 1000.0;
		double limiteDisponivel = 0.0;
		double limiteDisponivelMuitos[] = new double[2];
		double limiteUtilizado = 0.0;
		char escolhaTalao = 'S', continuarSimNao = ' ';
		final String descricao = null;
		boolean recomecar = true;
		int decisaoFinal;
		char decisaoExtrato = ' ';
		
		
		System.out.println("ED & RAFA BANK");
		System.out.println("AONDE O SEU DINHEIRO TEM MAIS FORÇA!!!");
		linha(40);
		
		do 
		{
				
			System.out.println("1 - CONTA POUPANÇA\r\n"
					+ "2 - CONTA CORRENTE\r\n"
					+ "3 - CONTA ESPECIAL \r\n"
					+ "4 - CONTA EMPRESA\r\n"
					+ "5 - CONTA ESTUDANTIL\r\n"
					+ "6 - SAIR\r\n"
					+ "");
			System.out.print("Digite o numero de sua opção: ");
			opcao = leia.next().charAt(0);
			
			if (opcao == '6')
			{
				break;
			}
			else if (opcao == '1') 
			{
				contaPoupanca();
			}
			else if (opcao == '2') 
			{
				contaCorrente();
			}
			else if (opcao == '3') 
			{
				contaEspecial();
			}
			
			
			
		} while (true);
		//saida
		System.out.println("Obrigado, volte sempre!!!");

	}
	
	public static void contaPoupanca()
	{
		Scanner tec = new Scanner(System.in);
		double saldo = 0.00, credito=0.00, debito=0.00;
		char opcaoDC;
		char opcaoSN;
		String descricao;
		
		linha(40);
		System.out.println("CONTA POUPANÇA");
		linha(40);
		//processos
		for (int giro=1; giro<=10; giro++)
		{
			System.out.printf("Lançamento %d : [D-débito/C-crédito] :",giro);
			opcaoDC = tec.next().toUpperCase().charAt(0);
			if (opcaoDC =='D')
			{
				System.out.print("\nDigite o valor para débito :");
				debito = tec.nextDouble();
				if (saldo > 0)
				{
					while (saldo < debito )
					{
						System.out.printf("Saldo indisponivel, atual %.2f, tente de novo!!!\n",saldo);
						System.out.print("Digite o valor para débito :");
						debito = tec.nextDouble();
						
					}
					tec.nextLine();
					System.out.print("Descrição do débito :");
					descricao = tec.nextLine();
					saldo = saldo - debito;
					System.out.printf("Saldo atual é R$ %.2f \n", saldo);
				} 
				else if (saldo == 0) 
				{
					System.out.println("Você está sem saldo no momento, faça um crédito primeiro!!!");
				}
			}
			else if (opcaoDC == 'C')
			{
				System.out.print("\nDigite o valor do crédito: ");
				credito = tec.nextDouble();
				while (credito <=0 )
				{
					System.out.print("Valor informado negativo ou zero, tente de novo:");
					System.out.print("Digite o valor do crédito: ");
					credito = tec.nextDouble();
				}
				tec.nextLine();
				System.out.print("Digite a descrição do crédito: ");
				descricao = tec.nextLine();
				saldo = saldo + credito;
				System.out.printf("Saldo atual é R$ %.2f \n", saldo);
			}
			else
			{
				System.out.println("Você não escolheu Debito ou Crédito!!!");
			}
			
			System.out.print("Continua S/N :");
			opcaoSN = tec.next().toUpperCase().charAt(0);
			if (opcaoSN == 'N')
			{
				break;
			}
		}
		//correção monetaria
		System.out.println("Deseja fazer a correção hoje sim ou não? ");
		opcaoSN = tec.next().toUpperCase().charAt(0);
		if (opcaoSN == 'S') 
		{
			saldo += (saldo * 0.0005);
		}
		System.out.printf("SALDO FINAL DA CONTA POUPANÇA %.2f \n", saldo);
		System.out.println();
		linha(40);
		
	}
	
	public static void linha(int tamanho) 
	{
		for (int x=1;x<tamanho; x++)
		{
			System.out.print("═");
		}
		System.out.println();
	}
	
	public static void contaCorrente()
	{	
		Scanner leia = new Scanner(System.in);
		int contagem = 0;
		int escolhadaTransacao;
		String descricaodaTransacao[] = new String[2];		
		int parcelaTalao = 0;
		double saldocomTalao = 0.00;
		double saldo = 0.00;
		double saldomuitos[] = new double [2];
		double valor = 0.00;
		double saldoTemporario = 0.00;
		char escolhaTalao = 'S', continuarSimNao = ' ';
		String descricao = null;
		
		System.out.println("Voce escolheu conta corrente"); // inicio cód. Tati
		System.out.println("Voce tem direto a 10 transações de debito ou credito");
	
		do	
		{ 	
			leia.nextLine();
			System.out.println(" Informe a descrição da sua tarefa ");
			descricao =leia.nextLine();
			descricaodaTransacao[contagem] = descricao;
			
			
			System.out.println("Sua transação é 1-Debito ou 2- Credito");
			escolhadaTransacao= leia.nextInt();
			while(escolhadaTransacao != 1 && escolhadaTransacao != 2 )
			{
				System.out.println("Voce digitou errado , tente novamente");
				System.out.println("Sua transação é 1-Debito ou 2- Credito");
				escolhadaTransacao = leia.nextInt();
			}
		
		
		
				if (escolhadaTransacao == 1)
				{	
						
						System.out.println("Digite o valor: " );
						valor = leia.nextInt();
						saldoTemporario = saldo;
						System.out.println("Sua transação foi debito e no valor de " + valor);
						saldo = saldo - valor;
						saldomuitos[contagem] +=saldo;
			
						if (saldo<0)
						{
							System.out.println("Seu saldo esta negativo , vc nao pode fazer essa atividade");	
							saldo = saldoTemporario;
							saldomuitos[contagem] +=saldo;
						}
				}
				
				if (escolhadaTransacao == 2)
				
				{   
					
					System.out.println("Digite o valor: " );
					valor = leia.nextInt();
					System.out.println("Sua transação foi credito e no valor de " + valor);
					saldo = saldo +valor;
					saldomuitos[contagem] +=saldo;
				
				}
		
			contagem++;
			
			
		
		}while (contagem !=2);
		
		
			System.out.println("Voce deseja emitir talão S/N" );
			escolhaTalao = leia.next().charAt(0);
			if(escolhaTalao != 'N' )
			{
				System.out.println("quantas vezes parcelados 1 - 3" );
				parcelaTalao = leia.nextInt();
				saldocomTalao = saldo/parcelaTalao;
				System.out.println("******************************");
				System.out.println("DEPRESSÃO BANKING G16");
				System.out.println("******************************");
				System.out.println("Conta corrente 01");
				System.out.println("Seu saldo é  " + saldo);
				System.out.println("Voce decidiu por talão e suas parcelas foram " + parcelaTalao);
				System.out.println("Baseado no seu saldo, suas parcelas precisam ser em torno de  " + saldocomTalao);
				
				
			}
			else
			{
				System.out.println("Sessão Encerrada");
				
			} // fim cód. Tati
			
			
			
	}
		
	
	
	public static void contaEspecial()
	{
		Scanner leia = new Scanner(System.in);
		DecimalFormat formatar = new DecimalFormat("0.00");
		int contagem = 0;
		int contaSelecionada;
		int escolhadaTransacao;
		String descricaodaTransacao[] = new String[2];		
		int parcelaTalao = 0;
		double saldocomTalao = 0.00;
		double saldo = 0.00;
		double saldomuitos[] = new double [2];
		double valor = 0.00;
		double saldoTemporario = 0.00;
		double saldoAtual = 0.0;
		double limite = 1000.0;
		double limiteDisponivel = 0.0;
		double limiteDisponivelMuitos[] = new double[2];
		double limiteUtilizado = 0.0;
		char escolhaTalao = 'S', continuarSimNao = ' ';
		String descricao = null;
		boolean recomecar = true;
		int decisaoFinal;
		char decisaoExtrato = ' ';
		
		do {
			leia.nextLine();
			System.out.printf("Digite a Descrição: ");
			descricao =leia.nextLine();
			descricaodaTransacao[contagem] = descricao;
			System.out.println("'CONTA ESPECIAL' - Seleciona o movimento [1 - D/ 2 - C]"); // inicio cód. Victor
			escolhadaTransacao = leia.nextInt();
			
			while(escolhadaTransacao != 1 && escolhadaTransacao != 2 )
			{
				System.out.println("Voce digitou errado , tente novamente");
				System.out.println("Sua transação é 1-Debito ou 2- Credito");
				escolhadaTransacao = leia.nextInt();
			}
			
			if(escolhadaTransacao == 1)
			{
				System.out.print("Digite o Valor: ");
				valor = leia.nextDouble();
				saldoAtual = saldo + valor;
				saldomuitos[contagem] +=saldoAtual;
				System.out.println("Saldo Atual "+formatar.format(saldoAtual) );
				
				
			}
			else
			{
			
				System.out.println("Deseja usar o limite?, se sim quanto: ");
				limiteUtilizado = leia.nextDouble();
				saldoAtual = saldo + limiteUtilizado;
				limiteDisponivel = limite - limiteUtilizado;
				limiteDisponivelMuitos[contagem] +=limiteDisponivel;
				System.out.printf("\nVocê utilizou " +formatar.format(limiteUtilizado)+" de limite");
				System.out.println("\nSeu saldo Atual é de: " +formatar.format(saldoAtual));
				System.out.println("\nLimite disponivel é de: " +formatar.format(limiteDisponivel));
			}
			if(limite == 0)
			{
				System.out.printf("Você está sem limite disponivel ");
			}
			
			contagem++;
	}while(contagem < 2);
			System.out.println("Sessão Encerrada");
	} // fim cód. Victor
	
}
	
	
