package ch04;

import java.util.Scanner;

public class SsnExam02 {

	public static void main(String[] args) {
		// 주민등록번호 7번째 자리 숫자로 성별 구분하기 연습
		
		Scanner ssn = new Scanner(System.in);
		System.out.print("주민등록번호를 입력해주세요 (ex:960306-2154879) : ");
		String ssn1 = ssn.next();
		
		char ssn7 = ssn1.charAt(7);
		//System.out.println("검증 : " + ssn7);
		
		switch(ssn7) {
		case '1' : case '3' : case '5' : case '7' :
			System.out.println("당신은 남자입니다.");
			break;
		case '2' : case '4' : case '6' : case '8' :
			System.out.println("당신은 여자입니다.");
			break;
		
		default : 
			System.out.println("입력 오류입니다. 번호를 다시 입력해주세요");
			
		} // switch 종료

	} //main 종료

} // class 종료
