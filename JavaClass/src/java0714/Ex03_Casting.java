package java0714;

public class Ex03_Casting {
	public static void main(String[] args) {
		/*
		 * ����ȯ 
		 * Ư�� Ÿ���� ������ �ٸ� Ÿ���� ������ ��ȯ�ϴ� �� 
		 * 1. �ڵ� ����ȯ
		 * 	- ũ�Ⱑ ���� Ÿ���� ū Ÿ������ ��ȯ  
		 * 2. ���� ����ȯ
		 *  - ũ�Ⱑ ū Ÿ���� ���� Ÿ������ ��ȯ 
		 */
		int intVar = 10;
		double doubleVar = 1.0;
		System.out.println("�ʱⰪ");
		System.out.println(intVar);
		System.out.println(doubleVar);
		doubleVar = intVar;
		System.out.println("�ڵ�����ȯ �� ");
		System.out.println(intVar);
		System.out.println(doubleVar);
		intVar = (int) doubleVar;
		System.out.println("��������ȯ �� ");
		System.out.println(intVar);
		System.out.println(doubleVar);
		
		
		
		
		
	}
}
