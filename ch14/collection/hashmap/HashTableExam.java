package ch14.collection.hashmap;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableExam {

	public static void main(String[] args) {
		// 키보드로 입력 받은 id와 pw를 이용한 로그인 성공!!! 테스트
		
		Map<String, String> login = new Hashtable<String, String>();
		
		login.put("kkk1", "1");
		login.put("kkk2", "12");
		login.put("kkk3", "123");
		login.put("kkk4", "1234");
		login.put("kkk5", "12345"); // <id, pw>
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("아이디를 입력하세요.");
			System.out.print(">>>");
			String id = scanner.next();
			
			System.out.println("패스워드를 입력하세요.");
			System.out.print(">>>");
			String pw = scanner.next();
			
			if(login.containsKey(id)) { // 테이블에 k가 id와 같은 것을 찾음
				if(login.get(id).equals(pw)) { // id와 pw가 같은 것을 찾음
					System.out.println("로그인 성공!");
					break;
				}else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				} // 패스워드 일치 if 종료
				
			}else {
				System.out.println("입력된 id가 없습니다.");
			} // id 일치 if 종료
			
			
			
			
		}
		
		

	}

}
