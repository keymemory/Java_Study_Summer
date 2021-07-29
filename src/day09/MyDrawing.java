package day09;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyDrawing extends Frame{
	
	int x=50, y=50;
	
	public MyDrawing() {
		super("--MyDrawing--");
		
		MyHandler my = new MyHandler(this);
		addMouseMotionListener(my);
		addWindowListener(new WindowHandler());
	}
	
	public void update(Graphics g) {
		paint(g);
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.red);
		g.fillOval(x, y, 7, 7);
	}
	

	
	public static void main(String[] args) {
		MyDrawing my = new MyDrawing();
		my.setSize(400, 400);
		my.setVisible(true);
	}
	
	//WindowAdapter클래스 내부 클래스로 구현하기
	class WindowHandler extends WindowAdapter{
		
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
	
	
}////////////////////////



class MyHandler extends MouseMotionAdapter{
	
	MyDrawing remote;
	public MyHandler(MyDrawing my) {
		remote = my;
	}
	
	public void mouseDragged(MouseEvent e) {
		remote.x = e.getX();
		remote.y = e.getY();
		remote.repaint();
	}
	
}///////////////////
