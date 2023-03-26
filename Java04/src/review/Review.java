package review;

import java.util.Scanner;

public class Review {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// #1 1~10 중 짝수만 출력하기
		// for(초기값;조건식;증감량){반복할 코드;}

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}

		System.out.println("");

		// #2 정수 형태 비밀번호 맞추기(기회는 5번, 맞추면 맞췄다!하고 종료, 기회를 모두 사용하면 접속불가)
//		int pw = 1234;
//		int user_input = 0;
//		
//		for(int i = 0; i < 5; i++) {
//			System.out.print("비밀번호를 입력해주세요>>");
//			user_input = sc.nextInt();
//			if(pw == user_input) {
//				System.out.println("맞았습니다!");
//				break;
//			}
//			if(i == 4) {
//				System.out.println("접속불가");		
//			}
//		
//		}

		// Ctrl + Shift + F키 : 정렬 // 드래그 + Alt + 방향키 : 코드 이동

		// #3 시험합격 점수는 국어, 영어, 수학이 각각 40점 이상이고, 총 점수가 150점 이상이면 합격
		// 40점 이하의 점수가 있으면 과락, 총점이 미달되면 총점 미달 (조건문)
		// 39, 40, 40 ==> 과락
		// 40, 40, 40 ==> 총점 미달
		// 40, 40, 100 ==> 합격

		int kor = 0, eng = 0, math = 0;
		int sum = 0;

		System.out.print("국어 점수>>");
		kor = sc.nextInt();
		System.out.print("영어 점수>>");
		eng = sc.nextInt();
		System.out.print("수학 점수>>");
		math = sc.nextInt();

		sum = kor + eng + math;
		// System.out.println(sum);
		
		if (sum >= 150) {
			if (kor < 40 || eng < 40 || math < 40) {
				System.out.println("과락");
			} 
			else {
				System.out.println("합격");
			}
		}
			
		if (sum < 150) {
			if (kor < 40 || eng < 40 || math < 40) {
				System.out.println("과락");
			}
			System.out.println("총점미달");
		}

		// #4 1~10까지의 합 구하기 (반복문) 			정답 : 55
		int sum2 = 0;
		for(int i = 1; i <= 10; i++) {
			sum2 += i;
		}
		System.out.println("1~10까지의 합 : "+sum2);
		
		// #5 10~1까지 거꾸로 출력하기 (반복문) 		정답 : 10 9 8 7 6 5 4 3 2 1
		for(int i = 10; i > 0; i--) {
			System.out.print(i+" ");
		}
		
		
		
		
		
		
		
		
		
	}
}
