package java0722_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		
		List<ClientDTO> clientList = new ArrayList<ClientDTO>();
		List<BookDTO> bookList = new ArrayList<BookDTO>();
		ClientDTO client = null;
		BookDTO book = null;
		LibraryService libraryService = new LibraryService();
		
		while(run) {
			System.out.println("--------------------------------------------------------------");
			System.out.println("1.ȸ����� | 2.������� | 3.�������� | 4.������� | 5.����");
			System.out.println("--------------------------------------------------------------");
			System.out.print("����> ");
			int selectNo = scan.nextInt();
			switch(selectNo) {
			case 1:
				System.out.print("�̸� : ");
				String name = scan.next();
				System.out.print("��ȭ��ȣ : ");
				String phone = scan.next();
				
				client = new ClientDTO();
				client.setName(name);
				client.setPhone(phone);
				
				int clientNumber = clientList.size() + 1;
				client.setClientNumber(clientNumber);
				clientList.add(client);
				
				break;
			case 2:
				System.out.print("������ : ");
				String bookName = scan.next();
				System.out.print("���� : ");
				String author = scan.next();
				
				book = new BookDTO();
				book.setBookName(bookName);
				book.setAuthor(author);
				
				int bookNumber = bookList.size() + 1;
				book.setBookNumber(bookNumber);
				bookList.add(book);
				break;
			case 3:
				bookList = libraryService.borrowBook(clientList, bookList);
				break;
			case 4: 
				libraryService.bookList(bookList);
				break;
			case 5: 
				libraryService.clientList(clientList);
				break;
			case 6:
				run = false;
				break;
				
			}
		}
	}

}
