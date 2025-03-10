package b_4;

import java.util.Scanner;

public class b_10807 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];

		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int v = sc.nextInt();	//찾고자 하는 숫자 입력
		int sum = 0;
		
		for(int i = 0; i < N; i++) {
			if(arr[i] == v) {
				sum++;
			}			
		}
		
		System.out.println(sum);
	}
}
