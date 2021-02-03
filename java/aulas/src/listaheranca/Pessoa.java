package listaheranca;
/*
 * 
1. Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos seletores (getters) e 
modificadores (setters), e ainda o construtor padr�o e pelo menos mais duas op��es de construtores 
conforme sua percep��o. Atributos: String nome; String endere�o; String telefone; 

 */

public class Pessoa 
{	
	public String nome;
	public String endereco;
	public String telefone;
	
	public Pessoa()
	{
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Pessoa(String nome, String endereco) {
		super();
		this.nome = nome;
		this.endereco = endereco;
	}
	
	public Pessoa(String nome, String endereco, String telefone) 
	{
		super();
		this.nome = nome;
		this.endereco = endereco;	
		this.telefone = telefone;
	}








	
	
	

	
	

	
}
