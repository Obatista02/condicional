package exerciciosPg64;

import java.util.Scanner;

public class expoente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int base = sc.nextInt();
		int expoente = sc.nextInt();
		
		int potencia = base ^ expoente;
		System.out.println(potencia);
		
		
		sc.close();
	}

}
