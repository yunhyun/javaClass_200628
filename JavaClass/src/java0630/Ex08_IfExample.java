package java0630;

import java.util.Scanner;

public class Ex08_IfExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score;
		System.out.print("점수를 입력하세요 : ");
		score = scan.nextInt();
		if(score > 100) {
			System.out.println("입력범위를 벗어났습니다!!");
		} else if (score >= 90) {
			System.out.println("A학점입니다.");
		} 
		// 80 <= score && score < 90
		else if (score >= 80) {
			System.out.println("B학점입니다.");
		} else if (score >= 70) {
			System.out.println("C학점입니다.");
		} else if (score >= 60) {
			System.out.println("D학점입니다.");
		} else {
			System.out.println("F학점입니다.");
		}
	}

}
