
class TryHelloWorld {
	public int tiling(int n) {
		int answer = 0;
		int[] tmp = new int[n + 1];
 		tmp[0] = 1;
		tmp[1] = 1;
		for (int i = 2; i <= n; i++) {
			tmp[i] = (tmp[i - 2] + tmp[i - 1]) % 100000;
		}
		
		answer = tmp[n];
		return answer;
	}

	public static void main(String args[]) {
		TryHelloWorld tryHelloWorld = new TryHelloWorld();
		// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
		System.out.println(tryHelloWorld.tiling(2));
		
		
	}
}