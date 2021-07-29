package day11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 데이터 소스(파일, 키보드, 원격지원 컴퓨터)
 * 데이터 목적지(파일, 모니터, 메모리)
 * 데이터 소스와 입력 스트림 연결(노드 스트림)
 * 데이터 목적지와 출력 스트림 연결
 * 1바이트 데이터 입출력시 : xxxInputStream.xxxOutStream
 * 2바이트 데이터 입출력시 : xxxPeader.xxxWriter
 * 
 * 파일로부터 데이터 읽어들여 파일로 출력하기 (파일복사)
 * 복사할 파일의 이름 : InputStreamTest4.txt
 */

public class InputStreamTest3 {

	public static void main(String[] args) {
		
		try {
			// 읽어들일 파일과 노드 연결 하기
			//InputStream is = 
					//new FileInputStream("C:\\Summer Java\\SummerJava\\src\\day11\\InputStreamTest.java");
			FileInputStream fis = 
					new FileInputStream("C:\\\\Summer Java\\\\SummerJava\\\\src\\\\day11\\\\InputStreamTest.java");
			FileOutputStream fos = 
					new FileOutputStream("C:\\\\Summer Java\\\\SummerJava\\\\src\\\\day11\\\\InputStreamTest4.txt");
			int n=0;
			while((n=fis.read())!=-1) {
				// 파일의 긑일 때는 -1을 반환
				fos.write((char)n);
			}
		}
		catch (IOException e){
			e.printStackTrace();
		}
		
		
		
	}//main()------------

	
}//////////////////////
