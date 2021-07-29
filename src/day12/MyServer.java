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
		// 포트 번호 : 대표 전화번호
		// 1~65535 까지의 정수값
		// 단, 0~1024 사이의 값은 시스템에서 사용하는 포트 번호
		// ftp: 21, telnet: 23, http: 80
		
		try {
			server = new ServerSocket(2000);
			System.out.println("서버 대기중");
			sock = server.accept();
			System.out.println("클라리언트가 접속됨");
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
