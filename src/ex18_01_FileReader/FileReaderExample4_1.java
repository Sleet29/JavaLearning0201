package ex18_01_FileReader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample4_1 {
	public static void main(String args[]) throws IOException{
		FileReader reader = null;
		char arr[] = new char[64];
		try {
			reader = new FileReader("거위의 꿈.txt");
			
			while (true) {
				// Returns : The number of characters read
				// arr의 배열 크기 만큼 문자를 읽어 arr에 저장한 후 읽은 개수를 반환합니다.
				int num = reader.read(arr);
				if (num == -1) // 더 이상 읽을 문자가 없을 경우 -1을 리턴합니다.
					break;
				
				for (int cnt = 0; cnt<num; cnt++) {
					System.out.printf("%c",arr[cnt]);
				} // for end
			}// while end
		} finally {
			try {
				if(reader !=null)
					reader.close();
			} catch (IOException e) {
				System.out.println("IOException");
			}
		}
		 // try end
	}
}
