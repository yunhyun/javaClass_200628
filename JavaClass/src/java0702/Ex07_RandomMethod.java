package java0702;

public class Ex07_RandomMethod {

	public static void main(String[] args) {
		/*
		 * Random �޼ҵ� 
		 * Ư�� ���� ������ ���� �ϳ��� ������ִ� �޼ҵ� 
		 */
		// 1~10 ������ �����ϳ� �߻���Ű�� 
		int num = 0;
		num = (int)(Math.random() * 10) + 1;
		System.out.println("��¼��� " + num);
	}

}
