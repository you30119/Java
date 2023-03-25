package loop;

import java.util.Scanner;

public class For2 {
	public static void main(String[] args) {
		// for문을 통해서 구현해보세요
		
		// #1 안녕 5번
		for(int i = 0; i < 5; i++) {
			System.out.println("안녕");
		}
		
		// #2 1~10까지 합계 구하기
		int sum1 = 0;
		
		for(int i = 0; i < 10 ; i++) {
			sum1 += i + 1;
		}
		System.out.println("1부터 10까지 합 : "+sum1);
		
		// #3 1~입력값까지 합계 구하기 (예시: 10 => 55, 50 => 1275)
		int num = 0;
		int sum2 = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1부터 몇까지 더할까요?>>");
		num = sc.nextInt();
		
		for(int i = 0; i < num ; i++) {
			sum2 += i + 1;
		}
		System.out.println("1부터 "+num+"까지의 합 : "+sum2);
		
	}
}
