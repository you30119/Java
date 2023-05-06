package multiThreading;

public class Sync2 {
	public static void main(String[] args) {
		DressRoom dressroom = new DressRoom();
		// 사람 3명 (Thread 3개)
		Thread 홍길동 = new Thread(dressroom, "홍길동");
		Thread 이순신 = new Thread(dressroom, "이순신");
		Thread 유관순 = new Thread(dressroom, "유관순");
		
		홍길동.start();
		이순신.start();
		유관순.start();
	}
}

// 의상탈의실
// 의류가게에서는 한 사람이 옷을 갈아입으러 탈의실에 들어가면 나올때까지 밖에서 대기를 해줘야한다
class DressRoom implements Runnable{
	private int time;
	
	@Override
	public void run() {
		synchronized(this) {
			
			String name = Thread.currentThread().getName();
			System.out.println(name+" 탈의실 들어감");
			for(time = 1;time<=10;++time) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println(name+" 탈의실 사용중..."+time+"초");
			}
			System.out.println(name+" 탈의실 나옴");
		}
	}
}