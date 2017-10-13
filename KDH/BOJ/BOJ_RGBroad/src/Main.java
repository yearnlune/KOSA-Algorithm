import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//boj 1149
public class Main {
	static int[] dp = {0, 0, 0};
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int n = Integer.parseInt(br.readLine());
		int[] input = new int[3];
		for (int i = 0; i < n; i++) {
			int j = 0;
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				input[j++] = Integer.parseInt(st.nextToken());
			}
			if (i == 0) {
				init(input);
				continue;
			}
			calc(input);
		}
		System.out.println(minValue());
	}
	
	public static void init(int[] input) {
		dp[0] = input[0];
		dp[1] = input[1];
		dp[2] = input[2];
	}
	
	public static void calc(int[] input) {
		int[] tempArr = new int[3];
		for (int i = 0; i < input.length; i++) {
			int min = Integer.MAX_VALUE;
			for (int j = 0; j < dp.length; j++) {
				if (i == j) continue;
				int temp = dp[j] + input[i];
				if (min > temp) min = temp;
			}
			tempArr[i] = min;
		}
		init(tempArr);
	}
	
	public static int minValue() {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < dp.length; i++) {
			if (min > dp[i]) min = dp[i];
		}
		return min;
	}
}
