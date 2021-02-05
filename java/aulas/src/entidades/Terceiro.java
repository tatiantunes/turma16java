package entidades;

public class Terceiro extends Empregado 
{
	private double acrescimo;

	public Terceiro(int horas, double valorHora, double acrescimo) 
	{
		
		super(horas,valorHora);
		this.acrescimo = acrescimo;
	}


	public Terceiro(String nome, int matricula, int horas, double valorHora, double acrescimo) {
		super(nome, matricula, horas, valorHora);
		this.acrescimo = acrescimo;
	}


	public double getAcrescimo() 
	{
		return acrescimo;
	}

	public void setAcrescimo(double acrescimo) {
		this.acrescimo = acrescimo;
	}
	
	@Override
	public double Salario(double valorHora)
	{
		double Salario;
		acrescimo= acrescimo/100;
		Salario = (getHoras() * (super.getHora() + (super.getHora()*acrescimo)));
		
		return Salario;
	}
	

}
