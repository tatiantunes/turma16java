package listapolimorfismo;

public class Cavalo extends Animal {
	
	public double peso;
	public boolean treinado;
	
	
	public Cavalo(double peso, boolean treinado) {
	
		this.peso = peso;
		this.treinado = treinado;
	}
	
	
	public Cavalo(String nome, double peso, boolean treinado) {
		super(nome);
		this.peso = peso;
		this.treinado = treinado;
	}


	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public boolean isTreinado() {
		return treinado;
	}

	public void setTreinado(boolean treinado) {
		this.treinado = treinado;
	}



	@Override
	public String emitirSom() {
		// TODO Auto-generated method stub
		String mensagemdeSom = null;
		if(treinado == true) {
			mensagemdeSom = "Excelentissimo";
		}
		if(treinado == false) {
			mensagemdeSom = "UGA UGA ";
		}
		
		return mensagemdeSom;
	}

	@Override
	public String correr() {
		// TODO Auto-generated method stub
		String mensagem = null;
		mensagem = "Correndo";
		return mensagem;
	}


	@Override
	public double quantoCorre() {
		// TODO Auto-generated method stub
		return 0;
	}

}
