package ex18_02_FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample2_String {
	public static void main(String args[]) throws IOException{
		FileWriter writer = null;
		try {
			// true : append(원래 있던 파일 내용 뒤에 추가로 작성)
			// false : overwrite(덮어쓰기 한다.)
			writer = new FileWriter("C:\\Users\\jhta\\eclipse-workspace\\20240201\\src\\ex18_02_FileWriter\\1.txt",false);
			// public FileWriter(String fileName) throws IOException
			// FileWriter 생성자는 IOException 에러를 발생하기 때문에
			// IOException 처리문이 있어야 합니다.
			
			for (int i=0;i<=9;i++) {
				for(int j=2;j<=9;j++) {
					if(i==0) {
						writer.write("["+j +"단"+"]"+"\t");
					} else {
						writer.write(j+"*"+i+"="+j*i+"\t");
					}
				} writer.write("\n");
			}
			
			
			
			// 파일에 반복해서 문자들을 씁니다.
			
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


