package java0708;

import java.util.Scanner;

public class Ex02_CountandSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// ���� �Է¿� ���� 
		int num = 0;
		// �հ�� ���� 
		int sum = 0;
		// ������ ���� 
		int count = 0;
		// �ݺ���� ���� ���� 
		boolean run = true;
		System.out.println("������ �Է��ϰ� �������� 0�� �Է��ϼ��� :");
		do {
			num = scan.nextInt();
			if(num == 0) {
				run = false;
			} else {
				sum = sum + num;
				count++;
			}
			
		} while(run);
		System.out.println("�Է��� ���� "+count+"��");
		System.out.println("����� "+(sum/count)+"�Դϴ�.");
	}

}





