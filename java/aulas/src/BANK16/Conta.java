package BANK16;

public class Conta {

	
	private String numero;
	private String cpf;
	private double saldo;
	public Conta(String numero, String cpf) {
		super();
		this.numero = numero;
		this.cpf = cpf;
		
	}
	
	public void Debitar(double debito)
	{
		
		if(saldo<=0)
		{
			
			System.out.println("Valor informado nao corresponde ao solicitado");
		}
		else {
			this.saldo -= debito;
		}
		
	}
	
	public void Creditar(double credito)
	{
		this.saldo += credito;
	}
	public String getNumero()
	{
		return numero;
	}
	public void setNumero(String numero)
	{
		this.numero = numero;
	}
	public String getCpf()
	{
		return cpf;
	}
	public void setCpf(String cpf)
	{
		this.cpf = cpf;
	}
	public double getSaldo()
	{
		return saldo;
	}
	
	
	
}
