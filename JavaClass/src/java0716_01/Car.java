package java0716_01;

public class Car {
	int gas;

	// 생성자 선언 
	Car(int gas) {
		this.gas = gas;
	}
	
	void setGas(int gas) {
		this.gas = gas;
	}

	boolean isLeftGas() {
		boolean result = false;
		if (gas == 0) {
			System.out.println("gas가 없습니다.");
//			return false;
			result = false;
		} else {
			System.out.println("gas가 있습니다.");
//			return true;
			result = true;
		}
		return result;
	}

	void run() {
		boolean run = true;
		while (run) {
			if (gas > 0) {
				System.out.println("달립니다.(gas 잔량 : " + gas + ")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다.(gas 잔량 : " + gas + ")");
				run = false;
			}
		}
	}
}
