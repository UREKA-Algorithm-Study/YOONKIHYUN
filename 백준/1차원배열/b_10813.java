package b_4;

import java.util.Scanner;

public class b_10813 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();	// 바구니 개수
		int M = sc.nextInt();	// 공 넣는 횟수
		
		int[] baskets = new int[N];
		
		for(int i = 0; i < N; i++) {
			baskets[i] = i + 1;
		}
		
		for(int i = 0; i < M; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			
			int temp = baskets[a];
			baskets[a] = baskets[b];
			baskets[b] = temp;
		}
		
		for(int ball : baskets) {
			System.out.print(ball + " ");
		}
	}
}
