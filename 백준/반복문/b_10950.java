package b_problem;

import java.util.Scanner;

public class b_10950 {
	static int A;
	static int B;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			A = sc.nextInt();
			B = sc.nextInt();
			System.out.println(A + B);
		}
	}
}
