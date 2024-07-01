package ch04;

import java.util.Scanner;

public class LottoExam {

	public static void main(String[] args) {
		// 정수 6개의 값을 입력받고 랜덤으로 6개의 값을 생성
		// 몇개가 맞았는지 파악
		
		Scanner input = new Scanner(System.in);
		System.out.println("로또 번호 1~45사이 숫자를 입력해주세요.");
		
		int mynum1 = input.nextInt();
		System.out.println("첫번째 번호 : " + mynum1);
		
		int mynum2 = input.nextInt();
		System.out.println("두번째 번호 : " + mynum2);
		
		int mynum3 = input.nextInt();
		System.out.println("세번째 번호 : " + mynum3);
		
		int mynum4 = input.nextInt();
		System.out.println("네번째 번호 : " + mynum4);
		
		int mynum5 = input.nextInt();
		System.out.println("다섯번째 번호 : " + mynum5);
		
		int mynum6 = input.nextInt();
		System.out.println("여섯번째 번호 : " + mynum6);
		
		int comnum1 = (int)(Math.random() * 45) + 1;
		int comnum2 = (int)(Math.random() * 45) + 1;
		int comnum3 = (int)(Math.random() * 45) + 1;
		int comnum4 = (int)(Math.random() * 45) + 1;
		int comnum5 = (int)(Math.random() * 45) + 1;
		int comnum6 = (int)(Math.random() * 45) + 1;
		
		int x = 0;
		
		if (mynum1==comnum1 || mynum1==comnum2 || mynum1==comnum3 || mynum1==comnum4 || mynum1==comnum5 || mynum1==comnum6) {
			++x;
		}else if (mynum2==comnum1 || mynum2==comnum2 || mynum2==comnum3 || mynum2==comnum4 || mynum2==comnum5 || mynum2==comnum6) {
			++x;
		}else if (mynum3==comnum1 || mynum3==comnum2 || mynum3==comnum3 || mynum3==comnum4 || mynum3==comnum5 || mynum3==comnum6) {
			++x;
		}else if (mynum4==comnum1 || mynum4==comnum2 || mynum4==comnum3 || mynum4==comnum4 || mynum4==comnum5 || mynum4==comnum6) {
			++x;
		}else if (mynum5==comnum1 || mynum5==comnum2 || mynum5==comnum3 || mynum5==comnum4 || mynum5==comnum5 || mynum5==comnum6) {
			++x;
		}else if (mynum6==comnum1 || mynum6==comnum2 || mynum6==comnum3 || mynum6==comnum4 || mynum6==comnum5 || mynum6==comnum6) {
			++x;
		}
		
		System.out.println("이번 주 로또 당첨 번호는 " + comnum1 + ", " + comnum2 + ", " + comnum3 + ", " + comnum4 + ", " + comnum5 + ", " + comnum6 + "입니다!");
		System.out.print("당신의 맞힌 번호 개수 : ");
		
		if (x==0) {
			System.out.println("0개 맞히셨습니다!");
		}else if(x==1) {
			System.out.println("1개 맞히셨습니다!");
		}else if(x==2) {
			System.out.println("2개 맞히셨습니다!");
		}else if(x==3) {
			System.out.println("3개 맞히셨습니다!");
		}else if(x==4) {
			System.out.println("4개 맞히셨습니다!");
		}else if(x==5) {
			System.out.println("5개 맞히셨습니다!");
		}else if(x==6) {
			System.out.println("6개 모두 맞히셨습니다! 1등 당첨을 축하드립니다!!");
		}else {
			System.out.println("시스템 오류입니다.");
		}
		
			
		
		
		
		
		
		
		

	}

}
