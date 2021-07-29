package day11;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 데이터 소스(파일, 키보드, 원격지원 컴퓨터)
 * 데이터 목적지(파일, 모니터, 메모리)
 * 데이터 소스와 입력 스트림 연결(노드 스트림)
 * 데이터 목적지와 출력 스트림 연결
 * 1바이트 데이터 입출력시 : xxxInputStream.xxxOutStream
 * 2바이트 데이터 입출력시 : xxxPeader.xxxWriter
 */

public class InputStreamTest {

	public static void main(String[] args) {
		
		try {
			int n = System.in.read();
			FileOutputStream fos = 
					new FileOutputStream("C:\\\\Summer Java\\\\SummerJava\\\\src\\\\day11\\\\test.txt");
			System.out.println((char)n);
			fos.write(n);
		}
		catch (IOException e){
			e.printStackTrace();
		}
		
		
		
	}//main()------------

	
}//////////////////////
