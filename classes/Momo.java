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

public class Momo implements ActionListener, IMomo{

	private JFrame  frame;
	
	private JCheckBox sd;
	private JCheckBox m;
	private JCheckBox dd;
	private JCheckBox bfc;
	
	private JLabel quantity1;
	private JLabel quantity2;
	private JLabel quantity3;
	private JLabel quantity4;
	
	private JLabel sdLabel;
	private JLabel mLabel;
	private JLabel ddLabel;
	private JLabel bfcLabel;
	
	private JLabel sdPrice;
	private JLabel mPrice;
	private JLabel ddPrice;
	private JLabel bfcPrice;
	
	private JComboBox<String> sdNumber;
	private JComboBox<String> mNumber;
	private JComboBox<String> ddNumber;
	private JComboBox<String> bfcNumber;
	
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
	
	public Momo(String user)
	{
		f= user;
		
		frame = new JFrame("Momos Menu");
		ImageIcon framelogo = new ImageIcon("icons/framelogo.jpg");
		Image background = new ImageIcon("icons/restbackground.png").getImage();
		frame.setContentPane(new ImagePanel(background));
		
		
		Image image1 = new ImageIcon("icons/sd.png").getImage().getScaledInstance(250, 140, Image.SCALE_DEFAULT);
		ImageIcon sdIcon = new ImageIcon(image1);
		sd = new JCheckBox("Sweet Danish");
		sd.setBounds(40, 170, 200, 20);
		sd.setFocusable(false);
		sd.setForeground(Color.white);
		sd.setBackground(Color.decode("#696969"));
		sd.addActionListener(this);
		frame.add(sd);
		
		sdLabel = new JLabel(sdIcon);
		sdLabel.setBounds(20, 20, 340, 140);
		frame.add(sdLabel);
		
		sdPrice = new JLabel("Price: 199.99 tk");
		sdPrice.setBounds(240, 170, 150, 20);
		sdPrice.setBackground(Color.black);
		sdPrice.setForeground(Color.white);
		frame.add(sdPrice);
		
		sdNumber = new JComboBox<String>(a);
		sdNumber.setBounds(40, 200, 50, 17);
		sdNumber.setFocusable(false);
		frame.add(sdNumber);
	
		quantity1 = new JLabel("⟻Quantity");
		quantity1.setBounds(95, 200, 80, 17);
		quantity1.setBackground(Color.black);
		quantity1.setForeground(Color.white);
		frame.add(quantity1);

		
		Image image2 = new ImageIcon("icons/m.png").getImage().getScaledInstance(300, 140, Image.SCALE_DEFAULT);
		ImageIcon mIcon = new ImageIcon(image2);
		m= new JCheckBox("Momos");
		m.setBounds(480, 170, 200, 20);
		m.setFocusable(false);
		m.setForeground(Color.white);
		m.setBackground(Color.decode("#696969"));
		frame.add(m);
		
		mPrice = new JLabel("Price: 299.99 tk");
		mPrice.setBounds(680, 170, 150, 20);
		mPrice.setBackground(Color.black);
		mPrice.setForeground(Color.white);
		frame.add(mPrice);
		
		mLabel = new JLabel(mIcon);
		mLabel.setBounds(450, 0, 340, 200);
		frame.add(mLabel);
		
		mNumber = new JComboBox<String>(b);
		mNumber.setBounds(480, 200, 50, 17);
		mNumber.setFocusable(false);
		frame.add(mNumber);
		
		quantity2 = new JLabel("⟻Quantity");
		quantity2.setBounds(535, 200, 80, 17);
		quantity2.setBackground(Color.black);
		quantity2.setForeground(Color.white);
		frame.add(quantity2);

		
		Image image3 = new ImageIcon("icons/d.png").getImage().getScaledInstance(250, 200, Image.SCALE_DEFAULT);
		ImageIcon ddIcon = new ImageIcon(image3);
		dd = new JCheckBox("Donuts");
		dd.setBounds(480, 430, 200, 20);
		dd.setFocusable(false);
		dd.setForeground(Color.white);
		dd.setBackground(Color.decode("#696969"));
		frame.add(dd);
		
		ddPrice = new JLabel("Price: 199.99 tk");
		ddPrice.setBounds(680, 430, 150, 20);
		ddPrice.setBackground(Color.black);
		ddPrice.setForeground(Color.white);
		frame.add(ddPrice);
		
		ddLabel = new JLabel(ddIcon);
		ddLabel.setBounds(450, 250, 340, 200);
		frame.add(ddLabel);
		
		ddNumber = new JComboBox<String>(c);
		ddNumber.setBounds(480, 470, 50, 17);
		ddNumber.setFocusable(false);
		frame.add(ddNumber);
		
		quantity3 = new JLabel("⟻Quantity");
		quantity3.setBounds(535, 470, 80, 17);
		quantity3.setBackground(Color.black);
		quantity3.setForeground(Color.white);
		frame.add(quantity3);
		
		
		Image image4 = new ImageIcon("icons/bfc.png").getImage().getScaledInstance(340, 200, Image.SCALE_DEFAULT);
		ImageIcon bfcIcon = new ImageIcon(image4);
		bfc  = new JCheckBox("Black Forest Cake");
		bfc.setBounds(40, 430, 180, 20);
		bfc.setFocusable(false);
		bfc.setForeground(Color.white);
		bfc.setBackground(Color.decode("#696969"));
		frame.add(bfc);
		
	
		bfcPrice = new JLabel("Price: 1000.0 tk");
		bfcPrice.setBounds(230, 430, 180, 20);
		bfcPrice.setBackground(Color.black);
		bfcPrice.setForeground(Color.white);
		frame.add(bfcPrice);
		
		
		bfcLabel = new JLabel(bfcIcon);
		bfcLabel.setBounds(20, 250, 340, 180);
		frame.add(bfcLabel);
		
		bfcNumber = new JComboBox<String>(d);
		bfcNumber.setBounds(40, 470, 50, 17);
		bfcNumber.setFocusable(false);
		frame.add(bfcNumber);
		
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
		new Momo("Hasib");

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
			double sdAmount = 0;
			double mAmount = 0;
			double ddAmount = 0;
			double bfcAmount = 0;
			
			int a = 0;
			int b = 0;
			int c = 0;
			int d = 0;
			
			if (sd.isSelected()==true)
			{
				a = (sdNumber.getSelectedIndex())+1;
				sdAmount= a*199.99;
			}
			if (m.isSelected()==true)
			{
				b = mNumber.getSelectedIndex()+1;
				mAmount= b*299.99;
			}
			if (dd.isSelected()==true)
			{
				c = ddNumber.getSelectedIndex()+1;
				ddAmount= c*199.99;
			}
			if (bfc.isSelected()==true)
			{
				d = bfcNumber.getSelectedIndex()+1;
				bfcAmount= d*1000.00;
			}
			
			totalAmount = sdAmount+
					mAmount+
					ddAmount+
					bfcAmount;
			if (totalAmount!=0)
			{
				int x = JOptionPane.showConfirmDialog(null, "Your Bill = "+totalAmount+" tk. Confirm Order?"," Conformation of Oder", 0);
				if (x==0) 
				{
					frame.setVisible(false);
					new Payment(totalAmount, "Momo",f);
					
					try {
						File newfile = new File("data\\Last.txt"); 
						newfile.createNewFile();
						FileWriter file = new FileWriter("data\\Last.txt");
						
						file.write("Sweet Danish--- "+a+" Piece----"+sdAmount+" tk."
						+"\nMomos----"+b+" Plates---"+mAmount+" tk."
						+"\nDonuts---"+c+" Piece---"+ddAmount+" tk. "
						+"\nBlack Forest Cake ---"+d+" Piece---"+bfcAmount+" tk."
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
