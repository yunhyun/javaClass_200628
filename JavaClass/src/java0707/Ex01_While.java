package java0707;

public class Ex01_While {

	public static void main(String[] args) {
		// while 문 연습 
		// while 문을 이용하여 1부터 10까지 출력
		
		int i = 0;
		int sum = 0;
		System.out.println("while문 시작 전");
		while(i<=10) {
			System.out.println("i값" +i);
			sum += i;
			i++;
		}
		System.out.println("while문 종료 후 i:"+i);
		System.out.println(sum);
	}

}



