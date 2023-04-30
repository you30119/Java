package collection_;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Map2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1.추가 2.변경 3.삭제 4.조회 0.끝내기
		
		MyDictionary dic = new MyDictionary();		// 생성자에서 flower:꽃, sea:바다, new:새로운
		String word1 = "", word2 = "";
		int choice = 0;
		
		while(true) {
			System.out.println("1.추가 2.변경 3.삭제 4.조회 0.끝내기");
			choice = Integer.parseInt(sc.nextLine());
			if(choice == 1) {
				// 추가
				System.out.print("추가할 영단어를 입력하세요>>");
				word1 = sc.nextLine();
				System.out.print("추가한 영단어의 한국어 뜻을 입력하세요>>");
				word2 = sc.nextLine();
				dic.addDictionary(word1, word2);
			}
			else if(choice == 2) {
				// 변경
				System.out.print("뜻을 변경할 영단어를 입력하세요>>");
				word1 = sc.nextLine();
				System.out.print("변경할 한국어 뜻을 입력하세요>>");
				word2 = sc.nextLine();
				dic.changeDictionary(word1, word2);
			}
			else if(choice == 3) {
				// 삭제
				System.out.print("삭제할 영단어 또는 한국어 뜻을 입력하세요>>");
				word1 = sc.nextLine();
				dic.deleteDictionary(word1);
			}
			else if(choice == 4) {
				// 조회
				dic.showAll();
			}
			else if(choice == 0) {
				System.out.println("끝내기");
				sc.close();
				break;
			}
		}
		
	}
}

// 한영사전 만들기
// 생성자에 단어 3개정도
class MyDictionary{
	// 멤버변수 private
	private HashMap<String, String> word = new HashMap<>();
	
	//3개단어 미리 저장 (생성자)
	public MyDictionary() {
		word.put("flower", "꽃");
		word.put("sea", "바다");
		word.put("new", "새로운");
	}
	
	// 메서드 public
	// 추가
	public void addDictionary(String word1, String word2) {
		word.put(word1, word2);
	}
	
	// 변경
	public void changeDictionary(String word1, String word2) {		// 덮어쓰기
		word.put(word1, word2);
	}
	
	// 삭제
	public void deleteDictionary(String word1) {
		if(word.containsKey(word1)) {
			word.remove(word1);			// 키값을 찾아서 삭제
		}
		else if(word.containsValue(word1)) {
			// 값을 통해서 해당하는 키의 위치를 찾고 키값으로 삭제
			String target = "";
			Set<String> set = word.keySet();
			
			for(String e : set) {
				if(word.get(e).equals(word1)) {
					target = e;
				}
			}
			word.remove(target);
		}
	}
	
	// 조회
	public void showAll() {
		Set<String> set = word.keySet();
		for(String e : set) {
			System.out.print(e+" : ");
			System.out.println(word.get(e));
		}
	}
	
}