package ex18_06_Buffered;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedWriterExample2_readLine {
	public static void main(String args[]) throws IOException {
		BufferedReader br = null;
		String message = null;
		try {
			br = new BufferedReader(new FileReader("src/ex18_06_Buffered/output2.dat"));
			
			
			while ((message = br.readLine()) !=null) {
				System.out.println(message);
			}
		} catch (FileNotFoundException fnfe) {
			System.out.println("파일 존재하지 않음");
		} catch (IOException ioe){
			System.out.println();
		} finally {
			try {
				if(br !=null)
					br.close();
			} catch (IOException e) {
				
			}
		}
	}
}
