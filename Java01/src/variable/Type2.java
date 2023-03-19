package variable;

public class Type2 {
	public static void main(String[] args) {
		// 변수를 활용해서
		// 이름, 출생년도, 키
		
		// 예시의 ㅇㅇㅇ을 변수로 사용
		/*
		 이름 : ㅇㅇㅇ
		 출생년도 : ㅇㅇㅇㅇ년 
		 키 : ㅇㅇㅇ.ㅇㅇcm
		 */
		
		String name = "만돌이";
		int year = 2014;
		double height = 50.51;		
		// java는 성능을 중요하게 생각하지 않아서 소숫점자리까지 나타내는데 사용을 하지않음	(C언어랑 다른 부분)
		// 50.50으로 나타내고 싶으면 String 사용하기
		
		System.out.println("이름 : "+name);
		System.out.println("출생년도 :" +year+"년");
		System.out.println("키 : "+height+"cm");
	}
}
