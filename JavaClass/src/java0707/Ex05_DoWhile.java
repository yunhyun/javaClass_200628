package java0707;

public class Ex05_DoWhile {

	public static void main(String[] args) {
		// do while
		
		int i = 10;
		boolean run = true;
		System.out.println("�ݺ��� ���� ��");
		do {
			System.out.println("do while�� i�� :"+i);
			if(i==20) {
				run = false;
			}
			i++;
		} while(run);
		System.out.println("�ݺ��� ���� ��");
		
	}

}




