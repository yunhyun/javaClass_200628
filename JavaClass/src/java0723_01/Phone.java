package java0723_01;

public class Phone {
	/*
	 * 상속 
	 * 자바에서의 상속
	 * 	: 부모클래스의 필드, 메소드를 상속 받는 것 
	 *  : 부모클래스, 자식클래스가 존재함. 
	 * 상속의 장점 
	 * 	: 코드 중복을 줄일 수 있음. 
	 *  : 유지보수 편리
	 *  : 객체의 다형성 구현이 가능 
	 * 유의 사항
	 * 	: private으로 선언한 필드, 메소드는 상속 불가능 
	 * 
	 */
	// 필드 선언 
	String model;
	String color;
	
	// 메소드 선언 
	void hangOn() {
		System.out.println("전화를 겁니다. ");
	}
	void hangOff() {
		System.out.println("전화를 끊습니다. ");
	}
	void call(String sendVoice) {
		System.out.println(sendVoice);
	}
}










