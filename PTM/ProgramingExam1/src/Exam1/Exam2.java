package Exam1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exam2 {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int A;
		int B;
		int sum = 0;

			A = Integer.parseInt(reader.readLine());
			B = Integer.parseInt(reader.readLine());
			sum = A+B;
		System.out.print(sum);
	}

}
