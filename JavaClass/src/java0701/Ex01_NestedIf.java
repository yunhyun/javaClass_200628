package java0701;

public class Ex01_NestedIf {

	public static void main(String[] args) {
		/*
		 * ��ø if�� 
		 * 
		 */
		int num = 10;
		
		if(num == 10) {
			if(num>5) {
				System.out.println("���ڰ� 5���� Ů�ϴ�.");
			} else if(num <= 5) {
				System.out.println("���ڰ� 5���� �۰ų� �����ϴ�.");
			} else {
				System.out.println("");
			}
		} else {
			System.out.println("");
		}
	}

}
