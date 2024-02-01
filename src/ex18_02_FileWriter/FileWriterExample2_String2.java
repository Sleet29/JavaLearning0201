package ex18_02_FileWriter;


public class FileWriterExample2_String2 {
	public static void main(String args[]) {
		for (int i=2;i<=9;i++) {
			System.out.print("["+i+"단]"+"\t");
		}
		System.out.println();
		for (int i=2;i<=10;i++) {
			for(int j=2;j<=9;j++)
				System.out.print(j+"*"+(i-1)+"="+(j*(i-1))+"\t");
				System.out.println();
		}
	}
}


