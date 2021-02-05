package listapolimorfismo;

public class Cachorro extends Animal {
	private double peso; 
	
	private double vel;
	
	
	
	
	public Cachorro(String nome, int idade, double peso, double vel) {
		super(nome, idade);
		this.peso = peso;
		this.vel = vel;
	}

	@Override
	public String emitirSom() {
		// TODO Auto-generated method stub
		String mensagem;
		mensagem = "AU AU!! ";
		return mensagem;
	}

	@Override
	public String correr() {
		// TODO Auto-generated method stub
		
		String mensagem;
	
		mensagem = "Voce corre rapido para um cachorro";
		return mensagem ;
		
	}
	
	public Cachorro(String nome, double peso, double vel) {
		super(nome);
		this.peso = peso;
		this.vel = vel;
	}

	public double quantoCorre()
	{
		double corrida;
		corrida = vel * peso;
		return corrida;
	}
	


}
