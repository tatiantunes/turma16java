package listapolimorfismo;

public class Preguica extends Animal{
	private char cansaco;
	
	
	
	
	@Override
	public String emitirSom() {
		// TODO Auto-generated method stub
		String mensagem;
		if (cansaco == 'S')
		{
			mensagem = "Muuuuuuu";
					
		}else
		{
			mensagem = "Bleeeh";
		}
		return mensagem;
	}

	public char getCansaco() {
		return cansaco;
	}

	public void setCansaco(char cansaco) {
		this.cansaco = cansaco;
	}

	public Preguica(String nome, int idade, char cansaco) {
		super(nome, idade);
		this.cansaco = cansaco;
	}

	@Override
	public String correr() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String devesubiremArvores()
	{
		String mensagem;
		if (cansaco == 'S')
		{
			mensagem = "ixi tem que carregar";
					
		}else
		{
			mensagem = "ele é um amorzinho melhor carregar";
		}
		return mensagem;
	}

	public Preguica(String nome, char cansaco) {
		super(nome);
		this.cansaco = cansaco;
	}

	@Override
	public double quantoCorre() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
