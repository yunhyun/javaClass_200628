package java0716_02;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int num1 = 0;
		int num2 = 0;
		while(run) {
			System.out.println("--------------------------------------------------------------");
			System.out.println("1.���� | 2.���� | 3.���� | 4.������ | 5.����");
			System.out.println("--------------------------------------------------------------");
			System.out.print("����> ");
			int selectNo = scan.nextInt();
			switch(selectNo) {
			case 1:
				num1 = 5;
				num2 = 5;
				cal.sum(num1,num2);
				break;
			case 2:
				System.out.print("�����Է� : ");
				num1 = scan.nextInt();
				System.out.print("�����Է� : ");
				num2 = scan.nextInt();
				cal.subtract(num1, num2);
				break;
			case 3:
				System.out.print("�����Է� : ");
				num1 = scan.nextInt();
				System.out.print("�����Է� : ");
				num2 = scan.nextInt();
				int result = cal.multiply(num1, num2);
				System.out.println("������� : "+result);
				break;
			case 4:
				cal.divide();
				break;
			case 5:
				run = false;
				break;
			}
		}
	}

}
