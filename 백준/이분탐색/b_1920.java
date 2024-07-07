package b_problem;

import java.util.Arrays;
import java.util.Scanner;

public class b_1920 {

	static int binSearch(int[] a, int k, int key) {
		int pl = 0;
		int pr = k - 1;

		do {
			int pc = (pl + pr) / 2;
			if (a[pc] == key)
				return pc;
			else if (a[pc] < key)
				pl = pc + 1;
			else
				pr = pc - 1;
		} while (pl <= pr);

		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] n = new int[N];
		for (int i = 0; i < N; i++) {
			n[i] = sc.nextInt();
		}

		int M = sc.nextInt();

		int[] m = new int[M];
		for (int i = 0; i < M; i++) {
			m[i] = sc.nextInt();
		}

		Arrays.sort(n); // 배열 n 정렬

		for (int i = 0; i < M; i++) {
			if (binSearch(n, N, m[i]) >= 0) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}

	}

}
