package b_problem;

import java.util.*;

public class b_2525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt(); // 시
		int M = sc.nextInt(); // 분
		int C = sc.nextInt(); // 필요한 시간(분 단위)

		M += C;

		while (M >= 60) {
			M -= 60;
			H++;
		}

		if (H >= 24) {
			H -= 24;
		}

		System.out.println(H + " " + M);
	}
}
