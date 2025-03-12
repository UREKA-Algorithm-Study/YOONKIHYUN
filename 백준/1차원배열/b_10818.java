package b_4;

import java.util.Scanner;

public class b_10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < N; i++) {
			int n = sc.nextInt();
			
			if(n > max) {
				max = n;
			}
			if(n < min) {
				min = n;
			}
		}

		System.out.println(min+ " " +max);
	}
}
