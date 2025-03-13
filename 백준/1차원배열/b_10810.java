package b_4;

import java.util.Scanner;

public class b_10810 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();	// 바구니 총 개수
		int M = sc.nextInt();	// 공 넣는 횟수
		
		int[] baskets = new int[N];
		
		for(int i = 0; i < M; i++) {
			int a = sc.nextInt();	// 시작 바구니 번호
			int b = sc.nextInt();	// 끝 바구니 번호
			int c = sc.nextInt();	// 넣을 공의 번호
			
			// a번 바구니부터 b번 바구니까지 c번 공을 넣음
			for(int j = a - 1; j < b; j++) {
				baskets[j] = c;
			}
		}
		
		for(int ball : baskets) {
			System.out.print(ball + " ");
		}
	}
}
