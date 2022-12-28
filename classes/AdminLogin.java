package classes;
import interfaces.*;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JPanel;

public class AdminLogin implements ActionListener, MouseListener,IAdminLogin{

	private JFrame frame;
	private JLabel label1;
	private JLabel label2;
	private JLabel userName;
	private JLabel userPass;
	private JButton backbtn;
	private JTextField tfUName;
	private JPasswordField pfUPass;
	private JPanel customerPanel1;
	private User u1,u2;
	private User users[];
	
	public AdminLogin()
	{
	
		frame = new JFrame("Admin Login");
		
		ImageIcon framelogo = new ImageIcon("icons/framelogo.jpg");
		ImageIcon userNameImage = new ImageIcon("icons/username.png");
		ImageIcon UserPassImage = new ImageIcon("icons/userpass.png");
		
		// Image background = new ImageIcon("icons/admin_back.png").getImage().getScaledInstance(550, 585, Image.SCALE_AREA_AVERAGING);
		// frame.setContentPane(new ImagePanel(background));

	    customerPanel1 = new JPanel();
	    customerPanel1.setLayout(null);
	    customerPanel1.setBounds(0, 0, 550, 585);
	    customerPanel1.setBackground(Color.decode("#8FBC8F"));
	    customerPanel1.setVisible(true);
	    customerPanel1.setOpaque(true);
		
		u1 = new User("Monmoy","21", "1234");
		u2 = new User("admin","21", "admin");
		users = new User[4];
		users[0] = u1;
		users[1] = u2;
		
		
		label1 = new JLabel("ADMIN LOGIN");
		// label1.setForeground(Color.DARK_GRAY);
		label1.setForeground(Color.white);
		label1.setFont(new Font("Forte",Font.PLAIN,40));
		label1.setBounds(130, 60, 300, 120);
		frame.add(label1);
		
		
		label2 = new JLabel("ADMIN IN");
		label2.setForeground(Color.DARK_GRAY);
		label2.setFont(new Font("Segoe UI",Font.BOLD,18));
		label2.setBounds(250, 320, 100, 80);
		label2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		label2.addMouseListener(this);
		frame.add(label2);
		
		
		userName = new JLabel("Admin name: ");
		userName.setBounds(110, 240, 120, 30);
		userName.setFont(new Font("Times New Roman",Font.BOLD,16));
		userName.setForeground(Color.decode("#000000"));
		frame.add(userName);
		
		
		userPass = new JLabel("Password: ");
		userPass.setBounds(130, 280, 100, 30);
		userPass.setFont(new Font("Times New Roman",Font.BOLD,16));
		userPass.setForeground(Color.decode("#000000"));
		frame.add(userPass);
		
		
		tfUName = new JTextField();
		tfUName.setBounds(230, 240, 140, 23);
		tfUName.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		tfUName.setToolTipText("Enter your name here");
		frame.add(tfUName);
		
		
		pfUPass = new JPasswordField();
		pfUPass.setBounds(230, 280, 140, 23);
		pfUPass.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		pfUPass.setEchoChar('*');
		pfUPass.setToolTipText("Enter your password here");
		frame.add(pfUPass);

		backbtn=new JButton("Previous");
		backbtn.setBounds(2, 2, 120, 20);
    	backbtn.setOpaque(true);
   	 	backbtn.setContentAreaFilled(true);
    	backbtn.setBackground(Color.WHITE);
    	backbtn.setBorderPainted(true);
    	backbtn.setForeground(Color.DARK_GRAY );
    	backbtn.addActionListener(this);
    	frame.add(backbtn);


    	frame.add(customerPanel1);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// frame.setBackground(new Color(25, 118, 211));
		frame.setSize(550, 585);
		frame.getContentPane().setBackground(Color.black);
		frame.setIconImage(framelogo.getImage());
		frame.setResizable(false);
		frame.setLayout (null);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}
	 public User searchUser(String username)
	    {
	    	User a = null;
	    	
	    	for(int i=0; i<users.length; i++)
	    	{
	    		if(users[i]!=null)
	    		{
	    			if(users[i].getName().equals(username))
	        		{
	        			a = users[i];
	        			break;
	        		}
	    		}
	    	}
	    	return a;
	    }
	
	public static void main(String[] args) {
		
			new AdminLogin();
	}

	@Override

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==backbtn)
		{
			frame.setVisible(false);
			new Login();
		}
		
		
	}
	public void mouseClicked(MouseEvent e) {
		if (e.getSource()==label2)
		{
			String user = tfUName.getText();
			String pass = pfUPass.getText();
			int flag=0;
			if(user.isEmpty()==false && pass.isEmpty()==false)
				{
				for(int i = 0; i<users.length; i++)
				{
					if(users[i]!=null)
					{
						if(user.equals(users[i].getName()) && pass.equals(users[i].getPassword()))
						{
							flag = 1;
							break;
						}
					}
				}
				if (flag == 1)
				{
					User x= this.searchUser(user);
					new AdminHome(x);
					frame.setVisible(false);
				}
				else
				{
				JOptionPane.showMessageDialog(null, "Invalid Admin name or password!");
				}
			}
			else
			{
			JOptionPane.showMessageDialog(null,"Admin Name & Password field can't be empty!");
			}
		}
		
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		if (e.getSource()==label2)
		{
			label2.setForeground(Color.green);
		}
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if (e.getSource()==label2)
		{
			label2.setForeground(Color.white);
		}
		
	}

}
