package java0702;

import java.util.Scanner;

public class Ex04_EvenOddNumber {

	public static void main(String[] args) {
		// 홀수, 짝수 판별하기 
		// 
		Scanner scan = new Scanner(System.in);
		int num = 0;
		System.out.print("숫자를 입력하세요 :");
		num = scan.nextInt();
		// 나머지값 저장용 변수 
		int num1 = 0;
		num1 = num % 2;
//		if(num % 2 ==0) {
		if(num1 ==0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
		
	}

}







