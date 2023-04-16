package rand;

import java.util.Random;
import java.util.Scanner;

public class Random1 {
	public static void main(String[] args) {
		// 자바에서 랜덤을 사용하는 법
		// Math클래스 또는 Random클래스 사용
		
		MyRandom md = new MyRandom();
		md.go1();
		md.go2();
		md.go3();
		md.go4();
		
		MyRandom2 md2 = MyRandom2.getInstance();
		System.out.println(md2.go5());
	}
}

class MyRandom{
	// nextInt : 0 ~ 0.99999999 까지 랜덤 후 int로 형변환
	public void go1() {
		// 0 ~ 9 랜덤
		Random random = new Random();		// Random사용하기위해 객체화
		int result = random.nextInt(10);		// 0 ~ 9까지 랜덤 (0*10 ~ 0.9999*10)
		System.out.println(result);
	}
	
	public void go2() {
		// 100 ~ 105 랜덤
		Random random = new Random();
		int result = random.nextInt(6) + 100;		// (0*6 ~ 0.999999*6) + 100		== 100 ~ 105
		System.out.println(result);
	}
	
	public void go3() {
		// 1 ~ 10 랜덤
		Random random = new Random();
		int result = random.nextInt(10) + 1;
		System.out.println(result);
	}
	
	// Math 클래스를 사용해서 랜덤
	public void go4() {
		int result = (int)(Math.random() * 10) + 1;			// 1 ~ 10
		// random이 static이라서 객체화없이 바로 사용
		System.out.println(result);
	}
}

// 싱글턴패턴 클래스로 생성하여 사용자에게 두 수를 입력받아 그 사이에서 랜덤을 돌려 리턴해주는 메서드
// 예외처리 필요 : 첫번째 숫자에 더 큰 수를 입력했을 경우를 대비
class MyRandom2{
	// 생성자를 막기
	private MyRandom2() {}		
	
	// 객체
	private static MyRandom2 instance;
	
	// 객체화를 진행할 메서드
	public static MyRandom2 getInstance() {
		if(instance == null) {
			instance = new MyRandom2();
		}
		return instance;
	}
	
	// 멤버변수, 메서드
	public int go5() {
		// 숫자 2개 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요>>");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요>>");
		int num2 = sc.nextInt();
		
		// 첫번째 숫자가 더 크면 교체
		int temp;
		if(num1>num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		// 랜덤 돌리기
		Random random = new Random();
		int result = random.nextInt(num2-num1+1) + num1;
		
		// 정리
		sc.close();		// 지금은 메인이 금방끝나서 안해도 됨
		return result;
	}
	
}