package java0630;

public class Ex01_AssignmentOperator {

	public static void main(String[] args) {
		// 대입연산자 
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		// num1, num2를 += 대입연산자 활용하여 계산 
		num1 = 7;
		num2 = 3;
		System.out.println(num1); // 7출력
		System.out.println(num2); // 3출력
		num1 += num2;
		System.out.println(num1); // 10출력
		System.out.println(num2); // 3출력
		num1 -= num2; // num1 = num1 - num2
		System.out.println(num1); // 4출력
		System.out.println(num2); // 출력
		// num3 = num1 -= num2;
	}

}
