package java0629;

public class Ex04_String {

	public static void main(String[] args) {
		// String ���� 
		String strVar = "";
		String strVar1;
		
		strVar = "�ƹ������̳� �� ���ϴ�1234!@#$asldkfjepoj";
		System.out.println(strVar);
		
		strVar = "�ڹ�";
		strVar1 = "��ճ׿�";
		String strVar2 = "�Ҹ��ϳ׿�";
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
