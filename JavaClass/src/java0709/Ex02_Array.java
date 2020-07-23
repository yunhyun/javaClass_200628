package java0709;

public class Ex02_Array {

	public static void main(String[] args) {
		// 정수형 배열변수 선언 
		int[] number;
		int number1[];
		
		// 배열 선언하면서 초기값 지정
		int[] number2 = {1,2,3,4};
		// 배열에 저장된 데이터 출력 
		System.out.println(number2[0]);
		System.out.println(number2[1]);
		System.out.println(number2[2]);
		System.out.println(number2[3]);
//		System.out.println(number2[4]);
		// String 타입 배열을 선언하여 같은 줄에 앉은 4명의 이름을 저장하고 출력
		String[] names = {"권단군", "김경수", "한상욱", "추영제"};
		names[3] = "송지혜";
		String n = "";
		n = "김은비";
		names[2] = n;
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		// names 배열의 크기는 4, 마지막 인덱스는 3
		// 배열의 크기 값 활용하기 
		System.out.println(names.length);
		// for문을 이용하여 배열에 저장된 값 모두 출력하기 
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
		int[] number3;
		number3 = new int[3];
		
		int[] number4 = new int[3];
		System.out.println(number4.length);
		for(int i=0; i<number4.length; i++) {
			System.out.println(number4[i]);
		}
		
		
		number3[0] = 1;
		
		
		
	}

}






