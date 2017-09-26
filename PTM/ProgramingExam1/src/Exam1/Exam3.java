package Exam1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Exam3 {

	public static void main(String[] args) throws Exception {
		int sum;
		String str, token_str;
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		
input_loop : //라벨 continue나 break문에 사용	
			while(true)
			{
				str = scan.readLine().trim(); //trim(): 불필요한 공백 제거
				
				StringTokenizer token = new StringTokenizer(str, " ", true);
				
				token_str = token.nextToken();
				if(input_check(token_str)) // input_check(): 토큰이 숫자인지 검사
				{
					System.out.println("수식 입력 오류!!!\n"); //토큰이 숫자가 아닐때
					continue; //13행의 while(true)로 이동
				}
			//praseInt앞에 Integer라는 클래스가 나온것으로보아 static메소드이다.
			sum = Integer.parseInt(token_str); //첫번째 토큰값을 숫자로 변환해서 sum에 기입
			
			while(token.hasMoreTokens()) //토큰이 없을때까지 루프를 반복
			{
				token_str = token.nextToken(); //짝수번째 토큰 읽음(연산자)
				char ch = token_str.charAt(0); //문자열에서 연산자를 추출
				
				if(token.hasMoreTokens())
					token_str = token.nextToken(); //홀수번째 토큰을 읽음(숫자)

				if(input_check(token_str)) // input_check(): 토큰이 숫자인지 검사
				{
					System.out.println("수식 입력 오류!!!\n");
					continue input_loop;
				}
				
				switch(ch)
				{
				case ' ':
					sum += Integer.parseInt(token_str);
					break;
				} //switch 
			}//while()
			break;	
		}//while(true)
		System.out.println(sum);
	}
	
	static boolean input_check(String str)
	{
		char ch;
		
		for(int i=0; i<str.length(); i++) //토큰을 전달 받아 문자열 길이만큼 한문자씩 검사
		{
			ch = str.charAt(i); //문자열에서 한문자씩 추출
			
			if (ch < '0' || ch > '9') //ch가 숫자인지 검사(유니코드로 비교)
				return true; //숫자 아닌 문자가 있음
		}
		return false;

	}
}
