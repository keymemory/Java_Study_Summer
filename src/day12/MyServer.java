package day12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

	ServerSocket server;
	Socket sock;
	BufferedReader br;
	PrintWriter pw;
	String msg;
	
	public MyServer() {
		// ��Ʈ ��ȣ : ��ǥ ��ȭ��ȣ
		// 1~65535 ������ ������
		// ��, 0~1024 ������ ���� �ý��ۿ��� ����ϴ� ��Ʈ ��ȣ
		// ftp: 21, telnet: 23, http: 80
		
		try {
			server = new ServerSocket(2000);
			System.out.println("���� �����");
			sock = server.accept();
			System.out.println("Ŭ�󸮾�Ʈ�� ���ӵ�");
			InputStream is = sock.getInputStream();
			br = new BufferedReader(new InputStreamReader(is));
			pw = new PrintWriter(sock.getOutputStream(), true);
			
			while((msg=br.readLine()) != null) {
				pw.write(msg);
				System.out.println("Client_Msg: " + msg);
			}
			
			pw.close();
			br.close();
			sock.close();
			
		}
		catch (IOException e){
			e.printStackTrace();
		}
		
		
	}//MyServer()--------------
	
	
	public static void main(String[] args) {
		MyServer ms = new MyServer();

	}//main()---------------

}////////////////
