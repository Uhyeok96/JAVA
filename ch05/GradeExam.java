package ch05;

import java.util.Scanner;

public class GradeExam {
	// 학생 이름 테이블 -> String[]
	// 점수 테이블 -> byte[]
	// 총점 테이블 -> int[]
	// 평균 테이블 -> double[]

	public static void main(String[] args) {
		// 주메뉴 구현용
		Scanner mainSC = new Scanner(System.in);
		System.out.println("초기작업 : 학생수를 입력하세요");
		int count = mainSC.nextInt(); // 학생수 등록완료
		String[] name = new String[count];
		byte[] engScores = new byte[count];
		byte[] korScores = new byte[count];
		int[] totalScores = new int[count];
		double[] avgScores = new double[count];

		boolean run = true;
		while (run) {
			System.out.println("=======MBC 교육센터 성적 관리 프로그램=======");
			System.out.println(" 1.학생관리 | 2.성적관리 | 3.통계 | 4.종료 ");
			System.out.println("======================================");
			System.out.print(">>>");
			int select = mainSC.nextInt(); // 1~4까지 정수 입력 후에 분기

			switch (select) {
			case 1:
				System.out.println("학생 관리 메서드로 진입합니다.");
				student(name);
				break;
			case 2:
				System.out.println("성적 관리 메서드로 진입합니다.");
				grade(name, engScores, korScores);
				break;
			case 3:
				System.out.println("통계 관리 메서드로 진입합니다.");
				statistics(name, engScores, korScores, totalScores, avgScores);
				break;
			case 4:
				System.out.println("종료합니다.");
				run = false;
				break;

			} // 주메뉴 switch문 종료
		} // while문 종료
	} // main() 종료

	private static void statistics(String[] name, byte[] engScores, byte[] korScores, int[] totalScores,
			double[] avgScores) { // 통계 관리 메서드 성공
		Scanner staSC = new Scanner(System.in);

		System.out.println("==============통계===============");
		System.out.println(" 1.총점 | 2.평균 | 3.최대값,최소값 | 4.순위 ");
		System.out.println("================================");
		int sta = staSC.nextInt();

		switch (sta) {
		case 1: // 학생별 영어+국어 점수 총점 구하기
			System.out.print("어느 학생의 총점을 구하시겠습니까? (번호 입력) : ");
			int staTotalNum = staSC.nextInt();
			System.out.println(staTotalNum + "번 " + name[staTotalNum - 1] + " 학생의 점수 총점은 : "
					+ (engScores[staTotalNum - 1] + korScores[staTotalNum - 1]) + "점 입니다.");
			break;
		case 2: // 학생별 영어+국어 점수 평균 구하기
			System.out.print("어느 학생의 평균을 구하시겠습니까? (번호 입력) : ");
			int staAvgNum = staSC.nextInt();
			System.out.println(staAvgNum + "번 " + name[staAvgNum - 1] + " 학생의 점수 총점은 : "
					+ (double) ((engScores[staAvgNum - 1] + korScores[staAvgNum - 1]) / 2) + "점 입니다.");
			break;

		case 3: // 과목별 최대값과 최소값 구하기
			System.out.println("=============과목===============");
			System.out.println("    1.영어점수 최대값과 최소값 ");
			System.out.println("    2.국어점수 최대값과 최소값 ");
			System.out.println("===============================");
			int staMM = staSC.nextInt();
			int max = engScores[0];
			int min = engScores[0];

			switch (staMM) {
			case 1: // 1.영어점수 최대값과 최소값
				for (int i = 0; i < engScores.length; i++) {
					if (engScores[i] > max) {
						max = engScores[i];
					} else if (engScores[i] < min) {
						min = engScores[i];
					} // 최대값, 최소값 구하는 if문 종료
				} // 최대값, 최소값 구하는 for문 종료
				System.out.println("영어점수 중 가장 높은 점수는 : " + max + "점 입니다.");
				System.out.println("영어점수 중 가장 낮은 점수는 : " + min + "점 입니다.");
				break;
			case 2: // 2.국어점수 최대값과 최소값
				for (int i = 0; i < korScores.length; i++) {
					if (korScores[i] > max) {
						max = korScores[i];
					} else if (korScores[i] < min) {
						min = korScores[i];
					} // 최대값, 최소값 구하는 if문 종료
				} // 최대값, 최소값 구하는 for문 종료
				System.out.println("국어점수 중 가장 높은 점수는 : " + max + "점 입니다.");
				System.out.println("국어점수 중 가장 낮은 점수는 : " + min + "점 입니다.");
				break;
			default:
				System.out.println("입력 오류입니다. 번호를 다시 입력해주세요.");

			} // 최대값, 최소값 switch문 종료
			break;
		case 4:
			System.out.println("=============과목===============");
			System.out.println("    1.영어 점수의 순위 ");
			System.out.println("    2.국어 점수의 순위 ");
			System.out.println("===============================");
			int ranking = staSC.nextInt();

			switch (ranking) {
			case 1:
				for (int i = 0; i < engScores.length - 1; i++) {
					for (int j = 0; j < engScores.length - 1 - i; j++) {
						if (engScores[j] < engScores[j] + 1) {
							byte rank = engScores[j];
							engScores[j] = engScores[j + 1];
							engScores[j + 1] = rank;
						} // 순위 구하는 if문 종료

					} // 안쪽 for문 종료

				} // 바깥쪽 for문 종료
				System.out.println("*********영어 점수 순위표**********");
				for (int i = 0; i < engScores.length; i++) {
					System.out.println((i + 1) + "등은 " + name[i] + " 학생 입니다. \n" + "점수 : " + engScores[i] + "점");
				} // 순위를 구하는 for문 종료
				break;
			case 2:
				for (int i = 0; i < korScores.length - 1; i++) {
					for (int j = 0; j < korScores.length - 1 - i; j++) {
						if (korScores[j] < korScores[j] + 1) {
							byte rank = korScores[j];
							korScores[j] = korScores[j + 1];
							korScores[j + 1] = rank;
						} // 순위 구하는 if문 종료

					} // 안쪽 for문 종료

				} // 바깥쪽 for문 종료
				System.out.println("*********국어 점수 순위표**********");
				for (int i = 0; i < korScores.length; i++) {
					System.out.println((i + 1) + "등은 " + name[i] + " 학생 입니다. \n" + "점수 : " + korScores[i] + "점");
				} // 순위를 구하는 for문 종료
				break;
			default:
				System.out.println("입력 오류입니다. 번호를 다시 입력해주세요.");
			} // 영어 점수의 순위를 매기는 switch문 종료
			break;
		default:
			System.out.println("입력 오류입니다. 번호를 다시 입력해주세요.");

		} // 통계 switch문 종료

	} // 통계 메서드 종료

