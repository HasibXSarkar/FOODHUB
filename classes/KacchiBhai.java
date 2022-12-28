package classes;
import interfaces.*;
import javax.swing.*;
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

public class KacchiBhai implements ActionListener,IKacchiBhai{
	
	private JFrame frame;
	
	private JCheckBox kacchiBiriyani;
	private JCheckBox tehri;
	private JCheckBox tandooriBiriyani;
	private JCheckBox kabsaHyderabadiBiryani ;
	
	private JLabel quantity1;
	private JLabel quantity2;
	private JLabel quantity3;
	private JLabel quantity4;
	
	private JLabel kacchiLabel;
	private JLabel tehriLabel;
	private JLabel tandooriLabel;
	private JLabel kabsaHyderabadiBiryaniLabel;
	
	private JLabel kPrice;
	private JLabel tPrice;
	private JLabel taPrice;
	private JLabel katPrice;
	
	private JComboBox<String> kNumber;
	private JComboBox<String> tNumber;
	private JComboBox<String> taNumber;
	private JComboBox<String> kaNumber;
	
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
	
	public KacchiBhai(String user)
	{
		f=user;
		
		frame = new JFrame("KacchiBhai Menu");
		ImageIcon framelogo = new ImageIcon("icons/framelogo.jpg");
		Image background = new ImageIcon("icons/restbackground.png").getImage();
		frame.setContentPane(new ImagePanel(background));
		
		
		
		Image image1 = new ImageIcon("icons/kacchiBiriyani.png").getImage();
		ImageIcon kacchiBiriyaniIcon = new ImageIcon(image1);
		kacchiBiriyani = new JCheckBox("kacchi Biriyani");
		//kacchiBiriyani.setFont(new Font("Segoe UI", 1, 10));
		kacchiBiriyani.setBounds(40, 170, 150, 20);
		kacchiBiriyani.setFocusable(false);
		kacchiBiriyani.setForeground(Color.white);
		kacchiBiriyani.setBackground(Color.decode("#696969"));
		kacchiBiriyani.addActionListener(this);
		frame.add(kacchiBiriyani);
		
		
		kacchiLabel = new JLabel(kacchiBiriyaniIcon);
		kacchiLabel.setBounds(20, 20, 340, 140);
		frame.add(kacchiLabel);
		
		kPrice = new JLabel("Price: 420.99 tk");
		kPrice.setBounds(220, 170, 150, 20);
		kPrice.setBackground(Color.black);
		kPrice.setForeground(Color.white);
		frame.add(kPrice);
		
		kNumber = new JComboBox<String>(a);
		kNumber.setBounds(95, 200, 50, 17);
		kNumber.setFocusable(false);
		frame.add(kNumber);
	
		quantity1 = new JLabel("⟻Quantity");
		quantity1.setBounds(145, 200, 80, 17);
		quantity1.setBackground(Color.black);
		quantity1.setForeground(Color.white);
		frame.add(quantity1);
		
		
		Image image2 = new ImageIcon("icons/tehri.png").getImage().getScaledInstance(340, 140, Image.SCALE_DEFAULT);
		ImageIcon tehriIcon = new ImageIcon(image2);
		tehri= new JCheckBox("Beef Tehri");
		tehri.setBounds(480, 170, 150, 20);
		tehri.setFocusable(false);
		tehri.setForeground(Color.white);
		tehri.setBackground(Color.decode("#696969"));
		frame.add(tehri);
		
		tPrice = new JLabel("Price: 239.99 tk");
		tPrice.setBounds(650, 170, 150, 20);
		tPrice.setBackground(Color.black);
		tPrice.setForeground(Color.white);
		frame.add(tPrice);
		
		tehriLabel = new JLabel(tehriIcon);
		tehriLabel.setBounds(450, 0, 340, 200);
		frame.add(tehriLabel);
		
		tNumber = new JComboBox<String>(b);
		tNumber.setBounds(535, 200, 50, 17);
		tNumber.setFocusable(false);
		frame.add(tNumber);
		
		quantity2 = new JLabel("⟻Quantity");
		quantity2.setBounds(585, 200, 80, 17);
		quantity2.setBackground(Color.black);
		quantity2.setForeground(Color.white);
		frame.add(quantity2);
		
		
		Image image3 = new ImageIcon("icons/tandooriBiriyani.png").getImage().getScaledInstance(340, 140, Image.SCALE_DEFAULT);
		ImageIcon tandooriBiriyaniIcon = new ImageIcon(image3);
		tandooriBiriyani = new JCheckBox("Tandoori Biriyani");
		tandooriBiriyani.setBounds(480, 430, 150, 20);
		tandooriBiriyani.setFocusable(false);
		tandooriBiriyani.setForeground(Color.white);
		tandooriBiriyani.setBackground(Color.decode("#696969"));
		frame.add(tandooriBiriyani);
		
		taPrice = new JLabel("Price: 399.99 tk");
		taPrice.setBounds(650, 430, 150, 20);
		taPrice.setBackground(Color.black);
		taPrice.setForeground(Color.white);
		frame.add(taPrice);
		
		tandooriLabel = new JLabel(tandooriBiriyaniIcon);
		tandooriLabel.setBounds(450, 250, 340, 200);
		frame.add(tandooriLabel);
		
		taNumber = new JComboBox<String>(c);
		taNumber.setBounds(535, 470, 50, 17);
		taNumber.setFocusable(false);
		frame.add(taNumber);
		
		quantity3 = new JLabel("⟻Quantity");
		quantity3.setBounds(585, 470, 80, 17);
		quantity3.setBackground(Color.black);
		quantity3.setForeground(Color.white);
		frame.add(quantity3);
		
		
		Image image4 = new ImageIcon("icons/KabsaHyderabadiBiryani .png").getImage().getScaledInstance(340, 200, Image.SCALE_DEFAULT);
		ImageIcon kabsaHyderabadiBiryaniIcon = new ImageIcon(image4);
		kabsaHyderabadiBiryani  = new JCheckBox("Kabsa Hyderabadi Biryani");
		kabsaHyderabadiBiryani .setBounds(40, 430, 180, 20);
		kabsaHyderabadiBiryani.setFocusable(false);
		kabsaHyderabadiBiryani.setForeground(Color.white);
		kabsaHyderabadiBiryani.setBackground(Color.decode("#696969"));
		frame.add(kabsaHyderabadiBiryani);
		
	
		katPrice = new JLabel("Price: 699.99 tk");
		katPrice.setBounds(230, 430, 180, 20);
		katPrice.setBackground(Color.black);
		katPrice.setForeground(Color.white);
		frame.add(katPrice);
		
		
		kabsaHyderabadiBiryaniLabel = new JLabel(kabsaHyderabadiBiryaniIcon);
		kabsaHyderabadiBiryaniLabel.setBounds(20, 250, 340, 180);
		frame.add(kabsaHyderabadiBiryaniLabel);
		
		kaNumber = new JComboBox<String>(d);
		kaNumber.setBounds(95, 470, 50, 17);
		kaNumber.setFocusable(false);
		frame.add(kaNumber);
		
		quantity4 = new JLabel("⟻Quantity");
		quantity4.setBounds(145, 470, 80, 17);
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
		new KacchiBhai("Hasib");

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
			double kacchiBiriyaniAmount = 0;
			double tehriAmount = 0;
			double tandooriBiriyaniAmount = 0;
			double kabsaHyderabadiBiryaniAmount = 0;
			int a = 0;
			int b = 0;
			int c = 0;
			int d = 0;
			
			
			if (kacchiBiriyani.isSelected()==true)
			{
				a = (kNumber.getSelectedIndex())+1;
				kacchiBiriyaniAmount= a*420.99;
			}
			if (tehri.isSelected()==true)
			{
				b = tNumber.getSelectedIndex()+1;
				tehriAmount= b*239.99;
			}
			if (tandooriBiriyani.isSelected()==true)
			{
				c = taNumber.getSelectedIndex()+1;
				tandooriBiriyaniAmount= c*399.99;
			}
			if (kabsaHyderabadiBiryani.isSelected()==true)
			{
				d = kaNumber.getSelectedIndex()+1;
				kabsaHyderabadiBiryaniAmount= d*699.99;
			}
			
			totalAmount = kacchiBiriyaniAmount+
					tehriAmount+
					tandooriBiriyaniAmount+
					kabsaHyderabadiBiryaniAmount;
			if (totalAmount!=0)
			{
				int x = JOptionPane.showConfirmDialog(null, "Your Bill = "+totalAmount+" tk. Confirm Order?"," Conformation of Oder", 0);
				if (x==0) 
				{
					frame.setVisible(false);
					 new Payment(totalAmount, "KacchiBhai",f);
					
					try {
						File newfile = new File("data\\Last.txt"); 
						newfile.createNewFile();
						FileWriter file = new FileWriter("data\\Last.txt");
						
						file.write("kacchi Biriyani--- "+a+" Packet----"+kacchiBiriyaniAmount+" tk."
						+"\nTehri----"+b+" Packet---"+tehriAmount+" tk."
						+"\nTandoori Biriyani---"+c+" Packet---"+tandooriBiriyaniAmount+" tk."
						+"\nkabsa Hyderabadi Biryani ---"+d+" Packet---"+kabsaHyderabadiBiryaniAmount +" tk."
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
