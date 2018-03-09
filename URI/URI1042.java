import java.util.Locale;
import java.util.Scanner;

public class URI1042 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		int A, B, C;

		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();

		if (A > B && B > C) {
			System.out.println(C);
			System.out.println(B);
			System.out.println(A);
		} else if (A < B && B < C) {
			System.out.println(A);
			System.out.println(B);
			System.out.println(C);
		} else if (A > B && B < C) {
			System.out.println(B);
			System.out.println(C);
			System.out.println(A);
		} else if (A < C && B < A) {
			System.out.println(B);
			System.out.println(A);
			System.out.println(C);
		} else if (B > A && A > C) {
			System.out.println(C);
			System.out.println(A);
			System.out.println(B);
		} else {
			System.out.println(A);
			System.out.println(C);
			System.out.println(B);
		}

		System.out.println("");

		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		sc.close();
	}

}