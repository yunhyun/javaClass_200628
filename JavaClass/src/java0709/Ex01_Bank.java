package java0709;

import java.util.Scanner;

public class Ex01_Bank {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int balance = 0; // �ܾ� ����
		int deposit = 0; // ���ݾ� ����
		int withdraw = 0; // ��ݾ� ����
		int menuNum = 0; // �޴� ���ÿ� ����
		while (run) {
			System.out.println("-------------------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("-------------------------------------");
			System.out.print("����> ");
			menuNum = scan.nextInt();
//			switch(menuNum) {
//			case 1:
//				// ���� ó�� ��� 
//				break;
//			case 2:
//				// ��� ó�� ��� 
//				break;
//			case 3:
//				// �ܾ� ��� ��� 
//				break;
//			case 4:
//				// ���� ��� 
//				break;
//			default :
//				System.out.println("�ش��ϴ� �޴��� �����ϴ�. ");
//			}
			if (menuNum == 1) {
				// ���� ó�� ��� 
				/*
				 * �ʿ��� �Է� : �Աݾ� 
				 * �ʿ��� ���� : ���� �ܾ׿� �Աݾ��� �߰� 
				 * �ʿ��� ��� : ���� �ܾ� ���  
				 */
				System.out.print("���ݾ�>");
				deposit = scan.nextInt();
				balance = balance + deposit;
				System.out.println("�ܾ��� "+balance+"�Դϴ�.");
			} else if (menuNum == 2) {
				// ��� ó�� ���
				/* �ʿ��� �Է� : ��ݾ� 
				 * 		���� : �ܾ�>��ݾ� => ��ݿ��� ���� 
				 * 			   �ܾ�<��ݾ� => ��ݿ��� �������� ���� 
				 * �ʿ��� ���� : ���� �ܾ׿� ��ݾ��� ��
				 * �ʿ��� ��� : ���� �ܾ� ��� */
				System.out.print("��ݾ�>");
				withdraw = scan.nextInt();
				if(withdraw > balance) {
					// ��� ���� ���� ����
					System.out.println("�ܰ����");
					System.out.println("�ܾ��� "+balance+"�Դϴ�.");
				} else {
					// ��� ���� ���� 
					balance = balance - withdraw;
					System.out.println("�ܾ��� "+balance+"�Դϴ�.");
				}
			} else if (menuNum == 3) {
				// �ܾ� ��� ��� 
				System.out.println("�ܾ��� "+balance+"�Դϴ�.");
			} else if (menuNum == 4) {
				// ���� ��� 
				run = false;
			}
		}

	}

}
