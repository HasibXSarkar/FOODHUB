package classes;
import interfaces.*;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AntikProfile implements ActionListener, IAntikProfile
{
	
	private JButton previous0;
	private JLabel picture;
	private JFrame frame;
	
	private String f;
	public AntikProfile(String user)
	{
		f=user;
		
		frame = new JFrame("Antik");
		
		// ImageIcon framelogo = new ImageIcon("icons/framelogo.jpg");
		// Image image1 = new ImageIcon("icons/yeamin.png").getImage().getScaledInstance(537, 560, Image.SCALE_SMOOTH);
		// ImageIcon yeamin= new ImageIcon(image1);
		// ImageIcon previousImage = new ImageIcon("icons/previous.png");
		
		
		previous0 = new JButton ("Previous");
		previous0.setFont(new Font("Calibri Light (Headings)", Font.BOLD, 15));
		previous0.setBounds(200, 520, 150, 30);
		previous0.setFocusable(false);
		previous0.setBackground(Color.LIGHT_GRAY);
		previous0.setCursor(new Cursor(Cursor.HAND_CURSOR));
		previous0.setBorder(BorderFactory.createRaisedSoftBevelBorder());
		previous0.addActionListener(this);
		previous0.setIcon(previousImage);
		frame.add(previous0);
		
		
		// picture = new JLabel(yeamin);
		// picture.setBounds(0, 0, 550, 570);
		// frame.add(picture);
		
		
		frame.setIconImage(framelogo.getImage());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(580,630);
		frame.getContentPane().setBackground(Color.white);
		frame.setLayout (null);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new MonmoyProfile("Antik");

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==previous0)
		{
			frame.setVisible(false);
			new Home(f);
		}
		
	}

}
