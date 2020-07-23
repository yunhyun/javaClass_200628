package java0721_01;

import java.util.*;

public class BoardService {
	Scanner scan = new Scanner(System.in);
		
	public void listView(List<BoardDTO> boardList) {
		for(int i=0; i<boardList.size(); i++) {
			System.out.println(boardList.get(i));
		}
	}

	public List<BoardDTO> boardModify(List<BoardDTO> boardList) {
		System.out.print("���� �۹�ȣ : ");
		int bnumber = scan.nextInt();
		scan.nextLine();
		System.out.print("��й�ȣ : ");
		String password = scan.next();
		
		for(int i=0; i<boardList.size(); i++) {
			if(bnumber==boardList.get(i).getBnumber() && password.equals(boardList.get(i).getPassword())) {
				System.out.print("�������� �Է� : ");
				String contents = scan.next();
				
				boardList.get(i).setContents(contents);
				System.out.println("����"+contents);
				System.out.println("�����Ϸ�");
				//break;
			} 
		}
		return boardList;
	}

	public List<BoardDTO> boardDelete(List<BoardDTO> boardList) {
		System.out.print("���� �۹�ȣ : ");
		int bnumber = scan.nextInt();
		scan.nextLine();
		System.out.print("��й�ȣ : ");
		String password = scan.next();
		
		for(int i=0; i<boardList.size(); i++) {
			if(bnumber==boardList.get(i).getBnumber() && password.equals(boardList.get(i).getPassword())) {
				boardList.remove(i);
				System.out.println("�����Ϸ�");
				//break;
			} 
		}
		return boardList;
	}

}
