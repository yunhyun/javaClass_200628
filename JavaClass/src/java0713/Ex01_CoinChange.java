package java0713;

import java.util.Scanner;

public class Ex01_CoinChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int coin = 0;
		System.out.print("�ݾ� �Է�: ");
		coin = scan.nextInt();
		int[] change = {500, 100, 50, 10};
		int coinCount = 0; // ���� ���� ��¿� ����  
		for(int i=0; i<change.length; i++) {
			coinCount = coin/change[i];
			System.out.println(change[i]+"�� ����:"
							+ coinCount+"��");
			coin = coin % change[i];
		}
		
		
		
		
		
		
		int coin500 = coin / 500;
		int remain500 = coin % 500;
		int coin100 = remain500 / 100;
		int remain100 = remain500 % 100;
		int coin50 = remain100 / 50;
		int remain50 = remain100 % 50;
		int coin10 = remain50 / 10;
		int remain10 = remain50 % 10;
		System.out.println(coin500);
		System.out.println(coin100);
		System.out.println(coin50);
		System.out.println(coin10);
	}

}
