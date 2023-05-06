package multiThreading;

public class MyThread6 {
	public static void main(String[] args) {
		MyModel mm = new MyModel();
		
		MyThreading4 mt4 = new MyThreading4(mm);
		MyThreading3 mt3 = new MyThreading3(mm);
		MyThreading5 mt5 = new MyThreading5(mm);
		
		mt3.start();
		
		try {
			mt3.join();			// mt3의 실행을 보장
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		mt4.start();
		
		try {
			mt4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		mt5.start();
		
	}
}

// 쓰레드 3개를 만든 다음
// join을 통해서
// 첫번째의 쓰레드가 먼저 수행된 다음
// 나머지 쓰레드가 수행되게 하기
class MyThreading3 extends Thread{
	MyModel mm;
	
	public MyThreading3(MyModel mm) {
		this.mm = mm;
	}
	
	@Override
	public void run() {
		mm.list.add("안녕!");
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mm.list.add("반갑!");
	}
}

class MyThreading4 extends Thread{
	MyModel mm;
	
	public MyThreading4(MyModel mm) {
		this.mm = mm;
	}
	
	@Override
	public void run() {
		for(String str : mm.list) {
			System.out.println(str);
		}	
	}
}

class MyThreading5 extends Thread{
	MyModel mm;
	
	public MyThreading5(MyModel mm) {
		this.mm = mm;
	}
	
	@Override
	public void run() {
		mm.list.set(0, "반갑!");
		
		System.out.println("쓰레드5");
		
		for(String str : mm.list) {
			System.out.println(str);
		}
	}
}