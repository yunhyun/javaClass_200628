package java0629;

public class Ex03_Operator {

	public static void main(String[] args) {
		/*
		 * 1. ������ ���� 2�� ���� 
		 * 2. ������(+,-,*,/,%)�� Ȱ���Ͽ� ���� ������ 
		 * 	   �����ϰ� �������� ����Ͻÿ�.
		 */
		double number1 = 0;
		double number2 = 0;
		double result = 0;
		System.out.println(result);
		
		number1 = 7;
		
		number2 = 3;
		
		System.out.println(number1);
		System.out.println(number2);
		
		result = number1 + number2;
		System.out.println("������� : "+result);
		
		System.out.println("������� : "+ number1 + number2);
		System.out.println("������� : "+ (number1 + number2));
		
		
		result = number1 - number2;
		System.out.println("������� : "+result);
		
		result = number1 * number2;
		System.out.println("������� : "+result);
		System.out.println("������� : "+ (number1 * number2));
		
		result = number1 / number2;
		System.out.println("��������� : "+result);
		
		result = number1 % number2;
		System.out.println("���Ӱ�� : "+result);
		
	}

}



