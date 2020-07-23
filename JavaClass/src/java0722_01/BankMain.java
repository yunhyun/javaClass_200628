package java0722_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		
		List<BankDTO> accountList = new ArrayList<BankDTO>();
		BankDTO account = null;
		BankService bankService = new BankService();
		
		while(run) {
			System.out.println("--------------------------------------------------------------");
			System.out.println("1.����� | 2.�Ա� | 3.��� | 4.�ܾ�Ȯ�� | 5.����");
			System.out.println("--------------------------------------------------------------");
			System.out.print("����> ");
			int selectNo = scan.nextInt();
			switch(selectNo) {
			case 1:
				System.out.print("�̸� : ");
				String name = scan.next();
				System.out.print("���� : ");
				String accountNumber = scan.next();
				System.out.print("�ʱ��Աݾ� : ");
				int balance = scan.nextInt();
				account = new BankDTO();
				account.setName(name);
				account.setAccountNumber(accountNumber);
				account.setBalance(balance);
				
				int clientNumber = accountList.size() + 1;
				account.setClientNumber(clientNumber);
				
				accountList.add(account);
				
				break;
			case 2:
				accountList = bankService.deposit(accountList);
				break;
			case 3:
				accountList = bankService.withdraw(accountList);
				break;
			case 4: 
				bankService.balanceCheck(accountList);
				break;
			case 5: 
				bankService.bankList(accountList);
				break;
			case 6:
				run = false;
				break;
				
			}
		}
	}

}
