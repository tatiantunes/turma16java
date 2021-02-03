package BANK16;

public class MainConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta cliente1 = new Conta("123", "0000");
		
		cliente1.Creditar(50);
		cliente1.Debitar(10);
		
		System.out.println(cliente1.getSaldo());
		
	}

}
