import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static String checkPath(int[][] map) {
		String answer = "NO";
		int[] dx = {0, 1, 0, 1, 0}; 
		int[] dy = {0, 0, 1, 0, 1};
		
		int x = 0;
		int y = 0;
		
		while (true) {
			int nx = x + dx[map[y][x]];
			int ny = y + dy[map[y][x]];
		
			if (nx == 7 && ny == 7) {
				answer = "YES";
				break;
			}
			if (x == nx && y == ny) {
				break;
			}
			x = nx;
			y = ny;
		}
		return answer;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCase; i++) {
			int[][] map = new int[9][9];
			StringTokenizer st = null;
			for (int j = 0; j < 8; j++) {
				st = new StringTokenizer(br.readLine().trim());
				int k = 0;
				while (st.hasMoreTokens()) { 
					map[j][k++]= Integer.parseInt(st.nextToken());
				}
			}
			System.out.println(checkPath(map));
		}
	}
}
