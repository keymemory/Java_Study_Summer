package day11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ������ �ҽ�(����, Ű����, �������� ��ǻ��)
 * ������ ������(����, �����, �޸�)
 * ������ �ҽ��� �Է� ��Ʈ�� ����(��� ��Ʈ��)
 * ������ �������� ��� ��Ʈ�� ����
 * 1����Ʈ ������ ����½� : xxxInputStream.xxxOutStream
 * 2����Ʈ ������ ����½� : xxxPeader.xxxWriter
 * 
 * ���Ϸκ��� ������ �о�鿩 ���Ϸ� ����ϱ� (���Ϻ���)
 * ������ ������ �̸� : InputStreamTest4.txt
 */

public class InputStreamTest3 {

	public static void main(String[] args) {
		
		try {
			// �о���� ���ϰ� ��� ���� �ϱ�
			//InputStream is = 
					//new FileInputStream("C:\\Summer Java\\SummerJava\\src\\day11\\InputStreamTest.java");
			FileInputStream fis = 
					new FileInputStream("C:\\\\Summer Java\\\\SummerJava\\\\src\\\\day11\\\\InputStreamTest.java");
			FileOutputStream fos = 
					new FileOutputStream("C:\\\\Summer Java\\\\SummerJava\\\\src\\\\day11\\\\InputStreamTest4.txt");
			int n=0;
			while((n=fis.read())!=-1) {
				// ������ �P�� ���� -1�� ��ȯ
				fos.write((char)n);
			}
		}
		catch (IOException e){
			e.printStackTrace();
		}
		
		
		
	}//main()------------

	
}//////////////////////
