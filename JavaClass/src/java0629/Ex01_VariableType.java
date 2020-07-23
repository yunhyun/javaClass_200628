package java0629;

public class Ex01_VariableType {

	public static void main(String[] args) {
		// 데이터 타입 
		/*
		 * 정수형 
		 * 	**int (4byte, 4B) : -2147483648 ~ 2147483647
		 * 	*long (8byte, 8B) : 2^63
		 * 	byte (1byte, 1B) : -128 ~ 127
		 *  char
		 *  short 
		 * 실수형 
		 * 	float 
		 * 	*double
		 * 논리형 
		 * 	**boolean : true, false
		 */
		// byte 타입 변수 
		byte byteVar;
		byteVar = -128;
		System.out.println(byteVar);
		
		long longVar;
		longVar = 100000000000000000L;
		System.out.println(longVar);
		
		char charVar;
		charVar = 68;
		charVar = '1';
		System.out.println(charVar);
		
		double doubleVar;
		doubleVar = 1.234567;
		System.out.println(doubleVar);

		float floatVar;
		floatVar = 1.234567f;
		System.out.println(floatVar);
		
		// bool type 변수, 논리형 변수 
		boolean boolVar;
		boolVar = true;
		boolVar = false;
		// boolVar = fals;
		System.out.println(boolVar);
		
	}

}









