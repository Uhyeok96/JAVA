package ch14.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayListExam {

	public static void main(String[] args) {
		// list 컬렉션은 Arraylist, vector, Linkedlist 3가지를 주로 사용한다.
		// list 컬렉션은 배열 대신 활용도가 높다. (길이가 자유롭다)
		// list<String>는 강한타입체크로 String만! 들어감
		// List<String> list = new ArrayList<String>(); -> 10개가 기본값
		
		List<String> listS = new ArrayList<String>();
		// List<String> listS = new Vector<String>(); // 메서드가 같아서 모두 사용가능
		// List<String> listS = new LinkedList<String>(); // 메서드가 같아서 모두 사용가능
		
		
		listS.add("Java"); // 0번 인덱스
		listS.add("Oracle"); // 데이터베이스
		listS.add("JDBC"); // java + db연동
		listS.add("HTML,CSS,JS"); // 프론트
		listS.add("jsp"); // java + db + 프론트
		listS.add("tomcat"); // 서버 프로그래밍 (servlet)
		listS.add("리눅스"); // 배포 서버
		listS.add(5,"servlet"); // jsp + java
		listS.add("AWS"); // 가상 배포서버
		
		int size = listS.size();
		System.out.println("총 객체수 : " + size);
		System.out.println("-----------------------");
		
		String skill = listS.get(2); // 2번 인덱스 값을 가져와 skill 변수에 넣음
		System.out.println("2번째 인덱스 값 : " + skill);
		
		listS.remove(2);
		listS.remove(2);
		listS.remove("jsp");
		listS.remove("AWS");
		
		System.out.println("-------for 전체 출력---------");
		for (int i = 0 ; i < listS.size() ; i++) {
			System.out.println(i + "번째 값 : " + listS.get(i));
		}
		
		System.out.println("-------for each 전체 출력 (index 사용 안함)---------");
		for(String str : listS) {
			System.out.println(str);
		}
		
		
		
		
		
		

	}

}
