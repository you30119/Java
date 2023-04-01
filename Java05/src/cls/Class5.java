package cls;

public class Class5 {
	public static void main(String[] args) {
		MyClass9 m1 = new MyClass9();
		m1.setVar(3, 4, "안녕", 3.14);		// this를 사용
		
		MyClass9 m2 = new MyClass9();
		m2.num1 = 11;
		m2.num2 = 22;
		m2.str = "반갑";
		m2.dnum = 123.123;
		
		m1.정보보기();
		m2.정보보기();
		
		// 모든 메서드에는 this 변수가 숨겨져 있고 (일반함수와의 차이)
		// this.을 통해서 클래스의 멤버변수와 메서드를 사용할 수 있다.
	}
}

class MyClass9{
	int num1;			// 멤버변수
	int num2;
	String str;
	double dnum;
	
	void 정보보기() {
		System.out.println(""+num1+num2+str+dnum);		
		// ""를 쓴 이유 : 그냥 쓰게 되면 num1과 num2가 합쳐진 숫자가 사용되기때문에 문자형태로 사용하기 위해 앞에 ""를 붙여서 형변환을 해준 것
	}
	
	void setVar(int num1, int num2, String str, double dnum) {
		int var = 0;		// 지역변수나 매개변수는 함수가 실행되고 삭제됨
		// 그래서 멤버변수에 백업
		this.num1 = num1;
		this.num2 = num2;
		this.str = str;
		this.dnum = dnum;
	}
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public double getDnum() {
		return dnum;
	}
	public void setDnum(double dnum) {
		this.dnum = dnum;
	}
	
	
}