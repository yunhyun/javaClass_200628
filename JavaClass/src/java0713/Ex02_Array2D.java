package java0713;

public class Ex02_Array2D {

	public static void main(String[] args) {
		// 2행 3열 정수형 배열 
		int[][] number = new int[2][3];
		System.out.println(number.length);
		System.out.println(number[0].length);
		System.out.println(number[1].length);
		// 3행 3열 
		int[][] number1 = new int[3][3];
		System.out.println(number1.length);
		// 1행에 1,2,3 2행에 4,5,6을 대입 
		int[][] number2 = {{1,2,3},{4,5,6}};
		// for문을 이용하여 number2에 담긴 모든 값 출력
		for(int i=0; i<number2.length; i++) {
			for(int j=0; j<number2[i].length; j++) {
				System.out.println(number2[i][j]);
			}
		}
		String[][] str = {{"가","나","다"},{"라","마","바"},
							{"사","아","자"}};
		
		
		number[0][0] = 1;
		number[0][1] = 2;
		number[0][2] = 3;
		number[1][0] = 4;
		number[1][1] = 5;
		number[1][2] = 6;
		
		
		
	}

}







