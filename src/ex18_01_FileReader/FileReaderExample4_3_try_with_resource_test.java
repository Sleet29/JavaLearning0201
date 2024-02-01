// 한꺼번에 여러 문자를 읽는 read 메소드 예
package ex18_01_FileReader;
import java.io.*;
class FileReaderExample4_3_try_with_resource_test {
	public static void main(String args[]) throws IOException {
        char arr[] = new char[64];
        /*
         * 1. try-with-resource문으로 try()괄호 안에 선언된 자원은
			  try문이 끝날 때 자동으로 close()메서드를 호출합니다.
		   2. try-with-resource문에 의해 자동으로 객체의 close()가 호출될 수 있으려면 클래스가 Autocloseable이라는 인터페이스를 구현한 것이어야 합니다.
			형식)
			try(){
				.....
			}catch(){
			}finally{
			}
         */
        try (
            FileReader reader = new FileReader("C:\\Users\\jhta\\eclipse-workspace\\20240201\\src\\ex18_01_FileReader\\1.txt");
        ) {
            while (true) {
                int num = reader.read(arr);
                if (num == -1)	// 더 이상 읽을 문자가 없을 경우 -1을 리턴
                    break;
                // arr의 0부터 num만큼 스트링으로 만든 후 출력
                System.out.println(new String(arr, 0, num));
            }// while end
        }// try end
        catch (FileNotFoundException fnfe) {
            System.out.println("파일이 존재하지 않습니다.");
        } catch (IOException ioe) {
            System.out.println("파일을 읽을 수 없습니다.");
        } finally {
        	System.out.println("final입니다.");
        }
    }
}
		

