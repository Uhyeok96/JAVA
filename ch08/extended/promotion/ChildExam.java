package ch08.extended.promotion;

public class ChildExam {

	public static void main(String[] args) {
		
		Child ch = new Child(); // 자식 객체 생성
		
		ch.method1(); // 부모메서드
		ch.method2(); // 자식메서드
		ch.method3(); // 자식메서드
		
		Parent pr = ch;
		//Parent pr = new Child();
		System.out.println("==자동타입변환==");
		pr.method1(); // 부모메서드
		pr.method2(); // 자식메서드
		// pr.method3(); 
		// 부모 타입으로 정하면 자식 메서드 사용 안됨
		// 사용하려면 재정의를 해야 함.

	}

}
