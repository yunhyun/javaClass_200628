package java0720_01;

import java.util.*;

public class NaverMemberMain {

	public static void main(String[] args) {
		// 
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		
		// ȸ�� ������ ��� ������ ArrayList ���� 
		List<NaverMemberDTO> memberList = new ArrayList<NaverMemberDTO>();
		// ȸ�� �ϳ��� ������ ���� DTO ���� ���� 
		NaverMemberDTO member = null;
		// Service Ŭ���� ��ü ���� 
		NaverMemberService naverService = new NaverMemberService();
		
		while(run) {
			System.out.println("--------------------------------------------------------------");
			System.out.println("1.ȸ������ | 2.id ��� | 3.id,pw,�̸� ��� | 4. | 5.����");
			System.out.println("--------------------------------------------------------------");
			System.out.print("����> ");
			int selectNo = scan.nextInt();
			switch(selectNo) {
			case 1:
				System.out.print("���̵� : ");
				String id = scan.next();
				System.out.print("��й�ȣ : ");
				String password = scan.next();
				System.out.print("�̸� : ");
				String name = scan.next();
				// DTO ��ü ���� 
				member = new NaverMemberDTO();
				// ��ü�� �ʵ尪 ���� ���� 
				member.setId(id);
				member.setPassword(password);
				member.setName(name);
				// ArrayList�� ���� 
				memberList.add(member);
				
				break;
			case 2:
				// id ����� ���� �޼ҵ� ȣ�� 
				naverService.viewId(memberList);
				break;
			case 3:
				// id, pw, �̸� ����� ���� �޼ҵ� ȣ�� 
				naverService.viewAll(memberList);
				break;
			}
		}
		
		
	}

}








