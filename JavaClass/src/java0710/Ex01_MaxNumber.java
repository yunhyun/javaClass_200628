package java0710;

import java.util.Scanner;

public class Ex01_MaxNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//		int[] num = {3, 10, 7, 5, 2};
		int[] num = new int[5];
		int max = 0;
		for(int i=0; i<num.length; i++) {
			// �ִ� ã�� 
			// max�� �迭�� �� �ε����� ����� ���� ��
			num[i] = scan.nextInt();
			if(max < num[i]) {
				max = num[i];
			}
		}
		System.out.println("�ִ��� : "+max);
	}

}
