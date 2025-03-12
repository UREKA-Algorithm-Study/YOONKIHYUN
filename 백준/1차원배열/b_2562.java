package b_4;

import java.util.Scanner;

public class b_2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int max = Integer.MIN_VALUE;
		int n = 0;
		
		for(int i = 0; i < 9; i++) {
			int N = sc.nextInt();
			
			if(N > max) {
				max = N;
				n = i + 1;
			}
		}
		
		System.out.println(max);
		System.out.println(n);
	}
}
