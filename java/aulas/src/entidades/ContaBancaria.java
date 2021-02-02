package entidades;
/*
 * Crie uma classe conta bancaria e apresente os atributos e 
 * métodos referentes esta classe, em seguida crie um objeto conta bancaria,
 *  defina as instancias deste objeto e apresente as informações deste objeto
 *   no console.
 */
public class ContaBancaria {
	public char genero;
	public String nome;
	public  double valor;
	public int escolhadaConta;

	public String statusGenero(char genero)

	{
		String apelido;
		if(genero == 'F')
		{
			apelido = "Sra.";
			
		}
		
		else if (genero == 'M')
		{
			apelido = "Sr.";
			
		}else {
			apelido = "Srx.";	
		}
		return apelido;
	}
	
	public String tipodeConta(int escolhadaConta)
	{
		String mensagem = null;
	
	
		if(escolhadaConta == 1)
	
		{
			mensagem = "Conta Corrente";
			
		}
		else if(escolhadaConta == 2)
	
		{
			mensagem = "Conta Poupança";
			
			
		}
		return mensagem;
	}
	
	public void valordaConta()
	{
		double valorFinal;
		
		if(escolhadaConta == 1)
	
		{
			
			valorFinal = valor*0.15;
			System.out.println("O saldo para Conta Corrente é " +valorFinal);
		}
		else if(escolhadaConta == 2)
	
		{
			
			valorFinal = valor*0.25;
			
			System.out.println("O saldo para Conta Poupança é " +valorFinal);
		}
	}
}
