package b_3;

import java.util.Scanner;

public class b_25304 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int N = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			sum += (a*b);
		}
		
		if(X == sum) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
