package java0706;

public class Ex02_MultipleNumber {

	public static void main(String[] args) {
		// 1���� 100���� ���� �߿��� 2�� ��� ������ ���� ����
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			// 2�ǹ��, 3�ǹ�� �ɷ����� �� ���ϱ�
			if (i % 2 != 0 && i % 3 !=0) {
				sum = sum + i;
			}
		}
		System.out.println("�հ� :" + sum);

	}

}
