package ch06.board2;

import java.util.Scanner;

public class Member {
	// 회원관리 클래스 생성
	// C = 회원가입
	// R = 로그인
	// U = 회원정보수정
	// D = 회원정보탈퇴
	String id;
	String pw;
	String nickName;
	String email;

	public void menu(Scanner input, Member[] members) {
		boolean run = true;
		while (run) {
			System.out.println("-----회원관리메뉴-----");
			System.out.println("1.회원가입 | 2.로그인 | 3.정보수정");
			System.out.println("4.회원탈퇴 | 5.종료");
			System.out.print(">>>");
			int select = input.nextInt();
			switch (select) {
			case 1:
				// System.out.println("회원가입을 진행합니다.");
				Member newMember = register(input);
				// 배열에서 null을 찾아 받은 정보를 삽입
				for (int i = 0; i < members.length; i++) {
					if (members[i] == null) {
						members[i] = newMember;
						System.out.println("회원정보가 등록되었습니다.");
						break;
					} // if 종료
				} // for 종료
				break;
			case 2:
				System.out.println("로그인을 진행합니다.");
				Member loginMember = login(input, members);
				break;
			case 3:
				System.out.println("정보수정을 진행합니다.");
				break;
			case 4:
				System.out.println("회원탈퇴를 진행합니다.");
				break;
			case 5:
				System.out.println("종료합니다.");
				run = false;
				break;

			} // 회원관리메뉴 switch 종료
		} // while 종료
	} // menu() 종료

	public Member register(Scanner input) {
		System.out.println("***회원가입을 시작합니다***");
		Member newMember = new Member();
		System.out.print("id를 입력해주세요 : ");
		id = input.next();
		System.out.print("pw를 입력해주세요 : ");
		pw = input.next();
		System.out.print("nickName를 입력해주세요 : ");
		nickName = input.next();
		System.out.print("email을 입력해주세요 : ");
		email = input.next();

		return newMember;
	} // 회원가입 메서드 종료

	public Member login(Scanner input, Member[] members) {
		System.out.println("***로그인을 시작합니다***");
		Member loginMember = new Member();
		System.out.print("id : ");
		loginMember.id = input.next();
		System.out.print("pw : ");
		loginMember.pw = input.next();
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null) {
				if (members[i].id.equals(loginMember.id) && 
						members[i].pw.equals(loginMember.pw)) {
					System.out.println("로그인에 성공하였습니다.");
				}else {
					System.out.println("회원 정보가 없습니다.");
					System.out.println("로그인을 다시 시도해주세요");
				}// id,pw 비교 if 종료
			} // null 제외 찾기 if 종료
		} // for 종료

		return loginMember;
	} // 로그인 메서드 종료

	public void modify() {
		System.out.println("정보수정을 시작합니다.");
	} // 정보수정 메서드 종료

	public void delete() {
		System.out.println("회원탈퇴를 시작합니다.");
	} // 회원탈퇴 메서드 종료
}
