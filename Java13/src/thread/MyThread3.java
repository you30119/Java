package thread;

public class MyThread3 {
	public static void main(String[] args) {
		// 객체화 2개
		Threading1 t1 = new Threading1();
		Threading2 t2 = new Threading2();
		
		// start() 2개
		t1.start();
		t2.start();
	}
}

// 클래스 2개를 생성해서 쓰레드를 각각 상속받고
// 반복문을 100번 돌려서 동시에 0.5초마다 출력
// 1. 쓰레드1
// 2. 쓰레드2
class Threading1 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("쓰레드1");
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Threading2 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("쓰레드2");
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}