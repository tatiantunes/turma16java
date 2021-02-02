package entidades;

public class Pessoa {//atributos da classe
	//nome
	//genero
	//anodeNascimento
	public String nome;
	public int anoNascimento;
	public char genero;
	
	public int idade()
	{
		 return 2021 - anoNascimento;
	}
	
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
	
	public String statusIdade()
	{
		int idade;
		String mensagem;
		idade = 2021 - anoNascimento;
		if (idade <18) 
		{
			mensagem = "pessoa menor de 18 anos";
		} else
		{
			mensagem = "pessoa maior de 18 anos";
		}
		return mensagem;
	}
			
	

}
