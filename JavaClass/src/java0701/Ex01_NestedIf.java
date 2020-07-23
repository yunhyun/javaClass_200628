package java0701;

public class Ex01_NestedIf {

	public static void main(String[] args) {
		/*
		 * 중첩 if문 
		 * 
		 */
		int num = 10;
		
		if(num == 10) {
			if(num>5) {
				System.out.println("숫자가 5보다 큽니다.");
			} else if(num <= 5) {
				System.out.println("숫자가 5보다 작거나 같습니다.");
			} else {
				System.out.println("");
			}
		} else {
			System.out.println("");
		}
	}

}
