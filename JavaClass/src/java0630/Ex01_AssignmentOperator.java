package java0630;

public class Ex01_AssignmentOperator {

	public static void main(String[] args) {
		// ���Կ����� 
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		// num1, num2�� += ���Կ����� Ȱ���Ͽ� ��� 
		num1 = 7;
		num2 = 3;
		System.out.println(num1); // 7���
		System.out.println(num2); // 3���
		num1 += num2;
		System.out.println(num1); // 10���
		System.out.println(num2); // 3���
		num1 -= num2; // num1 = num1 - num2
		System.out.println(num1); // 4���
		System.out.println(num2); // ���
		// num3 = num1 -= num2;
	}

}
