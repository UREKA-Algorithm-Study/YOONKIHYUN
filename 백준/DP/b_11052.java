package DP;

import java.util.Scanner;

public class b_11052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 카드 개수
		int[] p = new int[N + 1]; // 카드팩 가격
		int[] dp = new int[N + 1]; // 최대 비용 저장할 DP 배열

		// 카드팩의 가격 입력
		for (int i = 1; i <= N; i++) {
			p[i] = sc.nextInt();
		}

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= i; j++) {
				dp[i] = Math.max(dp[i], dp[i - j] + p[j]);
			}
		}

		System.out.println(dp[N]);
	}
}
