package polymorphism;

import java.util.Scanner;

public class PolyPet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int select = -1, type = -1;
//		Dog dog_list[] = new Dog[20];
//		int dog_count = 0;
//		Cat cat_list[] = new Cat[20];
//		int cat_count = 0;
		// 항목이 추가할 때마다 전반적으로 프로그램이 수정됨 ==> 다형성(틀 제공, 자료형을 통일)
		// 자료형이 통일되면 객체가 추가될 필요가 없음
		Pet pet_list[] = new Pet[60];
		int pet_count = 0;
		
		while(select != 0) {
			System.out.println("===메뉴===");
			System.out.println("1.추가 2.울기 3.먹기 0.종료");
			select = Integer.parseInt(sc.nextLine());		// 문자열 -> int 바꿔줌
			
			if(select == 1) {
				System.out.println("1:개, 2:고양이, 3:새?");
				type = Integer.parseInt(sc.nextLine());		// 추가항목 선택
				if(type == 1) {
					// 개 추가
					pet_list[pet_count++] = new Dog();		// 배열에 추가
					System.out.println("개를 추가했습니다.");
				}
				else if(type == 2) {
					// 고양이 추가
					pet_list[pet_count++] = new Cat();
					System.out.println("고양이를 추가했습니다.");
				}
				else if(type == 3) {
					// 새 추가
					pet_list[pet_count++] = new Bird();
					System.out.println("새를 추가했습니다.");
				}
			}else if(select == 2) {
				// 울기
				for(int i=0;i<pet_count;i++) {
					pet_list[i].울기();
				}
				
			}else if(select == 3) {
				// 먹기
				for(int i=0;i<pet_count;i++) {
					pet_list[i].먹기();
				}
				
			}
		}
	}
}

class Cat implements Pet{		// 고양이
	public void 울기() {
		System.out.println("야옹");
	}
	public void 먹기() {
		System.out.println("츄르");	
	}		
	
}

class Dog implements Pet{		// 강아지
	public void 울기() {
		System.out.println("멍멍");
	}
	public void 먹기() {
		System.out.println("개껌");
	}		
	
}

class Bird implements Pet{		// 새
	public void 울기() {
		System.out.println("짹짹");
	}
	public void 먹기() {
		System.out.println("모이");
	}		
	
}
