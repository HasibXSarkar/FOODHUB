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

public class TwinPeaks implements ActionListener, ITwinPeaks{
	
	private  JFrame  frame;
	
	private JCheckBox s;
	private JCheckBox cn;
	private JCheckBox rvc;
	private JCheckBox sw ;
	
	private JLabel quantity1;
	private JLabel quantity2;
	private JLabel quantity3;
	private JLabel quantity4;
	
	private JLabel sLabel;
	private JLabel cnLabel;
	private JLabel rvcLabel;
	private JLabel swLabel;
	
	private JLabel sPrice;
	private JLabel cnPrice;
	private JLabel rvcPrice;
	private JLabel swPrice;
	
	private JComboBox<String> sNumber;
	private JComboBox<String> cnNumber;
	private JComboBox<String> rvcNumber;
	private JComboBox<String> swNumber;
	
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
	
	public TwinPeaks(String user)
	{
		f= user;
		
		frame = new JFrame("Twin Peaks Menu");
		ImageIcon framelogo = new ImageIcon("icons/framelogo.jpg");
		Image background = new ImageIcon("icons/restbackground.png").getImage();
		frame.setContentPane(new ImagePanel(background));
		
		
		
		Image image1 = new ImageIcon("icons/steak.png").getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
		ImageIcon sIcon = new ImageIcon(image1);
		s = new JCheckBox("Beef Steak");
		s.setBounds(40, 170, 200, 20);
		s.setFocusable(false);
		s.setForeground(Color.white);
		s.setBackground(Color.decode("#696969"));
		s.addActionListener(this);
		frame.add(s);
		
		sLabel = new JLabel(sIcon);
		sLabel.setBounds(20, 20, 340, 140);
		frame.add(sLabel);
		
		sPrice = new JLabel("Price: 1499.99.99 tk");
		sPrice.setBounds(260, 170, 150, 20);
		sPrice.setBackground(Color.black);
		sPrice.setForeground(Color.white);
		frame.add(sPrice);
		
		sNumber = new JComboBox<String>(a);
		sNumber.setBounds(40, 200, 50, 17);
		sNumber.setFocusable(false);
		frame.add(sNumber);
	
		quantity1 = new JLabel("⟻Quantity");
		quantity1.setBounds(95, 200, 80, 17);
		quantity1.setBackground(Color.black);
		quantity1.setForeground(Color.white);
		frame.add(quantity1);
		
		
		Image image2 = new ImageIcon("icons/cn.png").getImage().getScaledInstance(340, 140, Image.SCALE_DEFAULT);
		ImageIcon cnIcon = new ImageIcon(image2);
		cn= new JCheckBox("Chicken Nuggets");
		cn.setBounds(480, 170, 200, 20);
		cn.setFocusable(false);
		cn.setForeground(Color.white);
		cn.setBackground(Color.decode("#696969"));
		frame.add(cn);
		
		cnPrice = new JLabel("Price: 299.99 tk");
		cnPrice.setBounds(680, 170, 150, 20);
		cnPrice.setBackground(Color.black);
		cnPrice.setForeground(Color.white);
		frame.add(cnPrice);
		
		cnLabel = new JLabel(cnIcon);
		cnLabel.setBounds(450, 0, 340, 200);
		frame.add(cnLabel);
		
		cnNumber = new JComboBox<String>(b);
		cnNumber.setBounds(480, 200, 50, 17);
		cnNumber.setFocusable(false);
		frame.add(cnNumber);
		
		quantity2 = new JLabel("⟻Quantity");
		quantity2.setBounds(535, 200, 80, 17);
		quantity2.setBackground(Color.black);
		quantity2.setForeground(Color.white);
		frame.add(quantity2);
		
		
		Image image3 = new ImageIcon("icons/rvc.png").getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
		ImageIcon rvcIcon = new ImageIcon(image3);
		rvc = new JCheckBox("Red Velvet Cake");
		rvc.setBounds(480, 430, 200, 20);
		rvc.setFocusable(false);
		rvc.setForeground(Color.white);
		rvc.setBackground(Color.decode("#696969"));
		frame.add(rvc);
		
		rvcPrice = new JLabel("Price: 199.99 tk");
		rvcPrice.setBounds(680, 430, 150, 20);
		rvcPrice.setBackground(Color.black);
		rvcPrice.setForeground(Color.white);
		frame.add(rvcPrice);
		
		rvcLabel = new JLabel(rvcIcon);
		rvcLabel.setBounds(450, 250, 340, 200);
		rvcLabel.setFocusable(false);

		frame.add(rvcLabel);
		
		rvcNumber = new JComboBox<String>(c);
		rvcNumber.setBounds(480, 470, 50, 17);
		rvcNumber.setFocusable(false);
		frame.add(rvcNumber);
		
		quantity3 = new JLabel("⟻Quantity");
		quantity3.setBounds(535, 470, 80, 17);
		quantity3.setBackground(Color.black);
		quantity3.setForeground(Color.white);
		frame.add(quantity3);
			

		Image image4 = new ImageIcon("icons/sw.png").getImage().getScaledInstance(340, 200, Image.SCALE_DEFAULT);
		ImageIcon tacoIcon = new ImageIcon(image4);
		sw  = new JCheckBox("Vej Sandwich");
		sw.setBounds(40, 430, 180, 20);
		sw.setFocusable(false);
		sw.setForeground(Color.white);
		sw.setBackground(Color.decode("#696969"));
		frame.add(sw);
		
	
		swPrice = new JLabel("Price: 200.0 tk");
		swPrice.setBounds(230, 430, 180, 20);
		swPrice.setBackground(Color.black);
		swPrice.setForeground(Color.white);
		frame.add(swPrice);
		
		
		swLabel = new JLabel(tacoIcon);
		swLabel.setBounds(20, 250, 340, 180);
		frame.add(swLabel);
		
		swNumber = new JComboBox<String>(d);
		swNumber.setBounds(40, 470, 50, 17);
		swNumber.setFocusable(false);
		frame.add(swNumber);
		
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
		
		new TwinPeaks("Hasib");
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
			double cnAmount = 0;
			double rvcAmount = 0;
			double swAmount = 0;
			
			int a = 0;
			int b = 0;
			int c = 0;
			int d = 0;
			
			if (s.isSelected()==true)
			{
				a = (sNumber.getSelectedIndex())+1;
				sAmount= a*1499.99;
			}
			if (cn.isSelected()==true)
			{
				b = cnNumber.getSelectedIndex()+1;
				cnAmount= b*299.99;
			}
			if (rvc.isSelected()==true)
			{
				c = rvcNumber.getSelectedIndex()+1;
				rvcAmount= c*199.99;
			}
			if (sw.isSelected()==true)
			{
				d = swNumber.getSelectedIndex()+1;
				swAmount= d*200.00;
			}
			
			totalAmount = sAmount+
					cnAmount+
					rvcAmount+
					swAmount;
			if (totalAmount!=0)
			{
				int x = JOptionPane.showConfirmDialog(null, "Your Bill = "+totalAmount+" tk. Confirm Order?"," Conformation of Oder", 0);
				if (x==0) 
				{
					frame.setVisible(false);
					new Payment(totalAmount, "TwinPeaks",f);
					
					try {
						File newfile = new File("data\\Last.txt"); 
						newfile.createNewFile();
						FileWriter file = new FileWriter("data\\Last.txt");
						
						file.write("Beef Steak--- "+a+" Piece----"+sAmount+" tk."
						+"\nChicken Nuggets----"+b+" Piece---"+cnAmount+" tk."
						+"\nRed Velvet Cake---"+c+" Piece---"+rvcAmount+" tk. "
						+"\nSandwich ---"+d+" Piece---"+swAmount+" tk."
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
