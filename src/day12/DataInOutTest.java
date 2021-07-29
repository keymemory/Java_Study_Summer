package day12;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * DataInputStream, DataOutputStream
 */

public class DataInOutTest {
	
	public static void main(String[] args) {
		
		FileOutputStream fos;
		String filename = "C:\\Summer Java\\SummerJava\\src\\day12\\test.txt";
		// 자바의 기본 자료형 데이터를 정의
		byte b= 2;
		byte arr[] = {65, 66, 67};
		boolean bool = true;
		char ch = '가';
		String str = "홍길동";
		DataOutputStream dos;
		
		try {
			fos = new FileOutputStream(filename);
			dos = new DataOutputStream(fos);
			
			dos.writeByte(b);
			dos.write(arr);
			dos.writeBoolean(bool);
			dos.writeChar(ch);
			dos.writeUTF(str);
			dos.flush();
			dos.close();
			
			DataInputStream dis = new DataInputStream(new FileInputStream(filename));
			
			System.out.println(dis.readByte());
			int n = dis.read(arr, 0, arr.length);
			for(byte by:arr)System.out.println((char)n);
			System.out.println(dis.readBoolean());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
			dis.close();
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}//main()--------

	
}////////////////
