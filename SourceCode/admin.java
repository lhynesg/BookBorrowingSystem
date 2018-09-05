import javax.swing.*;
import javax.swing.border.Border;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class admin extends JFrame {
	int width = 500, height = 400;
	JButton EditBooks, EditBookList, EditBorrowers,back;
	JLabel admin;
	
	public admin(){
		
		Border border = BorderFactory.createLineBorder(Color.black, 2);

		setLayout(null);
		
	admin = new JLabel("Administrator");
	admin.setFont(new Font("Aparajita", Font.PLAIN, 18));
	admin.setBounds(20, 11, 94, 24);
	add(admin);
	
	EditBooks = new JButton("Edit Books Copies");
	EditBooks.setIcon( new ImageIcon("C:/Users/User/Desktop/bg.jpg") );
	EditBooks.setHorizontalTextPosition(JButton.CENTER);
	EditBooks.setVerticalTextPosition(JButton.CENTER);
	EditBooks.setBounds(138, 114, 144, 38);
	EditBooks.setBorder(border);
	
	EditBookList = new JButton("Edit Book lists");
	EditBookList.setIcon( new ImageIcon("C:/Users/User/Desktop/bg.jpg") );
	EditBookList.setHorizontalTextPosition(JButton.CENTER);
	EditBookList.setVerticalTextPosition(JButton.CENTER);
	EditBookList.setBounds(138, 177, 144, 38);
	EditBookList.setBorder(border);
	
	EditBorrowers = new JButton("Edit Book Borrowers");
	EditBorrowers.setIcon( new ImageIcon("C:/Users/User/Desktop/bg.jpg") );
	EditBorrowers.setHorizontalTextPosition(JButton.CENTER);
	EditBorrowers.setVerticalTextPosition(JButton.CENTER);
	EditBorrowers.setBounds(138, 238, 144, 38);
	EditBorrowers.setBorder(border);
	
	back = new JButton("Back");
	back.setIcon( new ImageIcon("C:/Users/User/Desktop/bg.jpg") );
	back.setHorizontalTextPosition(JButton.CENTER);
	back.setVerticalTextPosition(JButton.CENTER);
	back.setBounds(341, 329, 71, 31);
	back.setBorder(border);
	
	EditBooks.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
		{
			CopiesEditor edit = new CopiesEditor();
			dispose();
		}
	});
	
	EditBookList.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
		{
			
			editbooks edit = new editbooks();
			dispose();
		}
	});

	EditBorrowers.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
		{
			
			brwrsList act = new brwrsList();
			dispose();
		}
	});

	back.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
		{
			mainframe main = new mainframe();
			dispose();
		}
	});

	JLabel lablab = new JLabel(new ImageIcon(new ImageIcon("C:/Users/User/Desktop/bg1.jpg").getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT)));

	add(back);
	add(EditBookList);
	add(EditBooks);
	add(EditBorrowers);
	add(lablab);

	setUndecorated(true);
	setVisible(true);
	setResizable(false);
	setSize(424, 400);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
}
