package entidades;

public class Funcionario {
	public char genero;
	public String nome;
	public int anosdeTrabalho;
	public int area;

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
	
	public String statusEntrega(int area)
	{	
		String mensagem = null;
		if(area == 1)
		{
		  mensagem = "Suporte";
		}
		else if (area == 2)
		{
			mensagem = "Marketing";
		}
		else if (area == 3)
		{
			mensagem = "Desenvolvimento";
		}
		
		return mensagem;
		
	}
	public String statusPromocao(int anosdeTrabalho)
	{	
		String mensagem;
		if(anosdeTrabalho > 5)
		{
		  mensagem = "voce ira ser promovido";
		}
		else 
		{
			mensagem = "seu perfil esta sendo olhado pela supervisao";
		}
		return mensagem;
		
	}
	
}
