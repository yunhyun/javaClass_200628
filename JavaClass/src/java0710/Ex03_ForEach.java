package java0710;

public class Ex03_ForEach {

	public static void main(String[] args) {
		// advanced for(향상된 for) 
		// foreach
		int[] num = {1,2,3,4,5};
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}
		for(int a:num) {
			System.out.println(a);
		}
		// 값이 5개 있는 String 배열을 선언하고 
		// foreach를 이용하여 배열에 저장된 값을 모두 출력 
		String[] word = {"가","나","다","라","마"};
		for(String a:word) {
			System.out.println(a);
		}
		
		
	}

}






