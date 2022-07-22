package exerciciosPg64;

import java.util.Scanner;

public class aspas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();

		int r = (A - B) * (A - B);
		System.out.println(r);

		sc.close();
	}

}
