package cls;

public class Method4 {
	public static void main(String[] args) {
		MyClass7 mc7 = new MyClass7();		// 객체화
		
		System.out.println(mc7.더하기(1,2));
		System.out.println(mc7.빼기(1,2));
		System.out.println(mc7.곱하기(1,2));
		System.out.println(mc7.나누기(1,2));
		System.out.println(mc7.나누기(1,0));
		System.out.println(mc7.나머지구하기(5,2));
		System.out.println(mc7.기호안쓰고나머지구하기(1,2));
		System.out.println(mc7.기호안쓰고나머지구하기(5,2));
	}
}

class MyClass7{
	// 더하기 +
	int 더하기(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	// 빼기 - 
	int 빼기(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}
	
	// 곱하기 *
	int 곱하기(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}
	
	// 나누기 / (0으로 나누면 결과를 0으로)
	double 나누기(int num1, int num2) {
		double result;
		if(num2 == 0) {
			result = 0;
			}
		else {
			result = (double)num1 / num2;
		}
		return result;
	}
	
	// 나머지구하기
	int 나머지구하기(int num1, int num2) {
		int result = num1 % num2;
		return result;
	}
	
	// %기호 안쓰고 나머지 구하기 만들어보기
	int 기호안쓰고나머지구하기(int num1, int num2) {
		int result = 0;
		
		// 방법1 
		// result = num1 - ((num1/num2)*num2);
		
		// 방법2
		result = num1;
		while(true) {
			if(num1 < num2) {
				break;
			}
			result -= num2;
		}
		
		return result;
	}
	
}