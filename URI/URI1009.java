
import java.util.Locale;
import java.util.Scanner;

public class URI1009 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		String NAME;
		double SALARY, TOTALSALE, TOTAL;
		
		NAME = sc.next();
		SALARY = sc.nextDouble();
		TOTALSALE = sc.nextDouble();
		
		TOTAL = SALARY + (TOTALSALE * 0.15);
		
		System.out.printf("TOTAL = R$ %.2f\n", TOTAL);
		
		sc.close();
	}

}