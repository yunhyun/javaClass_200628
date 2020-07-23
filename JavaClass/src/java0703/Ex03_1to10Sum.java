package java0703;

public class Ex03_1to10Sum {

	public static void main(String[] args) {
		int sum = 0;
		int num = 5;
		for(int i=1; i<=10; i++) {
//			sum = sum + i;
			sum += i;
			System.out.print(i);
			if(i<=9) {
				System.out.print("+");
			} else {
				System.out.print("=");
				System.out.print(sum);
			}
		}
	}

}
