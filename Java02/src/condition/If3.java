package condition;

import java.util.Scanner;

public class If3 {
	public static void main(String[] args) {
		// 사용자에게 점수를 입력받고
		// 점수가 90점 이상이면
		// 우등생입니다. 를 출력하는 프로그램 만들기
		
		int score;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력해주세요>>");
		score = sc.nextInt();
		
		if(score >= 90) {
			System.out.println("우등생입니다.");
		}
		
		
	}
}
