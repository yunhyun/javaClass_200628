package java0716_01;

public class Car {
	int gas;

	// ������ ���� 
	Car(int gas) {
		this.gas = gas;
	}
	
	void setGas(int gas) {
		this.gas = gas;
	}

	boolean isLeftGas() {
		boolean result = false;
		if (gas == 0) {
			System.out.println("gas�� �����ϴ�.");
//			return false;
			result = false;
		} else {
			System.out.println("gas�� �ֽ��ϴ�.");
//			return true;
			result = true;
		}
		return result;
	}

	void run() {
		boolean run = true;
		while (run) {
			if (gas > 0) {
				System.out.println("�޸��ϴ�.(gas �ܷ� : " + gas + ")");
				gas -= 1;
			} else {
				System.out.println("����ϴ�.(gas �ܷ� : " + gas + ")");
				run = false;
			}
		}
	}
}
