package java0715_04;

public class CalculatorMain {

	public static void main(String[] args) {
		// Calculator 클래스의 객체 선언
		Calculator cal = new Calculator();
		cal.sum(7, 5);
		int val1 = 10;
		int val2 = 7;
		double val3 = 0.5;
		cal.sum(val1, val2);
		
		cal.sum1(5, 3);
		System.out.println(cal.sum1(8, 12));
		//System.out.println(20);
		int result1 = cal.sum1(7, 10);
		int result2 = result1+10;
		
		System.out.println(result2);
		
		
		
	}

}






