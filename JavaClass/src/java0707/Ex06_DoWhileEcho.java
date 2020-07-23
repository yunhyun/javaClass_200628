package java0707;

import java.util.Scanner;

public class Ex06_DoWhileEcho {

	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요");
		System.out.println("프로그램을 종료하려면 '종료'를 입력하세요.");
		
		Scanner scan = new Scanner(System.in);
		String inputString = "";
		boolean run = true;
		do {
			System.out.print(">");
			inputString = scan.nextLine();
			System.out.println(inputString);
			if(inputString.equals("종료"))
				// 반복문 종료를 위해 반복조건인 run 변수 값을 false로 대입
				run=false;
//		} while( ! inputString.equals("종료") );
		} while(run);
		System.out.println();
		System.out.println("프로그램 종료");

	}

}
