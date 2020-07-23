package java0706;

public class Ex02_MultipleNumber {

	public static void main(String[] args) {
		// 1부터 100까지 숫자 중에서 2의 배수 제외한 숫자 총합
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			// 2의배수, 3의배수 걸러내고 합 구하기
			if (i % 2 != 0 && i % 3 !=0) {
				sum = sum + i;
			}
		}
		System.out.println("합계 :" + sum);

	}

}
