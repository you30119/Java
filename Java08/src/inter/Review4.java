package inter;

public class Review4 implements Review3{
	// 인터페이스를 받으면 클래스명에 빨간 밑줄이 생성됨
	// 클래스명 밑의 빨간 밑줄에 마우스를 갖다대고
	// 첫번째 파란 항목을 클릭(Add unimplemented methods)

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println(str);
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		System.out.println("재정의");
	}
	
	public static void main(String[] args) {
		System.out.println(str2); 		// static은 바로 쓸 수 있음
		
		Review4 review4 = new Review4();
		review4.test1();
		review4.test2();
	}
}

//extends : 하나만 가능
//implements : 여러개 가능