	private static void grade(String[] name, byte[] engScores, byte[] korScores) { // 성적 관리 메서드 성공
		// 성적관리용 crud
		// 영어와 국어과목의 성적관리
		// c - 점수 입력
		// r - 점수 보기
		// u - 점수 수정
		// d - 점수 삭제(초기화)
		Scanner gradeSC = new Scanner(System.in);

		System.out.println("==========성적관리메뉴==========");
		System.out.println("1.입력 | 2.보기 | 3.수정 | 4.삭제");
		System.out.println("============================");
		System.out.print(">>>");
		int select = gradeSC.nextInt();

		switch (select) {
		case 1: // 점수 입력 시작
			System.out.println("===입력할 과목선택===");
			System.out.println(" 1.영어 | 2.국어");
			System.out.println("================");
			int selectInput = gradeSC.nextInt();

			switch (selectInput) {
			case 1:
				System.out.println("영어 성적을 입력합니다.");
				System.out.println(">>>");
				for (int i = 0; i < engScores.length; i++) {
					engScores[i] = gradeSC.nextByte();
				} // 영어 성적입력 for문 종료
				System.out.println("영어 성적이 입력되었습니다.");
				break;

			case 2:
				System.out.println("국어 성적을 입력합니다.");
				System.out.println(">>>");
				for (int i = 0; i < korScores.length; i++) {
					korScores[i] = gradeSC.nextByte();
				} // 국어 성적입력 for문 종료
				System.out.println("국어 성적이 입력되었습니다.");
				break;
			default:
				System.out.println("입력 오류입니다. 1,2번 중 하나를 입력해주세요");
			} // 성적입력 switch문 종료
			break;

		case 2: // 점수 확인 시작
			System.out.println("===확인할 과목선택===");
			System.out.println(" 1.영어 | 2.국어");
			System.out.println("================");
			int selectCheck = gradeSC.nextInt();
			switch (selectCheck) {
			case 1:
				System.out.println("영어 성적을 확인합니다.");
				for (int i = 0; i < engScores.length; i++) {
					System.out.println((i + 1) + "번 " + name[i] + " 학생의 점수는 : " + engScores[i] + "점 입니다.");
				} // 영어성적 확인 for문 종료
				break;

			case 2:
				System.out.println("국어 성적을 확인합니다.");
				for (int i = 0; i < korScores.length; i++) {
					System.out.println((i + 1) + "번 " + name[i] + " 학생의 점수는 : " + korScores[i] + "점 입니다.");
				} // 국어성적 확인 for문 종료
				break;
			default:
				System.out.println("입력 오류입니다. 1,2번 중 하나를 입력해주세요");
			} // 성적확인 switch문 종료
			break;
		case 3: // 점수 수정 시작
			System.out.println("===수정할 과목선택===");
			System.out.println(" 1.영어 | 2.국어");
			System.out.println("================");
			int selecMOD = gradeSC.nextInt();

			switch (selecMOD) {
			case 1:
				System.out.println("영어 점수를 수정합니다.");
				System.out.print("몇번 학생의 점수를 수정하시겠습니까? : ");
				int studentEngNum = gradeSC.nextInt();
				System.out.print("수정할 점수 입력 : ");
				int studentEngMOD = gradeSC.nextInt();
				engScores[studentEngNum - 1] = (byte) studentEngMOD;
				System.out.println("수정이 완료 되었습니다!");
				break;
			case 2:
				System.out.println("국어 점수를 수정합니다.");
				System.out.print("몇번 학생의 점수를 수정하시겠습니까? : ");
				int studentKorNum = gradeSC.nextInt();
				System.out.print("수정할 점수 입력 : ");
				int studentKorMOD = gradeSC.nextInt();
				engScores[studentKorNum - 1] = (byte) studentKorMOD;
				System.out.println("수정이 완료 되었습니다!");
				break;
			default:
				System.out.println("입력 오류입니다. 1,2번 중 하나를 입력해주세요");
			} // 점수 수정 switch문 종료
			break;
		case 4: // 점수 삭제 시작
			System.out.println("===삭제할 과목선택===");
			System.out.println(" 1.영어 | 2.국어");
			System.out.println("================");
			int selectDelte = gradeSC.nextInt();

			switch (selectDelte) {
			case 1:
				System.out.println("******************************");
				System.out.println("※영어과목의 점수를 정말로 삭제하시겠습니까?");
				System.out.println("\t 1. 예 | 2. 아니오");
				System.out.println("******************************");
				int selectEng = gradeSC.nextInt();
				byte a = 0;

				if (selectEng == 1) {
					for (int i = 0; i < engScores.length; i++) {
						engScores[i] = a;
					}
					System.out.println("영어점수가 초기화 되었습니다!");
				} else {
					System.out.println("메뉴로 돌아갑니다.");
				}
				break; // 영어 점수 삭제(초기화)
			case 2:
				System.out.println("******************************");
				System.out.println("※국어과목의 점수를 정말로 삭제하시겠습니까?");
				System.out.println("\t 1. 예 | 2. 아니오");
				System.out.println("******************************");
				int selectKor = gradeSC.nextInt();
				byte b = 0;

				if (selectKor == 1) {
					for (int i = 0; i < engScores.length; i++) {
						engScores[i] = b;
					}
					System.out.println("국어점수가 초기화 되었습니다!");
				} else {
					System.out.println("메뉴로 돌아갑니다.");
				}
				break; // 국어 점수 삭제(초기화)

			} // 삭제할 과목 선택 switch문 종료

		} // 성적관리메뉴 switch문 종료

	} // grade() 종료

