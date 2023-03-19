package operator;

// 파일명 바꾸려면 파일 클릭하고 F2		반드시 일괄수정해야함
public class Oper1 {
	public static void main(String[] args) {
		// 프로그래밍은 기본적으로
		// 위에서 아래로, 왼쪽에서 오른쪽으로 진행됨
		int 숫자1 = 3;		// 대입연산자 = : 오른쪽에 있는 값을 왼쪽에 있는 공간에 담음
		int 숫자2 = 2;
		System.out.println(숫자1 - 숫자2 * 숫자2); 	// 연산 우선순위에 의해서 곱하기 먼저 한 후 빼기를 한다
		System.out.println((숫자1 - 숫자2) * 숫자2);   // 괄호가 우선순위가 제일 높다
		
		System.out.println(8 / 4 / 2);
		System.out.println(8/ (4 / 2));
		
		// 지금 자료형이 int (소숫점 없는 숫자)이기 때문에
		// 나누기를 한 다음 소숫점은 삭제 됨
		System.out.println(3 / 2); 		// 1.5(x), 1(o)
		
		System.out.println(3 / 2.0); 	// 소숫점 있는 숫자로 계산해야 소숫점 있는 숫자로 나옴
	}
}
