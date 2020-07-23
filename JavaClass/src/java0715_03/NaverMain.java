package java0715_03;

public class NaverMain {

	public static void main(String[] args) {
		System.out.println("按眉 积己 傈");
		Naver member = new Naver();
		System.out.println("按眉 积己 饶");
		
		Naver member1 = 
				new Naver("id1","1234","雀盔1","20001111","female","aa@aa.com","01111111111");
				
		System.out.println(member1.toString());
		
		
	}

}
