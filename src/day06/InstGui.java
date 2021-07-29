package day06;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileWriter;
import java.io.IOException;

public class InstGui extends Frame{

	InstApp ia = new InstApp();
	// ����ó�� ������ ���� Ŭ���� - �ܼ� ���ø����̼�
	
	Person p;
	TextArea ta;
	// ���, ����, �˻�, ���, ����
	Button reg, del, find, print, save;
	// �л�, ����, ����, �˻�, �˻�����
	Button btStudent, btTeacher, btStaff, btFindOk, btFindClose;
	Button btOk, btCancel, btClose;
	
	// ��ȭ���� 3�� �����
	Dialog dial1, dial2, dial3;
	Label lbName, lbAddr, lbId, lbPub;
	TextField tfName, tfAddr, tfId, tfPub, tfFindName;
	
	
	public InstGui() {
		super("---�л���� ���α׷� v1.1---");
		makeGui();
		
		addWindowListener(new WindowAdapter(){ // â �ݱ�
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		setSize(500, 500);
		setVisible(true);
	}//������--------------
	
	
	public void makeGui() {
		ta = new TextArea();
		add(ta, "Center");
		
		Panel pn = new Panel(new GridLayout(0, 1, 10, 10)) {
			// �� �ٱ� ������ �����ϴ� �޼ҵ� �������̵�
			public Insets getInsets() {
				return new Insets(10, 10, 10, 10);
			}
		};
		
		// ���� 1 ���� ����
		pn.setBackground(Color.ORANGE);
		add(pn, "East");
		pn.add(reg = new Button("���"));
		pn.add(find = new Button("�˻�"));
		pn.add(del = new Button("����"));
		pn.add(print = new Button("���"));
		pn.add(save = new Button("����"));
		
		// Dialog 1 �����
		dial1 = new Dialog(this, true);
		dial2 = new Dialog(this, true);
		dial3 = new Dialog(this, "---�˻�---", true);
		
		//dial 1�� ���۳�Ʈ ����
		btStudent = new Button("�л�");
		btTeacher = new Button("����");
		btStaff = new Button("����");
		btClose = new Button("�ݱ�");
		
		dial1.setTitle("--���--");
		dial1.setLayout(new GridLayout(1,0));
		dial1.add(btStudent);
		dial1.add(btTeacher);
		dial1.add(btStaff);
		dial1.add(btClose);
		
		
		// dial 2�� ���۳�Ʈ ����
		Panel dp1 = new Panel();
		Panel dp2 = new Panel();
		Panel dp3 = new Panel();
		dp1.setLayout(new GridLayout(4, 1));
		dp2.setLayout(new GridLayout(4, 1));
		
		dial2.add(dp1, "West"); // ����� ���� ��
		dial2.add(dp2, "Center");
		dial2.add(dp3, "South");
		
		dp1.add(lbName = new Label("�̸�"));
		dp1.add(lbAddr = new Label("�ּ�"));
		dp1.add(lbId = new Label("ID"));
		dp1.add(lbPub = new Label("��Ÿ"));
		
		dp2.add(tfName = new TextField());
		dp2.add(tfAddr = new TextField());
		dp2.add(tfId = new TextField());
		dp2.add(tfPub = new TextField());
		
		dp3.add(btOk = new Button("ó��"));
		dp3.add(btCancel = new Button("���"));
		
		// dial 3�� �˻� �Ǵ� ���� ���� ���۳�Ʈ ����
		Label lb = new Label("�̸��� �Է��ϼ���");
		dial3.add(lb, "North");
		Panel dp4 = new Panel();
		dial3.add(dp4,  "Center");
		tfFindName = new TextField(20);
		dp4.add(tfFindName);
		btFindOk = new Button("Ȯ��");
		btFindClose = new Button("�ݱ�");
		dp4.add(btFindOk);
		dp4.add(btFindClose);
		
		//������ ����
		MyHandler my = new MyHandler(); // �̺�Ʈ ó�� Ŭ����
		reg.addActionListener(my);
		find.addActionListener(my);
		del.addActionListener(my);
		print.addActionListener(my);
		save.addActionListener(my);
		
		btStudent.addActionListener(my);
		btTeacher.addActionListener(my);
		btStaff.addActionListener(my);
		btOk.addActionListener(my);
		btCancel.addActionListener(my);
		btClose.addActionListener(my);
		
		btFindOk.addActionListener(my);
		btFindClose.addActionListener(my);
		
		ta.setEditable(false);
		
	}//makeGui()--------
	
	
	// �̺�Ʈ�� ó���ϴ� Ŭ���� - inner Member Class
	class MyHandler implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			Object o = e.getSource();
			if(o==reg) { // ���
				dial1.pack();
				// �� ���۳�Ʈ�� preferred size��ŭ �����Ͽ� ũ�⸦ ���Ѵ�
				dial1.setLocation(500, 0);
				dial1.setVisible(true);
			}
			
			else if(o==find) { // �˻�
				dial3.setTitle("--�˻�--");
				dial3.pack();
				dial3.setVisible(true);
			}
			
			else if(o==del) { // ����
				dial3.setTitle("--����--");
				dial3.pack();
				dial3.setVisible(true);
			}
			
			else if(o==print) { // ���
				String str = ia.printAll();
				ta.append(str + "\n");
			}
			
			else if(o==save) { // ����
				// 1>, 2>
				FileDialog fd = new FileDialog(InstGui.this , "��������", FileDialog.SAVE);
				
				fd.setVisible(true);;
				// ���� ��� ���
				String dir = fd.getDirectory();
				String file = fd.getFile();
				String filename = dir + file;
				setTitle(filename);
				
				try {
					FileWriter fw = new FileWriter(filename);
					String content = ta.getText();
					// ta�κ��� ������ ������ fw�� ���ؼ� ����
					fw.write(content);
					fw.flush();
					fw.close();
					setTitle("���� �Ϸ�");
					ta.append("����Ϸ�!!" + filename + "\n");
				}
				catch (IOException e1) {
					//TODE Auto-generated catch block
					e1.printStackTrace();
				}
			}//else if(o==save)-----------
			
			else if(o==btStudent) { // �л�
				dial2.setTitle("--�л� ���--");
				lbId.setText("�й�");
				lbPub.setText("�б�");
				dial2.pack();
				dial2.setLocation(500, 30);
				dial2.setVisible(true);
			}
			
			else if(o==btStudent) { // �л�
				dial2.setTitle("--�л� ���--");
				lbId.setText("�й�");
				lbPub.setText("�б�");
				dial2.pack();
				dial2.setLocation(500, 30);
				dial2.setVisible(true);
			}
			
			else if(o==btTeacher) { // ����
				dial2.setTitle("--���� ���--");
				lbId.setText("����");
				lbPub.setText("����");
				dial2.pack();
				dial2.setLocation(500, 30);
				dial2.setVisible(true);
			}
			
			else if(o==btStaff) { // ����
				dial2.setTitle("--���� ���--");
				lbId.setText("���");
				lbPub.setText("�μ�");
				dial2.pack();
				dial2.setLocation(500, 30);
				dial2.setVisible(true);
			}
			
			else if(o==btOk) { // ����� ���� ���
				String name = tfName.getText();
				String addr = tfAddr.getText();
				String id = tfId.getText();
				
				String pub = tfPub.getText();
				// � ��ü�̳Ŀ� ���� ��� �޼ҵ尡 �޶�����
				
				String title = dial2.getTitle();
				System.out.println(title);
				// ���ڿ� �ε��� 2���� 4�� �������� �߶󳻾� �����ش�
				String word = title.substring(2,4);
				System.out.println(word);
				
				if(word.equals("�л�")) {
					 p =new Student();
					 ((Student)p).setClassName(pub);
				}
				else if(word.equals("����")) {
					 p =new Teacher();
					 ((Teacher)p).setSubject(pub);
				}
				else if(word.equals("����")) {
					 p =new Staff();
					 ((Staff)p).setDept(pub);
				}
				p.setName(name);
				p.setAddr(addr);
				p.setId(id);
				// �����Ͻ� �޼ҵ�---------------
				ia.addPerson(p);
				//--------------------------
				tfName.setText("");
				tfId.setText("");
				tfAddr.setText("");
				tfPub.setText("");
				
				tfName.requestFocus();
				
			}//else if(o==btOk)----------
			
			else if(o==btCancel) { // ���
				dial2.dispose();
				tfName.setText("");
				tfId.setText("");
				tfAddr.setText("");
				tfPub.setText("");
			}
			
			else if(o==btClose) { // �ݱ�
				// dial 1 �ݱ�
				dial1.dispose();
			}
			
			if(o==btFindOk) { // �˻�(���) Ȯ��
				String title = dial3.getTitle();
				String word = title.substring(2,4);
				//�������� �˻� â���� ���� â���� �����ϱ� ����
				
				if(word.equals("�˻�")) {
					String name = tfFindName.getText();
					//-------------------
					String msg = ia.findPerson(name);
					//-------------------
					ta.append(msg + "\n");
				}
				else {
					String name = tfFindName.getText();
					//---------------------
					String msg = ia.removePerson(name);
					//---------------------
					ta.append(msg + "\n");
				}
				tfFindName.setText("");
			}
			
			else if(o==btFindClose) { // �˻�(����)â �ݱ�
				dial3.dispose();
			}
			
			
		}//actionPerformed---------------
		
		
	}//MyHandler--------------
	
	
	
	public static void main(String[] args) {
		new InstGui();
	}
	
	
}///////////////////////
