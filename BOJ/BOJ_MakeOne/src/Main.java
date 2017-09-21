import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//boj 1463
public class Main {
	
	public static int makeOne(int x) {
		int[] dp = new int[x + 4];
		dp[2] = 1;
		dp[3] = 1;
		for (int i = 4; i < x + 1; i++) {
			// 1�� �������� ��
			int temp = dp[i - 1] + 1;
			// 2, 3���� �������ٸ�
			if (i % 3 == 0) {
				if (temp > dp[i / 3] + 1)
					temp = dp[i / 3] + 1;
			} else if (i % 2 == 0) {
				if (temp > dp[i / 2] + 1)
					temp = dp[i / 2] + 1;
			}
			dp[i] = temp;
		}
		return dp[x];
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine().trim());
		System.out.println(makeOne(x));
	}

}
