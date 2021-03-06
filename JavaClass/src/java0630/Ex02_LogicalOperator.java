package java0630;

public class Ex02_LogicalOperator {

	public static void main(String[] args) {
		/*
		 * 논리연산자 
		 * &&(AND 연산) : A && B 일 때 A, B 모두 true여야 결과가 true
		 *		A, B 중에 하나라도 false가 있다면 결과는 false  		 
		 * ||(OR 연산) : A || B 일 때 A, B 중에 하나라도 true면 결과는 true
		 * 		A, B 모두 false여야 결과가 false
		 * !(NOT 연산) : boolean 변수 앞에 사용하면 결과 반전 
		 */
		boolean var1 = false;
		boolean var2 = false;
		boolean var3 = false;
		// AND 연산 
		var3 = var1 && var2;
		System.out.println(var3); // false
		
		var1 = true;
		var3 = var1 && var2;
		System.out.println(var3); // false
		
		var2 = true;
		var3 = var1 && var2;
		System.out.println(var3); // true
		
		var3 = (7<3) && (3<1);
		System.out.println(var3); // false
		
		// OR 연산 
		var3 = var1 || var2; //var1 = true, var2 = true
		System.out.println(var3); // 
		
		var1 = false;
		var3 = var1 || var2; //var1 = false, var2 = true
		System.out.println(var3); //

		// NOT 연산자 사용 전 
		System.out.println("NOT 연산자 사용 전 : "+var2);
		var2 = !var2;
		// NOT 연산자 사용 후
		System.out.println("NOT 연산자 사용 후 : "+var2);

		var3 = var1 || var2; 
		System.out.println(var3); //
	}

}




