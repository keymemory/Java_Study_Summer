package day11;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/*
 * ������ �ҽ�(����, Ű����, �������� ��ǻ��)
 * ������ ������(����, �����, �޸�)
 * ������ �ҽ��� �Է� ��Ʈ�� ����(��� ��Ʈ��)
 * ������ �������� ��� ��Ʈ�� ����
 * 1����Ʈ ������ ����½� : xxxInputStream.xxxOutStream
 * 2����Ʈ ������ ����½� : xxxPeader.xxxWriter
 */

public class InputStreamTest2 {

	public static void main(String[] args) {
		
		try {
			// �о���� ���ϰ� ��� ���� �ϱ�
			//InputStream is = 
					//new FileInputStream("C:\\Summer Java\\SummerJava\\src\\day11\\InputStreamTest.java");
			FileInputStream fis = 
					new FileInputStream("C:\\Summer Java\\SummerJava\\src\\day11\\InputStreamTest.java");
			int n=0;
			while((n=fis.read())!=-1) {
				// ������ �P�� ���� -1�� ��ȯ
				System.out.println((char)n);
			}
		}
		catch (IOException e){
			e.printStackTrace();
		}
		
		
		
	}//main()------------

	
}//////////////////////
