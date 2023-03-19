package operator;

public class Oper7 {
	public static void main(String[] args) {
		// 삼항연산자 (외부 조건에 따라서 실행할 코드를 구분)
		// 조건 ? : 맞으면 : 틀리면;
		int num = 3 > 2 ? 3 : 2;		// 3이 2보다 크니? ==> 맞으면 3을 넣고, 틀리면 2를 넣는다
		System.out.println(num);
	}
}
