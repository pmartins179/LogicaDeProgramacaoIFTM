import java.util.Locale;
import java.util.Scanner;

public class URI1040 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		float N1, N2, N3, N4, media, notaexame, mediafinal;

		N1 = sc.nextFloat();
		N2 = sc.nextFloat();
		N3 = sc.nextFloat();
		N4 = sc.nextFloat();

		media = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) / 10;

		System.out.printf("Media: %.1f\n", media);

		if (media >= 7.0) {
			System.out.println("Aluno aprovado.");
		} else {
			if (media < 5.0) {
				System.out.println("Aluno reprovado.");
			} else {
				notaexame = sc.nextFloat();
				mediafinal = (notaexame + media) / 2;
				System.out.println("Aluno em exame.");
				System.out.printf("Nota do exame: %.1f\n", notaexame);
				if (mediafinal >= 5.0) {
					System.out.println("Aluno aprovado.");
				} else {
					System.out.println("Aluno reprovado.");
				}
				System.out.printf("Media final: %.1f\n", mediafinal);
			}
		}
		sc.close();
	}
}