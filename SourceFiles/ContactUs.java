package SourceFiles;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ContactUs extends JFrame implements ActionListener {
	
	JPanel p1;
    JButton Back,Exit;
    Font font = new Font("Times New Roman", Font.PLAIN, 20);
	
	ImageIcon icon1 = new ImageIcon ("Photos/Logo.jpg");
	ImageIcon icon = new ImageIcon ("Photos/ContactUs.png");
	
	
	public ContactUs()
	{
		super("Contact us");
		this.setSize(1200,800);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setIconImage(icon1.getImage());
		
		p1 = new JPanel();
		p1.setLayout(null);
		p1.setBounds(0,0,1200,800);
		p1.setOpaque(false);
		this.add(p1);
		this.setLayout(null);
		
		JLabel background = new JLabel(icon);
		background.setBounds(0,0,1200,800);
		this.add(background);
		
	    Back = new JButton("Back");
		Back.setBounds(90,700,120,40);
		Back.setFont(font);
		Back.setForeground(Color.white);
        Back.setBackground(Color.blue);
		Back.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent e) {
         setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
           }
         public void mouseExited(MouseEvent e) {
         setCursor(Cursor.getDefaultCursor());
           }
           });
		Back.addActionListener(this);
		Back.setFocusPainted(false);
		p1.add(Back);
		
		Exit = new JButton("Exit");
		Exit.setBounds(380,700,120,40);
		Exit.setFont(font);
		Exit.setForeground(Color.white);
        Exit.setBackground(Color.red);
		Exit.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent e) {
         setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
           }
         public void mouseExited(MouseEvent e) {
         setCursor(Cursor.getDefaultCursor());
           }
           });
		Exit.addActionListener(this);
		Exit.addActionListener(this);
		p1.add(Exit);
		
		
		 this.setVisible(true);
		 
	} 
	
	
	
	
   public void actionPerformed(ActionEvent ae) {
		  
		  
	   if(ae.getSource()==Back)
		{
			
			this.setVisible(false);
			new HomePage();
			
		}
			
	  else if(ae.getSource()==Exit)
		{
			System.exit(0);
		} 
	}

 
}
