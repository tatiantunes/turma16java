package entidades;
/*
 * 3) Crie uma classe produto eletrônico e apresente os atributos e 
 * métodos referentes esta classe, em seguida crie um objeto produto eletrônico, 
 * defina as instancias deste objeto e apresente as informações deste objeto no console.
 */
public class ProdutoEletronico
{
	public char genero;
	public String nome;
	public String cor;
	public int escolhaEntrega;

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
	
	public String statusEntrega(int escolhaEntrega)
	{	
		String mensagem = null;
		if(escolhaEntrega == 1)
		{
		  mensagem = "sera entregue em casa";
		}
		else if (escolhaEntrega == 2)
		{
			mensagem = "sera entregue no seu trabalho";
		}
		else if (escolhaEntrega == 3)
		{
			mensagem = "sera entregue no correios";
		}
		
		return mensagem;
		
	}
	
}
