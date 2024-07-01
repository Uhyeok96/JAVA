package ch02;

public class CharExam {

	public static void main(String[] args) {
		// 유니코드는 0~65535 숫자에 글자테이블을 매핑하여 문자를 출력해준다.
		// char는 2byte처리가 되며 작은 따옴표로 처리 해야 한다.
		
		char c1 = 75;
		char c2 = 105;
		char c3 = 109;
		System.out.print(c1);
		System.out.print(c2);
		System.out.print(c3);
		
		char c4 = 87;
		char c5 = 111;
		char c6 = 111;
		
		char c7 = 72;
		char c8 = 121;
		char c9 = 101;
		char c10 = 111;
		char c11 = 107;
		System.out.print(c4);
		System.out.print(c5);
		System.out.print(c6);
		
		System.out.print(c7);
		System.out.print(c8);
		System.out.print(c9);
		System.out.print(c10);
		System.out.println(c11);
		
		char h1 = '\uae40' ;
		char h2 = '우';
		char h3 = '\ud601';
		
		System.out.print(h1);
		System.out.print(h2);
		System.out.println(h3);
		
		

	}

}
