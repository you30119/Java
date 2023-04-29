package collection_;

import java.util.ArrayList;
import java.util.Scanner;

public class List2 {
	public static void main(String[] args) {
		ArrayList2 arr2 = new ArrayList2();
		Scanner sc = new Scanner(System.in);
		arr2.setMenuPrice(); 		// 기본메뉴 4개 추가
		
		System.out.println("==항목을 선택하세요==");
		System.out.println("1.추가 2.변경 3.삭제 4.전체보기 0.나가기");
		int choice = sc.nextInt();
		String str ="";
		
		switch(choice) {
		case 0:
			System.out.println("종료");
			break;
		case 1:
			System.out.println("추가할 메뉴를 입력하세요>>");
			str = sc.next();
			arr2.addMenuPrice(str);		// 구현 (값은 1000원으로 통일)
			arr2.printMenu();
			break;
		case 2:
//			System.out.println("변경할 메뉴를 입력하세요>>");
//			str = sc.next();
//			arr2.modifyMenuPrice(str);
//			break;
		case 3:
//			System.out.println("삭제할 메뉴를 입력하세요>>");
//			str = sc.next();
//			arr2.deleteMenuPrice(str);
//			break;
		case 4:
			arr2.printMenu();
			break;
		}
		
	}
}

class ArrayList2{
	// ArrayList 2개를 통해서 진행해보세요
	ArrayList<String> menu = new ArrayList<>();
	ArrayList<Integer> price = new ArrayList<>();
	
	public void setMenuPrice() {
		// 라면, 김밥, 떡볶이, 순대
		// 1000, 2000, 3000, 4000
		
		menu.add("라면");
		menu.add("김밥");
		menu.add("떡볶이");
		menu.add("순대");
		
		price.add(1000);
		price.add(2000);
		price.add(3000);
		price.add(4000);
	}
	
	public void printMenu() {
		// 모든 메뉴를 출력
		// 예) 라면 : 1000원
		for(int i=0;i<menu.size();i++) {
			System.out.println(menu.get(i)+" : "+price.get(i));
		}
	}
	
	public void addMenuPrice(String str) {
		menu.add(str);
		price.add(1000);
		
	}
}