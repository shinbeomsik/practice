package 문제복습;

import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class 게시판화면 {
	
	public void menuopen() {
	
		JFrame f = new JFrame("후기게시판");
		f.setSize(500, 500);
		f.setLayout(new FlowLayout());
		
		Font font1 = new Font("바탕" , 1 , 30);
		Font font2 = new Font("d2coding" , 1 , 35);
		Font font3 = new Font("바탕" , Font.ITALIC , 30);
		
		Date time = new Date();
		JLabel date = new JLabel(time + "");
		date.setFont(font2);
		JLabel id = new JLabel("ID");
		id.setFont(font1);
		JLabel title = new JLabel("제목");
		title.setFont(font1);
		JLabel come = new JLabel("내용");
		come.setFont(font1);
		
		JTextField idText = new JTextField(15);
		JTextField titleText = new JTextField(15);
		
		JTextArea comeText = new JTextArea(10,10);
		comeText.setFont(font3);
		
		

		
		f.add(date);
		f.add(id);
		f.add(idText);
		f.add(title);
		f.add(titleText);
		f.add(come);
		f.add(comeText);
		
		f.setVisible(true);
		
	}
}
