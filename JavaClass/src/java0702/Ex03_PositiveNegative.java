package java0702;

import java.util.Scanner;

public class Ex03_PositiveNegative {

	public static void main(String[] args) {
		// ����, ��� �Ǻ��ϱ�

		// ���� ����ϱ� 
		Scanner scan = new Scanner(System.in);
		int num = 0;
		System.out.print("���ڸ� �Է��ϼ��� :");
		num = scan.nextInt();
		if(num > 0) {
			System.out.println("�Է��� ���ڴ� ����Դϴ�.");
		} else if (num < 0) {
			System.out.println("�Է��� ���ڴ� �����Դϴ�.");
			//num = num * -1;
			num = -num;
		} else {
			System.out.println("�Է��� ���ڴ� 0�Դϴ�.");
		}
		
		System.out.println("�Է��� ������ ���� : " + num);
		
		
	}

}





