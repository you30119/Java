package array;

import java.util.Scanner;

public class Arr4 {
	public static void main(String[] args) {
		// 국가와 수도 (5개)
		/*
		 [국가별 수도]
		 대한민국의 수도는 서울입니다.
		 일본의 수도는 도쿄입니다.
		 중국의 수도는 베이징입니다.
		 미국의 수도는 워싱턴DC입니다.
		 러시아의 수도는 모스크바입니다.
		 */
		
		String contries[] = {"대한민국", "일본", "중국", "미국", "러시아"};
		String cities[] = {"서울", "도쿄", "베이징", "워싱턴DC", "모스크바"};
		
		System.out.println("[국가별 수도]");
		
		for(int i = 0; i < contries.length; i++) {
			System.out.println(contries[i]+"의 수도는 "+cities[i]+"입니다.");
		}
		
		// 사용자 입력으로 국가를 받아서
		// 해당 국가의 수도를 알려주는 프로그램 만들어보세요
		/*
		 수도를 알고자하는 국가의 이름을 입력하세요>>
		 대한민국 ==> 서울
		 일본 ==> 도쿄
		 */
		
		// 같은 문자열을 찾으면 해당 i(방번호)를 백업
		// 백업한 방번호를 통해서 수도를 출력
		
		Scanner sc = new Scanner(System.in);
		
		String find = "";
		int backup = -1;		// 0이 아닌 다른 숫자(예: -1)로 하는 이유 : 배열이 0번방부터 시작해서 버그발생될 수 있음, 겹치는 부분 안되게 사용
		System.out.print("수도를 알고자 하는 국가의 이름을 입력하세요>>");
		find = sc.next();
		
		// 해당하는 위치를 찾는다
		for(int i = 0; i < contries.length; i++) {
			if(find.equals(contries[i])) {		// ==은 버그가 있음, .equals 사용(find와 contries[i]가 같은지 비교)
				backup = i;	
				break;
			}	
		}
		if(backup == -1) {
			// 못찾았다
			System.out.println("해당 국가가 없습니다.");
		}
		else {
			// 찾게된 경우
			System.out.println(contries[backup]+"의 수도는 "+cities[backup]+"입니다.");
			
		}
		

		
	}
}
