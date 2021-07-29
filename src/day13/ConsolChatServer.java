package day13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ConsolChatServer implements Runnable{

	ServerSocket ser;
	Socket socket;
	
	public ConsolChatServer() {
		try {
			ser = new ServerSocket(5555);
			System.out.println("���� �����");
			socket = ser.accept();
			System.out.println("Ŭ���̾�Ʈ�� ���� ����");
			
			// Ŭ���̾�Ʈ�� ����� ��Ʈ�� ����
			BufferedReader br = new BufferedReader
					(new InputStreamReader(System.in));
			PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
			
			pw.println("�ȳ��ϼ��� Ŭ���̾�Ʈ��");
			String msg="";
			//////////////////////////////////////////////////
			Thread tr = new Thread(this);
			tr.start();
			//////////////////////////////////////////////////
			
			// Ŭ���̾�Ʈ���� �޼��� ����
			while((msg=br.readLine()) != null) {
				pw.println(msg);
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}//ConsolChatServer()-------------
	
	
	public static void main(String[] args) {
		
		new ConsolChatServer();

	}//main()-------


	@Override
	public void run() {
		// Ŭ���̾�Ʈ�� ������ �޼����� ��� �޾Ƽ� �ڱ� �ֿܼ� ���
		
		try {
			InputStream is = socket.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String clientMsg;
			
			while(true) {
				clientMsg = br.readLine();
				System.out.println("From Client -> " + clientMsg);
			}
			
		}
		catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}//run()----------

	
}////////
