package extend;

public class Ex1 {
	public static void main(String[] args) {
		Human 홍씨 = new Human("홍길동", 16, false);
		홍씨.talk();
		홍씨.eat();
		
		HumanEx 박씨 = new HumanEx("박첨지", 18, true);
		박씨.talk();
		박씨.eat();
		
		HumanDeco 이씨 = new HumanDeco("이이", 18);
		이씨.age();
	}
	// 이때, 원본에 버그가 발생해서 수정해야 하는 경우
	// 1번 수정작업 필요 ==> 3번 수정작업 필요
	// 실수를 할 확률이 높아짐
	
	// ==> 복사 붙여넣기를 했기 때문에 일이 많아지고 실수 증가
	// ==> '사람이' 복사 붙여넣기를 했기 때문에 문제 발생
	// ==> 컴퓨터가 알아서 복사 붙여넣기하게 한다 (상속)
	
}

// 사람(Human) 클래스
class Human{
	// name, age
	private String name;
	private int age;
	private boolean gender;		// 성별 (남:false, 여:true)
	
	// 생성자로 정보 채워넣기
	Human(String name, int age, boolean gender){
		System.out.println("생성!");
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	// talk, walk, eat
	public void talk() {
		System.out.println(name+"이(가) 말합니다."+gender);
	}
	
	public void walk() {
		System.out.println(name+"이(가) 걷습니다."+gender);
	}
	
	public void eat() {
		System.out.println(name+"이(가) 밥을 먹습니다."+gender);
	}
}

// Human클래스에서 이름 옆에 나이 추가한 클래스
class HumanEx{
	// name, age
	private String name;
	private int age;
	private boolean gender;
	
	// 생성자로 정보 채워넣기
	HumanEx(String name, int age, boolean gender){
		System.out.println("생성!");
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	// talk, walk, eat
	public void talk() {
		System.out.println(name+"("+age+")"+"이(가) 말합니다.");
	}
	
	public void walk() {
		System.out.println(name+"("+age+")"+"이(가) 걷습니다.");
	}
	
	public void eat() {
		System.out.println(name+"("+age+")"+"이(가) 밥을 먹습니다.");
	}
}

class HumanDeco{
	// name, age
	private String name;
	private int age;
	private boolean gender;
	
	// 생성자로 정보 채워넣기
	HumanDeco(String name, int age){
		System.out.println("생성!");
		this.name = name;
		this.age = age;
	}
	
	// talk, walk, eat, age
	public void talk() {
		System.out.println("=="+name+"이(가) 말합니다.");
	}
	
	public void walk() {
		System.out.println("=="+name+"이(가) 걷습니다.");
	}
	
	public void eat() {
		System.out.println("=="+name+"이(가) 밥을 먹습니다.");
	}
	
	public void age() {
		System.out.println("=="+name+"의 나이는 "+age+"살 입니다.");
	}
}