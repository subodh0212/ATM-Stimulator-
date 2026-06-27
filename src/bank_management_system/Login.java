package bank_management_system;

import java.awt.Image;
import java.awt.event.*;//ActionListener

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {
	
	JButton login, clear, signup;
	JTextField cardTextField ;
	JPasswordField pinTextField;
	
	
	Login(){
		
		
		setTitle("AUTOMATED TELLAR MACHINE");
		
		setLayout(null);
		
		ImageIcon i1 = new ImageIcon(getClass().getResource("/icons/logo.jpg"));
		Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel label =new JLabel(i3);
		label.setBounds(70,10,100,100);
		add(label);
		
		JLabel text =new JLabel("Welcome To ATM");
		text.setFont(new Font("Osward",Font.BOLD,38));
		text.setBounds(200, 40, 400, 40);
		add(text);
		
		JLabel cardo =new JLabel("Card No:");
		cardo.setFont(new Font("Raleway",Font.BOLD,28));
		cardo.setBounds(120, 150, 150, 30);
		add(cardo);
		
		
		cardTextField = new JTextField();
		cardTextField.setBounds(300,150,230,30);
		cardTextField.setFont(new Font ("Arial",Font.BOLD,14));
		add(cardTextField);
		
		JLabel pin =new JLabel("PIN:");
		pin.setFont(new Font("Raleway",Font.BOLD,28));
		pin.setBounds(120, 220, 230, 40);
		add(pin);
		
		
		pinTextField = new JPasswordField();
		pinTextField.setBounds(300,220,230,30);
		pinTextField.setFont(new Font ("Arial",Font.BOLD,14));
		add(pinTextField);
		
		
		login = new JButton("SIGN IN");
		login.setBounds(300,300,100,30);
		login.setBackground(Color.BLACK);
		login.setForeground(Color.white);
		login.addActionListener(this);
		add(login);
		
		clear = new JButton("CLEAR");
		clear.setBounds(430,300,100,30);
		clear.setBackground(Color.BLACK);
		clear.setForeground(Color.white);
		clear.addActionListener(this);
		add(clear);
		
		signup = new JButton("SIGN UP");
		signup.setBounds(300,350,230,30);
		signup.setBackground(Color.BLACK);
		signup.setForeground(Color.white);
		signup.addActionListener(this);
		add(signup);
		
		getContentPane().setBackground(Color.WHITE);
		
		setSize(800,480);
		setVisible(true);
		setLocation(350,200);
	}
	
	public void actionPerformed(ActionEvent ac) {
		
		if(ac.getSource() == clear) {
			cardTextField.setText("");
			pinTextField.setText("");
			
		}else if(ac.getSource() == login) {
			
			Conn conn = new Conn();
			String cardnumber = cardTextField.getText().trim();
			String pinnumber = pinTextField.getText().trim();
			String query ="Select * from login where cardnumber ='"+cardnumber+"' and pin ='"+pinnumber+"'";
			try {
				ResultSet rs = conn.s.executeQuery(query);
				if(rs.next()) {
					setVisible(false);
					new Transactions(pinnumber).setVisible(true);
				}else {
					
					JOptionPane.showMessageDialog(null,"Incorrect Card No. or Pin");
				}
				
			}catch(Exception e){
				
				System.out.println(e);
			}
			
		}else if(ac.getSource() == signup) {
			setVisible(false);
			new SignupOne().setVisible(true);
		}
	}
	
	 public static void main(String []args) {
		 
		 new Login();
	 }

}
