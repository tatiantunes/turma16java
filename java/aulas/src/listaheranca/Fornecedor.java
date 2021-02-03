package listaheranca;
/*Considere, como subclasse da classe Pessoa (desenvolvida no exercício anterior) a classe Fornecedor.
 *  Considere que cada instância da classe Fornecedor tem, para além dos atributos que caracterizam a classe Pessoa, 
 *  os atributos valorCredito (correspondente ao crédito máximo atribuído ao fornecedor) e valorDivida 
 *  (montante da dívida para com o fornecedor). Implemente na classe Fornecedor, para além dos usuais métodos seletores 
 *  e modificadores, um método obterSaldo() que devolve a diferença entre os valores dos atributos valorCredito e valorDivida. 
 * 
 */
public class Fornecedor extends Pessoa 
{
	
	public double valorCredito;
	public double valorDivida;
	public Fornecedor(String nome, String endereco, String telefone,double valorCredito, double valorDivida) {
		super(nome, endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	
	public Fornecedor() 
	{
		
	}
	public double getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}
	public double getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	public void ObterSaldo()
	{
		double dif;
		dif = valorCredito - valorDivida;
		System.out.printf("O saldo foi %f",dif);
	}
	
	
}
