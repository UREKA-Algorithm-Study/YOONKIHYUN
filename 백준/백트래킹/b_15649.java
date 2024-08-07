package b_problem;

import java.util.Arrays;
import java.util.Scanner;

public class b_15649 {
	private static int n, m;
    private static int[] arr; // 원소를 저장할 배열
    private static boolean[] visited; // 중복을 제거하기 위한 방문 처리
    // 순열
	private static void permutation(int cnt) {
        if (cnt == m) {
        	for (int i = 0; i < m; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }
        for (int i = 1; i <= n; i++) {	//전체 숫자를 하나씩 사용
            if (visited[i]==false) {
                visited[i] = true;
                arr[cnt] = i;
                permutation(cnt + 1);
                visited[i] = false;
            }//end if
        }//end for
    }//end permutation()
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		arr = new int[n];
		visited = new boolean[n + 1];
		permutation(0);
	}

}
