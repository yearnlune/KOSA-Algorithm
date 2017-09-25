import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine().trim());
		StringTokenizer st = null;
		int[][] matrix = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine().trim());
			int j = 0;
			while (st.hasMoreTokens()) {
				matrix[j++][i] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				bw.write(String.valueOf(matrix[i][j]));
				if (j == n - 1) continue;
				bw.write(" ");
			}
			bw.write("\n");
		}	
		bw.close();
	}
	
}
