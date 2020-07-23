package java0722_01;

import java.util.*;

public class BankService {
	Scanner scan = new Scanner(System.in);

	public List<BankDTO> deposit(List<BankDTO> accountList) {
		System.out.print("���� : ");
		String accountNumber = scan.next();
		System.out.print("�Աݾ� : ");
		int money = scan.nextInt();
		for (int i = 0; i < accountList.size(); i++) {
			if (accountList.get(i).getAccountNumber().equals(accountNumber)) {
				int balance = accountList.get(i).getBalance() + money;
				accountList.get(i).setBalance(balance);
				System.out.println("�ԱݿϷ� ");
				System.out.println("�ܾ� : " + accountList.get(i).getBalance());
			}
		}
		return accountList;
	}

	public List<BankDTO> withdraw(List<BankDTO> accountList) {
		System.out.print("���� : ");
		String accountNumber = scan.next();
		System.out.print("��ݾ� : ");
		int money = scan.nextInt();
		for (int i = 0; i < accountList.size(); i++) {
			if (accountList.get(i).getAccountNumber().equals(accountNumber)) {
				if (money <= accountList.get(i).getBalance()) {
					int balance = accountList.get(i).getBalance() - money;
					accountList.get(i).setBalance(balance);
					System.out.println("��ݿϷ� ");
					System.out.println("�ܾ� : " + accountList.get(i).getBalance());
				} else {
					System.out.println("�ܾ��� �����մϴ�. ");
				}
			}
		}
		return accountList;
	}

	public void balanceCheck(List<BankDTO> accountList) {
		System.out.print("���� : ");
		String accountNumber = scan.next();
		for (int i = 0; i < accountList.size(); i++) {
			if (accountList.get(i).getAccountNumber().equals(accountNumber)) {
				System.out.println("�ܾ� : " + accountList.get(i).getBalance());
			}
		}
	}

	public void bankList(List<BankDTO> accountList) {
		for (int i = 0; i < accountList.size(); i++) {
			System.out.println(accountList.get(i));
		}
	}

}
