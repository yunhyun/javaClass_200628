package java0710;

import java.util.Scanner;

public class Ex01_MaxNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//		int[] num = {3, 10, 7, 5, 2};
		int[] num = new int[5];
		int max = 0;
		for(int i=0; i<num.length; i++) {
			// 최댓값 찾기 
			// max와 배열의 각 인덱스에 저장된 값과 비교
			num[i] = scan.nextInt();
			if(max < num[i]) {
				max = num[i];
			}
		}
		System.out.println("최댓값은 : "+max);
	}

}
