package extend;

public class Ex5 {
	public static void main(String[] args) {
		MyStr ms1 = new MyStr("123");
		ms1.printStr();
		
		MyStrDeco ms2 = new MyStrDeco("123");
		ms2.printStr();
	}
}

class MyStr{
	// 멤버변수
	protected String str;
	
	// 생성자
	public MyStr(String str) {
		this.str = str;
	}
	
	public String getStr() {
		return str;
	}
	
	public void setStr(String str) {
		this.str = str;
	}
	
	public void printStr() {
		System.out.println(str);
	}
}

// MyStr 클래스를 상속받고 출력이 좀 더 꾸며진 채로 출력될 수 있게 변경
class MyStrDeco extends MyStr{
	public MyStrDeco(String str) {
		super(str);		// 부모 생성자에 매개변수가 있으면(기본 생성자 없으면) 자식 생성자에서 사용을 해줘야 함
	}
	
	public void printStr() {
		System.out.println("=="+str+"==");
	}
}

