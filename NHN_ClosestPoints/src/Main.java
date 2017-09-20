import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
		StringTokenizer st = new StringTokenizer(br.readLine());
		LinkedList<Integer> list = new LinkedList<Integer>(); 
		String answer = "";
		while (st.hasMoreTokens()) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		Collections.sort(list);
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n - 1; i++) {
			int curr = list.get(i);
			int next = list.get(i + 1);
			if (next - curr < min) {
				min = next - curr;
				answer = String.format("%d %d\n", curr, next);
			}
		}
		//숫자로 저장하여 printf로 출력하는 방법도 있음(더효율적으로 생각)
		System.out.println(answer);
	}
}
