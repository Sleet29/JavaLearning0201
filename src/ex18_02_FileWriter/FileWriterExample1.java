package ex18_02_FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample1 {
	public static void main(String args[]) throws IOException{
		FileWriter writer = null;
		try {
			// 생성자의 매개변수가 열 파일의 이름을 의미합니다.
			// output.txt파일이 없는 경우는 파일 생성 후 파일이 열립니다.
			// 만약 이름이 있는 경우 기존 파일의 내용이 지워집니다.
			writer = new FileWriter("output.txt");
			// public FileWriter(String fileName) throws IOException
			// FileWriter 생성자는 IOException 에러를 발생하기 때문에
			// IOException 처리문이 있어야 합니다.
			
			char arr[] = {'내','꺼','인',' ','듯',' ','내','꺼',' ',
					'아','닌',' ','내','꺼',' ','같','은',' ','너'};
			
			// 파일에 반복해서 문자들을 씁니다.
			for (int cnt= 0;cnt<arr.length;cnt++)
				writer.write(arr[cnt]);
			
		}
		catch (IOException ioe) {
			System.out.println("파일로 출력할 수 없습니다.");
			
		} finally {
				try {
					if(writer !=null)
						writer.close();
				}
				catch (IOException e) {
					System.out.println("파일 닫는 중 오류입니다.");
				}
		}
	}
}


