package java0702;

import java.util.Scanner;

public class Ex02_MaxNumber {

	public static void main(String[] args) {
		// �� ���� �� ū �� ����ϱ� 
		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		System.out.print("ù��° ���� �Է� :");
		num1 = scan.nextInt();
		System.out.print("�ι�° ���� �Է� :");
		num2 = scan.nextInt();
		if(num1 > num2) {
			System.out.println("ù��° ���ڰ� Ů�ϴ�.");
		} else if(num2 > num1) {
			System.out.println("�ι�° ���ڰ� Ů�ϴ�.");
		} else {
			System.out.println("�Է��� ���ڰ� �����ϴ�.");
		}
		
		
	}

}



