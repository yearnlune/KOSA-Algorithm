package Exam1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Exam3 {

	public static void main(String[] args) throws Exception {
		int sum;
		String str, token_str;
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		
input_loop : //�� continue�� break���� ���	
			while(true)
			{
				str = scan.readLine().trim(); //trim(): ���ʿ��� ���� ����
				
				StringTokenizer token = new StringTokenizer(str, " ", true);
				
				token_str = token.nextToken();
				if(input_check(token_str)) // input_check(): ��ū�� �������� �˻�
				{
					System.out.println("���� �Է� ����!!!\n"); //��ū�� ���ڰ� �ƴҶ�
					continue; //13���� while(true)�� �̵�
				}
			//praseInt�տ� Integer��� Ŭ������ ���°����κ��� static�޼ҵ��̴�.
			sum = Integer.parseInt(token_str); //ù��° ��ū���� ���ڷ� ��ȯ�ؼ� sum�� ����
			
			while(token.hasMoreTokens()) //��ū�� ���������� ������ �ݺ�
			{
				token_str = token.nextToken(); //¦����° ��ū ����(������)
				char ch = token_str.charAt(0); //���ڿ����� �����ڸ� ����
				
				if(token.hasMoreTokens())
					token_str = token.nextToken(); //Ȧ����° ��ū�� ����(����)

				if(input_check(token_str)) // input_check(): ��ū�� �������� �˻�
				{
					System.out.println("���� �Է� ����!!!\n");
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
		
		for(int i=0; i<str.length(); i++) //��ū�� ���� �޾� ���ڿ� ���̸�ŭ �ѹ��ھ� �˻�
		{
			ch = str.charAt(i); //���ڿ����� �ѹ��ھ� ����
			
			if (ch < '0' || ch > '9') //ch�� �������� �˻�(�����ڵ�� ��)
				return true; //���� �ƴ� ���ڰ� ����
		}
		return false;

	}
}
