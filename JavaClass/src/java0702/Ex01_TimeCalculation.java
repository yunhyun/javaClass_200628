package java0702;

import java.util.Scanner;

public class Ex01_TimeCalculation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int time = 0; // �ʴ����� �ð��� �Է¹ޱ� ���� ���� 
		int hour = 0; // �� ó���� ���� ���� 
		int minute = 0; // �� ó���� ���� ���� 
		int second = 0; // �� ó���� ���� ���� 
		System.out.print("�ʸ� �Է��ϼ��� :");
		time = scan.nextInt();
		// hour ��� 
		hour = time / 3600;
		int num = time % 3600;
		// minute ��� 
		minute = (time % 3600) / 60;
		// second ��� 
		second = (time % 3600) % 60;
		System.out.println(time + "�ʴ� "+hour +"�ð�"
					+ minute + "��" + second + "���Դϴ�.");
	}

}










