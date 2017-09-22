import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int ansf = 0;
		int anss = 0;
		char[] vowel = {'a', 'e', 'i', 'o', 'u'};
		int vsz = 5;
 		while (st.hasMoreTokens()) {
			String str = st.nextToken();
			int sz = str.length();
			int[] temp = new int[sz];
			int a = 1;
			int b = -1;
			for (int i = 0; i < sz; i++) {
				boolean bl = true;
				for (int j = 0; j < vsz; j++) {
					if (str.charAt(i) == vowel[j]) {
						bl = false;
						temp[i] = a++;
						b = -1;
						break;
					}
				}
				if (bl) {
					temp[i] = b--; 
					a = 1;
				}
			}
			boolean bf = false;
			boolean bs = false;
			for (int i = 0; i < temp.length; i++) {
				
				if (temp[i] == 2) {
					if (bf) continue;
					ansf++;
					bf = true;
				} else if (temp[i] == -3) {
					if (bs) continue;
					anss++;
					bs = true;
				}
			}
		}
		System.out.printf("%d\n%d", ansf, anss);
	}
}
