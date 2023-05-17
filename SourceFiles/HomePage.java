package SourceFiles;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class HomePage extends JFrame implements ActionListener {

	JPanel p1,p2;
	JButton aboutUsButton, viewAllCoursesButton,blogButton,contactUsButton,learnMoreButton,CartButton,ourteam,reviews;
    JButton Back,Exit;
    JTextField screen1;
	JPasswordField screen2;
	Font font = new Font("Times New Roman", Font.PLAIN, 20);
	
	ImageIcon icon1 = new ImageIcon ("Photos/Logo.jpg");
	ImageIcon icon = new ImageIcon ("Photos/HomePage.jpg");
	
	
	public HomePage ()
	{
		super("Home Page");
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
		
		p2 = new JPanel();
		p2.setLayout(null);
		p2.setBounds(0,0,400,800);
		p2.setBackground(new Color(1, 121, 111));
		p1.add(p2);
		this.setLayout(null);
		
		
		
		JLabel background = new JLabel(icon);
		background.setBounds(0,0,1200,800);
		this.add(background);
		
		 aboutUsButton = new JButton("About Us");
		 aboutUsButton.setBounds(75,460,250,45);
		 aboutUsButton.setFont(font);
		 aboutUsButton.setBackground(new Color(135, 206, 235));
		 aboutUsButton.setForeground(new Color(0,0,0));
	//	 aboutUsButton.setOpaque(false);
		 aboutUsButton.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent e) {
         setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
           }
         public void mouseExited(MouseEvent e) {
         setCursor(Cursor.getDefaultCursor());
           }
           });
		 aboutUsButton.addActionListener(this);
		 aboutUsButton.setFocusPainted(false);
    /*     aboutUsButton.addActionListener(new ActionListener() {
            
                public void actionPerformed(ActionEvent e) {
         
                JOptionPane.showMessageDialog(p1, "Know us better","CodingVibes",-1);
            }
        }); 
	*/
        p2.add(aboutUsButton);

        contactUsButton = new JButton("Contact Us");
		contactUsButton.setBounds(75,340,250,45);
		contactUsButton.setFont(font);
		contactUsButton.setBackground(new Color(135, 206, 235));
		contactUsButton.setForeground(new Color(0,0,0));
	//	contactUsButton.setOpaque(false);
	    contactUsButton.setFocusPainted(false);
		contactUsButton.addMouseListener(new MouseAdapter() {
        public void mouseEntered(MouseEvent e) {
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
           }
        public void mouseExited(MouseEvent e) {
        setCursor(Cursor.getDefaultCursor());
           }
           });
	    contactUsButton.addActionListener(this);
    /*    contactUsButton.addActionListener(new ActionListener() {
            
			
                public void actionPerformed(ActionEvent e) {
               
                JOptionPane.showMessageDialog(p1, "You can contact us here","CodingVibes",-1);
            }
        }); 
	*/
        p2.add(contactUsButton);
		
		 viewAllCoursesButton = new JButton("View all Courses");
		 viewAllCoursesButton.setBounds(75,40,250,45);
		 viewAllCoursesButton.setFont(font);
		 viewAllCoursesButton.setBackground(new Color(135, 206, 235));
		 viewAllCoursesButton.setForeground(new Color(0,0,0));
	//	 viewAllCoursesButton.setOpaque(false);
		 viewAllCoursesButton.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent e) {
         setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
           }
         public void mouseExited(MouseEvent e) {
         setCursor(Cursor.getDefaultCursor());
           }
           });
		 viewAllCoursesButton.addActionListener(this);
		 viewAllCoursesButton.setFocusPainted(false);
    /*     viewAllCoursesButton.addActionListener(new ActionListener() {
            
                public void actionPerformed(ActionEvent e) {
         
                JOptionPane.showMessageDialog(p1, "All the courses are listed here","CodingVibes",-1);
            }
        });
	*/
        p2.add(viewAllCoursesButton);

       
         ourteam = new JButton("Our Team");
		 ourteam.setBounds(75,400,250,45);
		 ourteam.setFont(font);
		 ourteam.setBackground(new Color(135, 206, 235));
		 ourteam.setForeground(new Color(0,0,0));
	//	 ourteam.setOpaque(false);
		 ourteam.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent e) {
         setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
           }
         public void mouseExited(MouseEvent e) {
         setCursor(Cursor.getDefaultCursor());
           }
           });
	    ourteam.addActionListener(this);
		ourteam.setFocusPainted(false);
    /*    ourteam.addActionListener(new ActionListener() {
            
                public void actionPerformed(ActionEvent e) {
         
                JOptionPane.showMessageDialog(p1, "Meet our Team","CodingVibes",-1);
            }
        });
	*/
        p2.add(ourteam);
       
	   
	     learnMoreButton = new JButton("Learn More");
		 learnMoreButton.setBounds(75,280,250,45);
		 learnMoreButton.setFont(font);
		 learnMoreButton.setBackground(new Color(135, 206, 235));
		 learnMoreButton.setForeground(new Color(0,0,0));
	//	 learnMoreButton.setOpaque(false);
		 learnMoreButton.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent e) {
         setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
           }
         public void mouseExited(MouseEvent e) {
         setCursor(Cursor.getDefaultCursor());
           }
           });
		 learnMoreButton.addActionListener(this);
		 learnMoreButton.setFocusPainted(false);
    /*     learnMoreButton.addActionListener(new ActionListener() {
            
                public void actionPerformed(ActionEvent e) {
         
                JOptionPane.showMessageDialog(p1, "Learn more about CodingVibes","CodingVibes",-1);
            }
        });
	*/
        p2.add(learnMoreButton);

         blogButton = new JButton("Blog");
		 blogButton.setBounds(75,160,250,45);
		 blogButton.setFont(font);
		 blogButton.setBackground(new Color(135, 206, 235));
		 blogButton.setForeground(new Color(0,0,0));
	//	 blogButton.setOpaque(false);
		 blogButton.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent e) {
         setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
           }
         public void mouseExited(MouseEvent e) {
         setCursor(Cursor.getDefaultCursor());
           }
           });
		 blogButton.addActionListener(this);
		 blogButton.setFocusPainted(false);
    /*       blogButton.addActionListener(new ActionListener() {
            
                public void actionPerformed(ActionEvent e) {
         
                JOptionPane.showMessageDialog(p1, "Welcome to our Blog","CodingVibes",-1);
            }
        });
	*/
        p2.add(blogButton);
		
		 CartButton = new JButton("Cart");
		 CartButton.setBounds(75,100,250,45);
		 CartButton.setFont(font);
		 CartButton.setBackground(new Color(135, 206, 235));
		 CartButton.setForeground(new Color(0,0,0));
	//	 CartButton.setOpaque(false);
		 CartButton.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent e) {
         setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
           }
         public void mouseExited(MouseEvent e) {
         setCursor(Cursor.getDefaultCursor());
           }
           });
	    CartButton.addActionListener(this);
		CartButton.setFocusPainted(false);
    /*    CartButton.addActionListener(new ActionListener() {
            
                public void actionPerformed(ActionEvent e) {
         
                JOptionPane.showMessageDialog(p1, "Welcome to our cart","CodingVibes",-1);
            }
        });
	*/
        p2.add(CartButton);
		
		 reviews = new JButton("Reviews");
		 reviews.setBounds(75,220,250,45);
		 reviews.setFont(font);
		 reviews.setBackground(new Color(135, 206, 235));
		 reviews.setForeground(new Color(0,0,0));
	//	 reviews.setOpaque(false);
		 reviews.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent e) {
         setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
           }
         public void mouseExited(MouseEvent e) {
         setCursor(Cursor.getDefaultCursor());
           }
           });
	    reviews.addActionListener(this);
		reviews.setFocusPainted(false);
    /*    reviews.addActionListener(new ActionListener() {
            
                public void actionPerformed(ActionEvent e) {
         
                JOptionPane.showMessageDialog(p1, "See reviews of CodingVibes","CodingVibes",-1);
            }
        });
	*/
        p2.add(reviews);
		
		
		
        Back = new JButton("Back");
		Back.setBounds(37,700,120,40);
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
        Back.setBackground(Color.blue);
		p2.add(Back);
		
		Exit = new JButton("Exit");
		Exit.setBounds(237,700,120,40);
		Exit.setFont(font);
		Exit.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent e) {
         setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
           }
         public void mouseExited(MouseEvent e) {
         setCursor(Cursor.getDefaultCursor());
           }
           });
		Exit.addActionListener(this);
		Exit.setFocusPainted(false);
		Exit.setForeground(Color.white);
        Exit.setBackground(Color.red);
		p2.add(Exit);
		
		
		 this.setVisible(true);
		 
	} 

  public void actionPerformed(ActionEvent ae) {
	  
	   if(ae.getSource()==Back)
		{
			
			this.setVisible(false);
			new UserLogin();
			
		}
		
		
	  else if(ae.getSource()==Exit)
		{
			System.exit(0);
		} 
		
		else if(ae.getSource()==aboutUsButton)
		{
			
			this.setVisible(false);
			new AboutUs();
			
		} 
		
		else if(ae.getSource()==ourteam)
		{
			
			this.setVisible(false);
			new OurTeam();
			
		} 
		
		else if(ae.getSource()==reviews)
		{
			
			this.setVisible(false);
			new Review();
			
		} 
		
		else if(ae.getSource()==contactUsButton)
		{
			
			this.setVisible(false);
			new ContactUs();
			
		} 
		else if(ae.getSource()==blogButton)
		{
			
			this.setVisible(false);
			new OurBlog();
			
		} 
		else if(ae.getSource()==viewAllCoursesButton)
		{
			
			this.setVisible(false);
			new Courses1();
			
		}
		else if(ae.getSource()==learnMoreButton)
		{
			
			this.setVisible(false);
			new LearnMore();
			
		} 
		else if(ae.getSource()==CartButton)
		{
			
			this.setVisible(false);
			new CartPage();
			
		} 
	}

 
}
	  
      
    