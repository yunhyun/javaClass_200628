package java0703;

public class Ex02_1to10Sum {

	public static void main(String[] args) {
		// 1���� 10���� ���� ��� ��� 
		// ������ 
		// �հ�� ���� 
		int sum = 0;
//		sum = 1+2+3+4+5+6+7+8+9+10;
		for(int i=1;i<=10;i++) {
			System.out.print("��� �� sum�� :"+sum);
			sum = sum + i;
			System.out.print(" ��� �� sum�� :"+sum);
			System.out.println("  i�� : "+i);
		}
		System.out.println(sum);
	}

}




