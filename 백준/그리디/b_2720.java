package b_problem;

import java.util.Scanner;

public class b_2720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 수
        
        int[] coins = {25, 10, 5, 1}; // 쿼터, 다임, 니켈, 페니

        for (int i = 0; i < T; i++) {
            int change = sc.nextInt();
            
            // 동전의 개수를 저장할 배열
            int[] counts = new int[4];
            
            // 각 동전에 대해 필요한 개수를 계산
            for (int j = 0; j < 4; j++) {
                counts[j] = change / coins[j];
                change %= coins[j];
            }
            
            // 결과 출력
            for (int j = 0; j < 4; j++) {
                System.out.print(counts[j] + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}

