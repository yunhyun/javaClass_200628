package java0706;

public class Ex06_xyFunction {

	public static void main(String[] args) {
		for(int x=1;x<=10;x++) {
			// x�� 1�϶� y�� 1~10���� �ϳ��ϳ� �Է��غ��� 
			// ���� �ߺ� for�� ��� 
			for(int y=1;y<=10;y++) {
				//4x+5y=60�� �����ϴ� ���� ã�� ���� if�� ���
				if((4*x+5*y)==60) {
					System.out.println
					("("+x+","+y+")");
				}
			}
		}
	}

}
