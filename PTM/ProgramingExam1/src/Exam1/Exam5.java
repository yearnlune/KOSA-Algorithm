package Exam1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Exam5 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		int sum;
		
		while(true)
		{
			String text = reader.readLine().trim();
			
			StringTokenizer token = new StringTokenizer(text, " ", true);
			
			str = token.nextToken();
			if(calc(str))
			{
				System.out.println("수식입력오류");
				continue;
			}
			sum = Integer.parseInt(str);
		}
		
		
		}
	
	static boolean calc(String str)
	{
		char ch = 0;
		
		if(ch < '0' || ch > '9')
			return true;
		
		return false;
	}

	}


