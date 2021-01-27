package aulas;

import java.util.Scanner;

public class DuplasSE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner leia = new Scanner(System.in);	
	
	int x;
	System.out.println("Digite um numero positivo");
	x= leia.nextInt();
	
	while(x<0)
	{
		System.out.println("O numero deve ser positivo, digite o numero novamente");
		x= leia.nextInt();
	}
	
	if(x%2 ==0 && x>0)
	{
		System.out.println("É par");
	}else if(x == 0) 
	{
		System.out.println("É neutro");
	}
	
	else {
		System.out.println("É impar");
	}
	
	
		
	}

}
