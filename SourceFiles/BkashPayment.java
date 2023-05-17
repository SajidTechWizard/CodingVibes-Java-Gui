package SourceFiles;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;



public class BkashPayment extends JFrame implements ActionListener {
	
	JLabel l1,l2;
	JPanel p1;
    JButton Back,Pay;
	JTextField phone;
	JPasswordField pin;
    
	
	Font font = new Font("Times New Roman", Font.PLAIN, 20);
	Font radioFont = new Font("Arial", Font.PLAIN, 16);
	
	ImageIcon icon1 = new ImageIcon ("Photos/Logo.jpg");
	ImageIcon icon = new ImageIcon ("Photos/BkashPayment.jpg");
	
	
	public BkashPayment()
	{
		super("Bkash Payment");
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
		
		l1 = new JLabel("Mobile Number :");
		l1.setBounds(850,200,200,45);
		l1.setForeground(Color.white);
		l1.setFont(new Font("cambria" , Font.BOLD ,20));
		p1.add(l1);

		l2= new JLabel("PIN Code : ");
		l2.setBounds(850,300,200,45);
	    l2.setForeground(Color.white);
		l2.setFont(new Font("cambria" , Font.BOLD ,20));
		p1.add(l2);
		
		
		
		phone = new JTextField(); 
		phone.setBounds(850,240,230,30);
		phone.setFont(font);
		phone.setBackground(new Color(255,255,255,250));
		p1.add(phone);
		
		pin = new JPasswordField();
		pin.setBounds(850,340,230,30);
		pin.setFont(font);
		pin.setBackground(new Color(255,255,255,250));
		pin.setEchoChar('•');
		p1.add(pin);
		
		Back = new JButton("Cancel");
		Back.setBounds(845,500,90,30);
		Back.setFont(font);
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
		Back.setForeground(Color.white);
        Back.setBackground(new Color(142, 69, 133));
		p1.add(Back);
		
		Pay = new JButton("Pay"); 
		Pay.setBounds(1020,500,90,30);
		Pay.setFont(font);
		Pay.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent e) {
         setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
           }
         public void mouseExited(MouseEvent e) {
         setCursor(Cursor.getDefaultCursor());
           }
           });
	
	    Pay.setFocusPainted(false);
		Pay.addActionListener(this);
		Pay.setForeground(Color.black);
        Pay.setBackground(Color.yellow);
		p1.add(Pay);
		
		this.setVisible(true);
	}
	
	


  public void actionPerformed(ActionEvent ae) {
	
        if (ae.getSource() == Pay) {
               if (phone.getText().equals("") || pin.getText().equals("")) {
                  JOptionPane.showMessageDialog(null, "You need to fill all information", "CodingVibes", JOptionPane.WARNING_MESSAGE);
      } else {
            JOptionPane.showMessageDialog(null, "Payment Complete", "Thank You", JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
            new FinishingPage();
        }
    } else if (ae.getSource() == Back) {
		
        this.setVisible(false);
        new PaymentOptions();
    }  
}

 
}
	
	