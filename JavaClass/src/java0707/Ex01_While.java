package java0707;

public class Ex01_While {

	public static void main(String[] args) {
		// while �� ���� 
		// while ���� �̿��Ͽ� 1���� 10���� ���
		
		int i = 0;
		int sum = 0;
		System.out.println("while�� ���� ��");
		while(i<=10) {
			System.out.println("i��" +i);
			sum += i;
			i++;
		}
		System.out.println("while�� ���� �� i:"+i);
		System.out.println(sum);
	}

}



