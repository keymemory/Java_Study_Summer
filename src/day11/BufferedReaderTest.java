package day11;

import java.io.BufferedReader;
import java.io.FileReader;

/*
 * 2����Ʈ �����͸� �о���̴� ��ü (���� ��Ʈ��)
 * ���Ϸκ��� �����͸� ���ۿ� ���� �о�� ��, ���۸����� ���� �����͸� �о�´�
 */

public class BufferedReaderTest {

	public static void main(String[] args) {
		
		String filename="C:\\\\\\\\Summer Java\\\\\\\\SummerJava\\\\\\\\src\\\\\\\\day11\\\\\\\\InputStreamTest.java";
		
		try {
			FileReader fr = new FileReader(filename);
			// ���� ��Ʈ�� ����
			BufferedReader br = new BufferedReader(fr);
			String str;
			while((str=br.readLine())!=null) {// ���� �б�
				System.out.println(str);
			}
		}
		catch (Exception e) {
			
			e.printStackTrace();
		}

		
	}//main()-------------

}//////////////////////
