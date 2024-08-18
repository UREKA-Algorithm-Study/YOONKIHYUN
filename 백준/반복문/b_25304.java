package b_problem;

import java.util.Scanner;

public class b_25304 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt(); // 영수증에 적힌 총 금액 X
		int N = sc.nextInt(); // 구매한 물건의 종류의 수 N
		int result = 0;

		for (int i = 1; i <= N; i++) {
			int a = sc.nextInt(); // 가격 a
			int b = sc.nextInt(); // 개수 b

			result += (a*b);
		}

		if (X == result) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
