package ex18_06_Buffered;
// https://dololak.tistory.com/84 그림 참조하기
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample1_write {
	public static void main(String args[]) throws IOException {
		String message = "하하입니다. \n 오늘도 화이팅입니다.";
		
		BufferedWriter br = null;
		try {
			br = new BufferedWriter(new FileWriter("src/ex18_06_Buffered/output2.dat"));
					br.write(message);
		} finally { // 파일을 닫는 명령문을 에러와 상관없이 처리하기 위해 finally 블록에서 사용
			try {
				if(br != null)
					br.close(); // 파일을 닫는 명령문
			} catch (IOException e) { // close 메소드가 발생하는 예외 처리
				System.out.println("닫는 중 오류입니다.");
			}
		}
	}

}
