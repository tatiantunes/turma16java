package lista1;

import java.util.Scanner;

public class Exercicioresultado1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double a, b, c, d, e, f, x, y;

		System.out.println("\nDigite um valor para a: ");
		a = leia.nextDouble();
		System.out.println("\nDigite um valor para b: ");
		b = leia.nextDouble();
		System.out.println("\nDigite um valor para c: ");
		c = leia.nextDouble();
		System.out.println("\nDigite um valor para d: ");
		d = leia.nextDouble();
		System.out.println("\nDigite um valor para e: ");
		e = leia.nextDouble();
		System.out.println("\nDigite um valor para f: ");
		f = leia.nextDouble();

		x = ((c*e)-(b*f))/((a*e) -(b*d));

		System.out.println("\nO valor do x é " +x);
		y = ((a*f)-(c*d))/((a*e)-(b*d));
		System.out.println("\nO valor do y é " +y);
			
		}
}
