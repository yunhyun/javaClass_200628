package java0709;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex03_ArrayEx {

	public static void main(String[] args) {
		// ũ�Ⱑ 5�� ������ �迭�� �����Ͽ� 
		// ���� �˾Ƽ� �Է��ϰ� 
		// �Էµ� ������ ���հ� ����� ���Ͻÿ�. 
		int[] number = new int[5];
		number[0] = 1;
		number[1] = 2;
		number[2] = 3;
		number[3] = 4;
		number[4] = 5;
		int[] number1 = {1,4,3,2,5};
		int sum = 0;
		int avg = 0;
		// �ݺ����� �̿��Ͽ� �迭�� ���� 
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
		
		
		// �迭 ���� ���� ���
		int[] num = {7,5,9};
		// num �迭 ������ ������ �ִ� �� ����ϱ� 
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		sum = 0;
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]);
			System.out.println(i);
			// num �迭�� 0�� �ε����� 1 ���� 
			num[0] = 1;
			// ��ĵ �Է� ���� ���� 0�� �ε����� ����
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
