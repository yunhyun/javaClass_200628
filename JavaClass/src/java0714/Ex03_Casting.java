package java0714;

public class Ex03_Casting {
	public static void main(String[] args) {
		/*
		 * 형변환 
		 * 특정 타입의 변수를 다른 타입의 변수로 변환하는 것 
		 * 1. 자동 형변환
		 * 	- 크기가 작은 타입이 큰 타입으로 변환  
		 * 2. 강제 형변환
		 *  - 크기가 큰 타입이 작은 타입으로 변환 
		 */
		int intVar = 10;
		double doubleVar = 1.0;
		System.out.println("초기값");
		System.out.println(intVar);
		System.out.println(doubleVar);
		doubleVar = intVar;
		System.out.println("자동형변환 후 ");
		System.out.println(intVar);
		System.out.println(doubleVar);
		intVar = (int) doubleVar;
		System.out.println("강제형변환 후 ");
		System.out.println(intVar);
		System.out.println(doubleVar);
		
		
		
		
		
	}
}
