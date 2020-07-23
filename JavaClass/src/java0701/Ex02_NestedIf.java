package java0701;

import java.util.Scanner;

public class Ex02_NestedIf {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 점수 입력용 변수 
		int score = 0;
		// 학점 처리용 변수
		String grade = "";
		System.out.print("점수를 입력하세요 : ");
		score = scan.nextInt();
		// 중첩 if를 활용한 학점 처리 
		/*
		 * 외부 if문 역할 : 100점 초과여부 판단 
		 * 				  100점 이하의 점수만 학점 처리를 할 수 있도록 
		 * 				  100점 초과하는 점수는 입력범위를 초과하였습니다. 출력 
		 * 내부 if문 역할 : 입력받은 점수에 따라 학점 처리 
		 */
		if(score <= 100) {
			// 100점 이하의 점수에 대한 학점 처리 부분
			if(score >= 95) {
				grade = "A+";
			} else if(score >= 90) {
				grade = "A";
			} else if(score >= 85) {
				grade = "B+";
			} else if(score >= 80) {
				grade = "B";
			}
			
//			else if(score >= 80) {
//				if (score >= 85) {
//					grade = "B+";
//				} else {
//					grade = "B";
//				}
//			}
			System.out.println("당신의 학점은 " + grade + "입니다.");
		} else {
			System.out.println("입력범위를 초과하였습니다.");
		}
		
		// System.out.println("당신의 학점은 " + grade + "입니다.");
		
	}

}




