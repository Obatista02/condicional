package exerciciosPg64;

import java.util.Scanner;

public class esfera {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double raio = sc.nextDouble();
		
		double volume = (4/3)*3.14159*(raio * raio * raio);
		System.out.println(volume);
		sc.close();

	}

}
