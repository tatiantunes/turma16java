package entidades;
/*
 * 5) Crie uma classe patinete e apresente os atributos e métodos referentes esta classe, 
 * em seguida crie um objeto patinete, defina as instancias deste objeto e 
 * apresente as informações deste objeto no console.
 */
public class Patinete {

	public char genero;
	public String nome;
	public String cor;
	public boolean Troca = true;

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
	
	public String TrocadePatinete(boolean Troca)
	{
		String mensagem;
		if(Troca == true)
		{
			mensagem = "e voce quer trocar por bicicleta";
			
		}else
		{
			mensagem = "e esta satisfeito com o patinete";
		}
		
		return mensagem;
	}
	
}
