package java0709;

import java.util.Scanner;

public class Ex01_Bank {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int balance = 0; // 잔액 변수
		int deposit = 0; // 예금액 변수
		int withdraw = 0; // 출금액 변수
		int menuNum = 0; // 메뉴 선택용 변수
		while (run) {
			System.out.println("-------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");
			menuNum = scan.nextInt();
//			switch(menuNum) {
//			case 1:
//				// 예금 처리 기능 
//				break;
//			case 2:
//				// 출금 처리 기능 
//				break;
//			case 3:
//				// 잔액 출력 기능 
//				break;
//			case 4:
//				// 종료 기능 
//				break;
//			default :
//				System.out.println("해당하는 메뉴가 없습니다. ");
//			}
			if (menuNum == 1) {
				// 예금 처리 기능 
				/*
				 * 필요한 입력 : 입금액 
				 * 필요한 연산 : 기존 잔액에 입금액을 추가 
				 * 필요한 출력 : 최종 잔액 출력  
				 */
				System.out.print("예금액>");
				deposit = scan.nextInt();
				balance = balance + deposit;
				System.out.println("잔액은 "+balance+"입니다.");
			} else if (menuNum == 2) {
				// 출금 처리 기능
				/* 필요한 입력 : 출금액 
				 * 		조건 : 잔액>출금액 => 출금연산 수행 
				 * 			   잔액<출금액 => 출금연산 수행하지 않음 
				 * 필요한 연산 : 기존 잔액에 출금액을 뺌
				 * 필요한 출력 : 최종 잔액 출력 */
				System.out.print("출금액>");
				withdraw = scan.nextInt();
				if(withdraw > balance) {
					// 출금 연산 수행 안함
					System.out.println("잔고부족");
					System.out.println("잔액은 "+balance+"입니다.");
				} else {
					// 출금 연산 수행 
					balance = balance - withdraw;
					System.out.println("잔액은 "+balance+"입니다.");
				}
			} else if (menuNum == 3) {
				// 잔액 출력 기능 
				System.out.println("잔액은 "+balance+"입니다.");
			} else if (menuNum == 4) {
				// 종료 기능 
				run = false;
			}
		}

	}

}
