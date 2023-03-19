package condition;

import java.util.Scanner;

public class Ifelse3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 변수 = sc.nextInt();
		
		// #1 20세 이상이면 성인, 14~20세는 청소년, 14세 미만은 어린이로 구분
		int age;
		System.out.print("나이를 입력해주세요>>");
		age = sc.nextInt();
		
		if(age >= 20) {
			System.out.println("성인");
		}
		else if(age >= 14 && age < 20) {
			System.out.println("청소년");
		}
		else if(age < 14 && age >= 0){
			System.out.println("어린이");
		}
		else {
			System.out.println("다시 입력");
		}
		
		// #2 학점 계산 (90이상은 A, 80이상은 B, 70이상은 C, 그 미만은 F)
		int score;
		System.out.print("점수를 입력해주세요>>");
		score = sc.nextInt();
		
		if(score >= 90) {
			System.out.println("학점 : A");
		}
		else if(score >= 80) {
			System.out.println("학점 : B");
		}
		else if(score >= 70) {
			System.out.println("학점 : C");
		}
		else {
			System.out.println("학점 : F");
		}
		
		// #3 비밀번호를 정해놓고 사용자가 비밀번호를 입력해서 맞추면 '비밀번호가 맞습니다.'
		// 틀리면 '비밀번호가 다릅니다." (비밀번호는 정수)
		int pw = 1234;
		int putpw;
		System.out.print("비밀번호를 입력해주세요>>");
		putpw = sc.nextInt();
		
		if(pw == putpw) {
			System.out.println("비밀번호가 맞습니다.");
		}
		else {
			System.out.println("비밀번호가 다릅니다.");
		}
		
		// #4 윤년 판별하기 (년도를 입력받아 해당 연도가 윤년인지 판별해보기)
		// 윤년 : 연도가 4의 배수이면서 100의 배수가 아닌 연도 
		//			 또는 400의 배수인 연도
		int year;
		
		System.out.print("연도를 입력해주세요>>");
		year = sc.nextInt();
		
		if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("윤년입니다.");
		}
		else {
			System.out.println("윤년이 아닙니다.");
		}
		
		sc.close();		// 입력받는 것 닫기, 굳이 안해줘도 됨
		

		// 드래그하고 Ctrl + /키 : 모두 주석 처리
	}
}
