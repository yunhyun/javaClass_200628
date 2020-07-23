package java0710;

import java.util.Arrays;

public class Ex02_ArraySort {

	public static void main(String[] args) {
		int[] num = {3,2,1,4,5};
		int temp = 0;
		
		/*
		 * 1회차 반복 : 0,1 0,2 0,3 0,4
		 * 2회차 반복 : 1,2 1,3 1,4
		 * 3회차 반복 : 2,3 2,4
		 * 4회차 반복 : 3,4
		 */
		Arrays.sort(num);
		for(int i=0; i<num.length; i++) {
			for(int j=i+1; j<num.length; j++) {
				if(num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]);
		}
		
		
		
		
		
		
		
		
		
	}

}
