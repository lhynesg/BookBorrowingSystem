import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class adminActions extends JFrame {
	private JTable table;
	private int width = 370, height = 500;
	private BufferedReader file;
	private Scanner x;
	
	public adminActions(){
		
		Border border = BorderFactory.createLineBorder(Color.black, 2);
		table = new JTable();
		table.setBounds(35, 77, 363, 322);
		add(table);
		setLayout(null);
		
		String[] columns = new String[] { "Registered Borrowers" };
		
		DefaultTableModel model = new DefaultTableModel();
		  
	        model.setColumnIdentifiers(columns);
	        
	        table.setBackground(Color.CYAN);
	        table.setForeground(Color.WHITE);
	        Font font = new Font("",5,12);
	        table.setFont(font);
	        table.setRowHeight(15);
	        table.setModel(model);
	        
	        
	        JScrollPane pane = new JScrollPane(table);
	        pane.setBounds(35, 77, 363, 322);
	        try
			{
				file = new BufferedReader(new FileReader("names.txt"));
				String s;
				
				while ((s = file.readLine())!=null)
				{
					model.addRow(new Object[] { s });
				}
				file.close();
			} 
	        catch(IOException e)
			{ 
				JOptionPane.showMessageDialog(null, "hey");
			}
		
		JLabel bkbrrowers = new JLabel("Registered Book Borrowers:");
		bkbrrowers.setBounds(25, 21, 189, 35);
		bkbrrowers.setFont(new Font("Tahoma", Font.PLAIN, 12));
		getContentPane().add(bkbrrowers);
		
		
		
		JButton delete = new JButton("Delete");
		delete.setIcon( new ImageIcon("C:/Users/User/Desktop/bg.jpg") );
		delete.setHorizontalTextPosition(JButton.CENTER);
		delete.setVerticalTextPosition(JButton.CENTER);
		delete.setBounds(25, 436, 114, 46);
		getContentPane().add(delete);
		delete.setBorder(border);

		JButton back = new JButton("Back");
		back.setIcon( new ImageIcon("C:/Users/User/Desktop/bg.jpg") );
		back.setHorizontalTextPosition(JButton.CENTER);
		back.setVerticalTextPosition(JButton.CENTER);
		back.setBounds(334, 452, 89, 30);


