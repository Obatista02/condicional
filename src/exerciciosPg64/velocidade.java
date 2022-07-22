package exerciciosPg64;

import java.util.Scanner;

public class velocidade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double distancia = sc.nextDouble();
		double tempo = sc.nextDouble();
		
		double velocidade = (distancia * 1000) / (tempo * 60);
		
		System.out.println(velocidade);
		
		sc.close();
	}

}
