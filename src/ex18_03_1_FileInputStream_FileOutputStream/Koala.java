package ex18_03_1_FileInputStream_FileOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Koala {
    public static void main(String[] args) {
        String Origin = "D:/temp/koala.jpg";
        String Copy = "D:/koala_copy.jpg";

        try (
            FileInputStream input = new FileInputStream(Origin);
            FileOutputStream output = new FileOutputStream(Copy)
        ) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = input.read(buffer)) != -1) {
                output.write(buffer, 0, bytesRead);
            }
            System.out.println("파일 성공적 복사 완료");
        } catch (FileNotFoundException fnfe){
        	System.out.println("파일이 존재하지 않음");
        } catch (IOException e) { // Exception - IOException
        	e.printStackTrace();
        }
    }
}


/*
원본파일 ) D:/temp/koala.jpg
복사파일 ) D:/koala_copy.jpg
1.원본파일의 위치에 있는 파일을 FileInputStream으로 읽어오고
2. 읽은 데이터를 모니터가 아닌 FileOutputStream 이용해서 파일로 출력하는
Koala 클래스 작성
*/