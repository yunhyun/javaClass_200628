package java0630;

public class Ex07_IfExample {

	public static void main(String[] args) {
		/*
		 * ���� ��� �ϱ� 
		 * �ڹ� ������ 60�� �̻��̸� �հ��߽��ϴ�. ��� 
		 * 60�� �̸��̸� ���հ� �߽��ϴ�. ��� 
		 */
		// �ڹ����� �Է��� ���� ���� 
		int javaScore = 0;
		javaScore = 80;
		if(javaScore >= 60) {
			System.out.println("�հ��Դϴ�.");
		} else if(javaScore >=50 ) {
			System.out.println("������Դϴ�.");
		} else {
			System.out.println("���հ��Դϴ�.");
		}
		
		
		
	}

}
