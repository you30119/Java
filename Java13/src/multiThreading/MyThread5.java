package multiThreading;

import java.util.Scanner;

public class MyThread5 {
	public static void main(String[] args) {
		MyModel mm = new MyModel();
		SaveList sl = new SaveList(mm);
		PrintList pl = new PrintList(mm);
		mm.list.add("sample0");
		// 만약에 하나의 쓰레드가 완료될 때까지 다른 쓰레드가 대기하고 싶으면
		// join() 메서드를 사용
		
		// 하나의 쓰레드에서는 list에 값 저장을
		sl.start();
		
		// sl쓰레드가 수행되기 전까지 다른 쓰레드는 대기 join
		try {
			sl.join();			// sl 쓰레드 끝나기 전까지 다른 쓰레드 대기
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// 다른 하나의 쓰레드에서는 전체 출력
		pl.start();
	}
}

class SaveList extends Thread{
	private MyModel mm;
	
	public SaveList(MyModel myModel) {		// 생성자
		mm = myModel;		// 객체의 주소를 전달받는다
	}			// 생성자()
	
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		String str = "";
		while(true) {
			if(str.equals("0")) {
				break;
			}
			System.out.println("저장할 항목을 입력하세요(0을 입력하면 종료)>>");
			str = sc.nextLine();
			mm.list.add(str);			// ArrayList에 추가
		}
		sc.close();
	}		// run()
}		// SaveList{}

class PrintList extends Thread{
	private MyModel mm;
	
	public PrintList(MyModel mm) {
		this.mm = mm;
	}		// 생성자 Constructor()
	
	@Override
	public void run(){
		for(String str : mm.list) {
			System.out.println(str+" ");
		}
	}		 	// run()
}			// PrintList{}