package java0702;

import java.util.Scanner;

public class Ex05_MaxNumber {

	public static void main(String[] args) {
		// 3���� ������ �Է� �޾� ���� ū �� ����ϱ� 
		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		System.out.print("ù��° ���� �Է� : ");
		num1 = scan.nextInt();
		System.out.print("�ι�° ���� �Է� : ");
		num2 = scan.nextInt();
		System.out.print("����° ���� �Է� : ");
		num3 = scan.nextInt();
		int max = 0; // �ִ��� ������ ���� 
		if(num1 > num2) {
			if(num1 > num3) {
				// System.out.println("num1");
				max = num1;
			} else {
//				System.out.println("num3");
				max = num3;
			}
		} else if(num1 < num2){
			if(num2 > num3) {
//				System.out.println("num2");
				max = num2;
			} else {
//				System.out.println("num3");
				max = num3;
			}
		}
		System.out.println("�ִ��� "+max+"�Դϴ�.");
		
	}

}






