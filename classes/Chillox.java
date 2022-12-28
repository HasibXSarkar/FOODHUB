package classes;
import interfaces.*;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;

public class Chillox implements ActionListener,IChillox{

	private JFrame  frame;
	
	private JCheckBox s;
	private JCheckBox h;
	private JCheckBox ff;
	private JCheckBox tb ;
	
	private JLabel quantity1;
	private JLabel quantity2;
	private JLabel quantity3;
	private JLabel quantity4;
	
	private JLabel sLabel;
	private JLabel hLabel;
	private JLabel ffLabel;
	private JLabel tbLabel;
	
	private JLabel sPrice;
	private JLabel hPrice;
	private JLabel ffPrice;
	private JLabel tbPrice;
	
	private JComboBox<String> sNumber;
	private JComboBox<String> hNumber;
	private JComboBox<String> ffNumber;
	private JComboBox<String> tbNumber;
	
	private JButton goBack;
	private JButton placeOrder;
	
	private JMenuBar menuBar;  
	private JMenu users;
	private JMenuItem profile, logout;

	private String a [] = {"1","2","3","4","5","6","7","8","9"};
	private String b [] = {"1","2","3","4","5","6","7","8","9"};
	private String c [] = {"1","2","3","4","5","6","7","8","9"};
	private String d [] = {"1","2","3","4","5","6","7","8","9"};
	
	private String f;
	
