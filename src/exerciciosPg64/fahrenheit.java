package exerciciosPg64;

import java.util.Scanner;

public class fahrenheit {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double F = sc.nextDouble();
		
		double C = ((F - 32) * 5) / 9;
		
		System.out.println(C);
		sc.close();
	}
}
