package ch16.io.write;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExam {

	public static void main(String[] args) throws Exception {
		// write 메서드는 자바에 데이터를 파일로 저장하는 기능
		OutputStream outputStream = new FileOutputStream("c:\\temp\\test.txt");
		byte[] data = "가나다".getBytes(); // ""안에 글자를 byte 배열에 넣음
		for (int i = 0; i < data.length; i++) {
			outputStream.write(data[i]);
		}
		System.out.println("메모장에서 확인 바람.");
		outputStream.flush(); // 찌꺼기 처리
		outputStream.close(); // 종료

	}

}
