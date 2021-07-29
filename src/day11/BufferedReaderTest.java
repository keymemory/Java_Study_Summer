package day11;

import java.io.BufferedReader;
import java.io.FileReader;

/*
 * 2바이트 데이터를 읽어들이는 객체 (필터 스트림)
 * 파일로부터 데이터를 버퍼에 먼저 읽어온 후, 버퍼리더를 통해 데이터를 읽어온다
 */

public class BufferedReaderTest {

	public static void main(String[] args) {
		
		String filename="C:\\\\\\\\Summer Java\\\\\\\\SummerJava\\\\\\\\src\\\\\\\\day11\\\\\\\\InputStreamTest.java";
		
		try {
			FileReader fr = new FileReader(filename);
			// 필터 스트림 연결
			BufferedReader br = new BufferedReader(fr);
			String str;
			while((str=br.readLine())!=null) {// 한줄 읽기
				System.out.println(str);
			}
		}
		catch (Exception e) {
			
			e.printStackTrace();
		}

		
	}//main()-------------

}//////////////////////
