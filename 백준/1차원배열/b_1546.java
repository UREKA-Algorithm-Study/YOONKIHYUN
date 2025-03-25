package b_4;

import java.util.Scanner;

public class b_1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();	//시험 본 과목의 개수
		double[] scores = new double[N];	//점수를 저장할 배열
		double max = 0;
		double sum = 0;
		
		for(int i = 0; i < N; i++) {
			scores[i] = sc.nextInt();
			if(scores[i] > max) {
				max = scores[i];
			}
		}
		
		for(int i = 0; i < N; i++) {
			sum += (scores[i] / max) * 100;
		}
		
		System.out.println(sum / N);
	}

}
