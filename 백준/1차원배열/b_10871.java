package b_4;

import java.util.Scanner;

public class b_10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] A = new int[N];
		
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			
			if(A[i] < X) {
				System.out.print(A[i]+" ");
			}
		}
	}
}
