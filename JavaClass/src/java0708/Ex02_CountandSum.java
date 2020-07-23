package java0708;

import java.util.Scanner;

public class Ex02_CountandSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 숫자 입력용 변수 
		int num = 0;
		// 합계용 변수 
		int sum = 0;
		// 갯수용 변수 
		int count = 0;
		// 반복제어를 위한 변수 
		boolean run = true;
		System.out.println("정수를 입력하고 마지막에 0을 입력하세요 :");
		do {
			num = scan.nextInt();
			if(num == 0) {
				run = false;
			} else {
				sum = sum + num;
				count++;
			}
			
		} while(run);
		System.out.println("입력한 수는 "+count+"개");
		System.out.println("평균은 "+(sum/count)+"입니다.");
	}

}





