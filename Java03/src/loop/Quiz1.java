package loop;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// #1 1~10 중 짝수만 출력하기
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 1) {
				continue;
			}
			System.out.print(i+" ");
		}
		System.out.println(" ");
		
		// #2 정수 형태 비밀번호 맞추기(기회는 5번, 맞추면 맞췄다!하고 종료, 기회를 모두 사용하면 접속불가)
		int pw = 1234;
		int key;
		
		int i = 0;
		for(i = 0; i < 5; i++) {
			System.out.print("비밀번호를 입력해주세요>>");
			key = sc.nextInt();
			if(pw == key) {
				System.out.println("맞췄다!");
				break;
			}
		}
		
		if(i == 5) {
			System.out.println("접속불가");
		}
		
		
	}
}
