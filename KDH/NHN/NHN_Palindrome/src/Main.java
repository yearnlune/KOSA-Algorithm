import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static String f(String str) {
		String temp = "";
		for (int i = str.length() - 1; i > -1; i--) {
			temp += str.charAt(i);
		}
		str = String.valueOf(Integer.parseInt(str) + Integer.parseInt(temp)); 
		int sz = str.length();
		if (sz >= 5) return "-1";
		// TODO 펠린드롬넘버인지 판별
		for (int i = 0; i < sz / 2; i++) {
			for (int j = sz - 1; j > sz / 2; j--) {
				if (str.charAt(i) != str.charAt(j)) return f(str);
			}
		}
		return str;
	}
	
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(f(br.readLine().trim()));
	}
	
}
