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

	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		OneTwoFour oneTwoFour = new OneTwoFour();
		System.out.println(oneTwoFour.change124(10));
	}
}
