import java.io.BufferedReader;
import java.io.InputStreamReader;

//boj 14726
public class Main {

	public static String checkCard(String card) {
		String answer = "F";
		int sum = 0;
		int len = card.length();
		for (int i = 0; i < len; i++) {
			int next = card.charAt(i) - '0';
			if(i % 2 == 0) {
				next = next << 1;
				next = (next / 10) + next % 10; 
			}
			sum += next;
		}
		
		if (sum % 10 == 0) answer = "T";
		
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine().trim());
		
		for (int i = 0; i < testCase; i++) {
			System.out.println(checkCard(br.readLine().trim()));
		}
	}
}
