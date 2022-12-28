package classes;
import interfaces.*;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PaymentSuccess implements ActionListener, IPaymentSuccess{

	private JFrame frame;
	private JLabel tcs;
	private JLabel ap;
	
	private JButton home;
	private JButton exit;
	private JButton recipt;
	private String f;
	public PaymentSuccess(double amount,String user)
	{
		f=user;
		
		frame= new JFrame();

		Image background = new ImageIcon("icons/PaymentSuccess.png").getImage();
		frame.setContentPane(new ImagePanel(background));
		
		
		ImageIcon framelogo = new ImageIcon("icons/framelogo.jpg");
		Image image1 = new ImageIcon("icons/success.png").getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT);
		ImageIcon successIcon = new ImageIcon(image1);
		tcs = new JLabel("Transaction Completed Successfully");
		tcs.setIcon(successIcon);
		tcs.setVerticalTextPosition(JLabel.BOTTOM);
		tcs.setHorizontalTextPosition(JLabel.CENTER);
		tcs.setForeground(Color.BLACK);
		tcs.setFont(new Font("Segoe UI Black", Font.PLAIN, 28));
		tcs.setBounds(135, 00, 520, 200);
		frame.add(tcs);
		
		
		ap = new JLabel("Amount Paid :    "+amount+" tk");
		ap.setForeground(Color.BLACK);
		ap.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		ap.setBounds(300, 200, 400, 100);
		frame.add(ap);
		
		
		home= new JButton("Home");
		home.setBounds(250, 300, 100, 30);
		home.setFocusable(false);
		home.setBackground(Color.decode("#FAAB78"));
		home.setForeground(Color.black);
		home.setBorder(BorderFactory.createEmptyBorder());
		home.setCursor(new Cursor(Cursor.HAND_CURSOR));
		home.addActionListener(this);
		frame.add(home);
		
		exit= new JButton("Exit");
		exit.setBounds(350, 370, 100, 30);
		exit.setFocusable(false);
		exit.setBackground(Color.decode("#FAAB78"));
		exit.setForeground(Color.black);
		exit.setBorder(BorderFactory.createEmptyBorder());
		exit.setCursor(new Cursor(Cursor.HAND_CURSOR));
		exit.addActionListener(this);
		frame.add(exit);
		
		recipt= new JButton("Print Recipt");
		recipt.setBounds(450, 300, 100, 30);
		recipt.setFocusable(false);
		recipt.setBackground(Color.decode("#FAAB78"));
		recipt.setForeground(Color.black);
		recipt.setBorder(BorderFactory.createEmptyBorder());
		recipt.setCursor(new Cursor(Cursor.HAND_CURSOR));
		recipt.addActionListener(this);
		frame.add(recipt);
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 500);
		frame.setIconImage(framelogo.getImage());
		frame.getContentPane().setBackground(Color.decode("#F2F2F2"));
		frame.setResizable(false);
		frame.setLayout (null);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		
		new PaymentSuccess(100.0,"Hasib");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==exit)
		{
			System.exit(0);
		}
	
		else if(e.getSource()==home)
		{
			frame.setVisible(false);
			new Home(f);
		}
		else if(e.getSource()==recipt)
		{
			
			try 
			{

			File newfile = new File("data\\Last.txt"); 
			Scanner sc = new Scanner(newfile);
			
			String line1 = null;
			String line2 = null;
			String line3= null;
			String line4 = null;
			String line5 = null;
			String line6 = null;
			String line7 = null;
			String line8 = null;
			String line9 = null;
	
			while(sc.hasNext())
			{
				line1 = sc.nextLine();
				line2 = sc.nextLine();
				line3 = sc.nextLine();
				line4 = sc.nextLine();
				line5 = sc.nextLine();

			}
			sc.close();  
			File newfile2 = new File("data\\Last2.txt");
			Scanner sc2 = new Scanner(newfile2);
			while(sc2.hasNext())
			{
				line6 = sc2.nextLine();
				line7 = sc2.nextLine();
				line8 = sc2.nextLine();
				line9 = sc2.nextLine();

			}
			sc2.close();  
			File recipt = new File("data\\Recipt.doc"); 
			recipt.createNewFile();
			FileWriter writeFile = new FileWriter("data\\Recipt.doc");
			
			writeFile.write(line1+"\n"+
					line2+"\n"+
					line3+"\n"+
					line4+"\n"+
					line5+"\n        \n ----------------------\n        \n"+
					line6+"\n"+
					line7+"\n"+
					line8+"\n"+
					line9+"\n////////////////////////////\n"+
					"\nThank You for using our service :) ");
			
			writeFile.close();
			
			newfile.delete();
			newfile2.delete();
			
			JOptionPane.showMessageDialog(null, "Recipt printed here--"+recipt.getAbsolutePath());
	
			}
			catch(IOException io)
			{
				JOptionPane.showMessageDialog(null, "An error Occured and failed to create the file");
				return;
			}
		}
		
	}

}
