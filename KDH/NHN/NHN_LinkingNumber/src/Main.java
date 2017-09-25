import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
		
	public static String max(LinkedList<Integer> listOne, LinkedList<Integer> listTwo) {
		String answer = "";
		//point
		int po = -1;
		int pt = -1;
		if (!listOne.isEmpty()) po = listOne.size() - 1;
		if (!listOne.isEmpty()) pt = listTwo.size() - 1;
		
		//max
		while (po != -1 && pt != -1) {
			int one = listOne.get(po);
			int two = listTwo.get(pt);
			if (one > two / 10) {
				answer += one;
				po--;
			} else if (one < two / 10) {
				answer += two;
				pt--;
			} else {
				if (one < two % 10) {
					answer += two;
					pt--;
				}
				else {
					answer += one;
					po--;
				}
			}
			if (po == -1 || pt == -1) break;
		}
		
		if (po == -1 && pt != -1) {
			while (pt > -1) {
				answer += listTwo.get(pt--);
			}
		} else if (po != -1 && pt == -1) {
			while (po > -1) {
				answer += listOne.get(po--);
			}
		}
		
		return answer;
	}
	public static String min(LinkedList<Integer> listOne, LinkedList<Integer> listTwo) throws Exception {
		String answer = "";
		//size
		int osz = listOne.size();
		int tsz = listTwo.size();
		
		//point
		int po = 0;
		int pt = 0;
		
		//max
		while (osz != 0 && tsz != 0) {
			int one = listOne.get(po);
			int two = listTwo.get(pt);
			if (one < two / 10) {
				answer += one;
				po++;
			} else if (one > two / 10) {
				answer += two;
				pt++;
			} else {
				if (one > two % 10) {
					answer += two;
					pt++;
				}
				else {
					answer += one;
					po++;
				}
			}
			if (po == osz || pt == tsz) break;
		}
		
		if (po == osz) {
			while (pt < tsz) {
				answer += listTwo.get(pt++);
			}
		} else if (pt == tsz) {
			while (po < osz) {
				answer += listOne.get(po++);
			}
		}
		
		return answer;
	}
	
	public static String cal(String max, String min) {
		String answer = "";
		int len = max.length();
		int temp = 0;
		for (int i = len - 1; i > -1; i--) {
			int var = (max.charAt(i) - '0') + (min.charAt(i) - '0') + temp;
			answer = var % 10 + answer;
			temp = var / 10;
			if(i == 0 && temp != 0) {
				answer = temp + answer;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		LinkedList<Integer> listOne = new LinkedList<Integer>();
		LinkedList<Integer> listTwo = new LinkedList<Integer>();
		String max = "";
		String min = "";
		while (st.hasMoreTokens()) {
			int tmp = Integer.parseInt(st.nextToken());
			if (tmp < 10) listOne.add(tmp);
			else listTwo.add(tmp);
		}
		//sort
		Collections.sort(listOne);
		Collections.sort(listTwo);
		
		max = max(listOne, listTwo);
		min = min(listOne, listTwo);
		
		System.out.println("max :" + max);
		System.out.println("min :" + min);
		
		System.out.println(cal(max, min));
		
	}
}
