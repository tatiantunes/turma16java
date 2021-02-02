package entidades;
/*
 * 7) Crie uma classe paciente e apresente os atributos e métodos referentes esta classe,
 *  em seguida crie um objeto paciente, defina as instancias deste objeto e 
 *  apresente as informações deste objeto no console.
 */
public class Paciente 
{
	public char genero;
	public String nome;
	public int estado;
	public int idade;

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
	
	public String estadoEmocional(int estado,int idade)
	{
		String mensagem = null;
		if(estado == 3)
		{
			mensagem =  "Voce precisa ficar internado";
			
			
		}
		
		else if (estado == 2 || idade >60)
		{
			mensagem = "Voce precisa tomar vacina";
		}
		
		else if (estado == 1 )
		{
			mensagem = "Por favor volte a sua casa nao é bom ficar exposto";
		}
		return mensagem;
		
	}
}
