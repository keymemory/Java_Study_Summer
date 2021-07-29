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
			System.out.println("������ ���� ��");

			// Ŭ���̾�Ʈ�� ����� ��Ʈ�� ����
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter pw = new PrintWriter(sock.getOutputStream(), true);

			pw.println("�ȳ��ϼ��� Ŭ���̾�Ʈ��");
			String msg = "";
			//////////////////////////////////////////////////
			Thread tr = new Thread(this);
			tr.start();
			//////////////////////////////////////////////////

			// Ŭ���̾�Ʈ���� �޼��� ����
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
