import java.util.Scanner;

public class Programa {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
	System.out.println("Digite o primeiro numero: ");
	double x = sc.nextInt();
	System.out.println("Digite o segundo numero: ");
	double y = sc.nextInt();
	
	double med = (x + y) / 2;
	
	System.out.println("A media eh: " + med);
	sc.close();
	}
}