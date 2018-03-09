
import java.util.Locale;
import java.util.Scanner;

public class URI1002 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		double area, raio;
		double pi = 3.14159;
		
		raio = sc.nextDouble();
		
		area = pi * Math.pow(raio, 2.0);
		
		System.out.printf("A=%.4f\n", area);
		
		sc.close();
	}

}