package exerciciosPg64;

import java.util.Locale;
import java.util.Scanner;

public class comprimentoRetangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double comprimento = sc.nextDouble();
		double largura = sc.nextDouble();
		double altura = sc.nextDouble();
		
		double volume = comprimento * largura * altura;
		
		System.out.println(volume);
		
		sc.close();
	}

}
