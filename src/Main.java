import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int y = 32;
		double x = 10.35784;
		String nome = "Wallison";
		int idade = 28;
		double renda = 5000.00;
		
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		System.out.println("RESULTADO = " + x + " METROS");
		System.out.printf("RESULTADO = %.2f METROS%n", x);
		System.out.println("RESULTADO = " + x + " METROS");
		System.out.printf("Nome: %s%n" + "Idade: %d%n" + "Renda: %f%n", nome, idade, renda);
	}

}
