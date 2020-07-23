package java0714;

import java.util.Scanner;

public class Ex02_StudentManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int[] student = null;

		while (run) {
			System.out.println("--------------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------------------------");
			System.out.print("선택> ");
			int selectNo = scan.nextInt();
			if (selectNo == 1) {
				// 학생수
				// 배열 크기 지정
				System.out.print("학생수>");
				int studentNum = scan.nextInt();
				student = new int[studentNum];

			} else if (selectNo == 2) {
				// 점수입력
				// 스캔을 이용하여 배열에 값 저장
				System.out.println(student.length);
				for (int i = 0; i < student.length; i++) {
					System.out.print((i + 1) + "번 째 학생점수 : ");
					student[i] = scan.nextInt();
				}
			} else if (selectNo == 3) {
				// 점수리스트
				// 배열에 담긴 값 차례대로 출력
				for (int i = 0; i < student.length; i++) {
					System.out.print((i + 1) + "번 째 학생점수 : " + student[i]);
				}
			} else if (selectNo == 4) {
				// 분석(최고점, 평균, 내림차순)
				int sum = 0, max = 0;
				double avg = 0;
				for (int i = 0; i < student.length; i++) {
					if (max < student[i]) {
						max = student[i];
					}
					sum += student[i];
				}
				avg = sum / student.length;
				System.out.println("최고점수 : " + max);
				System.out.println("평균점수 : " + avg);

				int temp = 0;
				for (int i = 0; i < student.length; i++) {
					for (int j = i + 1; j < student.length; j++) {
						if (student[i] < student[j]) {
							temp = student[i];
							student[i] = student[j];
							student[j] = temp;
						}
					}
				}
				for(int k=0; k<student.length; k++) {
					System.out.println(student[k]);
				}

			} else if (selectNo == 5) {
				// 종료
				run = false;
			}

		}

	}

}
