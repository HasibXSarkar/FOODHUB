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

public class PizzaBurg implements ActionListener, IPizzaBurg {

	private JFrame frame;
	
	private JCheckBox doubleCheesePizza;
	private JCheckBox thinCrustPizza;
	private JCheckBox beefCheesePizza;
	private JCheckBox extraPerperoniThinPizza;
	
	private JLabel dCPLabel;
	private JLabel tCPLabel;
	private JLabel bCLabel;
	private JLabel ePTLabel;
	
	private JLabel dcpPrice;
	private JLabel tcpPrice;
	private JLabel bcPrice;
	private JLabel eptPrice;
	
	private JLabel quantity1;
	private JLabel quantity2;
	private JLabel quantity3;
	private JLabel quantity4;
	
	private JComboBox<String> dcpNumber;
	private JComboBox<String> tcpNumber;
	private JComboBox<String> bcNumber;
	private JComboBox<String> eptNumber;
	
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
	
	public PizzaBurg(String user)
	{
		f= user;
		
		frame = new JFrame("PizzaBurg Menu");
		ImageIcon framelogo = new ImageIcon("icons/framelogo.jpg");
		Image background = new ImageIcon("icons/restbackground.png").getImage();
		frame.setContentPane(new ImagePanel(background));
		
		
		
		Image image1 = new ImageIcon("icons/doubleCheese.png").getImage().getScaledInstance(340, 200, Image.SCALE_DEFAULT);
		ImageIcon doubleCheesePizzaIcon = new ImageIcon(image1);
		doubleCheesePizza = new JCheckBox("Double Cheese Pizza");
		doubleCheesePizza.setBounds(40, 170, 150, 20);
		doubleCheesePizza.setFocusable(false);
		doubleCheesePizza.setForeground(Color.white);
		doubleCheesePizza.setBackground(Color.decode("#696969"));
		doubleCheesePizza.addActionListener(this);
		frame.add(doubleCheesePizza);
		
		dcpPrice = new JLabel("Price: 1099.99 tk");
		dcpPrice.setBounds(220, 170, 150, 20);
		dcpPrice.setBackground(Color.black);
		dcpPrice.setForeground(Color.white);
		frame.add(dcpPrice);
		
		dCPLabel = new JLabel(doubleCheesePizzaIcon);
		dCPLabel.setBounds(20, 20, 340, 140);
		frame.add(dCPLabel);
		
		dcpNumber = new JComboBox<String>(a);
		dcpNumber.setBounds(40, 200, 50, 17);
		dcpNumber.setFocusable(false);
		frame.add(dcpNumber);
	
		quantity1 = new JLabel("⟻Quantity");
		quantity1.setBounds(95, 200, 80, 17);
		quantity1.setBackground(Color.black);
		quantity1.setForeground(Color.white);
		frame.add(quantity1);
		
		
		Image image2 = new ImageIcon("icons/thinCrust.png").getImage().getScaledInstance(340, 140, Image.SCALE_DEFAULT);
		ImageIcon thinCrustPizzaIcon = new ImageIcon(image2);
		thinCrustPizza = new JCheckBox("Thin Crust Pizza");
		thinCrustPizza.setBounds(480, 170, 150, 20);
		thinCrustPizza.setFocusable(false);
		thinCrustPizza.setForeground(Color.white);
		thinCrustPizza.setBackground(Color.decode("#696969"));
		frame.add(thinCrustPizza);
		
		tcpPrice = new JLabel("Price: 999.99 tk");
		tcpPrice.setBounds(650, 170, 150, 20);
		tcpPrice.setBackground(Color.black);
		tcpPrice.setForeground(Color.white);
		frame.add(tcpPrice);
		
		tCPLabel = new JLabel(thinCrustPizzaIcon);
		tCPLabel.setBounds(450, 0, 340, 200);
		frame.add(tCPLabel);
		
		tcpNumber = new JComboBox<String>(b);
		tcpNumber.setBounds(480, 200, 50, 17);
		tcpNumber.setFocusable(false);
		frame.add(tcpNumber);
		
		quantity2 = new JLabel("⟻Quantity");
		quantity2.setBounds(535, 200, 80, 17);
		quantity2.setBackground(Color.black);
		quantity2.setForeground(Color.white);
		frame.add(quantity2);
		
		
		Image image3 = new ImageIcon("icons/BeefCheese.png").getImage().getScaledInstance(340, 140, Image.SCALE_DEFAULT);
		ImageIcon beefCheesePizzaIcon = new ImageIcon(image3);
		beefCheesePizza = new JCheckBox("Beef Cheese Pizza");
		beefCheesePizza.setBounds(480, 430, 150, 20);
		beefCheesePizza.setFocusable(false);
		beefCheesePizza.setForeground(Color.white);
		beefCheesePizza.setBackground(Color.decode("#696969"));
		frame.add(beefCheesePizza);
		
		bcPrice = new JLabel("Price: 1299.99 tk");
		bcPrice.setBounds(650, 430, 150, 20);
		bcPrice.setBackground(Color.black);
		bcPrice.setForeground(Color.white);
		frame.add(bcPrice);
		
		bCLabel = new JLabel(beefCheesePizzaIcon);
		bCLabel.setBounds(450, 250, 340, 200);
		frame.add(bCLabel);
		
		bcNumber = new JComboBox<String>(c);
		bcNumber.setBounds(480, 470, 50, 17);
		bcNumber.setFocusable(false);
		frame.add(bcNumber);
		
		quantity3 = new JLabel("⟻Quantity");
		quantity3.setBounds(535, 470, 80, 17);
		quantity3.setBackground(Color.black);
		quantity3.setForeground(Color.white);
		frame.add(quantity3);
		
		
		Image image4 = new ImageIcon("icons/extraPerperoniThinPizza.png").getImage().getScaledInstance(340, 200, Image.SCALE_DEFAULT);
		ImageIcon extraPerperoniThinPizzaIcon = new ImageIcon(image4);
		extraPerperoniThinPizza = new JCheckBox("Extra Pepproni Thin Pizza");
		extraPerperoniThinPizza.setBounds(40, 430, 180, 20);
		extraPerperoniThinPizza.setFocusable(false);
		extraPerperoniThinPizza.setForeground(Color.white);
		extraPerperoniThinPizza.setBackground(Color.decode("#696969"));
		frame.add(extraPerperoniThinPizza);
		
	
		eptPrice = new JLabel("Price: 899.99 tk");
		eptPrice.setBounds(230, 430, 180, 20);
		eptPrice.setBackground(Color.black);
		eptPrice.setForeground(Color.white);
		frame.add(eptPrice);
		
		
		ePTLabel = new JLabel(extraPerperoniThinPizzaIcon);
		ePTLabel.setBounds(20, 250, 340, 180);
		frame.add(ePTLabel);
		
		eptNumber = new JComboBox<String>(d);
		eptNumber.setBounds(40, 470, 50, 17);
		eptNumber.setFocusable(false);
		frame.add(eptNumber);
		
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
	
	public static void main(String [] args)
	{
		new PizzaBurg("Faysal");
	}
	
	public void display()
	{
		frame.setVisible(true);
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
				double doubleCheesePizzaAmount = 0;
				double thinCrustPizzaAmount = 0;
				double beefCheesePizzaAmount = 0;
				double extraPerperoniThinPizzaAmount = 0;
				int a=0;
				int b=0;
				int c=0;
				int d=0;
				if (doubleCheesePizza.isSelected()==true)
				{
					a = (dcpNumber.getSelectedIndex())+1;
					doubleCheesePizzaAmount= a*1099.99;
				}
				if (thinCrustPizza.isSelected()==true)
				{
					b = tcpNumber.getSelectedIndex()+1;
					thinCrustPizzaAmount= b*999.99;
				}
				if (beefCheesePizza.isSelected()==true)
				{
					c = bcNumber.getSelectedIndex()+1;
					beefCheesePizzaAmount= c*1299.99;
				}
				if (extraPerperoniThinPizza.isSelected()==true)
				{
					d = eptNumber.getSelectedIndex()+1;
					extraPerperoniThinPizzaAmount= d*899.99;
				}
				
				totalAmount = doubleCheesePizzaAmount+thinCrustPizzaAmount+beefCheesePizzaAmount+extraPerperoniThinPizzaAmount;
				if (totalAmount!=0)
				{
					int x = JOptionPane.showConfirmDialog(null, "Your Bill = "+totalAmount+" tk. Confirm Order?"," Conformation of Oder", 0);
					if (x==0) 
					{
						frame.setVisible(false);
						new Payment(totalAmount, "PizzaBurg",f);
						
						try {
								File newfile = new File("data\\Last.txt"); 
								newfile.createNewFile();
								FileWriter file = new FileWriter("data\\Last.txt");
								
								file.write("Double Cheese Pizza--- "+a+" Piece----"+doubleCheesePizzaAmount+" tk."
								+"\nThin Crust Pizza----"+b+" Piece---"+thinCrustPizzaAmount+" tk."
								+"\nBeef Cheese Pizza------"+c+" Piece---"+beefCheesePizzaAmount+" tk."
								+"\nExtra Perperoni Thin Pizza ---"+d+"Piece---"+extraPerperoniThinPizzaAmount+" tk."
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
