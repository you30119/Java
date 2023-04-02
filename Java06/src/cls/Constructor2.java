package cls;

public class Constructor2 {
	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 20);			// 기본 생성자를 안 만들어놔서 무조건 입력
		Person p2 = new Person("유관순", 19);
		
		PersonView pv1 = new PersonView(p1);			// 기본 생성자를 오버로딩하면 입력안해도 가능 		// 클래스명 객체명 = new 생성자명();
		PersonView pv2 = new PersonView();
		
		pv1.info();		// info : 들어온 값을 저장하고 정보출력
		
		pv2.info(p2);			// info : 바로 정보출력
	}
}

class Person{
	// 멤버변수(private) : 이름, 나이
	private String name;
	private int age;
	
	// 생성자(public) (생성자 통해서 멤버변수 초기화)
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 게터세터(public)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

class PersonView{
	private Person person;	// 멤버변수

	// person 초기화 목적
	public PersonView(Person person) {
		this.person = person;
	}
	
	// 기본 생성자 오버로딩
	public PersonView() {};		// PersonView pv2 = new PersonView(); 처럼 괄호 안을 비워놓을 수 있음
	
	// 메서드(멤버변수 출력용)
	public void info() {
		System.out.println("이름: "+person.getName()+", 나이: "+person.getAge());
	}
	
	// 메서드 오버로딩
	public void info(Person person) {
		this.person = person;
		System.out.println("이름: "+person.getName()+", 나이: "+person.getAge());
	}
}