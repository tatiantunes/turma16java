package listaheranca;
/*
 * Considere, como subclasse da classe Pessoa, a classe Empregado. Considere que cada instância da classe Empregado tem, 
 * para além dos atributos que caracterizam a classe Pessoa, os atributos codigoSetor (inteiro), salarioBase (vencimento base)
 *  e imposto (porcentagem retida dos impostos). Implemente a classe Empregado com métodos seletores e 
 *  modificadores e um método calcularSalario. 
 */
public class Empregado extends Pessoa
{
	
	public int codigoSetor;
	public double salarioBase;
	public double impostos;
	
	public Empregado() {
		
	}

	public Empregado(String nome, String endereco, String telefone,int codigoSetor, double salarioBase, double impostos)
	{
		super(nome, endereco, telefone);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.impostos = impostos;
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImpostos() {
		return impostos;
	}

	public void setImpostos(double impostos) {
		this.impostos = impostos;
	}

	public void ObterSalario()
	{
		impostos = impostos/100;
		double salarioFinal;
		salarioFinal = (salarioBase - (salarioBase*impostos));
		System.out.printf("O imposto resultante foi %f e com isso seu salario %f", impostos, salarioFinal);
	}
	
	
		
	
}
