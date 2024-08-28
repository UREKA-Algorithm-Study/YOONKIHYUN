package b_problem;

import java.util.Arrays;
import java.util.Scanner;

public class b_20115 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		double[] Energy = new double[N];
		for (int i = 0; i < N; i++) {
			Energy[i] = sc.nextDouble();
		}
		
		// 배열을 오름차순으로 정렬
        Arrays.sort(Energy);
		
		//이 과정 에너지 드링크 하나 남을 때까지 반복
		double maxEnergy = Energy[N - 1];
		for(int i = 0; i < N - 1; i++) {
			//두 가지 드링크 고른다
			//한쪽 에너지 드링크를 다른 쪽 에너지 드링크에 모두 붓는다. 부을 때 절반 흘린다.
			//다 붓고 남은 빈 에너지 드링크는 버린다.
			maxEnergy += Energy[i] / 2.0;
		}
		
		System.out.println(maxEnergy);
	}

}
