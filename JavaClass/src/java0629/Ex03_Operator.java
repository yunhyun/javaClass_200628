package java0629;

public class Ex03_Operator {

	public static void main(String[] args) {
		/*
		 * 1. 정수형 변수 2개 선언 
		 * 2. 연산자(+,-,*,/,%)를 활용하여 각각 연산을 
		 * 	   수행하고 연산결과를 출력하시오.
		 */
		double number1 = 0;
		double number2 = 0;
		double result = 0;
		System.out.println(result);
		
		number1 = 7;
		
		number2 = 3;
		
		System.out.println(number1);
		System.out.println(number2);
		
		result = number1 + number2;
		System.out.println("덧셈결과 : "+result);
		
		System.out.println("덧셈결과 : "+ number1 + number2);
		System.out.println("덧셈결과 : "+ (number1 + number2));
		
		
		result = number1 - number2;
		System.out.println("뺄셈결과 : "+result);
		
		result = number1 * number2;
		System.out.println("곱셈결과 : "+result);
		System.out.println("곱셈결과 : "+ (number1 * number2));
		
		result = number1 / number2;
		System.out.println("나눗셈결과 : "+result);
		
		result = number1 % number2;
		System.out.println("나머결과 : "+result);
		
	}

}



