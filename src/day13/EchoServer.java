package day13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/*
 * ���� ����
 * 1. Ŭ���̾�Ʈ�� ������ ������ �Ǹ�
 * 2. ������ ���� Ŭ���̾�Ʈ���� "�ȳ��ϼ��� Ŭ���̾�Ʈ��" �̶�� �޼����� ���� ������
 * 3. Ŭ���̾�Ʈ�� �ֿܼ��� Ű���� �Է��� ���� �޼����� ������
 * 4. ������ Ŭ���̾�Ʈ�κ��� ���� �޼����� ����
 *    ��) "�ȳ��ϼ���?" or "����" -> "Ŭ���̾�Ʈ�� �ݰ�����" �� �޼����� ����
 *    ��) "���� ��¥��" -> ���� ��¥�� �� ����
 *    ��) ��Ÿ �ٸ� �޼����� ���� -> "Ŭ���̾�Ʈ�� ���"
 */

public class EchoServer {
	
	ServerSocket ser;
	Socket sock;
	int port = 5000;


	public EchoServer() throws Exception {
		ser = new ServerSocket(port); // ��� ����
		System.out.println("���� �����");
		sock = ser.accept();
		System.out.println(sock.getInetAddress() + " �� �����");
		// ��Ʈ�� ������
		// Ŭ���̾�Ʈ�� ����� ��Ʈ�� ����
		BufferedReader br = new BufferedReader
				(new InputStreamReader(sock.getInputStream()));
		PrintWriter pw = new PrintWriter(sock.getOutputStream(), true);
		
		pw.println("�ȳ��ϼ��� Ŭ���̾�Ʈ��");
		String msg="";
		
		while((msg=br.readLine()) != null) {
			if(msg.startsWith("�ȳ�") || msg.startsWith("����")) {
				pw.println(sock.getInetAddress() + " �� �ݰ�����");
			}
			else if(msg.startsWith("���� ��¥��")) {
				Date date = new Date();
				pw.println(date.toString());
			}
			else {
				pw.println(sock.getInetAddress() + " �� ���");
			}
			
		}//while()-----------
		
		pw.close();
		br.close();
		sock.close();
		ser.close();
		
		
	}//EchoServer()---------
	
	
	public static void main(String[] args) throws Exception {
		new EchoServer();

	}//main()------------

	
}///////////////
