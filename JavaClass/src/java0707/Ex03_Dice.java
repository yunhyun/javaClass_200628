package java0707;

public class Ex03_Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		while (run) {
			int num = (int) (Math.random() * 6) + 1;
			int num1 = (int) (Math.random() * 6) + 1;
			System.out.println("숫자: " + num);
			if (num+num1 == 6) {
				System.out.println("6이 나왔네요 종료합니다.");
				run = false;
			}
		}
	}

}
