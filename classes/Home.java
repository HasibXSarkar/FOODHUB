package classes;
import interfaces.*;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Home implements ActionListener, IHome{

	private JFrame frame;
	private JLabel iFood;
	private JLabel lLogo;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JLabel label5;
	private JLabel lProfile;
	private JButton findResturant;
	private JMenuBar menuBar;  
	private JMenu users, setting, aboutUs;   
	private JMenuItem monmoy, hasib, hachibur, antik,tawhid, profile, logout, changeBGColor;
	private String f="monmoy";
	
	public Home(String user)
	{
		f=user;
		
		frame = new JFrame("Home");

		
		ImageIcon framelogo = new ImageIcon("icons/framelogo.jpg");
		// ImageIcon food = new ImageIcon("icons/food.png");
		// ImageIcon logoType = new ImageIcon("icons/logotype.png");
		ImageIcon profileImage = new ImageIcon("icons/admin.png");
		// ImageIcon resturantLogo = new ImageIcon("icons/resturantlogo.png");
		ImageIcon deliveryLogo = new ImageIcon("icons/delivery.png");
		ImageIcon emojiIcon = new ImageIcon("icons/emoji.png");

		Image background = new ImageIcon("icons/FOODHUB.png").getImage();
		frame.setContentPane(new ImagePanel(background));

		monmoy= new JMenuItem ("Monmoy");
		monmoy.addActionListener(this);
		monmoy.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		hasib = new JMenuItem ("Hasib");
		hasib.addActionListener(this);
		hasib.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		hachibur = new JMenuItem ("Hachibur");
		hachibur.addActionListener(this);
		hachibur.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		antik = new JMenuItem ("Antik");
		antik.addActionListener(this);
		antik.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		
		
		profile = new JMenuItem ("Profile");
		profile.addActionListener(this);
		profile.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		logout = new JMenuItem ("Logout");
		logout.addActionListener(this);
		logout.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		
		users = new JMenu("User");
		users.setCursor(new Cursor(Cursor.HAND_CURSOR));
		users.setBorder(new EmptyBorder(0, 10, 0, 10));
		users.setForeground(Color.decode("#FFEFD6"));
		users.add(profile);
		users.add(logout);
		
		
		
		aboutUs = new JMenu("About Us");
		aboutUs.setCursor(new Cursor(Cursor.HAND_CURSOR));
		aboutUs.setBorder(new EmptyBorder(0, 20, 0, 10));
		aboutUs.setForeground(Color.decode("#FFEFD6"));
		aboutUs.add(monmoy);
		aboutUs.add(hasib);
		aboutUs.add(antik);
		aboutUs.add(hachibur);
		
		
		
		menuBar = new JMenuBar();
		menuBar.add(users);
		menuBar.add(aboutUs);
		menuBar.setBackground(Color.decode("#AD8E70"));
		menuBar.setBorder(BorderFactory.createEmptyBorder());
		frame.setJMenuBar(menuBar);
		
		
		
		
		
		label1 = new JLabel("Order Tasty &");
		label1.setBounds(100, 30, 300, 150);
		label1.setForeground(Color.decode("#AD8E70"));
		label1.setFont(new Font("Forte",Font.BOLD,28));
		frame.add(label1);
		
		
		label2 = new JLabel("Fresh Food");
		label2.setBounds(100, 70, 300, 150);
		label2.setForeground(Color.decode("#AD8E70"));
		label2.setFont(new Font("Forte",Font.BOLD,28));
		frame.add(label2);
		
		
		label3 = new JLabel("anytime!");
		label3.setBounds(100, 110, 300, 150);
		label3.setForeground(Color.decode("#AD8E70"));
		label3.setFont(new Font("Forte",Font.BOLD,30));
		frame.add(label3);
		
		
		label4 = new JLabel(deliveryLogo);
		label4.setBounds(950, 0, 300, 300);
		frame.add(label4);
		
		
		label5 = new JLabel("EASY WAY TO ORDER YOUR FOOD");
		label5.setIcon(emojiIcon);
		label5.setBounds(100, 10, 250, 100);
		label5.setForeground(Color.decode("#AD8E70"));
		label5.setFont(new Font("Lucida Console",Font.PLAIN,10));
		frame.add(label5);
		
		
		lProfile = new JLabel (user);
		lProfile.setBounds(1150, 5, 80, 23);
		lProfile.setForeground(Color.decode("#243763"));
		lProfile.setBackground(Color.decode("#AD8E70"));
		lProfile.setHorizontalAlignment(JLabel.CENTER);
		lProfile.setOpaque(true);
		lProfile.setIcon(profileImage);
		frame.add(lProfile);
		
		
		findResturant= new JButton("Find Resturant");
		findResturant.setBounds(520, 240, 150, 30);
		findResturant.setFocusable(false);
		findResturant.setFont(new Font("Segoe UI", 1, 19));
		findResturant.setBackground(Color.decode("#AD8E70"));
		findResturant.setForeground(Color.decode("#243763"));
		findResturant.setBorder(BorderFactory.createEmptyBorder());
		findResturant.setCursor(new Cursor(Cursor.HAND_CURSOR));
		findResturant.addActionListener(this);
		frame.add(findResturant);
		
		
		frame.setIconImage(framelogo.getImage());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1280,720);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setLayout (null);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	public static void main (String [] args)
	{
		new Home("monmoy");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==logout)
		{
			frame.setVisible(false);
			new Login();
		}
		else if(e.getSource()==findResturant)
		{
			frame.setVisible(false);
			new ResturantName(f);
		}
		 else if(e.getSource()==profile)
		{
		frame.setVisible(false);
		new UProfile(f);
		}
		
		
		
		//need to work
		else if(e.getSource()==monmoy)
		{
			frame.setVisible(false);
			new MonmoyProfile(f);
		}
		else if(e.getSource()==hasib)
		{
			new HasibProfile(f);
			frame.setVisible(false);
		}
		else if(e.getSource()==hachibur)
		{
			new HachiburProfile(f);
			frame.setVisible(false);
		}
		else if(e.getSource()==antik)
		{
			new AntikProfile(f);
			frame.setVisible(false);
		}
	}
}


