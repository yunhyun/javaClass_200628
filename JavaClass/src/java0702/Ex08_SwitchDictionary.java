package java0702;

import java.util.Scanner;

public class Ex08_SwitchDictionary {

	public static void main(String[] args) {
		/*
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		String word = null;
		System.out.print("단어를 입력하세요 : ");
		word = scan.next();
		switch(word) {
		case "desk":
			System.out.println("책상입니다.");
			break;
		case "chair":
			System.out.println("의자입니다.");
			break;
		case "monitor":
			System.out.println("모니터입니다.");
			break;
		case "mouse":
			System.out.println("마우스입니다.");
			break;
		default:
			System.out.println("사전에 없는 단어입니다.");
			break;
		}
	}

}
