package java0630;

import java.util.Scanner;

public class Ex08_IfExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score;
		System.out.print("������ �Է��ϼ��� : ");
		score = scan.nextInt();
		if(score > 100) {
			System.out.println("�Է¹����� ������ϴ�!!");
		} else if (score >= 90) {
			System.out.println("A�����Դϴ�.");
		} 
		// 80 <= score && score < 90
		else if (score >= 80) {
			System.out.println("B�����Դϴ�.");
		} else if (score >= 70) {
			System.out.println("C�����Դϴ�.");
		} else if (score >= 60) {
			System.out.println("D�����Դϴ�.");
		} else {
			System.out.println("F�����Դϴ�.");
		}
	}

}
