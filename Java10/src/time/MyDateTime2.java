package time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MyDateTime2 {
	public static void main(String[] args) {
		MyDate md = new MyDate();
		
		while(true) {
			System.out.println(md.now());
			try {
				Thread.sleep(1000); // 숫자 1000 : 1초동안 프로그램 멈춤 => 1초마다 프로그램 실행
			} catch (Exception e) {
				e.printStackTrace();
			} 		
		}
	}
}

class MyDate{
	// 현재 시간을 가져오기
	// ㅇㅇㅇㅇ년 ㅇㅇ월 ㅇㅇ일 ㅇㅇ시 ㅇㅇ분 ㅇㅇ초
	public String now() {
		String str;
		Calendar cal = Calendar.getInstance();		// 컴퓨터의 시간을 받아옴
		Date date = cal.getTime();		// 형변환용
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		
		str = sdf.format(date);	
		// String str = str.format(cal.getTime()); 이렇게 간단히 쓸 수도 있다
		return str;
	}
}