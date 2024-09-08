package 반복문;

import java.util.Scanner;

public class b_25314 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int count = N / 4;
		for (int i = 0; i < count; i++) {
			System.out.print("long ");
		}

		System.out.println("int");
	}
}
