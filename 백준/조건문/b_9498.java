package b_problem;

import java.util.Scanner;

public class b_9498 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 시험점수 입력

		if (90 <= N && 100 >= N) {
			System.out.println("A");
		} else if (80 <= N && 89 >= N) {
			System.out.println("B");
		} else if (70 <= N && 79 >= N) {
			System.out.println("C");
		} else if (60 <= N && 69 >= N) {
			System.out.println("D");
		} else
			System.out.println("F");
	}
}
