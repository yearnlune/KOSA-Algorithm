import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;

//boj 14727 O(n^2 + n);
public class Main {
	public static int findRectangle(int[] graph, int n, HashMap<Integer, String> map) {
		int answer = n;
		Iterator<Integer> it = map.keySet().iterator();
		StringTokenizer st = null;
		while (it.hasNext()) {
			int i = it.next();
			String str = map.get(i);
			st = new StringTokenizer(str);
			int tempMax = 0;
			while (st.hasMoreTokens()) {
				int cur = Integer.parseInt(st.nextToken());
				int wid = 1;
				//¾Õ
				for (int j = cur - 1; j >= 0; j--) {
					if (graph[j] < i) break;
					wid++;
				}
				//µÚ
				for (int k = cur + 1; k < n; k++) {
					if (graph[k] < i) break;
					wid++;
				}
				if (tempMax < wid) 
					tempMax = wid;
				
			}
			if (answer < tempMax * i) 
				answer = tempMax * i;
		}
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
		int[] graph = new int[n + 1];
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		//O(n)
		for (int i = 0; i < n; i++) {
			graph[i] = Integer.parseInt(br.readLine());
			if (!map.containsKey(graph[i])) map.put(graph[i], "");
			map.put(graph[i], map.get(graph[i]) + String.format(" %d", i));
		}
		System.out.println(findRectangle(graph, n, map));
	}
	
}
