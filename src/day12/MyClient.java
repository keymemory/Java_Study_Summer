package day12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class MyClient {

	Socket socket;
	int port = 2000;
	String ip = "127.0.0.1";
	BufferedReader br;
	PrintWriter pw;
	String msg;
	
	public MyClient() {
		try {
		socket = new Socket(ip, port);
		//InputStream is = socket.getInputStream();
		br = new BufferedReader(new InputStreamReader(System.in));
		pw = new PrintWriter(socket.getOutputStream(), true);
		
		while((msg=br.readLine()) != null) {
			pw.println(msg);
			System.out.println("Client_Msg: " + msg);
		}
		
		pw.close();
		br.close();
		socket.close();
		}
		
		catch (IOException e){
			e.printStackTrace();
		}
		
	}//MyCLient()--------------
	
	
	public static void main(String[] args) {

		new MyClient();

	}
	
}////////////////
