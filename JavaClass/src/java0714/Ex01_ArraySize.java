package java0714;

import java.util.Scanner;

public class Ex01_ArraySize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// 정수형 배열 num 이름만 선언(완전한 배열로 선언된 것은 아님)
//		System.out.println(num.length);
		// 스캐너 입력을 통해 사이즈 지정 
		// 입력받은 숫자를 배열 크기에 지정 
//		int[] num1 = new int[5];
		
		int[] num = null;
		int num2 = 100;
		if(num2==100) {
			System.out.print("지정할 배열 크기 ");
			int size = scan.nextInt();
			num = new int[size];
		} 
		System.out.println(num.length);
		
		int num3 = 200;
		if(num3==200) {
			System.out.print("지정할 배열 크기 ");
			int size = scan.nextInt();
			int[] num4 = new int[size];
		}
//		System.out.println(num4[0]);
//		System.out.println(size);
		
	}

}






