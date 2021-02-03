package listaheranca;
/*Considere, como subclasse da classe Pessoa (desenvolvida no exerc�cio anterior) a classe Fornecedor.
 *  Considere que cada inst�ncia da classe Fornecedor tem, para al�m dos atributos que caracterizam a classe Pessoa, 
 *  os atributos valorCredito (correspondente ao cr�dito m�ximo atribu�do ao fornecedor) e valorDivida 
 *  (montante da d�vida para com o fornecedor). Implemente na classe Fornecedor, para al�m dos usuais m�todos seletores 
 *  e modificadores, um m�todo obterSaldo() que devolve a diferen�a entre os valores dos atributos valorCredito e valorDivida. 
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
