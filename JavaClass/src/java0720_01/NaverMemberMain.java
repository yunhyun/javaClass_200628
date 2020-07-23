package java0720_01;

import java.util.*;

public class NaverMemberMain {

	public static void main(String[] args) {
		// 
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		
		// 회원 정보를 모두 저장할 ArrayList 선언 
		List<NaverMemberDTO> memberList = new ArrayList<NaverMemberDTO>();
		// 회원 하나의 정보를 담을 DTO 변수 선언 
		NaverMemberDTO member = null;
		// Service 클래스 객체 선언 
		NaverMemberService naverService = new NaverMemberService();
		
		while(run) {
			System.out.println("--------------------------------------------------------------");
			System.out.println("1.회원가입 | 2.id 출력 | 3.id,pw,이름 출력 | 4. | 5.종료");
			System.out.println("--------------------------------------------------------------");
			System.out.print("선택> ");
			int selectNo = scan.nextInt();
			switch(selectNo) {
			case 1:
				System.out.print("아이디 : ");
				String id = scan.next();
				System.out.print("비밀번호 : ");
				String password = scan.next();
				System.out.print("이름 : ");
				String name = scan.next();
				// DTO 객체 선언 
				member = new NaverMemberDTO();
				// 객체의 필드값 각각 저장 
				member.setId(id);
				member.setPassword(password);
				member.setName(name);
				// ArrayList에 저장 
				memberList.add(member);
				
				break;
			case 2:
				// id 출력을 위한 메소드 호출 
				naverService.viewId(memberList);
				break;
			case 3:
				// id, pw, 이름 출력을 위한 메소드 호출 
				naverService.viewAll(memberList);
				break;
			}
		}
		
		
	}

}








