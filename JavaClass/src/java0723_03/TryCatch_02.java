package java0723_03;

public class TryCatch_02 {

	public static void main(String[] args) {
		try {
		int num1 = 7;
		int num2 = 0;
		int result = num1/num2;
		System.out.println(result);
		} catch(Exception e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
	}

}
