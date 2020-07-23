package java0707;

public class Ex02_While {

	public static void main(String[] args) {
		// while문을 이용하여 무한반복 하기
		// i값이 99일 때 반복문 종료 
		int i = 1;
		boolean run = true;
		while(run) {
			System.out.println(i);
			if(i==99) {
				run = false;
			}
			i++;
		}
		System.out.println("반복문 종료 ");
	}

}








