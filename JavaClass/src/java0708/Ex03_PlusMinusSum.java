package java0708;

public class Ex03_PlusMinusSum {

	public static void main(String[] args) {
		int sum = 0; // 합계용 변수
		int count = 1; // 1,2,3,4~~~ 숫자용 변수
		int num = 0; // 1,-2,3,-4~~~ 숫자용 변수
		int s = 1; // 부호용 변수
		boolean run = true;
		while (run) {
			sum = sum + num;
			if (sum >= 100) {
				run = false;
			} else {
				num = s * count;
				s = -s; //1, -1, 1, -1, 1
				count++;
			}
		}
		System.out.println("숫자 : " + num);

	}

}
