package operator;		// package는 그냥 폴더명

public class Plus2 {
	public static void main(String[] args) {
		// 숫자를 더하기
		// 1+1
		System.out.println(1+1); 		// 1+1을 계산한 2라는 값을 출력
		
		int 숫자1 = 1;
		int 숫자2 = 2;
		
		System.out.println(숫자1 + 숫자2); 		// 자료형이 숫자이기에 문자열합치기 +는 사용안해도 됨
		
		// 빼기
		System.out.println(1 - 1);
		System.out.println(숫자1 - 숫자2);
		
		// 곱하기
		System.out.println(2 * 2);
		System.out.println(숫자1 * 숫자2);
		
		// 나누기
		System.out.println(2 / 1);
		System.out.println(숫자2 / 숫자1);		
		
		// 나머지 구하기
		System.out.println(5 % 2);
		System.out.println(숫자2 % 숫자1);
		
		int 숫자3 = 숫자1 * 숫자2;
		System.out.println("곱하기 결과는 : " +숫자3);
		
		// 연산자에게는 우선 순위가 있다
	}
}
