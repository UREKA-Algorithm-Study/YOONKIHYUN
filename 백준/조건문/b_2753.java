package b_problem;

import java.util.Scanner;

public class b_2753 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();	//연도입력
		
		if (N % 4 == 0 && N % 100 != 0 || N % 400 == 0) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}
