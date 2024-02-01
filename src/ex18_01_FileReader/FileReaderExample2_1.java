package ex18_01_FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample2_1 {
	public static void main(String args[]) {
		FileReader reader = null;
		try {
		// 1. 파일을 엽니다.
		/* 생성자 인자값으로 파일의 위치를 지정합니다.
		 * 지정 방법 : 상대경로와 절대 경로 지정
		 * 1) 상대경로 : 프로젝트 경로를 기준으로 차례대로 파일의 위치를 지정합니다.
		 * 2) 절대경로 : 드라이브명부터 차례대로 파일의 위치를 지정합니다.
		 * 				예) D:/작업폴더/프로젝트/poem.txt 의미
		 */
			reader = new FileReader("poem.txt");
		
		
			// 절대경로 지정
		//FileReader reader = new FileReader ("D:/worksapce_java/java/poem.txt");
		
		// 2. 파일을 읽어서 처리합니다.
		while (true) {
			//read() : 파일에 있는 문자 하나를 읽어서 리턴하는 메소드
			int data = reader.read();
			if(data== -1)
				break;
			char ch = (char) data;
			System.out.print(ch);
				} // 만약 read()메서드에서 오류 발생시
				  // close()메서드가 실행 되지 않은 채 프로그램이 종료됨.
		
		//3. 파일을 닫습니다.
			}
		catch(FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch(IOException ioe) { 
			System.out.println("파일을 읽을 수 없습니다.");
		} finally {
			try {
				if(reader !=null)
					reader.close();
			} catch (IOException e) {
				System.out.println("IOException");
			}
		}
	}
}
