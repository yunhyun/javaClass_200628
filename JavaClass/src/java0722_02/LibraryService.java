package java0722_02;

import java.util.*;

public class LibraryService {
	
	Scanner scan = new Scanner(System.in);
		
	public List<BookDTO> borrowBook(List<ClientDTO> clientList, List<BookDTO> bookList) {
		System.out.print("고객 번호 : ");
		int clientNumber = scan.nextInt();
		System.out.print("빌릴책 번호 : ");
		int bookNumber = scan.nextInt();
		for(int i=0;i<bookList.size();i++) {
			if(bookNumber==bookList.get(i).getBookNumber() && bookList.get(i).isCheck()==false) {
				bookList.get(i).setClientNumber(clientNumber);
				bookList.get(i).setCheck(true);
				System.out.println("대출이 완료되었습니다.");
			}
		}
		return bookList;
	}
	// 고객번호, 책번호가 모두 존재하면 대출 처리. 
	// 그리고 대출 여부 true로 바꿈. 누가 대출했는지까지 bookList에 저장?

	public void bookList(List<BookDTO> bookList) {
		for(int i=0; i<bookList.size(); i++) {
			System.out.println(bookList.get(i));
		}
	}

	public void clientList(List<ClientDTO> clientList) {
		for(int i=0; i<clientList.size(); i++) {
			System.out.println(clientList.get(i));
		}
		
	}
	
	
	
	
}
