package java0703;

import java.util.Scanner;

public class Ex04_ForSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int startValue = 0, lastValue = 0;
		System.out.print("���۰��� �Է��ϼ��� : ");
		startValue = scan.nextInt();
		System.out.print("������ �Է��ϼ��� : ");
		lastValue = scan.nextInt();
		
		for(int i=startValue; i<=lastValue;i++) {
			sum+=i;
			System.out.print(i);
			
			if(i<lastValue) {
				System.out.print("+");
			} else {
				System.out.print("=");
				System.out.println(sum);
			}
		}
		System.out.println(startValue+"���� "+lastValue+"������ ����"+
				sum+"�Դϴ�.");
	}

}
