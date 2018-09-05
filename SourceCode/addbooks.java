import javax.swing.*;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class addbooks extends JFrame {
	private JTextField bookname;
	private JTextField publisher;
	private JTextField copies;
	
	BufferedWriter file1, file2, file3;
	 int width = 420, height = 300;
	
	public addbooks() {
		
		JLabel add = new JLabel("Add Book");
		add.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add.setBounds(21, 11, 70, 32);
		add(add);
		
		JLabel name = new JLabel("Name of book:");
		name.setBounds(21, 78, 89, 32);
		add(name);
		
		JLabel pub = new JLabel("Publisher:");
		pub.setBounds(21, 121, 99, 32);
		add(pub);
		
		JLabel NumberOfCopies = new JLabel("number of copies:");
		NumberOfCopies.setBounds(21, 164, 89, 32);
		add(NumberOfCopies);
		
		bookname = new JTextField();
		bookname.setBounds(123, 84, 152, 20);
		add(bookname);
		
		publisher = new JTextField();
		publisher.setBounds(123, 127, 152, 20);
		add(publisher);
		
		copies = new JTextField();
		copies.setBounds(123, 170, 63, 20);
		add(copies);
		
		JButton addItem = new JButton("Add Item");
		addItem.setBounds(243, 218, 89, 32);
		add(addItem);
		
		JButton cancel = new JButton("Cancel");
		cancel.setBounds(335, 218, 89, 32);
		add(cancel);
		
		 addItem.addActionListener(new ActionListener() {
	    		public void actionPerformed(ActionEvent arg0) {
	    			String bk = bookname.getText();
	    			String pb = publisher.getText();
	    			String copy = copies.getText();
	    			
	    			try{
	    				file1 = new BufferedWriter(new FileWriter(new File("books.txt"), true));
	    				file2 = new BufferedWriter(new FileWriter(new File("publisher.txt"), true));
	    				file3 = new BufferedWriter(new FileWriter(new File("numberofcopies.txt"), true));
	    			
	    			file1.write(bk);
	    			file2.write(pb);
	    			file3.write(copy);
	    			file1.newLine();
	    			file2.newLine();
	    			file3.newLine();
	    			file1.close();
	    			file2.close();
	    			file3.close();
	    			
	    			JOptionPane.showMessageDialog(null, "Adding Success");
	    			
	    			dispose();
	    			editbooks bks = new editbooks();
	    			
	    			}
	    			catch(Exception e){
	    				
	    			}
	    					
	    					
	    			dispose();
	    		}
	    	});
	        
		 
		 cancel.addActionListener(new ActionListener() {
	    		public void actionPerformed(ActionEvent arg0) {
	    			
	    			editbooks main = new editbooks();
	    			dispose();
	    		}
	    	});
		 
		 JLabel lab = new JLabel();
		 add(lab);
		
		 setSize(width, height);
			setResizable(false);
			setLocationRelativeTo(null);
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLayout(null);
	        
	}
}
