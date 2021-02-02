package entidades;

public class Produto {
	
	public int codigo;
	public String descricao;
	public double valorUnitario;
	
	
	public Produto(String descricao)
	{
		this.descricao = descricao;
	}
	public Produto(int codigo,String descricao)
	{
		this.codigo = codigo;
		this.descricao = descricao;		
	}
	public Produto(int codigo,String descricao, double valorUnitario)
	{
		this.codigo = codigo;
		this.descricao = descricao;	
		this.valorUnitario = valorUnitario;
	}
	
	
}
