package day13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ConsolChatClient implements Runnable{

	Socket sock;
	
	public ConsolChatClient() {
		try {
			sock = new Socket("127.0.0.1", 5555);
			System.out.println("서버와 연결 됨");

			// 클라이언트와 통신할 스트림 생성
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter pw = new PrintWriter(sock.getOutputStream(), true);

			pw.println("안녕하세요 클라이언트님");
			String msg = "";
			//////////////////////////////////////////////////
			Thread tr = new Thread(this);
			tr.start();
			//////////////////////////////////////////////////

			// 클라이언트에게 메세지 전달
			while ((msg = br.readLine()) != null) {
				pw.println(msg);
			}
		}

		catch (IOException e) {
			e.printStackTrace();
		}
		
	}//ConsolChatClient()-----------
	

	
	public static void main(String[] args) {

		new ConsolChatClient();
	}// main()------------



	@Override
	public void run() {
		try {
			InputStream is = sock.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String serverMsg;

			while (true) {
				serverMsg = br.readLine();
				System.out.println("From Server -> " + serverMsg);
			}

		} catch (IOException e) {

			e.printStackTrace();
		}

	}// run()----------------

	
	
}///////////////////
