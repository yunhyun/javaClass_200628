package java0701;

import java.util.Scanner;

public class Ex03_IfExample {

	public static void main(String[] args) {
		// �հ�, ���հ� ��� 
		/*
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		int score = 0;
		int year = 0;
		System.out.print("�г��� �Է��ϼ��� : ");
		year = scan.nextInt();
		System.out.print("������ �Է��ϼ��� : ");
		score = scan.nextInt();
		
		if(score >= 60) {
			if(year != 4) {
				// score>=60 && year = 1 or 2 or 3
				System.out.println("�հ��Դϴ�.");
			} else if(score >= 70) {
				// score >=70 && year = 4
				System.out.println("�հ��Դϴ�.");
			} else {
				System.out.println("���հ��Դϴ�.");
			}
		} else {
			System.out.println("���հ� �Դϴ�.");
		}
		
		
		
		
		
		
		
	}

}










