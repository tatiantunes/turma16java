package entidades;
/*
 * 2) Crie uma classe avião e apresente os atributos e métodos referentes esta classe, 
 * em seguida crie um objeto avião, defina as instancias deste objeto e apresente as informações deste objeto no console.
 */
public class Aviao
{
	public char genero;
	public String nome;
	public int escolhadoPlano;

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
	
	
	public String statusPlano(int escolhadoPlano)
	{
		String mensagem = null;
		if(escolhadoPlano == 1)
		{
		  mensagem = "seu plano é economico";
		}
		else if (escolhadoPlano == 2)
		{
			mensagem = "seu plano é classe executiva";
		}
		else if (escolhadoPlano == 3)
		{
			mensagem = "seu plano é primeira classe";
		}
			
		return mensagem;
		
	}
	
	public String statusComida( int escolhadoPlano)
	{
		String mensagem1 = null;
		if(escolhadoPlano == 1)
		{
		  mensagem1 = "terá direito a um biscoito";
		}
		else if (escolhadoPlano == 2)
		{
			mensagem1 = "terá direito a um lanche e uma bebida da sua escolha";
		}
		else if (escolhadoPlano == 3)
		{
			mensagem1 = "terá todo apoio e inclusive nosso menu especial";
		}
			
		return mensagem1;
		
	}
	
}
