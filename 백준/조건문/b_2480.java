package b_problem;

import java.util.*;

public class b_2480 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 같은 눈 3개 = 10000 + 같은 눈 x 1000
		// 같은 눈 2개 = 1000 + 같은 눈 x 100
		// 모두 다른 눈 = 가장 큰 눈 x 100
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int result = 0;
		
		if (A == B && B == C) {
            // 세 개의 눈이 모두 같은 경우
			result = 10000 + A * 1000;
        } else if (A == B || A == C) {
            // 두 개의 눈이 같은 경우 (a가 다른 두 주사위와 같을 때)
        	result = 1000 + A * 100;
        } else if (B == C) {
            // 두 개의 눈이 같은 경우 (b와 c가 같을 때)
        	result = 1000 + B * 100;
        } else {
            // 세 개의 눈이 모두 다른 경우
        	result = Math.max(A, Math.max(B, C)) * 100;
        }

        // 결과 출력
        System.out.println(result);
	}
}
