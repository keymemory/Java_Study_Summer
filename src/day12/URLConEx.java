package day12;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class URLConEx {

	public URLConEx() {
		
		String code = null;
		System.out.println("웹주소를 압력하세요");
		Scanner scn = new Scanner(System.in);
		String address = scn.next();
		
		try {
			URL url = new URL(address);
			URLConnection con = url.openConnection();
			BufferedReader br = 
				new BufferedReader(new InputStreamReader(con.getInputStream()));
			FileWriter fw = 
				new FileWriter("C:\\Summer Java\\SummerJava\\src\\day12\\result.html");
			
			while((code = br.readLine()) != null) {
				fw.write(code);
				fw.flush();
			}
			System.out.println("The End");
			fw.close();
			
		}
		
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}//URLConEx()--------------

}////////////////
