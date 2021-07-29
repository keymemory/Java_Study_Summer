package day11;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/*
 * 데이터 소스(파일, 키보드, 원격지원 컴퓨터)
 * 데이터 목적지(파일, 모니터, 메모리)
 * 데이터 소스와 입력 스트림 연결(노드 스트림)
 * 데이터 목적지와 출력 스트림 연결
 * 1바이트 데이터 입출력시 : xxxInputStream.xxxOutStream
 * 2바이트 데이터 입출력시 : xxxPeader.xxxWriter
 */

public class InputStreamTest2 {

	public static void main(String[] args) {
		
		try {
			// 읽어들일 파일과 노드 연결 하기
			//InputStream is = 
					//new FileInputStream("C:\\Summer Java\\SummerJava\\src\\day11\\InputStreamTest.java");
			FileInputStream fis = 
					new FileInputStream("C:\\Summer Java\\SummerJava\\src\\day11\\InputStreamTest.java");
			int n=0;
			while((n=fis.read())!=-1) {
				// 파일의 긑일 때는 -1을 반환
				System.out.println((char)n);
			}
		}
		catch (IOException e){
			e.printStackTrace();
		}
		
		
		
	}//main()------------

	
}//////////////////////
