package ch04;

import java.util.Scanner;

public class JoinSwitchExam {

	public static void main(String[] args) {
		// 조건문을 활용하여 회원가입 연습
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("회원 가입을 하시겠습니까?" + "\n" + "(회원 가입 하시려면 yes를 입력해주세요) : ");
		String member = sc.next();
		if(member.equalsIgnoreCase("yes")) { // 소문자, 대문자 상관없이 yes 입력시 아이디,비밀번호 입력 가능
			System.out.println("\n" + "회원 가입을 진행해주세요.");
			
			System.out.print("ID : ");
			String id = sc.next();
			
			System.out.print("PASSWORD : ");
			String pass = sc.next();
			
			char passTr = pass.charAt(0);
			
			
			switch(passTr) {
			case '0' : case '1' : case '2' : case '3' : case '4' : case '5' : case '6' : case '7' : case '8' : case '9' :
				System.out.println("\n" + "회원가입이 완료되었습니다." + "\n" + "회원님의 정보를 입력해주세요"); // 비밀번호 첫번째 자리가 숫자일 경우 회원가입 완료
				break;
				
				default :
					System.out.println("비밀번호 첫번째 자리는 숫자를 입력해주세요."); // 비밀번호 첫번째 자리가 숫자가 아닐 경우 재입력 요청
			} // switch 종료
			
			System.out.print("/n" + "주민등록번호를 입력해주세요 (ex 960101-1234567) :  "); // 주민번호 7번째 자리로 성별 정보 추가하기
			String ssn = sc.next();
			
			char ssn1 = ssn.charAt(7);
			
			switch(ssn1) {
			case '1' : case '3' : case '5' : case '7' :
				System.out.println("남성 회원입니다.");
				break;
			case '2' : case '4' : case '6' : case '8' :
				System.out.println("여성 회원입니다.");
				break;
				
				default :
					System.out.println("번호를 잘못 입력하셨습니다. 다시 입력해주세요.");
			}
			
			
			
		}else {
			System.out.println("감사합니다. 안녕히 가십시오.");
		} // if 종료
		
				
		
		


	} // main 종료

} // class 종료
