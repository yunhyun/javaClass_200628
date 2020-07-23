package java0722_01;

import java.util.*;

public class BankService {
	Scanner scan = new Scanner(System.in);

	public List<BankDTO> deposit(List<BankDTO> accountList) {
		System.out.print("계좌 : ");
		String accountNumber = scan.next();
		System.out.print("입금액 : ");
		int money = scan.nextInt();
		for (int i = 0; i < accountList.size(); i++) {
			if (accountList.get(i).getAccountNumber().equals(accountNumber)) {
				int balance = accountList.get(i).getBalance() + money;
				accountList.get(i).setBalance(balance);
				System.out.println("입금완료 ");
				System.out.println("잔액 : " + accountList.get(i).getBalance());
			}
		}
		return accountList;
	}

	public List<BankDTO> withdraw(List<BankDTO> accountList) {
		System.out.print("계좌 : ");
		String accountNumber = scan.next();
		System.out.print("출금액 : ");
		int money = scan.nextInt();
		for (int i = 0; i < accountList.size(); i++) {
			if (accountList.get(i).getAccountNumber().equals(accountNumber)) {
				if (money <= accountList.get(i).getBalance()) {
					int balance = accountList.get(i).getBalance() - money;
					accountList.get(i).setBalance(balance);
					System.out.println("출금완료 ");
					System.out.println("잔액 : " + accountList.get(i).getBalance());
				} else {
					System.out.println("잔액이 부족합니다. ");
				}
			}
		}
		return accountList;
	}

	public void balanceCheck(List<BankDTO> accountList) {
		System.out.print("계좌 : ");
		String accountNumber = scan.next();
		for (int i = 0; i < accountList.size(); i++) {
			if (accountList.get(i).getAccountNumber().equals(accountNumber)) {
				System.out.println("잔액 : " + accountList.get(i).getBalance());
			}
		}
	}

	public void bankList(List<BankDTO> accountList) {
		for (int i = 0; i < accountList.size(); i++) {
			System.out.println(accountList.get(i));
		}
	}

}
