package multiThreading;

public class Sync1 {
	public static void main(String[] args) {
		// 멀티쓰레드 환경에서
		// '동기화' synchronized
		// 클래스를 동기화해서 여러 쓰레드가 동시에 접근하는 것을 방지함
		// Runnable
		Toilet toilet = new Toilet();				// 화장실 (동기화된 클래스)
		Thread 홍길동 = new Thread(toilet, "홍길동");	// 사람1
		Thread 이순신 = new Thread(toilet, "이순신");	// 사람2
		
		홍길동.start();
		이순신.start();
	}
}

// 1인용 화장실... 한명이 사용하고 있으면 다른 사람들은 대기해야한다...
class Toilet implements Runnable{
	private int time;		// 10초동안 사용 (동시 사용은 불가능)
	
	@Override
	public void run() {
		synchronized(this) {		// 이 클래스는 동기화 시킴
			
			String name = Thread.currentThread().getName();		// 쓰레드 이름 받기
			System.out.println(name+" 화장실 들어감");
			for(time = 1;time<=10;++time) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println(name+" 화장실 사용중..."+time+"초");
			}
			System.out.println(name+" 화장실 나옴");
		}	// synchronized(this)
	}		// run()
}		// Toilet{}