
import java.util.Locale;
import java.util.Scanner;

public class URI1048 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		double salary, total, increase;
		int percent;

		salary = sc.nextDouble();

		if (salary <= 400.00) {
			percent = 15;
		} else if (salary <= 800.00) {
				percent = 12;
			} else if (salary <= 1200.00) {
					percent = 10;
				} else if (salary <= 2000.00) {
						percent = 7;
					} else {
						total = salary * 1.04;
						percent = 4;
					}
		
		
		total = ((salary * percent) / 100) + salary;
		increase = total - salary;

		System.out.printf("Novo salario: %.2f%n", total);
		System.out.printf("Reajuste ganho: %.2f%n", increase);
		System.out.println("Em percentual: " + percent + " %");

		sc.close();
	}
}