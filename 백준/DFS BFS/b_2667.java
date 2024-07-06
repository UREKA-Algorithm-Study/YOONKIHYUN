package b_problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class b_2667 {
	static int N, count; // 정사각형 크기
	static int[][] Map;
	static boolean[][] visited;
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };
	static List<Integer> HomeCount = new ArrayList<>();

	public static int dfs(int x, int y) {
		visited[x][y] = true;
		int count = 1; // 현재 집 포함

		// 상하좌우 탐색
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
				if (Map[nx][ny] == 1 && !visited[nx][ny]) {
					count += dfs(nx, ny);
				}
			}
		}

		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		Map = new int[N][N];
		visited = new boolean[N][N];

		// 지도 정보 입력 받기
		for (int i = 0; i < N; i++) {
			String line = sc.next();
			for (int j = 0; j < N; j++) {
				Map[i][j] = line.charAt(j) - '0';
			}
		}

		// 단지 탐색
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (Map[i][j] == 1 && !visited[i][j]) {
					int count = dfs(i, j);
					HomeCount.add(count);
				}
			}
		}

		Collections.sort(HomeCount);	//오름차순
		System.out.println(HomeCount.size());
		for (int i = 0; i < HomeCount.size(); i++) {
			int count = HomeCount.get(i);
			System.out.println(count);
		}
	}

}
