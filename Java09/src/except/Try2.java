package except;

import java.util.Scanner;

public class Try2 {
	public static void main(String[] args) {
		// #1
		// try-catch를 사용해서 나누기를 해보세요
		// 숫자 2개를 나누기하되
		// 0이 들어올 수 있으니까 try로 예외처리
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자1을 입력하세요>>");
			int num1 = sc.nextInt();
			
			System.out.print("숫자2를 입력하세요>>");
			int num2 = sc.nextInt();
			
			try {
				System.out.println(num1/num2);
				
			}catch(Exception e){
				System.out.println("예외처리");
			}
			
			if(num1 == 0 && num2 == 0) {
				break;
			}
		}
		
		// #2
		// int a = sc.nextInt();	에 대한 예외처리 (숫자를 입력해야하는 함수에 문자열을 입력할 수 있음)
		System.out.println("숫자를 입력하세요>>");
		// int a = sc.nextInt();		// nextInt : 숫자만 입력해줘야 함
		int a = 0;
		try {
			a = sc.nextInt();
			System.out.println(a);
		}catch(Exception e) {
			System.out.println("숫자를 입력해주세요");
		}
		
		
		// 형변환 String -> int
		int c = 0;
		String str = "글자";
		try {
			c = Integer.parseInt(str);
			System.out.println(c);
		}catch(Exception e) {
			System.out.println("숫자만 가능"+e);
		}
	}
}
