package b_3;

import java.util.Scanner;

public class b_25314 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		if(N%4 == 0) {
			for(int i = 0; i < N/4; i++ ) {
				System.out.print("long ");
			}
			System.out.println("int");
		}
	}
}
