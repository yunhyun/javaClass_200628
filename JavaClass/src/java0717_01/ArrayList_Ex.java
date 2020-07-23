package java0717_01;

import java.util.*;

public class ArrayList_Ex {

	public static void main(String[] args) {
		/*
		 * ArrayList, Set, Map 
		 */
		// numbers ��� �̸��� ArrayList ����
		List<Integer> numbers = new ArrayList<Integer>();
		// <> : generic
		// Ÿ�Ժ�ȯ�� ���� �ʰ� �ش� Ÿ���� ����� �� �ְ� ����
		List<String> strs = new ArrayList<String>();
		
		// numbers�� �� ���� 
		numbers.add(10);
		int num = 100;
		numbers.add(num);
		System.out.println(numbers.add(500));
		numbers.add(1, 99);
		numbers.add(1, 999);
		// ��ü ������ ���� 
//		numbers.clear();
		numbers.remove(2);
		// ��� 
		System.out.println(numbers.get(0));
		System.out.println(numbers.get(1));
		System.out.println(numbers.get(2));
		// ArrayList ũ�� ��� 
		System.out.println(numbers.size());
		// for���� �̿��Ͽ� ArrayList�� ��� ��� ������ ��� 
		for(int i=0; i<numbers.size(); i++) {
			System.out.println("�ε��� "+ i +" : "+numbers.get(i));
		}
		
		strs.add("��������");
		
		List<StudentDTO> stuList = new ArrayList<StudentDTO>();
		StudentDTO stu = new StudentDTO();
		stu.setName("ȸ��1");
		stu.setAddress("��õ������");
		stu.setPhone("010-1111-1111");
		
		stuList.add(stu);
		System.out.println(stuList.get(0));
		System.out.println(stuList.get(0).getName());
		
		StudentDTO stu1 = new StudentDTO();
		stu1.setName("ȸ��2");
		stu1.setAddress("��õ��");
		stu1.setPhone("010-2222-2222");
		stuList.add(stu1);
		System.out.println(stuList.get(1).getName());
		
		for(int i=0; i<stuList.size(); i++) {
			System.out.println("��ü ��� : "+stuList.get(i));
			System.out.println("�̸��� ��� : "+stuList.get(i).getName());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}