	public Chillox(String user)
	{
		f= user;
		
		frame = new JFrame("Chillox Menu");
		ImageIcon framelogo = new ImageIcon("icons/framelogo.jpg");
		Image background = new ImageIcon("icons/restbackground.png").getImage();
		frame.setContentPane(new ImagePanel(background));
		
		Image image1 = new ImageIcon("icons/s.png").getImage().getScaledInstance(250, 160, Image.SCALE_DEFAULT);
		ImageIcon sIcon = new ImageIcon(image1);
		
		s = new JCheckBox("All Flavoured Shakes");
		s.setBounds(40, 170, 200, 20);
		s.setFocusable(false);
		s.setForeground(Color.white);
		s.setBackground(Color.decode("#696969"));
		s.addActionListener(this);
		frame.add(s);
		
		sLabel = new JLabel(sIcon);
		sLabel.setBounds(20, 20, 340, 140);
		frame.add(sLabel);
		
		sPrice = new JLabel("Price: 199.99 tk");
		sPrice.setBounds(240, 170, 150, 20);
		sPrice.setBackground(Color.black);
		sPrice.setForeground(Color.white);
		frame.add(sPrice);
		
		sNumber = new JComboBox<String>(a);
		sNumber.setBounds(40, 200, 50, 17);
		sNumber.setFocusable(false);;
		frame.add(sNumber);
	
		quantity1 = new JLabel("⟻Quantity");
		quantity1.setBounds(95, 200, 80, 17);
		quantity1.setBackground(Color.black);
		quantity1.setForeground(Color.white);
		frame.add(quantity1);
		
		Image image2 = new ImageIcon("icons/h.png").getImage().getScaledInstance(250, 170, Image.SCALE_DEFAULT);
		ImageIcon hIcon = new ImageIcon(image2);
		h= new JCheckBox("Ham Burgers");
		h.setBounds(480, 170, 200, 20);
		h.setFocusable(false);
		h.setForeground(Color.white);
		h.setBackground(Color.decode("#696969"));
		frame.add(h);
		
		hPrice = new JLabel("Price: 399.99 tk");
		hPrice.setBounds(680, 170, 150, 20);
		hPrice.setBackground(Color.black);
		hPrice.setForeground(Color.white);
		frame.add(hPrice);
		
		hLabel = new JLabel(hIcon);
		hLabel.setBounds(450, 0, 340, 200);
		frame.add(hLabel);
		
		hNumber = new JComboBox<String>(b);
		hNumber.setBounds(480, 200, 50, 17);
		hNumber.setFocusable(false);
		frame.add(hNumber);
		
		quantity2 = new JLabel("⟻Quantity");
		quantity2.setBounds(535, 200, 80, 17);
		quantity2.setBackground(Color.black);
		quantity2.setForeground(Color.white);
		frame.add(quantity2);
		
		
		Image image3 = new ImageIcon("icons/ff.png").getImage().getScaledInstance(250, 160, Image.SCALE_DEFAULT);
		ImageIcon ffIcon = new ImageIcon(image3);
		ff = new JCheckBox("French Fries");
		ff.setBounds(480, 430, 200, 20);
		ff.setFocusable(false);
		ff.setForeground(Color.white);
		ff.setBackground(Color.decode("#696969"));
		frame.add(ff);
		
		ffPrice = new JLabel("Price: 159.99 tk");
		ffPrice.setBounds(680, 430, 150, 20);
		ffPrice.setBackground(Color.black);
		ffPrice.setForeground(Color.white);
		frame.add(ffPrice);
		
		ffLabel = new JLabel(ffIcon);
		ffLabel.setBounds(450, 250, 340, 200);
		frame.add(ffLabel);
		
		ffNumber = new JComboBox<String>(c);
		ffNumber.setBounds(480, 470, 50, 17);
		ffNumber.setFocusable(false);
		frame.add(ffNumber);
		
		quantity3 = new JLabel("⟻Quantity");
		quantity3.setBounds(535, 470, 80, 17);
		quantity3.setBackground(Color.black);
		quantity3.setForeground(Color.white);
		frame.add(quantity3);
		
		
		Image image4 = new ImageIcon("icons/tb.png").getImage().getScaledInstance(250, 200, Image.SCALE_DEFAULT);
		ImageIcon tbIcon = new ImageIcon(image4);
		tb  = new JCheckBox("Tripple Beef Patty Burger");
		tb.setBounds(40, 430, 180, 20);
		tb.setFocusable(false);
		tb.setForeground(Color.white);
		tb.setBackground(Color.decode("#696969"));
		frame.add(tb);
		
	
		tbPrice = new JLabel("Price: 600.0 tk");
		tbPrice.setBounds(230, 430, 180, 20);
		tbPrice.setBackground(Color.black);
		tbPrice.setForeground(Color.white);
		frame.add(tbPrice);
		
		
		tbLabel = new JLabel(tbIcon);
		tbLabel.setBounds(20, 250, 340, 180);
		frame.add(tbLabel);
		
		tbNumber = new JComboBox<String>(d);
		tbNumber.setBounds(40, 470, 50, 17);
		tbNumber.setFocusable(false);
		frame.add(tbNumber);
		
		quantity4 = new JLabel("⟻Quantity");
		quantity4.setBounds(95, 470, 80, 17);
		quantity4.setBackground(Color.black);
		quantity4.setForeground(Color.white);
		frame.add(quantity4);
		
		profile = new JMenuItem ("Profile");
		profile.addActionListener(this);
		profile.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		logout = new JMenuItem ("Logout");
		logout.addActionListener(this);
		logout.setCursor(new Cursor(Cursor.HAND_CURSOR));
	
		
		users = new JMenu("User");
		users.setCursor(new Cursor(Cursor.HAND_CURSOR));
		users.setBorder(new EmptyBorder(0, 10, 0, 10));
		users.setForeground(Color.black);
		users.add(profile);
		users.add(logout);
		
		
		goBack= new JButton("Previous page");
		goBack.setFocusable(false);
		goBack.setBackground(Color.decode("#FFD4B2"));
		goBack.setForeground(Color.black);
		goBack.setCursor(new Cursor(Cursor.HAND_CURSOR));
		goBack.setBorder(BorderFactory.createEmptyBorder());
		goBack.addActionListener(this);
		
		
		menuBar = new JMenuBar();
		menuBar.add(users);
		menuBar.add(goBack);
		menuBar.setBackground(Color.decode("#FFD4B2"));
		menuBar.setBorder(BorderFactory.createEmptyBorder());
		frame.setJMenuBar(menuBar);
		
		
		placeOrder= new JButton("Place Order");
		placeOrder.setBounds(770, 0, 100, 30);
		placeOrder.setFocusable(false);
		placeOrder.setBackground(Color.decode("#DBA39A"));
		placeOrder.setForeground(Color.black);
		placeOrder.setBorder(BorderFactory.createEmptyBorder());
		//placeOrder.setBorder(BorderFactory.createEtchedBorder(0, Color.green, Color.red));
		//placeOrder.setIcon(resturantLogo);
		placeOrder.setCursor(new Cursor(Cursor.HAND_CURSOR));
		placeOrder.addActionListener(this);
		frame.add(placeOrder);
		

		frame.setIconImage(framelogo.getImage());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(900,600);
		frame.getContentPane().setBackground(Color.decode("#696969"));
		frame.setLayout (null);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new Chillox("Hasib");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==logout)
		{
			frame.setVisible(false);
			new Login();
		}
		else if (e.getSource()==goBack)
		{
			new ResturantName(f);
			frame.setVisible(false);
		}
		else if(e.getSource()==placeOrder)
		{
			double totalAmount=0;
			double sAmount = 0;
			double hAmount = 0;
			double ffAmount = 0;
			double tbAmount = 0;
			
			int a = 0;
			int b = 0;
			int c = 0;
			int d = 0;
			
			if (s.isSelected()==true)
			{
				a = (sNumber.getSelectedIndex())+1;
				sAmount= a*199.99;
			}
			if (h.isSelected()==true)
			{
				b = hNumber.getSelectedIndex()+1;
				hAmount= b*399.99;
			}
			if (ff.isSelected()==true)
			{
				c = ffNumber.getSelectedIndex()+1;
				ffAmount= c*159.99;
			}
			if (tb.isSelected()==true)
			{
				d = tbNumber.getSelectedIndex()+1;
				tbAmount= d*600.00;
			}
			
			totalAmount = sAmount+
					hAmount+
					ffAmount+
					tbAmount;
			if (totalAmount!=0)
			{
				int x = JOptionPane.showConfirmDialog(null, "Your Bill = "+totalAmount+" tk. Confirm Order?"," Conformation of Oder", 0);
				if (x==0) 
				{
					frame.setVisible(false);
					 new Payment(totalAmount,"Chillox",f);
					
					try {
						File newfile = new File("data\\Last.txt"); 
						newfile.createNewFile();
						FileWriter file = new FileWriter("data\\Last.txt");
						
						file.write("All Flavoured Shakes--- "+a+" Piece----"+sAmount+" tk."
						+"\nHam Burgers----"+b+" Piece---"+hAmount+" tk."
						+"\nFrench Fries---"+c+" Piece---"+ffAmount+" tk. "
						+"\nTripple Beef Patty Burger ---"+d+" Piece---"+tbAmount+" tk."
						+"\n"+totalAmount+" tk Total.");
						file.close();
			
					}
				catch(IOException io)
					{
					JOptionPane.showMessageDialog(null, "An error Occured and failed to create the file");
					io.printStackTrace();
					}
					
				}
			}
			else 
			{
				JOptionPane.showMessageDialog(null, "Please select something before placing order!", "Message", 0);
			}
		
	
		}
		
	}
}
