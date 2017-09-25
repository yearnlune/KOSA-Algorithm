class OneTwoFour {
	public String change124(int n) {
		String answer = "";
		String str = "";
		int temp = n;
		int d = 0;
 
		while (temp != 0) {
			d = temp % 3;
			str += String.valueOf(d);
			if (d == 0) temp--;
			temp /= 3;
		}
		
		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) == '0') {
				answer += '4'; 
				continue;
			}
			answer += str.charAt(i);
		}
		
		return answer;
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		OneTwoFour oneTwoFour = new OneTwoFour();
		System.out.println(oneTwoFour.change124(10));
	}
}
