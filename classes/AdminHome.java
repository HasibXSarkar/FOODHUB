package classes;
import interfaces.*;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class AdminHome implements ActionListener, MouseListener, IAdminHome{

	private JFrame frame;
	private JLabel label1;
	private JButton userData;
	private JButton previous0;
	private JButton exitButton;
	private JTextArea display;
	private User x;
	
	public AdminHome(User a)
	{
		x=a;
		
		frame = new JFrame("Admin Home");
		
		ImageIcon framelogo = new ImageIcon("icons/framelogo.jpg");
		ImageIcon previousImage = new ImageIcon("icons/previous.png");
		
	 	Image background = new ImageIcon("icons/Adminpage.png").getImage();
		frame.setContentPane(new ImagePanel(background));
		
		// Image image1 = new ImageIcon("icons/adminSetting.png").getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
		// ImageIcon adminImage = new ImageIcon(image1);
		
		
		label1 = new JLabel("Admin Panel");
		label1.setForeground(Color.white);
		label1.setFont(new Font("Forte",Font.PLAIN,50));
		// label1.setIcon(adminImage);
		// label1.setVerticalTextPosition(JLabel.BOTTOM);
		// label1.setHorizontalTextPosition(JLabel.CENTER);
		// label1.setFont(new Font("Imprint MT Shadow",Font.BOLD,25));
		label1.setBounds(290, 00, 400, 300);
		//frame.add(label1);
		
		
		userData= new JButton("User Data");
		userData.setFont(new Font("Calibri Light (Headings)", Font.BOLD, 15));
		userData.setBounds(390, 580, 100, 30);
		userData.setFocusable(false);
		userData.setBackground(Color.decode("#E5DDC8"));
		userData.setCursor(new Cursor(Cursor.HAND_CURSOR));
		userData.setBorder(BorderFactory.createEtchedBorder());
		userData.addActionListener(this);	
		userData.addMouseListener(this);
		frame.add(userData);
		
	
		previous0 = new JButton ("Previous");
		previous0.setFont(new Font("Calibri Light (Headings)", Font.BOLD, 15));
		previous0.setBounds(520, 580, 100, 30);
		previous0.setFocusable(false);
		previous0.setBackground(Color.decode("#E5DDC8"));
		previous0.setCursor(new Cursor(Cursor.HAND_CURSOR));
		previous0.setBorder(BorderFactory.createRaisedSoftBevelBorder());
		previous0.addActionListener(this);
		previous0.addMouseListener(this);
		previous0.setIcon(previousImage);
		frame.add(previous0);
		
		
		exitButton = new JButton("Exit");
		exitButton.setFont(new Font("Calibri Light (Headings)", Font.BOLD, 15));
		exitButton.setBounds(455, 650, 100, 30);
		exitButton.setFocusable(false);
		exitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		exitButton.setBackground(Color.decode("#E5DDC8"));
		exitButton.setBorder(BorderFactory.createRaisedSoftBevelBorder());
		exitButton.addActionListener(this);
		exitButton.addMouseListener(this);
		frame.add(exitButton);
		
		
		display = new JTextArea (3, 3);
		display.setBounds(10,580,200,140);
		display.setBackground(Color.decode("#E5DDC8"));
		display.setForeground(Color.decode("#004369"));
		display.setFont(new Font("Times New Roman",Font.BOLD,19));
		String name= a.getName();
		String age = a.getAge();
		String pass = a.getPassword();
		display.setText("Admin Name: "+name+"\n\nAdmin Age: "+age+"\n\nAdmin Pass: "+pass);
		display.setEditable(false);
		frame.add(display);
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1024, 768);
		frame.setIconImage(framelogo.getImage());
		frame.setResizable(false);
		frame.setLayout (null);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		if (e.getSource()==userData)
		{
			userData.setBackground(Color.decode("#E5DDC8"));
			userData.setForeground(Color.decode("#DB1F48"));
		}
		else if (e.getSource()==exitButton)
		{
			exitButton.setBackground(Color.decode("#E5DDC8"));
			exitButton.setForeground(Color.decode("#DB1F48"));
		}
		else if (e.getSource()==previous0)
		{
			previous0.setBackground(Color.decode("#E5DDC8"));
			previous0.setForeground(Color.decode("#DB1F48"));
		}
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if (e.getSource()==userData)
		{
			userData.setBackground(Color.decode("#E5DDC8"));
			userData.setForeground(Color.decode("#004369"));
		}
		else if (e.getSource()==exitButton)
		{
			exitButton.setBackground(Color.decode("#E5DDC8"));
			exitButton.setForeground(Color.decode("#004369"));
		}
		else if (e.getSource()==previous0)
		{
			previous0.setBackground(Color.decode("#E5DDC8"));
			previous0.setForeground(Color.decode("#004369"));
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==exitButton)
		{
			System.exit(0);
		}
		else if (e.getSource()==previous0)
		{
			frame.setVisible(false);
			new Login();
		}
		else if (e.getSource()==userData)
		{
			frame.setVisible(false);
			new UserData(x);
		}
		
	}

}
