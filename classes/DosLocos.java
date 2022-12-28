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

public class DosLocos implements ActionListener, IDosLocos {
	
	private JFrame frame;
	
	private JCheckBox scdbb;
	private JCheckBox bcb;
	private JCheckBox cgcw;
	private JCheckBox taco ;
	
	private JLabel quantity1;
	private JLabel quantity2;
	private JLabel quantity3;
	private JLabel quantity4;
	
	private JLabel scdbbLabel;
	private JLabel bcbLabel;
	private JLabel cgcwLabel;
	private JLabel tacoLabel;
	
	private JLabel scdbbPrice;
	private JLabel bcbPrice;
	private JLabel cgcwPrice;
	private JLabel tacoPrice;
	
	private JComboBox<String> scdbbNumber;
	private JComboBox<String> bcbNumber;
	private JComboBox<String> cgcwNumber;
	private JComboBox<String> tacoNumber;
	
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
	
	public DosLocos(String user)
	{
		f= user;
		
		frame = new JFrame("Dos Locos Menu");
		ImageIcon framelogo = new ImageIcon("icons/framelogo.jpg");
		Image background = new ImageIcon("icons/restbackground.png").getImage();
		frame.setContentPane(new ImagePanel(background));
		
		
		Image image1 = new ImageIcon("icons/scdbb.png").getImage().getScaledInstance(340, 160, Image.SCALE_DEFAULT);
		ImageIcon scdbbIcon = new ImageIcon(image1);
		scdbb = new JCheckBox("Spicy Cheese Beef Burrito");
		scdbb.setBounds(40, 170, 200, 20);
		scdbb.setFocusable(false);
		scdbb.setForeground(Color.white);
		scdbb.setBackground(Color.decode("#696969"));
		scdbb.addActionListener(this);
		frame.add(scdbb);
		
		
		scdbbLabel = new JLabel(scdbbIcon);
		scdbbLabel.setBounds(20, 20, 340, 140);
		frame.add(scdbbLabel);
		
		scdbbPrice = new JLabel("Price: 220.99 tk");
		scdbbPrice.setBounds(260, 170, 150, 20);
		scdbbPrice.setBackground(Color.black);
		scdbbPrice.setForeground(Color.white);
		frame.add(scdbbPrice);
		
		scdbbNumber = new JComboBox<String>(a);
		scdbbNumber.setBounds(40, 200, 50, 17);
		scdbbNumber.setFocusable(false);
		frame.add(scdbbNumber);
	
		quantity1 = new JLabel("⟻Quantity");
		quantity1.setBounds(95, 200, 80, 17);
		quantity1.setBackground(Color.black);
		quantity1.setForeground(Color.white);
		frame.add(quantity1);
		
		
		Image image2 = new ImageIcon("icons/bcb.png").getImage().getScaledInstance(280, 140, Image.SCALE_DEFAULT);
		ImageIcon bcbIcon = new ImageIcon(image2);
		bcb= new JCheckBox("Barbecue Chicken Burrito");
		bcb.setBounds(480, 170, 200, 20);
		bcb.setFocusable(false);
		bcb.setForeground(Color.white);
		bcb.setBackground(Color.decode("#696969"));
		frame.add(bcb);
		
		bcbPrice = new JLabel("Price: 239.99 tk");
		bcbPrice.setBounds(680, 170, 150, 20);
		bcbPrice.setBackground(Color.black);
		bcbPrice.setForeground(Color.white);
		frame.add(bcbPrice);
		
		bcbLabel = new JLabel(bcbIcon);
		bcbLabel.setBounds(450, 0, 340, 200);
		frame.add(bcbLabel);
		
		bcbNumber = new JComboBox<String>(b);
		bcbNumber.setBounds(480, 200, 50, 17);
		bcbNumber.setFocusable(false);
		frame.add(bcbNumber);
		
		quantity2 = new JLabel("⟻Quantity");
		quantity2.setBounds(535, 200, 80, 17);
		quantity2.setBackground(Color.black);
		quantity2.setForeground(Color.white);
		frame.add(quantity2);
		
		
		Image image3 = new ImageIcon("icons/cgcw.png").getImage().getScaledInstance(340, 140, Image.SCALE_DEFAULT);
		ImageIcon cgcwIcon = new ImageIcon(image3);
		cgcw = new JCheckBox("Chipotle Grilled Chicken Wrap");
		cgcw.setBounds(480, 430, 200, 20);
		cgcw.setFocusable(false);
		cgcw.setForeground(Color.white);
		cgcw.setBackground(Color.decode("#696969"));
		frame.add(cgcw);
		
		cgcwPrice = new JLabel("Price: 299.99 tk");
		cgcwPrice.setBounds(680, 430, 150, 20);
		cgcwPrice.setBackground(Color.black);
		cgcwPrice.setForeground(Color.white);
		frame.add(cgcwPrice);
		
		cgcwLabel = new JLabel(cgcwIcon);
		cgcwLabel.setBounds(450, 250, 340, 200);
		frame.add(cgcwLabel);
		
		cgcwNumber = new JComboBox<String>(c);
		cgcwNumber.setBounds(480, 470, 50, 17);
		cgcwNumber.setFocusable(false);
		frame.add(cgcwNumber);
		
		quantity3 = new JLabel("⟻Quantity");
		quantity3.setBounds(535, 470, 80, 17);
		quantity3.setBackground(Color.black);
		quantity3.setForeground(Color.white);
		frame.add(quantity3);
		
		
		Image image4 = new ImageIcon("icons/taco.png").getImage().getScaledInstance(340, 200, Image.SCALE_DEFAULT);
		ImageIcon tacoIcon = new ImageIcon(image4);
		taco  = new JCheckBox("Taco");
		taco.setBounds(40, 430, 180, 20);
		taco.setFocusable(false);
		taco.setForeground(Color.white);
		taco.setBackground(Color.decode("#696969"));
		frame.add(taco);
		
	
		tacoPrice = new JLabel("Price: 269.99 tk");
		tacoPrice.setBounds(230, 430, 180, 20);
		tacoPrice.setBackground(Color.black);
		tacoPrice.setForeground(Color.white);
		frame.add(tacoPrice);
		
		
		tacoLabel = new JLabel(tacoIcon);
		tacoLabel.setBounds(20, 250, 340, 180);
		frame.add(tacoLabel);
		
		tacoNumber = new JComboBox<String>(d);
		tacoNumber.setBounds(40, 470, 50, 17);
		tacoNumber.setFocusable(false);
		frame.add(tacoNumber);
		
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
		
		new DosLocos("Hasib");
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
			double scdbbAmount = 0;
			double bcbAmount = 0;
			double cgcwAmount = 0;
			double tacoAmount = 0;
			
			int a = 0;
			int b = 0;
			int c = 0;
			int d = 0;
			
			if (scdbb.isSelected()==true)
			{
				a = (scdbbNumber.getSelectedIndex())+1;
				scdbbAmount= a*220.99;
			}
			if (bcb.isSelected()==true)
			{
				b = bcbNumber.getSelectedIndex()+1;
				bcbAmount= b*239.99;
			}
			if (cgcw.isSelected()==true)
			{
				c = cgcwNumber.getSelectedIndex()+1;
				cgcwAmount= c*299.99;
			}
			if (taco.isSelected()==true)
			{
				d = tacoNumber.getSelectedIndex()+1;
				tacoAmount= d*269.99;
			}
			
			totalAmount = scdbbAmount+
					bcbAmount+
					cgcwAmount+
					tacoAmount;
			if (totalAmount!=0)
			{
				int x = JOptionPane.showConfirmDialog(null, "Your Bill = "+totalAmount+" tk. Confirm Order?"," Conformation of Oder", 0);
				if (x==0) 
				{
					frame.setVisible(false);
					new Payment(totalAmount, "DosLocos",f);
					
					try {
						File newfile = new File("data\\Last.txt"); 
						newfile.createNewFile();
						FileWriter file = new FileWriter("data\\Last.txt");
						
						file.write("Spicy Cheese Double Beef Burrito--- "+a+" Piece----"+scdbbAmount+" tk."
						+"\nBarbecue Chicken Burrito----"+b+" Piece---"+bcbAmount+" tk."
						+"\nChipotle Grilled Chicken Wrap---"+c+" Piece---"+cgcwAmount+" tk. "
						+"\nTaco ---"+d+" Piece---"+tacoAmount+" tk."
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
