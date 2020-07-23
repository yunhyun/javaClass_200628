package java0713;

import java.util.Scanner;

public class Ex04_ArrayWords {

	public static void main(String[] args) {
		String[][] words = { 
				{ "chair", "����" }, 
				{ "desk", "å��" }, 
				{ "water", "��" }, 
				{ "pencil", "����" },
				{ "watch", "�ð�" } };
		double score = 0;

		Scanner scan = new Scanner(System.in);
		// System.out.println(words.length);

		for (int i = 0; i < words.length; i++) {
			System.out.print("����" + (i + 1) + ". " + words[i][0] + "�� ���� �����ΰ���? ");
			String answer = scan.next();

			if (answer.equals(words[i][1])) {
				System.out.println("�����Դϴ�.");
				score++;
			} else {
				System.out.println("Ʋ�Ƚ��ϴ�.");
				System.out.println("������ " + words[i][1] + "�Դϴ�.");
			}
		}
		System.out.println("�� " + score + "�� �����Դϴ�. ");
		double percent = 100 * (score / words.length);
		System.out.println("������� " + percent + "% �Դϴ�.");
	}

}
