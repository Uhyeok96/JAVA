package ch04;

import java.util.Scanner;

public class SSNExam {

	public static void main(String[] args) {
		// 주민번호 7번째 글자를 입력 받아 남여 파악용
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("주민번호 7번째 숫자 입력 : ");
		int ssn = input.nextInt();
		
		if(ssn>8 || ssn<1) {
			System.out.println("입력 오류입니다.");
		}else if(ssn%2==1 && ssn<=8) { 
			System.out.println("당신의 성별은 : 남");
		}else if(ssn%2==0 && ssn<=8) {
			System.out.println("당신의 성별은 : 여");
		}else {
			
		}
		
		
		

	}

}
