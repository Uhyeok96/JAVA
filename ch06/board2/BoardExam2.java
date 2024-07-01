package ch06.board2;

import java.util.Scanner;

public class BoardExam2 {
	public static Scanner input = new Scanner(System.in);
	public static Member[] members = new Member[100];
	public static Board[] boards = new Board[1000];

	public static void main(String[] args) {
		// 게시판 만들기
		// 회원관리 - 회원가입, 로그인, 회원수정, 회원탈퇴
		// 게시판 - 게시물번호, 제목, 내용, 작성자, 작성일
		boolean run = true;
		while (run) {
			System.out.println("=====회원제 게시판=====");
			System.out.println("1.회원관리 | 2.게시판 | 3.종료");
			int select = input.nextInt();
			switch (select) {
			case 1:
				// System.out.println("회원관리 메뉴로 진입합니다.");
				Member member = new Member();
				member.menu(input, members);
				break;
			case 2:
				System.out.println("게시판관리 메뉴입니다.");
				break;
			case 3:
				System.out.println("종료합니다.");
				run = false;
				break;
			default:
				System.out.println("1~3사이의 번호를 입력해주세요.");
			} // switch 종료
		} // while 종료

	} // main() 종료

} // class 종료
