package day09;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class MyDrawing2 extends Frame{
	
	Canvas can;
	public MyDrawing2() {
		super("--MyDrawing2--");
		
		setLayout(new FlowLayout());
		can = new MyCanvas(); // 도화지 역할을 하는 컴포넌트
		add(can);
		
		// 캔버스는 사이즈를 정해줘야 한다
		can.setSize(200, 200);
		// 캔버스 색상을 줘야 눈으로 확인 가능
		can.setBackground(Color.lightGray);
		addWindowListener(new WindowHandler2()); // 창 닫기 버튼
	}

	public static void main(String[] args) {
		MyDrawing2 my = new MyDrawing2();
		my.setSize(400, 400);
		my.setVisible(true);
	}
	
	//WindowAdapter클래스 내부 클래스로 구현하기
	class WindowHandler2 extends WindowAdapter{ // 창 닫기 버튼
		
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
	
	
}////////////////////////



class MyCanvas extends Canvas{
	int x,y;
	public MyCanvas() {
		//리스너 부착
		MyHandler2 my = new MyHandler2(this);
		addMouseMotionListener(my);
	}
	
	public void update(Graphics g) {
		paint(g);
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.green);
		g.fillOval(x, y, 7, 7);
	}
	
}/////////////////////



class MyHandler2 extends MouseMotionAdapter{
	
	MyCanvas can;
	public MyHandler2(MyCanvas can) {
		this.can = can;
	}
	
	public void mouseDragged(MouseEvent e) {
		can.x = e.getX();
		can.y = e.getY();
		can.repaint();
	}
	
}///////////////////
