package java0702;

import java.util.Scanner;

public class Ex08_SwitchDictionary {

	public static void main(String[] args) {
		/*
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		String word = null;
		System.out.print("�ܾ �Է��ϼ��� : ");
		word = scan.next();
		switch(word) {
		case "desk":
			System.out.println("å���Դϴ�.");
			break;
		case "chair":
			System.out.println("�����Դϴ�.");
			break;
		case "monitor":
			System.out.println("������Դϴ�.");
			break;
		case "mouse":
			System.out.println("���콺�Դϴ�.");
			break;
		default:
			System.out.println("������ ���� �ܾ��Դϴ�.");
			break;
		}
	}

}
