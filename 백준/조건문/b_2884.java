package b_problem;

import java.util.*;

public class b_2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt(); // 시
		int M = sc.nextInt(); // 분

		M -= 45;

		if (M < 0) {
			H--;
			M += 60;
		}

		if (H < 0) {
			H = 23;
		}

		System.out.println(H + " " + M);
	}
}
