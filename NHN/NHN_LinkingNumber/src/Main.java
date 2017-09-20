import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
		
		public static void main(String[] args) throws Exception {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine());
			LinkedList<Integer> listOne = new LinkedList<Integer>();
			LinkedList<Integer> listTwo = new LinkedList<Integer>();
			String answer = "";
			
			while (st.hasMoreTokens()) {
				int tmp = Integer.parseInt(st.nextToken());
				if (tmp < 10) listOne.add(tmp); 
				listTwo.add(tmp);
			}
			//sort
			Collections.sort(listOne);
			Collections.sort(listTwo);
			
			//point
			int po = listOne.size() - 1;
			int pt = listTwo.size() - 1;
			
			//max
			if (listOne.get(po) > listTwo.get(pt) / 10) {
				answer += listOne.get(po--);
			} else if (listOne.get(po) < listTwo.get(pt) / 10) {
				answer += listTwo.get(pt--);
			} else {
				answer += listOne.get(po--);
			}
			
		}
}
