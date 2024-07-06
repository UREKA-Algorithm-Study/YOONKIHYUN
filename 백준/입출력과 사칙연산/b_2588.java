package b_problem;

import java.util.Scanner;

public class b_2588 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int B1 = B%10;			//일의 자리 숫자
		int B10 = (B/10)%10;	//십의 자리 숫자
		int B100 = B/100;		//백의 자리 숫자
		
		System.out.println(A*B1);
		System.out.println(A*B10);
		System.out.println(A*B100);
		System.out.println(A*B);
	}
}
