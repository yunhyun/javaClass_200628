package java0723_03;

public class StringMethod {

	public static void main(String[] args) {
		// String으로 저장되어 있는 값을 정수로 변환 
		String str = "a100";
		int num = 100;
//		int result1 = num + str;
		
		int num1 = Integer.parseInt(str);  
		int result2 = num + num1;
	}

}
