package java0629;

public class Ex05_CompareOperator {

	public static void main(String[] args) {
		// �񱳿����� 
		int num1 = 0;
		int num2 = 0;
		num1 = 7;
		num2 = 3;
		
		System.out.println(num1 >= num2);
		
		boolean result = false;
		result = num1 > num2;
		System.out.println(result);
		
		result = num1 <= num2;
		result = num1 == num2;
		result = num1 != num2;
		
		String str1 = "Java";
		String str2 = "JAVA";
		// equals �޼ҵ� : �� ���ڿ��� �������� ���ϴ� �޼ҵ� 
		result = str1.equals(str2);
		System.out.println(result);
		
		
	}

}
