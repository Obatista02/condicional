package exerciciosPg64;

import java.util.Locale;
import java.util.Scanner;

public class gastoGasolina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int carro = sc.nextInt();
		int tempo = sc.nextInt();
		double velocidade = sc.nextDouble();
		double distancia = tempo * velocidade;
		double litros = distancia / carro;
		
		System.out.println("Velocidade: "+ velocidade);
		System.out.println("Tempo: "+ tempo);
		System.out.println("Distancia: "+ distancia);
		System.out.println("Litos gastos: "+ litros);
		
		sc.close();

	}

}
