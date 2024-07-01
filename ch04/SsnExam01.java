package ch04;

import java.util.Scanner;

public class SsnExam01 {

	public static void main(String[] args) {
		// 주민등록번호로 성별구별과 나이, 태어난 계절 찾기
		
		System.out.print("주민등록번호를 입력해주세요(-생략) : ");
		Scanner input = new Scanner(System.in);
		
		String ssn = input.next();
		
		char ssn1 = ssn.charAt(6);
		int num = Character.getNumericValue(ssn1);
		
		
		if (num<0 || num>8) {
			System.out.println("오류입니다. 다시 입력해주세요.");
		}else if (num%2==0) {
			System.out.println("당신의 성별은 여자입니다.");
		}else if (num%2==1){ 
			System.out.println("당신의 성별은 남자입니다.");
		}
		
		int year = Integer.parseInt(ssn.substring(0, 2));
		
		if (num==1 || num==2 || num==5 || num==6) { 
			System.out.println("당신의 나이는 " + (2024-(1900+year)) + "세 입니다.");
		}else if (num==3 || num==4 || num==7 || num==8) {
			System.out.println("당신의 나이는 " + (2024-(2000+year)) + "세 입니다.");
		}else {
			System.out.println("오류입니다. 다시 입력해주세요.");
		}
		
		
		
		

	}

}
