package java0716_02;

import java.util.Scanner;

public class Calculator {
	Scanner scan = new Scanner(System.in);
	
	void sum(int num1, int num2) {
		System.out.println("�������:" + num1+num2);
	}
	
	void subtract(int num1, int num2) {
		int result = num1 - num2;
		System.out.println("�������:" + result);
	}
	
	int multiply(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}
	
	void divide() {
		System.out.print("�����Է� : ");
		int num1 = scan.nextInt();
		System.out.print("�����Է� : ");
		int num2 = scan.nextInt();
		int result = num1 / num2;
		System.out.println("��������� : "+ result);
	}
	
}








