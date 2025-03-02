package b_2;

import java.util.Scanner;

public class b_9498 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if(90<=num && 100>=num)
			System.out.println("A");
		else if(80<=num && 89>=num)
			System.out.println("B");
		else if(70<=num && 79>=num)
			System.out.println("C");
		else if(60<=num && 69>=num)
			System.out.println("D");
		else
			System.out.println("F");
	}
}
