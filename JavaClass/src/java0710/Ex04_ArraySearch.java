package java0710;

import java.util.Scanner;

public class Ex04_ArraySearch {

	public static void main(String[] args) {
		int num[] = {1, 2, 5, 3, 4, 7, 6, 9, 10, 8};
		int value = 0;
		int index = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		value = scan.nextInt();
		for(int i=0; i<num.length; i++) {
			// 입력한 숫자와 배열에 담긴 데이터와 같은지를 각각 비교 
			if(value==num[i]) {
				System.out.println(i);
				index = i;
			} 
		}
		System.out.println(value+"는 "+(index+1)+"번째 있습니다.");
	}

}









