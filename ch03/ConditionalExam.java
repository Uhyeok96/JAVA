package ch03;

import java.util.Scanner;

public class ConditionalExam {

	public static void main(String[] args) {
		// 3항 연산자는 if를 간단히 처리하기 위해 활용된다.
		// (조건식) ? 참 : 거짓 ;
		
		int score = 85 ;
		char grade = (score > 90) ? 'A' : 'B' ;
		System.out.println(score + "\t 점은 \n" + grade + "\t 등급 입니다.");
		
		int score1 = 0 ;
		Scanner input = new Scanner(System.in) ;
		
		System.out.print("점수를 입력하세요 : ");
		score1 = input.nextInt();
		
		char grade1 = (score1 >= 90) ? 'A' : (score1 >= 85) ? 'B' : (score1 >= 80) ? 'C' : (score1 >= 75) ? 'D' : 'F' ;
		
		System.out.println(score1 + "점은 " + grade1 + "등급 입니다.");
		
		
		
				

	}

}
