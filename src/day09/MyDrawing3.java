package day09;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyDrawing3 extends Frame {

	Button bt[] = new Button[7];
	String str[] = { "Red", "Green", "Blue", "Small", "Large", "Clear", "AllClear" };

	Panel p1, p2;
	MyCanvas2 can;

	public MyDrawing3() {
		super("--MyDrawing3--");
		p1 = new Panel();
		add(p1, BorderLayout.NORTH);
		p1.setBackground(Color.CYAN);

		p2 = new Panel() {
			public Insets getInsets() { // 여백 설정하기
				return new Insets(30, 20, 20, 20);
			}
		};

		add(p2, BorderLayout.CENTER);
		p2.setBackground(Color.ORANGE);
		can = new MyCanvas2(); // 도화지 역할을 하는 컴포넌트
		p2.add(can);

		// 캔버스는 사이즈를 정해줘야 한다
		can.setSize(200, 200);
		// 캔버스 색상을 줘야 눈으로 확인 가능
		can.setBackground(Color.lightGray);

		for (int i = 0; i < bt.length; i++) {
			bt[i] = new Button(str[i]);
			p1.add(bt[i]);
			MyHandler3 my = new MyHandler3(can);
			bt[i].addActionListener(my);
		}

		addWindowListener(new WindowHandler3()); // 창 닫기 버튼
	}

	public static void main(String[] args) {
		MyDrawing3 my = new MyDrawing3();
		my.setSize(400, 400);
		my.setVisible(true);
	}

	// WindowAdapter클래스 내부 클래스로 구현하기
	class WindowHandler3 extends WindowAdapter { // 창 닫기 버튼

		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}

}////////////////////////



class MyCanvas2 extends Canvas {
	int x = -5, y = -5, w = 7, h = 7, flag = 0;
	Color cr = Color.GREEN;

	public MyCanvas2() {
		// 리스너 부착
		MyHandler3 my = new MyHandler3(this);
		addMouseMotionListener(my);
	}

	public void update(Graphics g) {
		paint(g);
	}

	public void paint(Graphics g) {

		if (flag == 0) {
			g.setColor(cr);
			g.fillOval(x, y, w, h);
		}

		else if (flag == 1) {
			g.clearRect(0, 0, this.getWidth(), this.getHeight());
		}
	}// paint()----------

}/////////////////////



class MyHandler3 extends MouseMotionAdapter implements ActionListener {

	MyCanvas2 can;

	public MyHandler3(MyCanvas2 can) {
		this.can = can;
	}// 생성자-----------------

	public void mouseDragged(MouseEvent e) {
		can.x = e.getX();
		can.y = e.getY();
		can.repaint();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// System.out.println("Event먹음");
		// Object obj = e.getSource();
		String cmd = e.getActionCommand();
		can.flag = 0;
		if (cmd.equals("Red")) {
			can.cr = Color.RED;
		}

		else if (cmd.equals("Green")) {
			can.cr = Color.GREEN;
		}

		else if (cmd.equals("Blue")) {
			can.cr = Color.BLUE;
		}

		else if (cmd.equals("Clear")) {
			can.cr = can.getBackground();
		}

		else if (cmd.equals("AllClear")) {
			can.flag = 1;
			can.repaint();
		}

		else if (cmd.equals("Large")) {
			can.w += 2;
			can.h += 2;
		}

		else if (cmd.equals("Small")) {
			if (can.w > 3) {
				can.w -= 2;
				can.h -= 2;
			}
		}

	}// actionPerformed()--------

}///////////////////
