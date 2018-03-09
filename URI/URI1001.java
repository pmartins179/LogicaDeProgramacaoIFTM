
import java.util.Locale;
import java.util.Scanner;

public class URI1001 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int A, B, X;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		X = A + B;
		
		System.out.println("X = "+X);
		
		sc.close();
	}

}