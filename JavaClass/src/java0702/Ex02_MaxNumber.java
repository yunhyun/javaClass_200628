package java0702;

import java.util.Scanner;

public class Ex02_MaxNumber {

	public static void main(String[] args) {
		// 두 정수 중 큰 값 출력하기 
		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		System.out.print("첫번째 숫자 입력 :");
		num1 = scan.nextInt();
		System.out.print("두번째 숫자 입력 :");
		num2 = scan.nextInt();
		if(num1 > num2) {
			System.out.println("첫번째 숫자가 큽니다.");
		} else if(num2 > num1) {
			System.out.println("두번째 숫자가 큽니다.");
		} else {
			System.out.println("입력한 숫자가 같습니다.");
		}
		
		
	}

}



