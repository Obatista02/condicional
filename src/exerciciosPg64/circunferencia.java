package exerciciosPg64;

import java.util.Scanner;

public class circunferencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double raio = sc.nextDouble();
		double Circ = 3.14159265 * (raio * raio);
		System.out.println(Circ);
		sc.close();
	}

}
