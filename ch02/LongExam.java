package ch02;

public class LongExam {

	public static void main(String[] args) {
		// long 타입은 int 타입의 2배인 64bit 값을 갖는다.
		// 대부분 금융, 은행, 증권 등 돈에 관련된 변수 타입으로 사용된다.
		// 초기값 입력시 int와 차이를 주기 위해 숫자 뒤에 l,L을 붙인다. (대문자 선호)
		
		long var1 = 10 ; // int 범위에선 'L' 생략 가능
		long var2 = 20L ;
		long var3 = 22222222222222222L ; // int 범위 초과시 'L'은 필수
		// The literal 222222222222 of type int is out of range
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		

	}

}
