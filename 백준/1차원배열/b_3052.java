package b_4;

import java.util.Scanner;

public class b_3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] Check = new boolean[42];
		int count = 0;
		
		for(int i = 0; i < 10; i++) {
			int N = sc.nextInt();
			int remainder = N % 42;
			
			if(!Check[remainder]) {
				Check[remainder] = true;
				count++;
			}
		}
		
		System.out.println(count);
	}

}
