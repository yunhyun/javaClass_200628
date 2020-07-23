package java0707;

public class Ex05_DoWhile {

	public static void main(String[] args) {
		// do while
		
		int i = 10;
		boolean run = true;
		System.out.println("반복문 시작 전");
		do {
			System.out.println("do while문 i값 :"+i);
			if(i==20) {
				run = false;
			}
			i++;
		} while(run);
		System.out.println("반복문 종료 후");
		
	}

}




