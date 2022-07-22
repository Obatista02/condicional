package exerciciosPg64;

import java.util.Scanner;

public class combinandp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		int a1,a2,a3,a4,a5,a6,m1,m2,m3,m4,m5,m6;
		a1 = A+B;  m1= A*B;
		a2 = A+C;  m2= A*C;
		a3 = A+D;  m3= A*D;
		a4 = B+C;  m4= C*B;
		a5 = C+D;  m5= C*D;
		a6 = D+B;  m6= D*B;
		 System.out.println(a1 + ", "+ a2+", " + a3 + ", "+ a4 +", " + a5 + ", "+ a6);
		 System.out.println(m1 + ", "+ m2+", " + m3 + ", "+ m4 +", " + m5 + ", "+ m6);
		sc.close();
	}

}
