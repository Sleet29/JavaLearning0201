package ex18_02_FileWriter;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample2_String {
	public static void main(String args[]) throws IOException{
		FileReader reader = null;
		char arr[] = new char[64];
		try {
			reader = new FileReader("C:\\\\Users\\\\jhta\\\\eclipse-workspace\\\\20240201\\\\src\\\\ex18_02_FileWriter\\\\1.txt");
				
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
		
		/*
		FileReader reader = null;
		try {
			// true : append(원래 있던 파일 내용 뒤에 추가로 작성)
			// false : overwrite(덮어쓰기 한다.)
			reader = new FileReader("C:\\Users\\jhta\\eclipse-workspace\\20240201\\src\\ex18_02_FileWriter\\1.txt");
			// public FileWriter(String fileName) throws IOException
			// FileWriter 생성자는 IOException 에러를 발생하기 때문에
			// IOException 처리문이 있어야 합니다.
			/*
			for (int i=0;i<=9;i++) {
				for(int j=2;j<=9;j++) {
					if(i==0) {
						writer.write("["+j +"단"+"]"+"\t");
					} else {
						writer.write(j+"*"+i+"="+j*i+"\t");
					}
				} writer.write("\n");
			}
			*/
			
			
			
			// 파일에 반복해서 문자들을 씁니다.
			
	


