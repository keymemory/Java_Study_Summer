package day11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;

public class Words {

	Random rand;
	private String[] words;
	int len;
	static final int MAX = 100;
	
	public Words() {
		
		try {
			rand = new Random();
			words = new String[MAX];
			Scanner sc = new Scanner(new BufferedReader(new FileReader(
					"C:\\Summer Java\\SummerJava\\src\\day11\\data.txt")));
			int i;
			
			for(i=0;i<MAX;i++) {
				if(sc.hasNext()==false)
					break;
					words[i] = sc.next();
			}
			len = i;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}//words()--------- »ý¼ºÀÚ
	
	public String getWord() {
		return words[rand.nextInt(len)];
	}//getWord()---------
		
	
	public static void main(String[] args) {

		Words w = new Words();
		for(int i=0; i<10; i++) {
			System.out.println(w.getWord()+" ");
		}
	}//main()-----------

	
}//////////////////
