package cls;

public class Class3 {
	public static void main(String[] args) {
		// 아빠차, 엄마차, 내차
		car father_car = new car();			// 객체화 하는 방법 꼭 기억하기
		car mother_car = new car();
		car I_car = new car();
		
		father_car.owner = "아빠";
		father_car.type = "스타랙스";
		father_car.color = "검은색";
		father_car.info();
		
		mother_car.owner = "엄마";
		mother_car.type = "모닝";
		mother_car.color = "빨간색";
		mother_car.info();
		
		I_car.owner = "나";
		I_car.type = "스파크";
		I_car.color = "흰색";
		I_car.info();			// 사용할 때 값을 담지 않고 사용하면 버그가 발생
		
	}
}

// class 자동차
// 데이터 : 차주인, 차종, 차색상
// 기능 : 차정보(주인이 누구인지, 차종은 무엇인지, 차색상은 무엇인지 안내해주는 출력)
class car{
	// 데이터를 담기 위해선 변수가 필요
	String owner;
	String type;
	String color;
	
	// 기능 제공을 위해서 메서드를 만든다
	void info() {
		System.out.println("차주인은 "+owner+"고 차종은 "+type+"이고 색상은 "+color+"입니다.");
	}
}