	private static String[] student(String[] name) { // 학생관리 메서드 성공
		// 학생관리용 crud
		Scanner studentSC = new Scanner(System.in);

		System.out.println("==========학생관리메뉴==========");
		System.out.println("1.등록 | 2.보기 | 3.수정 | 4.삭제");
		System.out.println("============================");
		System.out.print(">>>");
		int select = studentSC.nextInt();

		switch (select) {
		case 1:
			System.out.println("학생 등록을 시작합니다.");
			System.out.println("총 학생수는 : " + name.length);
			for (int i = 0; i < name.length; i++) { // 학생이름 반복문
				System.out.println((i + 1) + "번 학생 이름을 등록하세요");
				name[i] = studentSC.next(); // 키보드 문자로 받은 값을 배열 i에 넣는다
			}
			System.out.println("학생 등록 완료");
			break;
		case 2:
			System.out.println("학생 리스트 출력!");
			for (int i = 0; i < name.length; i++) {
				System.out.println((i + 1) + "번 :" + name[i]);
			}
			break;
		case 3:
			System.out.println("학생 이름 수정 : ");
			System.out.println("수정할 학생 번호를 입력하세요 : ");
			int nameNum = studentSC.nextInt();
			System.out.println("수정할 학생 이름을 입력하세요 : ");
			String nameMOD = studentSC.next();
			name[nameNum - 1] = nameMOD;
			System.out.println("수정완료");
			break;
		case 4:
			System.out.println("삭제할 학생 번호를 입력하세요");
			int deleteNum = studentSC.nextInt();
			name[deleteNum - 1] = null;
			break;

		default:
			System.out.println("입력값 오류 : 1~4번 만 입력하세요");
		} // switch문 종료

		return name;

	} // student() 종료

} // class 종료
