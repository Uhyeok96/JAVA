package ch02;

public class ShortExam {

	public static void main(String[] args) {
		// short은 char와 같이 16bit로 처리되는데 양수,음수 처리가 됨 (-32,768 ~ 32,767 까지 표현)
		
		short sh1 = -32768; // Type mismatch: cannot convert from int to short
		int sh2 = -32769; 
		short sh3 = 32767; // Type mismatch: cannot convert from int to short
		int sh4 = 32768; 
		
		System.out.println(sh1);
		System.out.println(sh2);
		System.out.println(sh3);
		System.out.println(sh4);
		
		short sh5 = -10000;
		int sh6 = -10000;
		short sh7 = 30000; // int와 동일하게 40000을 입력하면 오류 발생.(범위 초과) Type mismatch: cannot convert from int to short
		int sh8 = 40000;
		
		System.out.println(sh5);
		System.out.println(sh6);
		System.out.println(sh7);
		System.out.println(sh8);
		
		

	}

}
