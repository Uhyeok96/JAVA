package ch03;

import java.util.Scanner;

public class ScannerExam {

	public static void main(String[] args) {
		// Scanner 및 printf 출력포멧 실습
		
		Scanner input = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = input.next();
		
		System.out.print("나이 : ");
		int age = input.nextInt();
		
		System.out.print("성별 : ");
		String sex = input.next();
		
		System.out.printf("당신의 이름은 %s\n 나이는 %d\n 성별은 %s\n 입니다.\n", name, age, sex);
		
		int i = 97;
		String s = "JAVA";
		double f = 3.14f;
		System.out.printf("%d\n", i);
		System.out.printf("%o\n", i);
		System.out.printf("%x\n", i);
		System.out.printf("%c\n", i);
		System.out.printf("%5d\n", i);
		System.out.printf("%05d\n", i);
		System.out.printf("%s\n", s);
		System.out.printf("%5s\n", s);
		System.out.printf("%-5s\n", s);
		System.out.printf("%f\n", f);
		System.out.printf("%e\n", f);
		System.out.printf("%4.3f\n", f);
		System.out.printf("%04.12f\n", f);
		System.out.printf("%-4.1f\n", f);
		
		
		
		
		

	}

}
