package java0630;

import java.util.Scanner;

public class Ex04_Scanner {
	public static void main(String[] args) {
		// ��ĳ�� ����� ���� ��ĳ�� ��ü ���� 
		Scanner scan = new Scanner(System.in);
		// Scanner sc = new Scanner(System.in);
		// Scanner scanner = new Scanner(System.in);
		// �ܼ�â���� �̸�, �ּҸ� �Է� �޾Ƽ� 
		// �Է¹��� ���� �״�� ��� 
		// �̸�, �ּ� �Է��� ���� ���� ���� 
		String name, address;
		
		System.out.print("�̸��� �Է��ϼ��� :");
		// ��ĳ�ʷ� �Է¹��� ������ name ������ ���� 
		// �º� : name 
		// �캯 : ��ĳ�� �Է��� ó���ϴ� ���� 
		name = scan.nextLine();
		// name ������ ��� �ִ� �� ��� 
		System.out.println("�Է��� �̸� :"+name);
		
		System.out.print("�ּҸ� �Է��ϼ��� :");
		address = scan.nextLine();
		System.out.println("�Է��� �ּ� :"+address);
		
		int age = 0;
		System.out.print("���̸� �Է��ϼ��� :");
		age = scan.nextInt();
		System.out.println("�Է��� ���� :" + age);
		
		scan.close();
		
	}
}
