package java0702;

import java.util.Scanner;

public class Ex03_PositiveNegative {

	public static void main(String[] args) {
		// 음수, 양수 판별하기

		// 절댓값 출력하기 
		Scanner scan = new Scanner(System.in);
		int num = 0;
		System.out.print("숫자를 입력하세요 :");
		num = scan.nextInt();
		if(num > 0) {
			System.out.println("입력한 숫자는 양수입니다.");
		} else if (num < 0) {
			System.out.println("입력한 숫자는 음수입니다.");
			//num = num * -1;
			num = -num;
		} else {
			System.out.println("입력한 숫자는 0입니다.");
		}
		
		System.out.println("입력한 숫자의 절댓값 : " + num);
		
		
	}

}





