package b_2;

import java.util.Scanner;

public class b_2525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		int time = sc.nextInt();
				
		M += time;
		
		while(M >= 60) {
			M -= 60;
			H++;
		}
		
		if(H >= 24) {
			H -= 24;
		}
		
		System.out.println(H + " " + M);
	}
}
