package java0714;

import java.util.Scanner;

public class Ex01_ArraySize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// ������ �迭 num �̸��� ����(������ �迭�� ����� ���� �ƴ�)
//		System.out.println(num.length);
		// ��ĳ�� �Է��� ���� ������ ���� 
		// �Է¹��� ���ڸ� �迭 ũ�⿡ ���� 
//		int[] num1 = new int[5];
		
		int[] num = null;
		int num2 = 100;
		if(num2==100) {
			System.out.print("������ �迭 ũ�� ");
			int size = scan.nextInt();
			num = new int[size];
		} 
		System.out.println(num.length);
		
		int num3 = 200;
		if(num3==200) {
			System.out.print("������ �迭 ũ�� ");
			int size = scan.nextInt();
			int[] num4 = new int[size];
		}
//		System.out.println(num4[0]);
//		System.out.println(size);
		
	}

}






