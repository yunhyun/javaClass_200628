package java0707;

import java.util.Scanner;

public class Ex06_DoWhileEcho {

	public static void main(String[] args) {
		System.out.println("�޽����� �Է��ϼ���");
		System.out.println("���α׷��� �����Ϸ��� '����'�� �Է��ϼ���.");
		
		Scanner scan = new Scanner(System.in);
		String inputString = "";
		boolean run = true;
		do {
			System.out.print(">");
			inputString = scan.nextLine();
			System.out.println(inputString);
			if(inputString.equals("����"))
				// �ݺ��� ���Ḧ ���� �ݺ������� run ���� ���� false�� ����
				run=false;
//		} while( ! inputString.equals("����") );
		} while(run);
		System.out.println();
		System.out.println("���α׷� ����");

	}

}
