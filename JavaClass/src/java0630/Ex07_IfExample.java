package java0630;

public class Ex07_IfExample {

	public static void main(String[] args) {
		/*
		 * 성적 출력 하기 
		 * 자바 점수가 60점 이상이면 합격했습니다. 출력 
		 * 60점 미만이면 불합격 했습니다. 출력 
		 */
		// 자바점수 입력을 위한 변수 
		int javaScore = 0;
		javaScore = 80;
		if(javaScore >= 60) {
			System.out.println("합격입니다.");
		} else if(javaScore >=50 ) {
			System.out.println("재시험입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
		
		
		
	}

}
