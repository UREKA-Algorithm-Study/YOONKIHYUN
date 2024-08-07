package b_problem;

import java.util.Arrays;
import java.util.Scanner;

public class b_15650 {
	private static int n, r;
	private static int[] arr;
	private static void combination(int cnt, int start) {
		if (cnt == r) {
			for (int i = 0; i < r; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}
		for (int i = start; i <= n; i++) {
			arr[cnt] = i;
			combination(cnt + 1, i + 1);
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		r = sc.nextInt();
		arr = new int[r];
		combination(0, 1);
	}

}
