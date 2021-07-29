package day08;


import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Label;
import java.awt.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyPanel extends JFrame{

	Label lb1, lb2, lb3;
	Choice ch;
	List list;
	JPanel p1, p2;
	
	public MyPanel() {
		lb1 = new Label("이름");
		add(lb1);
		lb1.setBackground(Color.CYAN);
		lb2 = new Label("이메일");
		add(lb2);
		lb2.setBackground(Color.YELLOW);
		lb3 = new Label("전화번호");
		add(lb3);
		lb3.setBackground(Color.GREEN);
		
		ch = new Choice();
		add(ch);
		ch.add("010");
		ch.add("011");
		ch.add("019");
		ch.addItem("018");
		
		list = new List(4, false);
		add(list);
		list.add("JAVA");
		list.add("JSP");
		list.add("EJB");
		list.add("SWING");
		list.add("AWT", 2);
		
		
		// 패널 생성
		p1 = new JPanel();
		add(p1);
		p1.setBackground(Color.BLACK);
		
		Button btn = new Button("OPEN");
		p1.add(btn);
		
		
		
	}
	
	
}
