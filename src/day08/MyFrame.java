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
		// ��, ��, ��, ��, ��� ���� ��ġ���� ���� �ִ�.
		btn = new Button("��ư");
		btn.addActionListener(this);
		btn2 = new Button("��ư2");
		btn2.addActionListener(this);
		btn3 = new Button("��ư3");
		btn3.addActionListener(this);
		btn4 = new Button("��ư4");
		btn4.addActionListener(this);
		btn5 = new Button("��ư5");
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
			btn.setLabel("��ư�� ���������ϴ�");
		}
		
		if(obj==btn) {
			btn.setLabel("��ư�� ���������ϴ�");
		}
		
		else if(obj==btn2) {
			btn2.setLabel("��ư2�� ���������ϴ�");
		}
		
		else if(obj==btn3) {
			btn3.setLabel("��ư3�� ���������ϴ�");
		}
		
		else if(obj==btn4) {
			btn4.setLabel("��ư4�� ���������ϴ�");
		}
		
		else
			btn5.setLabel("��ư5�� ���������ϴ�");
	
	}//actionPerformed()-------
	
	
}
