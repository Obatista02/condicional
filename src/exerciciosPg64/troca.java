package exerciciosPg64;

import java.util.Scanner;

public class troca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int X = A;
		A = B;
		B = X;
		System.out.println(A);
		System.out.println(B);
		
		sc.close();
	}

}
