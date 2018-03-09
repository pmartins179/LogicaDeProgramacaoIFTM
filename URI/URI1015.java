
import java.util.Locale;
import java.util.Scanner;

public class URI1015 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		double x1, x2, y1, y2, resultform, finalresult;

		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();

		resultform = ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1));
		finalresult = Math.sqrt(resultform);

		System.out.printf("%.4f%n", finalresult);
		sc.close();
	}
}