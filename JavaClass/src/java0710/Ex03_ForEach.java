package java0710;

public class Ex03_ForEach {

	public static void main(String[] args) {
		// advanced for(���� for) 
		// foreach
		int[] num = {1,2,3,4,5};
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}
		for(int a:num) {
			System.out.println(a);
		}
		// ���� 5�� �ִ� String �迭�� �����ϰ� 
		// foreach�� �̿��Ͽ� �迭�� ����� ���� ��� ��� 
		String[] word = {"��","��","��","��","��"};
		for(String a:word) {
			System.out.println(a);
		}
		
		
	}

}






