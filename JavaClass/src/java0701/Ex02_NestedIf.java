package java0701;

import java.util.Scanner;

public class Ex02_NestedIf {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// ���� �Է¿� ���� 
		int score = 0;
		// ���� ó���� ����
		String grade = "";
		System.out.print("������ �Է��ϼ��� : ");
		score = scan.nextInt();
		// ��ø if�� Ȱ���� ���� ó�� 
		/*
		 * �ܺ� if�� ���� : 100�� �ʰ����� �Ǵ� 
		 * 				  100�� ������ ������ ���� ó���� �� �� �ֵ��� 
		 * 				  100�� �ʰ��ϴ� ������ �Է¹����� �ʰ��Ͽ����ϴ�. ��� 
		 * ���� if�� ���� : �Է¹��� ������ ���� ���� ó�� 
		 */
		if(score <= 100) {
			// 100�� ������ ������ ���� ���� ó�� �κ�
			if(score >= 95) {
				grade = "A+";
			} else if(score >= 90) {
				grade = "A";
			} else if(score >= 85) {
				grade = "B+";
			} else if(score >= 80) {
				grade = "B";
			}
			
//			else if(score >= 80) {
//				if (score >= 85) {
//					grade = "B+";
//				} else {
//					grade = "B";
//				}
//			}
			System.out.println("����� ������ " + grade + "�Դϴ�.");
		} else {
			System.out.println("�Է¹����� �ʰ��Ͽ����ϴ�.");
		}
		
		// System.out.println("����� ������ " + grade + "�Դϴ�.");
		
	}

}




