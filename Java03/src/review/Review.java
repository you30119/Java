package review;

import java.util.Scanner;

public class Review {
	public static void main(String[] args) {
		// if문
		// if ~ else if ~ else
		// 조건이 맞으면 실행, 조건이 틀리면 무시
		// else(){} : ()에는 조건식을, {}에는 코드를 넣는다.
		
		// 예제 : 버스카드 (20세 이상이면 성인입니다 1000원, 14~19세면 청소년입니다 650원, 13세 이하면 400원)
		
		int age = 19;
		int money = 0;
		
		if(age >=20) {
			// 나이가 20이상일 때 실행할 코드
			System.out.println("성인입니다.");
			money = 1000;
		}
		else if(age >=14) {
			// 나이가 14이상 20미만일 때 실행할 코드
			System.out.println("청소년입니다.");
			money = 650;
		}
		else {
			// 나이가 14미만일 때 실행할 코드
			System.out.println("어린이입니다.");
			money = 400;
		}
		
		System.out.println(money+"원");
		
		// 윤년 구하기
		int year = 0;
		Scanner sc = new Scanner(System.in);		// 사용자 입력을 위해 먼저 해야할 작업
		System.out.print("년도를 입력하세요>>");
		year = sc.nextInt();			// 사용자에게 int값을 입력받고 year에 담기
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println("운년 입니다.");
		}
		else {
			System.out.println( "윤년이 아닙니다.");
		}
		sc.close();		// 프로그램 성능을 느려지게 할 수 있는 자원을 해제
		// 지금은 main함수가 종료되면 자동으로 해제되기 때문에 지금은 안해도 됨
	}
}
