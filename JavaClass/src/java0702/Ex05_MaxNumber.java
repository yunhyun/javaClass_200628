package java0702;

import java.util.Scanner;

public class Ex05_MaxNumber {

	public static void main(String[] args) {
		// 3개의 정수를 입력 받아 가장 큰 수 출력하기 
		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		System.out.print("첫번째 숫자 입력 : ");
		num1 = scan.nextInt();
		System.out.print("두번째 숫자 입력 : ");
		num2 = scan.nextInt();
		System.out.print("세번째 숫자 입력 : ");
		num3 = scan.nextInt();
		int max = 0; // 최댓값을 저장할 변수 
		if(num1 > num2) {
			if(num1 > num3) {
				// System.out.println("num1");
				max = num1;
			} else {
//				System.out.println("num3");
				max = num3;
			}
		} else if(num1 < num2){
			if(num2 > num3) {
//				System.out.println("num2");
				max = num2;
			} else {
//				System.out.println("num3");
				max = num3;
			}
		}
		System.out.println("최댓값은 "+max+"입니다.");
		
	}

}






