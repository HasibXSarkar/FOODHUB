package classes;
import interfaces.*;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JPanel;
import javax.swing.border.Border;
public class SignUp implements ActionListener, ISignUp{

	private JFrame frame;
	private JLabel label1;
	private JLabel userName;
	private JLabel userPass;
	private JLabel email;
	private JLabel confirmUserPass;
	private JTextField tfUName;
	private JPasswordField pfUPass;
	private JPasswordField cpfUPass;
	private JTextField tfemail;
	private JButton signUpButton1;
	private JButton exitButton;
	private JButton previous0;
	private JPanel customerPanel1;
	private ImageIcon on;
    private ImageIcon off;
    private JToggleButton toggleButton1;
    private JToggleButton toggleButton2;
	
	public SignUp()
	{
		frame = new JFrame("FOOD HUB");
		
		ImageIcon framelogo = new ImageIcon("icons/framelogo.jpg");
		ImageIcon signupImage = new ImageIcon("icons/signup.png");
		ImageIcon userNameImage = new ImageIcon("icons/username.png");
		ImageIcon UserPassImage = new ImageIcon("icons/userpass.png");
		ImageIcon previousImage = new ImageIcon("icons/previous.png");

		
		
		
		Image background = new ImageIcon("icons/back_img.png").getImage().getScaledInstance(800, 550, Image.SCALE_AREA_AVERAGING);
		frame.setContentPane(new ImagePanel(background));
		

		// customerPanel1 = new JPanel();
	    // customerPanel1.setLayout(null);
	    // customerPanel1.setBounds(0, 0, 550, 585);
	    // customerPanel1.setBackground(Color.decode("#8EC3B0"));
	    // customerPanel1.setVisible(true);
	    // customerPanel1.setOpaque(true);
	    // frame.add(customerPanel1);
		
		label1 = new JLabel("Enter Your Necessary Details Below");
		label1.setForeground(Color.decode("#191970"));
		label1.setFont(new Font("Algerian",Font.PLAIN,30));
		label1.setBounds(100, 0, 600, 140);
		frame.add(label1);
		
		
		userName = new JLabel("Username: ");
		userName.setBounds(250, 140, 150, 30);
		userName.setFont(new Font("Biome",Font.BOLD,16));
		userName.setIcon(userNameImage);
		userName.setForeground(Color.decode("#030914"));
		frame.add(userName);
		
		
		userPass = new JLabel("Password: ");
		userPass.setBounds(250, 180, 150, 30);
		userPass.setFont(new Font("Biome",Font.BOLD,16));
		userPass.setIcon(UserPassImage);
		userPass.setForeground(Color.decode("#030914"));
		frame.add(userPass);
		
		
		confirmUserPass = new JLabel("Confirm Password: ");
		confirmUserPass.setBounds(180, 220, 180, 30);
		confirmUserPass.setFont(new Font("Biome",Font.BOLD,16));
		confirmUserPass.setForeground(Color.decode("#030914"));
		confirmUserPass.setIcon(UserPassImage);
		frame.add(confirmUserPass);
		
		
		tfUName = new JTextField();
		tfUName.setBounds(350, 140, 140, 23);
		tfUName.setBorder(BorderFactory.createLineBorder(Color.decode("#3A4A62"), 1));
		tfUName.setToolTipText("Enter your name here");
		frame.add(tfUName);
		
		
		pfUPass = new JPasswordField();
		pfUPass.setBounds(350, 180, 140, 23);
		pfUPass.setBorder(BorderFactory.createLineBorder(Color.decode("#3A4A62"), 1));
		pfUPass.setEchoChar('*');
		pfUPass.setToolTipText("Enter your password here");
		frame.add(pfUPass);



		on = new ImageIcon("icons/tg1.png");
        off = new ImageIcon("icons/tg2.png");
        toggleButton1 = new JToggleButton(off);
        toggleButton1.setBounds(500, 180, 30, 22);
        toggleButton1.setBackground(new Color(176,224,230));
        toggleButton1.setForeground(new Color(173,255,47));
        toggleButton1.setOpaque(true);
        toggleButton1.setBorder(BorderFactory.createEmptyBorder());
        toggleButton1.setFocusable(false);
        toggleButton1.setToolTipText("Show Password");
        toggleButton1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        // Border redBorder3 = BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(179, 63, 64));
        // toggleButton.setBorder(redBorder3);
        toggleButton1.setVisible(true);
        frame.add(toggleButton1);
        toggleButton1.addActionListener(this);
		
		
		cpfUPass = new JPasswordField();
		cpfUPass.setBounds(350, 220, 140, 23);
		cpfUPass.setBorder(BorderFactory.createLineBorder(Color.decode("#3A4A62"), 1));
		cpfUPass.setEchoChar('*');
		cpfUPass.setToolTipText("Re-write your password here");
		frame.add(cpfUPass);


		on = new ImageIcon("icons/tg1.png");
        off = new ImageIcon("icons/tg2.png");
        toggleButton2 = new JToggleButton(off);
        toggleButton2.setBounds(500, 220, 30, 22);
        toggleButton2.setBackground(new Color(176,224,230));
        toggleButton2.setForeground(new Color(176,224,230));
        toggleButton2.setOpaque(true);
        toggleButton2.setBorder(BorderFactory.createEmptyBorder());
        toggleButton2.setFocusable(false);
        toggleButton2.setToolTipText("Show Password");
        toggleButton2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        // Border redBorder3 = BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(179, 63, 64));
        // toggleButton.setBorder(redBorder3);
        toggleButton2.setVisible(true);
        frame.add(toggleButton2);
        toggleButton2.addActionListener(this);



		
		
		email = new JLabel("Email: ");
		email.setBounds(290, 260, 100, 30);
		email.setFont(new Font("Biome",Font.BOLD,16));
		email.setForeground(Color.decode("#030914"));
		frame.add(email);
		
		
	    tfemail = new JTextField();
		tfemail.setBounds(350, 260, 140, 23);
		tfemail.setBorder(BorderFactory.createLineBorder(Color.decode("#3A4A62"), 1));
		tfemail.setToolTipText("Your Email Adress?");
		frame.add(tfemail);
		
		
		previous0 = new JButton ("Previous");
		previous0.setBounds(440, 380, 120, 30);
		previous0.setFocusable(false);
		previous0.setBackground(Color.decode("#37f9f8"));
		previous0.setFont(new Font("Segoe UI", 1, 18));
		previous0.setBorder(new LineBorder(new Color(6, 90, 215), 2));
		// previous0.setBorder(BorderFactory.createRaisedSoftBevelBorder());
		previous0.addActionListener(this);
		previous0.setCursor(new Cursor(Cursor.HAND_CURSOR));
		previous0.setIcon(previousImage);
		frame.add(previous0);
		
		
		signUpButton1 = new JButton("Signup");
		signUpButton1.setBounds(300, 380, 120, 30);
		signUpButton1.setFocusable(false);
		signUpButton1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		signUpButton1.setBackground(Color.decode("#37f9f8"));
		signUpButton1.setFont(new Font("Segoe UI", 1, 18));
		signUpButton1.setBorder(new LineBorder(new Color(6, 90, 215), 2));
		// signUpButton1.setBorder(BorderFactory.createRaisedSoftBevelBorder());
		signUpButton1.setIcon(signupImage);
		signUpButton1.addActionListener(this);
		frame.add(signUpButton1);
		
		
		exitButton = new JButton("Exit");
		exitButton.setBounds(390, 440, 80, 30);
		exitButton.setFocusable(false);
		exitButton.setBackground(Color.LIGHT_GRAY);
		exitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		exitButton.setBackground(Color.decode("#37f9f8"));
		exitButton.setFont(new Font("Segoe UI", 1, 18));
		exitButton.setBorder(new LineBorder(new Color(6, 90, 215), 2));
		// exitButton.setBorder(BorderFactory.createRaisedSoftBevelBorder());
		exitButton.addActionListener(this);
		frame.add(exitButton);
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 550);
		frame.setIconImage(framelogo.getImage());
		frame.setResizable(false);
		frame.setLayout (null);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new SignUp();
	}
	@Override
	public void actionPerformed(ActionEvent e) {


		

        if (e.getSource() == toggleButton1) 
        {
            if (toggleButton1.isSelected()) {
                toggleButton1.setIcon(on);
                pfUPass.setEchoChar((char) 0);
            } else {
                toggleButton1.setIcon(off);
                pfUPass.setEchoChar('*');
            }
        }



        if (e.getSource() == toggleButton2) 
        {
            if (toggleButton2.isSelected()) {
                toggleButton2.setIcon(on);
                cpfUPass.setEchoChar((char) 0);
            } else {
                toggleButton2.setIcon(off);
                cpfUPass.setEchoChar('*');
            }
        }





		if (e.getSource()==previous0)
		{
			new Login();
			frame.setVisible(false);
		}
		else if(e.getSource()==exitButton)
		{
			System.exit(0);
		}
		else if(e.getSource()==signUpButton1)
		{
			String username = tfUName.getText();
			String pass = pfUPass.getText();
			String confirmPass = cpfUPass.getText();
			String sEmail = tfemail.getText();
			
			if (username.isEmpty()==false && pass.isEmpty()==false && sEmail.isEmpty()==false && sEmail.isEmpty()==false)
			{
				
				if (confirmPass.equals(pass)) 
				{
					try {
                    	File file = new File("data\\.user_data.txt");
                    	if (!file.exists()) {
                        	file.createNewFile();
                    	}
                    	FileWriter fw = new FileWriter(file, true);
                    	BufferedWriter bw = new BufferedWriter(fw);
                    	PrintWriter pw = new PrintWriter(bw);

                    	LocalDateTime myDateObj = LocalDateTime.now();
                    	DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm a, dd/MM/yyyy");

                    	String timeAndDate = myDateObj.format(myFormatObj);

                    	pw.println("User Name : " + username);
                    	pw.println("Password : " + pass);
                    	pw.println("Email : " + sEmail);
                    	pw.println("Time & Date : " + timeAndDate);
                    	pw.println("===============================================");
                    	pw.close();
                    	
                    	JOptionPane.showMessageDialog(null, "New User Created Successfully.", "User created",JOptionPane.INFORMATION_MESSAGE);
                    	tfUName.setText(null);
                    	pfUPass.setText(null);
                    	cpfUPass.setText(null);
                    	tfemail.setText(null);
                    	frame.setVisible(false);
                    	new Login();
					}
					
					catch (Exception ex) {
						System.out.print(ex);
						JOptionPane.showMessageDialog(null,"Something Went wrong");
						}
					}
				else 
				{
					JOptionPane.showMessageDialog(null,"Password didn't match");
				}
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Please enter valid information in the fields");
			}
			
		}
		
	}
	
}
