package collection_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Set2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		NationSet ns = new NationSet();
		int choice = 0;
		String nation = "";
		String after = "";
		
		while(true) {
			System.out.println("==국가 이름 저장 프로그램==");
			System.out.println("1.추가 2.조회 3.변경 4.삭제 0.끝내기");
			choice = Integer.parseInt(sc.nextLine());		// 띄어쓰기 가능
			
			if(choice == 1) {
				// 추가
				System.out.print("추가할 국가명을 입력>>");
				nation = sc.nextLine();
				ns.addNation(nation);
			}
			else if(choice == 2) {
				// 조회
				ns.showAll();
				
			}
			else if(choice == 3) {
				// 변경
				System.out.print("변경할 국가명을 입력>>");
				nation = sc.nextLine();
				System.out.print("변경 후 국가명을 입력>>");
				after = sc.nextLine();
				ns.changeNation(nation, after);
			}
			else if(choice == 4) {
				// 삭제
				System.out.print("삭제할 국가명을 입력>>");
				nation = sc.nextLine();
				ns.removeNation(nation);
			}
			else if(choice == 0) {
				System.out.println("프로그램 종료");
				sc.close();
				break;
			}
		}
	}
}

// 국가 이름을 보관하는 프로그램, 중복값이 없어야 한다.
class NationSet{
	// 멤버변수 private
	private HashSet<String> hs = new HashSet<>();
	
	// 메서드 public
	// 추가
	public void addNation(String nation) {
		hs.add(nation);
	}
	
	// 변경
	public void changeNation(String nation, String after) {
		hs.remove(nation);
		hs.add(after);
	}
	
	// 삭제
	public void removeNation(String nation) {
		hs.remove(nation);
	}
	
	// 전체조회
	public void showAll() {
		Iterator<String> iter = hs.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}