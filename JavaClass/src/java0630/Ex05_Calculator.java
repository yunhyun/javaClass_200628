package java0630;

import java.util.Scanner;

public class Ex05_Calculator {

	public static void main(String[] args) {
		/*
		 * ������ ���� ����� 
		 *  - ������ ������ ���� 
		 *  - ���� �� ���� �Է¹޾� ������ ����� ��� 
		 * 
		 */
		int num1, num2, result;
		Scanner scan = new Scanner(System.in);
		System.out.print("ù��° ���ڸ� �Է��ϼ��� : ");
		num1 = scan.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��ϼ��� : ");
		num2 = scan.nextInt();
		result = num1 + num2;
		System.out.println("���� ����� "+ result +"�Դϴ�.");
		scan.close();
	}

}
