package java0714;

import java.util.Scanner;

public class Ex02_StudentManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int[] student = null;

		while (run) {
			System.out.println("--------------------------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("--------------------------------------------------------------");
			System.out.print("����> ");
			int selectNo = scan.nextInt();
			if (selectNo == 1) {
				// �л���
				// �迭 ũ�� ����
				System.out.print("�л���>");
				int studentNum = scan.nextInt();
				student = new int[studentNum];

			} else if (selectNo == 2) {
				// �����Է�
				// ��ĵ�� �̿��Ͽ� �迭�� �� ����
				System.out.println(student.length);
				for (int i = 0; i < student.length; i++) {
					System.out.print((i + 1) + "�� ° �л����� : ");
					student[i] = scan.nextInt();
				}
			} else if (selectNo == 3) {
				// ��������Ʈ
				// �迭�� ��� �� ���ʴ�� ���
				for (int i = 0; i < student.length; i++) {
					System.out.print((i + 1) + "�� ° �л����� : " + student[i]);
				}
			} else if (selectNo == 4) {
				// �м�(�ְ���, ���, ��������)
				int sum = 0, max = 0;
				double avg = 0;
				for (int i = 0; i < student.length; i++) {
					if (max < student[i]) {
						max = student[i];
					}
					sum += student[i];
				}
				avg = sum / student.length;
				System.out.println("�ְ����� : " + max);
				System.out.println("������� : " + avg);

				int temp = 0;
				for (int i = 0; i < student.length; i++) {
					for (int j = i + 1; j < student.length; j++) {
						if (student[i] < student[j]) {
							temp = student[i];
							student[i] = student[j];
							student[j] = temp;
						}
					}
				}
				for(int k=0; k<student.length; k++) {
					System.out.println(student[k]);
				}

			} else if (selectNo == 5) {
				// ����
				run = false;
			}

		}

	}

}
