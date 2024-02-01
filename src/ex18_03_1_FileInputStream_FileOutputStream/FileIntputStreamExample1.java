package ex18_03_1_FileInputStream_FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class FileIntputStreamExample1 {
	public static void main(String args[]) {
		if (args.length < 1) {
			System.out.println("파일명을 Arguments탭에 output1.dat 입력해 주세요~"); // source >> run as >> output1.dat입력
			return;
		}
		FileInputStream in = null;
		try {
			in = new FileInputStream(args[0]); // 파일을 연다.
			// Run -> Run Configurations에서 매개변수 값으로 output1.dat 입력
			
			byte arr[] = new byte[21];
			while(true) {
				int num = in.read(arr);
				// int java.io.FileInputStream.read(byte[] b) throws IOException
				
				if (num == -1) // 더 이상 읽을 문자가 없을 경우 -1을 리턴합니다.
					break;
				
				System.out.println("\n16진수 출력");
				for (int cnt=0;cnt<num;cnt++)
					System.out.printf("%02X ", arr[cnt]);
				// %02X : 2자리 16진수 (%X)로 출력하되, 대문자 (X가 대문자임)로 출력하면서 숫자가 한 자리이면
				// 앞자리를 0으로 채운다
				// %02x : 2자리 16진수 (%x)로 출력하되, 대문자 (x가 소문자임)로 출력하면서 숫자가 한 자리이면
				// 앞자리를 0으로 채운다
				
				System.out.println("\n\n10진수 출력");
				for (int cnt=0;cnt<num;cnt++)
					System.out.printf("%02d ", arr[cnt]);
				
				System.out.println("\n\n8진수 출력");
				for (int cnt=0;cnt<num;cnt++)
					System.out.printf("%02o ", arr[cnt]);
			}// while end
		}catch(FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch(IOException ioe) { 
			System.out.println("파일을 읽을 수 없습니다.");
		} finally {
			try {
				if(in !=null)
					in.close();
			} catch (IOException e) {
				System.out.println("IOException");
			}
		}
	}
}
