package java0702;

import java.util.Scanner;

public class Ex04_EvenOddNumber {

	public static void main(String[] args) {
		// Ȧ��, ¦�� �Ǻ��ϱ� 
		// 
		Scanner scan = new Scanner(System.in);
		int num = 0;
		System.out.print("���ڸ� �Է��ϼ��� :");
		num = scan.nextInt();
		// �������� ����� ���� 
		int num1 = 0;
		num1 = num % 2;
//		if(num % 2 ==0) {
		if(num1 ==0) {
			System.out.println("¦���Դϴ�.");
		} else {
			System.out.println("Ȧ���Դϴ�.");
		}
		
	}

}







