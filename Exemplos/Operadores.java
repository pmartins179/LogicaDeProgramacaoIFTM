import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x;

		x = sc.nextInt();

		if (x % 2 == 0) {
			System.out.println(x + " eh par");
		} else {
			System.out.println(x + " eh impar");
		}
		if (x > 0) {
			System.out.println(x + " eh positivo");
		} else if (x == 0) {
			System.out.println(x + "vale 0");
		} else {
			System.out.println(x + " eh negativo");
		}
		if (x != 0) {
			System.out.println(x + " eh diferente de 0");
		}

		sc.close();
	}
}