package java0715_05;




public class Calculator {
	// add �޼ҵ�, ����Ÿ�� : int, �Ű����� : ���� x,y
	int add(int x, int y) {
		int result = x + y;
		return result;// result�� ��� ���� ���� 
	}
	
	double avg(int x, int y) {
		double sum = add(x, y);
		double result = sum/2;
		return result;
	}
	
	void execute() {
		double result = avg(7, 10);
		System.out.println("������:" + result);
	}
}






