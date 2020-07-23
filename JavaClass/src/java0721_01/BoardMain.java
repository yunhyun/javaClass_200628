package java0721_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java0720_01.NaverMemberDTO;
import java0720_01.NaverMemberService;

public class BoardMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		
		List<BoardDTO> boardList = new ArrayList<BoardDTO>();
		BoardDTO board = null;
		BoardService boardService = new BoardService();
		
		//BoardService.listView(boardList);
		
		while(run) {
			System.out.println("--------------------------------------------------------------");
			System.out.println("1.글쓰기 | 2.전체 출력 | 3.글수정 | 4.글삭제 | 5.종료");
			System.out.println("--------------------------------------------------------------");
			System.out.print("선택> ");
			int selectNo = scan.nextInt();
			switch(selectNo) {
			case 1:
				System.out.print("제목 : ");
				String title = scan.next();
				System.out.print("내용 : ");
				String contents = scan.next();
				System.out.print("비밀번호 : ");
				String password = scan.next();
				board = new BoardDTO();
				board.setTitle(title);
				board.setContents(contents);
				board.setPassword(password);
				
				int bnumber = boardList.size() + 1;
				board.setBnumber(bnumber);
				
				boardList.add(board);
				
				break;
			case 2:
				boardService.listView(boardList);
				break;
			case 3:
				boardList = boardService.boardModify(boardList);
				break;
			case 4: 
				boardList = boardService.boardDelete(boardList);
				break;
			}
		}
		
	}
}
