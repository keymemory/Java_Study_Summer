package day14;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;

public class MultiServerRunnable implements Runnable{

	Socket sock;
	DataInputStream dis;
	DataOutputStream dos;
	MultiServer mser;
	//ArrayList arraylist;
	
	public MultiServerRunnable(Socket sock) {
		this.sock = sock;
		mser = new MultiServer();
		
	}//MultiServerRunnable(Socket sock)----------

	
	// arraylist�� �ִ� ��ü�鿡�� ���ÿ� �޼��� ����ϴ� �޼ҵ�
	public void broadCasting(String msg) throws IOException {
		for(MultiServerRunnable ms : mser.arrlist) {
			System.out.println("Message: " + msg);
			ms.send(msg);
		}
	}
	
	
	public void send(String msg) throws IOException {
		dos.writeUTF(msg);
	}
	
	
	@Override
	public synchronized void run() {
		
		try {
		dis = new DataInputStream(sock.getInputStream());
		dos = new DataOutputStream(sock.getOutputStream());
		
		while(true) {
			String msg = dis.readUTF().toString();
			System.out.println("Megssage: " + msg);
			}
		
		}
		catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}//////////
