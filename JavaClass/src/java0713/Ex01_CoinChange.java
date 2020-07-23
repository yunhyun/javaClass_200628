package java0713;

import java.util.Scanner;

public class Ex01_CoinChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int coin = 0;
		System.out.print("금액 입력: ");
		coin = scan.nextInt();
		int[] change = {500, 100, 50, 10};
		int coinCount = 0; // 동전 갯수 출력용 변수  
		for(int i=0; i<change.length; i++) {
			coinCount = coin/change[i];
			System.out.println(change[i]+"원 동전:"
							+ coinCount+"개");
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
