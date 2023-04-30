package review;

// import : 다른 패키지에 있는 클래스를 가져다 쓰겠다. (프로그램 무게를 줄이기 위함)
import java.util.ArrayList;

public class Review {
	public static void main(String[] args) {
		// 객체화
		MyReview mr = new MyReview();
		mr.go();
	}
}

class MyReview{
	// 멤버변수 private
	String str1;
	String str2;
	String str3;
	String str[] = new String[3];		// 고정배열 (삽입, 삭제, 정렬에 대해서 불편)
	ArrayList<String> list = new ArrayList<>();			// 동적배열 
	
	// 메서드 public
	public void go() {
		// 추가
		list.add("String1");		// ["String1"]
		list.add("String2");		// ["String1", "String2"]
		
		// 변경
		list.set(0, "String0");		// ["String0", "String2"]
		
		// 삽입
		list.add(1, "String1");		// ["String0", "String1", "String2"]
		
		// 방번호 알아내기
		int idx = list.indexOf("String1");		// String1 값이 들어있는 방번호를 return
		
		// 제거
		list.remove(1);		// 1번방 값 삭제 ["String0", "String2"]
		
		// 조회
		list.get(0);		// String0
		
		// 전체 조회는 for문 + size + get 사용하기
		for(int i=0;i<list.size();i++) {
			String getStr = list.get(i);	// 중괄호 안에서 만든 변수는 중괄호가 끝나면 사라짐
			System.out.println(getStr);
		}
		
	}
}