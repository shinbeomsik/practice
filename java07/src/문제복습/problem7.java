package 문제복습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class problem7 {

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setSize(500, 700);
		f.getContentPane().setBackground(Color.green);
		f.setTitle("나의 일기장");
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		Font font = new Font("바탕" , 1 , 20);
		
		ImageIcon icon1 = new ImageIcon("diary.jpg");
		ImageIcon icon2 = new ImageIcon("login.png");
		ImageIcon icon3 = new ImageIcon("reset.png");
		
		JLabel diary  = new JLabel();
		diary.setIcon(icon1);
		JLabel id  = new JLabel();
		id.setText("아 이 디  :");
		id.setFont(font);
		JLabel pw  = new JLabel();
		pw.setText("패스워드 :");
		pw.setFont(font);		
		
		JTextField idText = new JTextField(10);
		JTextField pwText = new JTextField(10);
		
		JButton login = new JButton();
		login.setIcon(icon2);
		
		login.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String id2 = idText.getText();
				String pw2 = pwText.getText();
				
				if (id2.equals("root") && pw2.equals("1234")) {
					JOptionPane.showMessageDialog(f, "로그인성공");
					problem7open diary = new problem7open();
					diary.open();
				} else {
					JOptionPane.showMessageDialog(f, "로그인실패");
				}
				
			}
		});
		
		
		JButton reset = new JButton();
		reset.setIcon(icon3);
		
		reset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				idText.setText("");
				pwText.setText("");
			}
		});
		
		
		f.add(diary);
		f.add(id);
		f.add(idText);
		f.add(pw);
		f.add(pwText);
		f.add(login);
		f.add(reset);
	
		
		f.setVisible(true);
	}
	
}
