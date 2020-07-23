package java0629;

public class Ex04_String {

	public static void main(String[] args) {
		// String 변수 
		String strVar = "";
		String strVar1;
		
		strVar = "아무내용이나 다 들어갑니다1234!@#$asldkfjepoj";
		System.out.println(strVar);
		
		strVar = "자바";
		strVar1 = "재밌네요";
		String strVar2 = "할만하네요";
		String result = "";
		
		result = strVar + strVar2;
		System.out.println(result);
		
		result = strVar1 + strVar2;
		System.out.println(result);
		
		result = strVar + strVar1;
		System.out.println(result);
		
		result = strVar + 1.8;
		System.out.println(result);
		
		
		
		
		
	}

}
