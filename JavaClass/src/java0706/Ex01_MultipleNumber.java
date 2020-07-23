package java0706;

public class Ex01_MultipleNumber {

	public static void main(String[] args) {
		// 1부터 100까지 숫자중에서 3의 배수 출력하기
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i);
			}
		}
	}

}
