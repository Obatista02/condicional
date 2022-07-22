package exerciciosPg64;

import java.util.Scanner;

public class celsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int C = sc.nextInt();

		double F = C * 9 / 5 + 32;

		System.out.println(F);
		sc.close();
	}

}
