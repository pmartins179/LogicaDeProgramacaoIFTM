
import java.util.Locale;
import java.util.Scanner;

public class URI1016 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int time, km;
		
		km = sc.nextInt();
		
		time = km * 2;
		
		System.out.println(time +" minutos");
		sc.close();
	}
}