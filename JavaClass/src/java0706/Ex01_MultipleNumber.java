package java0706;

public class Ex01_MultipleNumber {

	public static void main(String[] args) {
		// 1���� 100���� �����߿��� 3�� ��� ����ϱ�
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i);
			}
		}
	}

}
