
import java.util.Locale;
import java.util.Scanner;

public class URI1017 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		int time, velocity;
		double efficiency, distance;

		velocity = sc.nextInt();
		time = sc.nextInt();

		distance = velocity * time;
		efficiency = distance / 12;

		System.out.printf("%.3f%n", efficiency);

		sc.close();
	}

}