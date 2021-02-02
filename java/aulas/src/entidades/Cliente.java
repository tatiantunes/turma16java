package entidades;
/*
 * 1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, em seguida 
 * crie um objeto cliente, defina as instancias deste objeto e apresente as informações deste objeto no console.
 */
public class Cliente {

	
	public String nome;
	public double desconto;
	public char genero;
	public int anos;
	
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
	
	public double Contadodesconto()
	{
		desconto = anos*0.15;
		return desconto;
		
	}
	
	public String statusDesconto()
	{
		String mensagem;
		if(desconto >2)
		{
			mensagem = "que voce tem nos fornecido bastante apoio , seu status é inestimavel";
			
		}else
		{
			mensagem = "continue nos apoiando!!";
		}
		
		return mensagem;
	}
	
	
}
