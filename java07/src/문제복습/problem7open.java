package 문제복습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class problem7open {

	public void open() {
		
		JFrame f = new JFrame();
		f.setSize(500, 700);
		f.getContentPane().setBackground(Color.green);
		f.setTitle("나의 일기장");
		f.getContentPane().setBackground(Color.DARK_GRAY);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		Font font = new Font("바탕" , 1 , 20);
		
		
		JLabel day  = new JLabel();
		day.setText("오늘의 날짜");
		day.setFont(font);
		day.setForeground(Color.white);
		JLabel title  = new JLabel();
		title.setText("오늘의 제목");
		title.setFont(font);
		title.setForeground(Color.white);
		JLabel content  = new JLabel();
		content.setText("오늘의 내용");
		content.setFont(font);
		content.setForeground(Color.white);
		
		
		
		TextField dayText = new TextField(10);
		dayText.setForeground(Color.blue);
		TextField titleText = new TextField(10);
		titleText.setForeground(Color.blue);
		TextArea contentText = new TextArea();
		contentText.setForeground(Color.blue);
		
		JButton btn = new JButton();
		btn.setText("파일에 일기 저장");
		btn.setFont(font);
		btn.setBackground(Color.magenta);
		
		
		f.add(day);
		f.add(dayText);
		f.add(title);
		f.add(titleText);
		f.add(content);
		f.add(contentText);
		f.add(btn);
		
		
		f.setVisible(true);
		
		
	}
}
