package java0707;

public class Ex02_While {

	public static void main(String[] args) {
		// while���� �̿��Ͽ� ���ѹݺ� �ϱ�
		// i���� 99�� �� �ݺ��� ���� 
		int i = 1;
		boolean run = true;
		while(run) {
			System.out.println(i);
			if(i==99) {
				run = false;
			}
			i++;
		}
		System.out.println("�ݺ��� ���� ");
	}

}








