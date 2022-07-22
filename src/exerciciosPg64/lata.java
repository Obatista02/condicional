package exerciciosPg64;

import java.util.Scanner;

public class lata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// calcular o volume de uma lata/objeto
		Scanner sc = new Scanner(System.in);
		double R = sc.nextDouble();
		double h = sc.nextDouble();
		double PI = 3.14159;
		double V = PI * R * R * h;
		
		System.out.println(V);
		sc.close();
	}

}
