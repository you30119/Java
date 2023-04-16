package time;

public class StaticVar {
	// 이렇게 하면 안됨. 싱글턴패턴으로 바꾸세요
	static String str1 = "안녕하세요";
	static String str2 = "반갑습니다";
	static int num1 = 314;
	static int nums[] = new int[100];			// 성능 굉장히 느려짐
	
	public static void main(String[] args) {
		Test.print();
		
		Singleton singleton = Singleton.getInstance();		// static메서드
		singleton.setStr("안녕하세요 싱글턴입니다");
		System.out.println(singleton.getStr());
	}
	
}

class Test{
	public static void print() {
		System.out.println(StaticVar.str1);
		StaticVar.nums[0] = 0;
		StaticVar.nums[1] = 1;
		StaticVar.nums[2] = 2;
		
		System.out.println(StaticVar.num1);
	}
}