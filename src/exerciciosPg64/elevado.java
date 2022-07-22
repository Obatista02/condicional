package exerciciosPg64;

import java.util.Scanner;

public class elevado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a =sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int soma1 = (a*a)+(b*b)+(c*c);
		System.out.println(soma1);
		
		int soma2 = (a+b+c)*(a+b+c);
		System.out.println(soma2);
		
		
		sc.close();
	}

}
