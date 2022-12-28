package classes;
import interfaces.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.Border;


public class Login implements ActionListener,ILogin{

	private JFrame  frame;
	private JLabel  title,title1;
	private JLabel  shortNote;
	private JLabel  loginAlert;
	private JButton loginButton1;
	private JButton loginButton2;
	private JButton signUpButton1;
	private JButton exitButton;
	private JButton adminButton;
	private JButton previous0;
	private JButton frgtpass;
	private JLabel  userName;
	private JLabel  userPass;
	private JLabel  confirmUserPass;
	private JTextField tfUName;
	private JPasswordField pfUPass;
	private JPasswordField cpfUPass;
	private ImageIcon on;
    private ImageIcon off;
    private JToggleButton toggleButton;
	
	public Login()
	{
		frame = new JFrame("FOOD HUB");
		
		ImageIcon framelogo     = new ImageIcon("icons/framelogo.jpg");
		ImageIcon loginImage    = new ImageIcon("icons/login.png");
		ImageIcon signupImage   = new ImageIcon("icons/signup.png");
		ImageIcon adminImage    = new ImageIcon("icons/admin.png");
		ImageIcon userNameImage = new ImageIcon("icons/username.png");
		ImageIcon UserPassImage = new ImageIcon("icons/userpass.png");
		ImageIcon previousImage = new ImageIcon("icons/previous.png");
		
		Image background = new ImageIcon("icons/1.jpg").getImage();
		frame.setContentPane(new ImagePanel(background));
		
		title = new JLabel("FOOD");
		title.setForeground(Color.decode("#696969"));
		title.setFont(new Font("Forte",Font.PLAIN,50));
		title.setBounds(220, 0, 300, 75);
		frame.add(title);

		title1 = new JLabel("HUB");
		title1.setForeground(Color.decode("#696969"));
		title1.setFont(new Font("Forte",Font.PLAIN,50));
		title1.setBounds(350, 22, 300, 75);
		frame.add(title1);
		
		
		shortNote = new JLabel(" Order Your Favourite Item ");
		shortNote.setForeground(Color.decode("#2A261F"));
		shortNote.setFont(new Font("Harlow Solid Italic",Font.PLAIN,17));
		shortNote.setBounds(420, 60, 380, 60);
		frame.add(shortNote);
		
		loginAlert = new JLabel ("Please Login to Continue....");
		// loginAlert.setForeground(Color.LIGHT_GRAY);
		loginAlert.setForeground(Color.decode("#808000"));
		loginAlert.setFont(new Font("Algerian",Font.PLAIN,17));
		loginAlert.setBounds(540, 300, 380, 60);
		frame.add(loginAlert);
		
		
		
		
		
		loginButton1 = new JButton("Login");
        loginButton1.setFont(new Font("Segoe UI", 1, 19));
        loginButton1.setBounds(550, 380, 80, 30);
        loginButton1.setBorder(new LineBorder(new Color(6, 90, 215), 2));
        loginButton1.setBackground(Color.decode("#37f9f8"));
		loginButton1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		loginButton1.addActionListener(this);
        loginButton1.setFocusable(false);
        frame.add(loginButton1);
		
	
		
		
		signUpButton1 = new JButton("Sign Up");
        signUpButton1.setFont(new Font("Segoe UI", 1, 18));
        signUpButton1.setBounds(640, 380, 80, 30);
        signUpButton1.setBorder(new LineBorder(new Color(6, 90, 215), 2));
        signUpButton1.setBackground(Color.decode("#37f9f8"));
		signUpButton1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		signUpButton1.addActionListener(this);
        signUpButton1.setFocusable(false);
        frame.add(signUpButton1);


        frgtpass = new JButton("FogotPassword");
        frgtpass.setFont(new Font("Segoe UI", 1, 19));
        frgtpass.setBounds(550, 440, 170, 30);
        frgtpass.setBorder(new LineBorder(new Color(6, 90, 215), 2));
        frgtpass.setBackground(Color.decode("#37f9f8"));
		frgtpass.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frgtpass.addActionListener(this);
        frgtpass.setFocusable(false);
        frgtpass.setVisible(false);
        //frame.add(frgtpass);
		
	
		
	
		
		
		
        exitButton = new JButton("EXIT");
        exitButton.setFont(new Font("Segoe UI", 1, 18));
        exitButton.setBounds(360, 440, 80, 30);
        exitButton.setBackground(Color.decode("#37f9f8"));
        exitButton.setBorder(new LineBorder(new Color(6, 90, 215), 2));
		exitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		exitButton.addActionListener(this);
        exitButton.setFocusable(false);
        frame.add(exitButton);
		
		
		userName = new JLabel("Username: ");
		userName.setBounds(550, 140, 200, 30);
		userName.setFont(new Font("Segoe UI", 1, 16));
		userName.setIcon(userNameImage);
		// userName.setForeground(Color.decode("#FFFF00"));
		userName.setVisible(false);
		frame.add(userName);
		
		
		userPass = new JLabel("Password: ");
		userPass.setBounds(550, 220, 200, 30);
		userPass.setFont(new Font("Segoe UI", 1, 16));
		userPass.setIcon(UserPassImage);
		// userPass.setForeground(Color.decode("#FFFF00"));
		userPass.setVisible(false);
		frame.add(userPass);
		
		
		confirmUserPass = new JLabel("Confirm Password: ");
		confirmUserPass.setBounds(180, 260, 180, 30);
		confirmUserPass.setFont(new Font("Calibri",Font.BOLD,16));
		confirmUserPass.setForeground(Color.decode("#FFFF00"));
		confirmUserPass.setIcon(UserPassImage);
		confirmUserPass.setVisible(false);
		frame.add(confirmUserPass);
		
		
		tfUName = new JTextField();
		tfUName.setBounds(550, 180, 140, 23);
		tfUName.setBorder(BorderFactory.createLineBorder(Color.GREEN, 1));
		tfUName.setToolTipText("Enter your name here");
		tfUName.setVisible(false);
		frame.add(tfUName);
		
		
		pfUPass = new JPasswordField();
		pfUPass.setBounds(550, 260, 140, 23);
		pfUPass.setBorder(BorderFactory.createLineBorder(Color.GREEN, 1));
		pfUPass.setEchoChar('*');
		pfUPass.setToolTipText("Enter your password here");
		pfUPass.setVisible(false);
		frame.add(pfUPass);


		on = new ImageIcon("icons/tg1.png");
        off = new ImageIcon("icons/tg2.png");
        toggleButton = new JToggleButton(off);
        toggleButton.setBounds(700, 260, 40, 22);
        toggleButton.setBackground(new Color(143,188,143));
        toggleButton.setForeground(new Color(173,255,47));
        toggleButton.setOpaque(true);
        toggleButton.setBorder(BorderFactory.createEmptyBorder());
        toggleButton.setFocusable(false);
        toggleButton.setToolTipText("Show Password");
        toggleButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        // Border redBorder3 = BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(179, 63, 64));
        // toggleButton.setBorder(redBorder3);
        toggleButton.setVisible(false);
        frame.add(toggleButton);
        toggleButton.addActionListener(this);




		
		
		cpfUPass = new JPasswordField();
		cpfUPass.setBounds(350, 260, 140, 23);
		cpfUPass.setBorder(BorderFactory.createLineBorder(Color.GREEN, 1));
		cpfUPass.setEchoChar('*');
		cpfUPass.setToolTipText("Re-write your password here");
		cpfUPass.setVisible(false);
		frame.add(cpfUPass);
	
		
		
		
		loginButton2 = new JButton("Login");
        loginButton2.setFont(new Font("Segoe UI", 1, 18));
        loginButton2.setBounds(550, 380, 80, 30);
        loginButton2.setBorder(new LineBorder(new Color(6, 90, 215), 2));
        loginButton2.setBackground(Color.decode("#37f9f8"));
		loginButton2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		loginButton2.addActionListener(this);
        loginButton2.setFocusable(false);
        frame.add(loginButton2);
		
		

		
		
		
		
		
	    previous0 = new JButton("BACK");
        previous0.setFont(new Font("Segoe UI", 1, 18));
        previous0.setBounds(640, 380, 80, 30);
        previous0.setBorder(new LineBorder(new Color(6, 90, 215), 2));
        previous0.setBackground(Color.decode("#37f9f8"));
		previous0.setCursor(new Cursor(Cursor.HAND_CURSOR));
		previous0.addActionListener(this);
        previous0.setFocusable(false);
        frame.add(previous0);
		
		
		
		adminButton = new JButton("ADMIN");
        adminButton.setFont(new Font("Segoe UI", 1, 12));
        adminButton.setBounds(715, 0, 70, 20);
        adminButton.setBorder(new LineBorder(new Color(6, 90, 215), 2));
        adminButton.setBackground(Color.decode("#FF6347"));
		adminButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		adminButton.addActionListener(this);
        adminButton.setFocusable(false);
        frame.add(adminButton);
		
	
		
		frame.setSize(800, 550);
		// frame.setUndecorated(true);
		frame.setIconImage(framelogo.getImage());
		frame.setResizable(false);
		frame.setLayout (null);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {



        if (e.getSource() == toggleButton) {
            if (toggleButton.isSelected()) {
                toggleButton.setIcon(on);
                pfUPass.setEchoChar((char) 0);
            } else {
                toggleButton.setIcon(off);
                pfUPass.setEchoChar('*');
            }
        }




		if(e.getSource()==loginButton1)
		{
			loginAlert.setVisible(false);
			signUpButton1.setVisible(false);
			loginButton1.setVisible(false);
			loginButton2.setVisible(true);
			frgtpass.setVisible(true);
			userName.setVisible(true);
			userPass.setVisible(true);
			tfUName.setVisible(true);
			pfUPass.setVisible(true);
			previous0.setVisible(true);
			toggleButton.setVisible(true);
			tfUName.setText(null);
			pfUPass.setText(null);
		}
		//if(e.getSource()==frgtpass){
			//new ForgotPass();
			//frame.setVisible(false);

		//}
		
		else if(e.getSource()==signUpButton1)
		{
			
			new SignUp();
			frame.setVisible(false);
			
		}
		else if (e.getSource()==previous0)
		{
			loginAlert.setVisible(true);
			loginButton1.setVisible(true);
			loginButton2.setVisible(false);
			frgtpass.setVisible(false);
			userName.setVisible(false);
			userPass.setVisible(false);
			tfUName.setVisible(false);
			pfUPass.setVisible(false);
			previous0.setVisible(false);
			signUpButton1.setVisible(true);
			toggleButton.setVisible(false);
		}
		
		else if(e.getSource()==exitButton)
		{
			System.exit(0);
		}
		
		
		else if(e.getSource()==loginButton2)
		{  
			String user = tfUName.getText();
			String pass = pfUPass.getText();
            if (user.isEmpty()|| pass.isEmpty()) 
            {
                JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                        JOptionPane.WARNING_MESSAGE);
            }
            
            
            else {

                try {
                    String userNameS = "User Name : " + user;
                    String passwordS = "Password : " + pass;
                    BufferedReader reader = new BufferedReader(new FileReader("data\\.user_data.txt"));

                    int totalLines = 0;
                    while (reader.readLine() != null)
                        totalLines++;
                    reader.close();

                    for (int i = 0; i <= totalLines; i++) {
                        String line = Files.readAllLines(Paths.get("data\\.user_data.txt")).get(i);
                        if (line.equals(userNameS)) {
                            String line2 = Files.readAllLines(Paths.get("data\\.user_data.txt")).get((i + 1));
                            if (line2.equals(passwordS)) {
                                frame.setVisible(false);
                                new Home(user);
                                break;
                            }
                        }
                    }
                } 
                catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Invalid User Name or Password!", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                }
            }
            
        }
		else if(e.getSource()==adminButton)
		{
			new AdminLogin();
			frame.setVisible(false);
		}
		
		
	}
	
}
