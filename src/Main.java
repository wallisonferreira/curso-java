import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double a, b, c;
		double x1, x2;
		double delta;
		
		System.out.println("Informe os valores de a, b, c");
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		delta = Math.pow(b, 2.0) - 4*a*c;
		
		if (delta < 0) {
			System.out.println("Não possui raíz. Delta = " + delta);
		} else {
			x1 = (-b + Math.sqrt(delta)) / (2.0*a);
			x2 = (-b - Math.sqrt(delta)) / (2.0*a);
			
			System.out.printf("Raízes x1 = %.2f e x2 = %.2f", x1, x2);
		}
		
	}

}
