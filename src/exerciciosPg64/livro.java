package exerciciosPg64;

import java.util.Scanner;

public class livro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int p = a *c;
		int s = b +d;
		System.out.println(p + " "+ s);
		sc.close();
	}
}
