package java0630;

public class Ex03_IncreaseDecreaseOperator {

	public static void main(String[] args) {
		// ���������� (++, --)
		/*
		 * ++ : ���� ������ ������ �ִ� ���� 1�� ���� 
		 * -- : ���� ������ ������ �ִ� ���� 1�� ��
		 * ������ ���� num = 5 �� �ִٸ� 
		 *  num++ : num�� ������ �ִ� ���� ����� �� 
		 *  		num ���� 1����(num=6 �̵�)
		 *  ++num : num�� ������ �ִ� ���� 1�� ���� �� 
		 *  		��꿡 Ȱ��(num=6) 
		 */
		int num1 = 5;
		int num2 = 0;
		int num3 = 0;
		
		System.out.println("num1: " +num1);
		System.out.println("num3: " +num3);
		num3 = num1++;
		System.out.println("num1: " +num1);
		System.out.println("num3: " +num3);
		
		System.out.println("num1: " +num1);
		System.out.println("num3: " +num3);
		num3 = ++num1;
		System.out.println("num1: " +num1);
		System.out.println("num3: " +num3);
		
		

	}

}
