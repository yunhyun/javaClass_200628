package java0716_01;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Car car = new Car(5);
		System.out.print("������ �������ּ��� : ");
		int gas = scan.nextInt();
//		car.setGas(5);
		car.setGas(gas);
		
		boolean gasState = car.isLeftGas();
		System.out.println(car.gas);
		if(gasState) {
			System.out.println("���");
			car.run();
			
		}
	}

}
