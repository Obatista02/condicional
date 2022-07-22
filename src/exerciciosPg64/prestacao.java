package exerciciosPg64;

import java.util.Locale;
import java.util.Scanner;

public class prestacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double valor = sc.nextDouble();
		double taxa = sc.nextDouble();
		double tempo = sc.nextDouble();

		double prestacao = valor + (taxa / 100) * tempo;
		
		System.out.println(prestacao);

		sc.close();
	}

}
