package java0709;

public class Ex02_Array {

	public static void main(String[] args) {
		// ������ �迭���� ���� 
		int[] number;
		int number1[];
		
		// �迭 �����ϸ鼭 �ʱⰪ ����
		int[] number2 = {1,2,3,4};
		// �迭�� ����� ������ ��� 
		System.out.println(number2[0]);
		System.out.println(number2[1]);
		System.out.println(number2[2]);
		System.out.println(number2[3]);
//		System.out.println(number2[4]);
		// String Ÿ�� �迭�� �����Ͽ� ���� �ٿ� ���� 4���� �̸��� �����ϰ� ���
		String[] names = {"�Ǵܱ�", "����", "�ѻ��", "�߿���"};
		names[3] = "������";
		String n = "";
		n = "������";
		names[2] = n;
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		// names �迭�� ũ��� 4, ������ �ε����� 3
		// �迭�� ũ�� �� Ȱ���ϱ� 
		System.out.println(names.length);
		// for���� �̿��Ͽ� �迭�� ����� �� ��� ����ϱ� 
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
		int[] number3;
		number3 = new int[3];
		
		int[] number4 = new int[3];
		System.out.println(number4.length);
		for(int i=0; i<number4.length; i++) {
			System.out.println(number4[i]);
		}
		
		
		number3[0] = 1;
		
		
		
	}

}






