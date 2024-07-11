package b_problem;

import java.util.Arrays;
import java.util.Scanner;

public class b_2512 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 지방의 수
		int max = 0;

		// 각 지방의 예산 요청 금액, 상한액
		int[] localarr = new int[N];
		for (int i = 0; i < N; i++) {
			localarr[i] = sc.nextInt();
			if (localarr[i] > max) {
				max = localarr[i];
			}
		}

		int totalMoney = sc.nextInt(); // 총 예산

		int low = 0;
		int high = max;
		int result = 0;

		while (low <= high) {
			int mid = (low + high) / 2;	//상한액 후보
			long currentSum = 0;

			//상한액을 적용하여 현재 예산의 합 계산
			for (int i = 0; i < N; i++) {
				if (localarr[i] > mid) {
					currentSum += mid;
				} else {
					currentSum += localarr[i];
				}
			}

			//이분 탐색 조건
			if (currentSum <= totalMoney) {
				result = mid;
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		System.out.print(result);
	}

}
