package java0701;

import java.util.Scanner;

public class Ex03_IfExample {

	public static void main(String[] args) {
		// 합격, 불합격 출력 
		/*
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		int score = 0;
		int year = 0;
		System.out.print("학년을 입력하세요 : ");
		year = scan.nextInt();
		System.out.print("점수를 입력하세요 : ");
		score = scan.nextInt();
		
		if(score >= 60) {
			if(year != 4) {
				// score>=60 && year = 1 or 2 or 3
				System.out.println("합격입니다.");
			} else if(score >= 70) {
				// score >=70 && year = 4
				System.out.println("합격입니다.");
			} else {
				System.out.println("불합격입니다.");
			}
		} else {
			System.out.println("불합격 입니다.");
		}
		
		
		
		
		
		
		
	}

}










