package collection_;

import java.util.ArrayList;
import java.util.Scanner;

public class Food {
	public static void main(String[] args) {
		// 1.추가 2.변경 3.삭제 4.전체보기 0.끝내기
		// 음식점 항목을 관리하는 프로그램 만들기
		// 기본메뉴 : 김밥, 떡볶이, 순대
		// 가격 : 1000, 2000, 3000
		
		FoodList arr = new FoodList();
		Scanner sc = new Scanner(System.in);
		System.out.println("==항목을 선택하세요==");
		String str = "";
		String after = "";
		int num = 0;
		int num2 = 0;
		int choice = -1;
		int choice2 = -1;
		while(true) {
			System.out.println("1.추가 2.변경 3.삭제 4.전체보기 0.끝내기");
			choice = sc.nextInt();
		
			if(choice == 1) {
				// 추가
				System.out.println("추가할 메뉴 이름은?");
				str = sc.next();
				System.out.println("추가할 메뉴의 가격은?");
				num = sc.nextInt();
				arr.addFood(str, num);
			}
			else if(choice == 2) {
				// 변경
				System.out.println("변경할 메뉴 이름은?");
				str = sc.next();
				System.out.println("변경 후 메뉴 이름은?");
				after = sc.next();
				arr.setFood(str, after);
				System.out.println("메뉴 가격을 변경하시겠습니까? 1.변경 2.변경안함");
				choice2 = sc.nextInt();
				if(choice2 == 1) {
					System.out.println("원래 가격은?");
					num = sc.nextInt();
					System.out.println("변경 후 가격은?");
					num2 = sc.nextInt();
					arr.setFoodPrice(num, num2);
				}
			}
			else if(choice == 3) {
				// 삭제
				System.out.println("삭제할 메뉴 이름은?");
				str = sc.next();
				arr.deleteFood(str);
			}
			else if(choice == 4) {
				// 전체보기
				arr.showAll();
			}
			else {
				// 끝내기
				System.out.println("종료");
				break;
			}
		}
	}
}

class FoodList{
	ArrayList<String> name = new ArrayList<>();
	ArrayList<Integer> price = new ArrayList<>();
	
	public FoodList() {
		name.add("김밥");
		name.add("떡볶이");
		name.add("순대");
		
		price.add(1000);
		price.add(2000);
		price.add(3000);
	}
	
	// 추가
	public void addFood(String str, int num) {
		name.add(str);
		price.add(num);
	}
	
	// 메뉴 이름 변경
	public void setFood(String prev, String after) {
		int number = name.indexOf(prev);
		name.set(number, after);
	}
	
	// 메뉴 가격 변경
	public void setFoodPrice(int num, int after) {
		int number = price.indexOf(num);
		price.set(number, after);
	}
	
	// 삭제
	public void deleteFood(String str) {
		int number = name.indexOf(str);
		name.remove(number);
		price.remove(number);
	}
	
	// 전체보기
	public void showAll() {
		for(int i=0;i<name.size();i++) {
			System.out.println(name.get(i)+" : "+price.get(i));
		}
	}
}