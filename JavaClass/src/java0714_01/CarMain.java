package java0714_01;

public class CarMain {

	public static void main(String[] args) {
		/* Car Ŭ������ ��ü�� �����Ͽ�
		 * Car Ŭ������ ������ �ִ� �ʵ带 ���
		 * * ��ü ������ 
		 *   '��ü�θ���Ŭ�����̸�' ������ = new '��üŬ������ ����������'; 
		 */
		// CarŬ������ ��ü�� car1�̶�� �̸����� ����
		// car1 : Car Ŭ���� Ÿ���� ���� 
		Car car1 = new Car();
		// Car Ŭ������ ������ �ִ� color �ʵ忡 �� ���� 
		car1.color = "red";
		// car1�� color �ʵ尡 ������ �ִ� �� ��� 
		System.out.println(car1.color);
		
		Car car2 = new Car();
		car2.color = "blue";
		System.out.println(car1.color);
		System.out.println(car2.color);
		
		String var = "";
		var = car1.color;
		System.out.println(var);
		
		Car car3 = null;
		car3 = new Car();
		// car3�� ��� �ʵ尪 ��� 
		System.out.println(car3.color);
		System.out.println(car3.company);
		System.out.println(car3.model);
		System.out.println(car3.speed);
		System.out.println(car3.type);
//		int num;
//		System.out.println(num);
		car3.company = "bmw";
		System.out.println(car3.company);
		
		// �Ű������� �ִ� �����ڸ� Ȱ���� ��ü ���� 
		Car car4 = new Car("���̹���");
		car4.model = "���̹���";
		System.out.println(car4.color);
		System.out.println(car4.company);
		System.out.println(car4.model);
		System.out.println(car4.speed);
		System.out.println(car4.type);
		
		
		
		
		
		
	}

}







