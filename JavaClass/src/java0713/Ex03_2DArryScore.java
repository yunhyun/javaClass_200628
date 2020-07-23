package java0713;

import java.util.Scanner;

public class Ex03_2DArryScore {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[][] scores = new double[4][2];
		double sum = 0;
		double avg = 0;
		int count = 0;
		System.out.println("성적을 입력하세요 ");
		for(int i=0; i<scores.length; i++) {
			for(int j=0; j<scores[i].length; j++) {
				System.out.print((i+1)+"학년 "+(j+1)+" 학기");
				scores[i][j] = scan.nextDouble();
				sum = sum + scores[i][j];
				count++;
			}
		}
		System.out.println("총합 : "+sum);
		avg = sum/8;
		avg = sum / (scores.length*scores[0].length);
		avg = sum/count;
	}

}






