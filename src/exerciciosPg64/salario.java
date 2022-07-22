package exerciciosPg64;

import java.util.Scanner;

public class salario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double sm = sc.nextDouble();
		double pr = sc.nextDouble();
		double ns = sm + pr/100;
		
		System.out.println(ns);
		
		sc.close();
	}

}
