package java0629;

public class Ex05_CompareOperator {

	public static void main(String[] args) {
		// 비교연산자 
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
		// equals 메소드 : 두 문자열이 같은지를 비교하는 메소드 
		result = str1.equals(str2);
		System.out.println(result);
		
		
	}

}
