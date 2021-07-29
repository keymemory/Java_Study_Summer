package day08;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
public class MyFrame extends JFrame implements ActionListener{

	Button btn, btn2, btn3, btn4, btn5;
	
	public MyFrame() {
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		// 동, 서, 남, 북, 가운데 영역 배치값을 갖고 있다.
		btn = new Button("버튼");
		btn.addActionListener(this);
		btn2 = new Button("버튼2");
		btn2.addActionListener(this);
		btn3 = new Button("버튼3");
		btn3.addActionListener(this);
		btn4 = new Button("버튼4");
		btn4.addActionListener(this);
		btn5 = new Button("버튼5");
		btn5.addActionListener(this);
		
		this.add(btn, BorderLayout.EAST);
		this.add(btn2, BorderLayout.WEST);
		this.add(btn3, BorderLayout.SOUTH);
		this.add(btn4, BorderLayout.NORTH);
		this.add(btn5, BorderLayout.CENTER);
		
		setVisible(true);
	}//MyFrame()------
	

	@Override
	public void actionPerformed(ActionEvent arg0) {

		Button obj = (Button)arg0.getSource();
		
		if(obj==btn) {
			btn.setLabel("버튼이 눌려졌습니다");
		}
		
		if(obj==btn) {
			btn.setLabel("버튼이 눌려졌습니다");
		}
		
		else if(obj==btn2) {
			btn2.setLabel("버튼2이 눌려졌습니다");
		}
		
		else if(obj==btn3) {
			btn3.setLabel("버튼3이 눌려졌습니다");
		}
		
		else if(obj==btn4) {
			btn4.setLabel("버튼4이 눌려졌습니다");
		}
		
		else
			btn5.setLabel("버튼5이 눌려졌습니다");
	
	}//actionPerformed()-------
	
	
}
