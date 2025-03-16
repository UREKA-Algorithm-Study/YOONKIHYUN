package b_4;

import java.util.Scanner;

public class b_10811 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();	// 바구니 개수
		int M = sc.nextInt();	// 바꾸는 횟수
		int[] baskets = new int[N];
		
		//초기 바구니 설정
		for(int i = 0; i < N; i++) {
			baskets[i] = i + 1;
		}
		
		for(int i = 0; i < M; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			
			while(a < b) {
				int temp = baskets[a];
				baskets[a] = baskets[b];
				baskets[b] = temp;
				a++;
				b--;
			}
		}
		
		for(int num : baskets) {
			System.out.print(num + " ");
		}
	}

}
