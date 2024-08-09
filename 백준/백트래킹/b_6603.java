package b_problem;

import java.util.Scanner;

public class b_6603 {
	static int k;
	static int[] S;
	static int[] combination;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			k = sc.nextInt();
			if (k == 0)
				break;

			S = new int[k];
			combination = new int[6];

			for (int i = 0; i < k; i++) {
				S[i] = sc.nextInt();
			}

			dfs(0, 0);
			sb.append("\n");
		}

		System.out.println(sb.toString());
	}

	public static void dfs(int start, int depth) {
		if (depth == 6) {
			for (int i = 0; i < 6; i++) {
				sb.append(combination[i]).append(" ");
			}
			sb.append("\n");
			return;
		}

		for (int i = start; i < k; i++) {
			combination[depth] = S[i];
			dfs(i + 1, depth + 1);
		}
	}
}
