package java0720_01;

import java.util.ArrayList;
import java.util.List;

public class NaverMemberService {
	// id 출력을 위한 메소드 선언 
	public void viewId(List<NaverMemberDTO> memberList) {
		for(int i=0; i<memberList.size(); i++) {
			System.out.println(memberList.get(i).getId());
		}	
	}

	public void viewAll(List<NaverMemberDTO> memberList) {
		for(int i=0; i<memberList.size(); i++) {
			System.out.println(memberList.get(i).getId());
			System.out.println(memberList.get(i).getPassword());
			System.out.println(memberList.get(i).getName());
		}
	}
	
	
	
}
