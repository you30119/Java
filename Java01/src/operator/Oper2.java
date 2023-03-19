package operator;

public class Oper2 {
	public static void main(String[] args) {
		int 국어 = 49;
		int 영어 = 40; 
		int 수학 = 60;
		
		// 합계와 평균을 구하세요
		
		/*
		 합계 : ㅇㅇㅇ점
		 평균 : ㅇㅇㅇ점
		 */
		
		int 합계 = 국어 + 영어 + 수학;
		double 평균 = 합계 / 3.0;
		
		System.out.println("합계 : "+합계);
		System.out.println("평균 : "+평균);
		System.out.printf("평균 : %.2f\n", 평균);		// 이렇게는 잘 사용안한다	
	}
}
