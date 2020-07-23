package java0703;

public class Ex02_1to10Sum {

	public static void main(String[] args) {
		// 1부터 10까지 합한 결과 출력 
		// 누적합 
		// 합계용 변수 
		int sum = 0;
//		sum = 1+2+3+4+5+6+7+8+9+10;
		for(int i=1;i<=10;i++) {
			System.out.print("계산 전 sum값 :"+sum);
			sum = sum + i;
			System.out.print(" 계산 후 sum값 :"+sum);
			System.out.println("  i값 : "+i);
		}
		System.out.println(sum);
	}

}




