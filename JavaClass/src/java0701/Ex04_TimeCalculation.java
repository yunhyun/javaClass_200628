package java0701;

import java.util.Scanner;

public class Ex04_TimeCalculation {

	public static void main(String[] args) {
		while(true) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// �Է� �� ��꿡 �ʿ��� ���� ���� 
		int time; // �ð��� �Է� �ޱ� ���� ���� 
		int hour; // �� ó���� ���� ���� 
		int minute; // �� ó���� ���� ���� 
		int second; // �� ó���� ���� ���� 
		System.out.print("�ʸ� �Է��ϼ��� : ");
		time = scan.nextInt();
		// �ð� ��� 
		hour = time/3600;
		// �� ��� 
		minute = (time%3600)/60;
		// �� ��� 
		second = (time%3600)%60;
		// ��� ��� ��� 
		System.out.println(time +"�ʴ� "+hour+"�ð� "
				+ minute +"�� "+second+"�� �Դϴ�.");
		}
	}

}
