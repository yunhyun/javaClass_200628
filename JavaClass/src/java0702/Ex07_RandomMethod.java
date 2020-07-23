package java0702;

public class Ex07_RandomMethod {

	public static void main(String[] args) {
		/*
		 * Random 메소드 
		 * 특정 범위 내에서 숫자 하나를 출력해주는 메소드 
		 */
		// 1~10 사이의 숫자하나 발생시키기 
		int num = 0;
		num = (int)(Math.random() * 10) + 1;
		System.out.println("출력숫자 " + num);
	}

}
