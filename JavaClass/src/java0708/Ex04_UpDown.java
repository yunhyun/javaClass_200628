package java0708;

import java.util.Scanner;

public class Ex04_UpDown {

	public static void main(String[] args) {
		int input = 0;
		int count = 0;
		boolean run = true;
		Scanner scan = new Scanner(System.in);
		int answer = (int) (Math.random() * 100) + 1;
		System.out.println("Up&Down");
		do {
			System.out.print("1���� 100������ ���ڸ� �Է��ϼ��� : ");
			input = scan.nextInt();
			count++;
			if (answer > input) {
				System.out.println("�� ū ���� �Է��ϼ���.");
			} else if (answer < input) {
				System.out.println("�� ���� ���� �Է��ϼ���.");
			} else {
				System.out.println("������ϴ�.");
				System.out.println("�õ�Ƚ���� " + count + "�� �Դϴ�.");
				run = false;
			}
		} while (run);

	}

}
