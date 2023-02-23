package 문제복습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 로그인화면 {

	public static void main(String[] args) {
		JFrame f = new JFrame("로그인화면");
		f.setSize(500, 750);
		f.getContentPane().setBackground(Color.LIGHT_GRAY);
		f.setLayout(new FlowLayout());
		
		JLabel diary = new JLabel();
		ImageIcon diaryIcon = new ImageIcon("diary.jpg");
		diary.setIcon(diaryIcon);
		
		Font font = new Font("바탕", Font.ITALIC,30);
		Font font1 = new Font("고딕", Font.BOLD,30);
		
		JLabel id = new JLabel("ID :  ");
		id.setFont(font);
		JLabel pw = new JLabel("PW : ");
		pw.setFont(font);
		
		JTextField idField = new JTextField(15);
		idField.setFont(font1);
		JTextField pwField = new JTextField(15);
		pwField.setFont(font1);
		
		ImageIcon loginIcon = new ImageIcon("login.png");
		ImageIcon resetIcon = new ImageIcon("reset.png");
		
		JButton loginButton = new JButton();
		loginButton.setIcon(loginIcon);
		
		loginButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			String idText = idField.getText();
			String pwText = pwField.getText();
			
			if (idText.equals("root") && pwText.equals("1234")) {
				JOptionPane.showMessageDialog(f, "로그인성공");
				음식주문화면 next = new 음식주문화면();
				next.foodOpen();
			} else {
				JOptionPane.showMessageDialog(f, "로그인실패");
			}
				
			}
		});
		
		JButton resetButton = new JButton();
		resetButton.setIcon(resetIcon);
		
		resetButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				idField.setText("");
				pwField.setText("");
			}
		});
		
		
		
		
		
		
		f.add(diary);
		f.add(id);
		f.add(idField);
		f.add(pw);
		f.add(pwField);
		f.add(loginButton);
		f.add(resetButton);
		
		f.setVisible(true);
		
	}
	
}

