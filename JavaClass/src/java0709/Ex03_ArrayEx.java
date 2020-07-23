package java0709;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex03_ArrayEx {

	public static void main(String[] args) {
		// 크기가 5인 정수형 배열을 선언하여 
		// 값을 알아서 입력하고 
		// 입력된 값들의 총합과 평균을 구하시오. 
		int[] number = new int[5];
		number[0] = 1;
		number[1] = 2;
		number[2] = 3;
		number[3] = 4;
		number[4] = 5;
		int[] number1 = {1,4,3,2,5};
		int sum = 0;
		int avg = 0;
		// 반복문을 이용하여 배열에 접근 
		for(int i=0; i<number.length; i++) {
//			sum = sum+1;
//			sum = sum+2;
//			sum = sum+3;
//			sum = sum+4;
//			sum = sum+5;
			sum = sum + number[i];
		}
		System.out.println(sum);
		avg = sum/number.length;
		System.out.println(avg);
		
		
		// 배열 변수 선언 방법
		int[] num = {7,5,9};
		// num 배열 변수가 가지고 있는 값 출력하기 
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		sum = 0;
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]);
			System.out.println(i);
			// num 배열의 0번 인덱스에 1 대입 
			num[0] = 1;
			// 스캔 입력 받은 값을 0번 인덱스에 대입
//			num[0] = scan.nextInt();
//			num[1] = scan.nextInt();
//			num[2] = scan.nextInt();
			num[i] = scan.nextInt();
//			sum = sum + num[0];
//			sum = sum + num[1];
//			sum = sum + num[2];
			sum = sum + num[i];
			sum += num[i];
		}
		
		
		
		
		
		
		
		
		
		
	}

}
