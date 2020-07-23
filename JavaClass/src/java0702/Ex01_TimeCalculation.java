package java0702;

import java.util.Scanner;

public class Ex01_TimeCalculation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int time = 0; // 초단위의 시간을 입력받기 위한 변수 
		int hour = 0; // 시 처리를 위한 변수 
		int minute = 0; // 분 처리를 위한 변수 
		int second = 0; // 초 처리를 위한 변수 
		System.out.print("초를 입력하세요 :");
		time = scan.nextInt();
		// hour 계산 
		hour = time / 3600;
		int num = time % 3600;
		// minute 계산 
		minute = (time % 3600) / 60;
		// second 계산 
		second = (time % 3600) % 60;
		System.out.println(time + "초는 "+hour +"시간"
					+ minute + "분" + second + "초입니다.");
	}

}










