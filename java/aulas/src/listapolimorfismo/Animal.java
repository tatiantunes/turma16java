package listapolimorfismo;
/*
 * Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e comportamentos (observe a tabela), 
 * utilize os seus conhecimentos e distribua as características de forma que tudo o que for comum a todos os animais
 *  fique na classe Animal:
 */
public abstract class Animal implements Cachorrointerface, CavaloInterface, PreguicaInterface {
	protected String nome;
	protected int idade;
	protected String cor;
	public Animal() {
		
	}
	
	public Animal(String nome, int idade, String cor) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
	}
	
	public Animal(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	public abstract String emitirSom();	
	
	public Animal(String nome) {
		super();
		this.nome = nome;
	}

	public abstract  String correr();

	@Override
	public String devesubiremArvores() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
