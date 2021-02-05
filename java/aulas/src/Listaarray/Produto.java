package Listaarray;

public class Produto {
	private String nomeProduto;
	private String codigo;
	private double precoUni;
	private int Estoque;
	
	
	
	
	public Produto(String nomeProduto, String codigo, double precoUni, int qtdeProdutoEstoque) {
		this.nomeProduto = nomeProduto;
		this.codigo = codigo;
		this.precoUni = precoUni;
		this.Estoque = qtdeProdutoEstoque;
	}
	public Produto(String nomeProduto, String codigo, double precoUnitario) 
	{
		this.nomeProduto = nomeProduto;
		this.codigo = codigo;
		this.precoUni = precoUnitario;
	}
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public double getPrecoUni() {
		return precoUni;
	}
	public void setPrecoUni(double precoUni) {
		this.precoUni = precoUni;
	}
	public Produto(String nomeProduto, double precoUni) {
		super();
		this.nomeProduto = nomeProduto;
		this.precoUni = precoUni;
	}
	
	public int getEstoque() {
		return Estoque;
	}
	

	public void tiraEstoque(int saida) 
	{
		if (testarEstoque(saida))
		{
			
			this.Estoque -= saida;
		}
		else 
		{
			System.out.println("Estoque indisponivel!!");
		}
		
	}
	
	public void adicionaEstoque(int entrada) 
	{
		
		
		this.Estoque += entrada;
	}
	
	public boolean testarEstoque(int valor) 
	{
		
		if (valor > this.Estoque) 
		{
			return false;
		}
		else if (valor == 0)
		{
			return false;
		}
		else if (this.Estoque == 0)
		{
			return false;
		}
		else if (this.Estoque < 0)
		{
			return false;
		}
		else	
		{
			return true;
		}
		
	}
	
	
	public double venda(int qtdeVendida) 
	{
		
		if (testarEstoque(qtdeVendida))
		{
			tiraEstoque(qtdeVendida);
			return qtdeVendida * this.precoUni;
		
		} 
		else 
		{
			System.out.println("Venda nao realizada!!");
			return 0;
		}
	
	
	}
	
}

