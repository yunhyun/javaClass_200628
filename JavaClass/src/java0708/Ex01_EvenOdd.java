package java0708;

import java.util.Scanner;

public class Ex01_EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num;
		boolean end = true;
		do {
			System.out.print("�����Է� : ");
			num = scan.nextInt();

			if (num % 2 == 0 && num > 0)
				System.out.println("¦��");
			else if (num % 2 == 1)
				System.out.println("Ȧ��");
			else
				end = false;
		} while (end);
		System.out.println("����");
	}

}
