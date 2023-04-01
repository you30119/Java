package cls;

public class Method3 {
	public static void main(String[] args) {
		// MyClass6 객체화
		MyClass6 mc6 = new MyClass6();
		
		System.out.println(mc6.func());
		System.out.println(mc6.func(34));
		System.out.println(mc6.func(34, 49));
		System.out.println(mc6.func(34, 49, 99));		// 편의를 위해 괄호안에 내용을 바꿔서 다른 메서드 사용
		System.out.println(mc6.func(3.14));
	}
}

class MyClass6{
	// 클래스 안에는 변수와 베서드만 올 수 있고
	int num;
	String str;
	
	int func() {
		// 메서드 안에는 코드를 쓸 수 있다
		return 0;
	}
	
	// 메서드 오버로딩 : () 안에 내용이 달라지면 다른 메서드로 취급해 줄 수 있다.
	int func(int num1) {	// 함수 이름이 같으면 한쪽은 이름을 바꿔주는게 맞는데 ()안에 내용이 달라서 허용해줌
		return num1;
	}
	
	int func(int num1, int num2) {
		return num1 + num2;
	}
	
	int func(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	
	int func(double dnum) {
		System.out.println("실수는 정수로 변경됩니다.");
		return (int)dnum;
	}
}