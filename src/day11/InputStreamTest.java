package day11;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ������ �ҽ�(����, Ű����, �������� ��ǻ��)
 * ������ ������(����, �����, �޸�)
 * ������ �ҽ��� �Է� ��Ʈ�� ����(��� ��Ʈ��)
 * ������ �������� ��� ��Ʈ�� ����
 * 1����Ʈ ������ ����½� : xxxInputStream.xxxOutStream
 * 2����Ʈ ������ ����½� : xxxPeader.xxxWriter
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
