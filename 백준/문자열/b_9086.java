package b_5;

import java.util.Scanner;

public class b_9086 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < T; i++) {
			String word = sc.nextLine();
			System.out.println("" + word.charAt(0) + word.charAt(word.length() - 1));
		}
	}

}
