package ex18_01_FileReader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample1 {
	public static void main(String args[]) throws IOException {
		// 1. 파일을 엽니다.
		/* 생성자 인자값으로 파일의 위치를 지정합니다.
		 * 지정 방법 : 상대경로와 절대 경로 지정
		 * 1) 상대경로 : 프로젝트 경로를 기준으로 차례대로 파일의 위치를 지정합니다.
		 * 2) 절대경로 : 드라이브명부터 차례대로 파일의 위치를 지정합니다.
		 * 				예) D:/작업폴더/프로젝트/poem.txt 의미
		 */
		FileReader reader = new FileReader("poem.txt");
		
		// 절대경로 지정
		// FileReader reader =
		// new FileReader ("D:/worksapce_java/java/poem.txt");
		
		// 2. 파일을 읽어서 처리합니다.
		while (true) {
			//read() : 파일에 있는 문자 하나를 읽어서 리턴하는 메소드
			int data = reader.read();
			if(data== -1)
				break;
			char ch = (char) data;
			System.out.print(ch);
		}
		
		//3. 파일을 닫습니다.
		reader.close();
	}
}
