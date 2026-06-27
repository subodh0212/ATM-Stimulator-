package bank_management_system;

import java.awt.Color;
import java.awt.Font;
import java.util.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener{
	
	long random;
	JTextField nameTextFeild,fnameTextField,emailTextField,addressTextField,cityTextField,stateTextField,pinTextField;
	JButton next;
	JRadioButton male, female, other, married ,unmarried , OTHER;
	JDateChooser dateChooser;
	 
	SignupOne(){
		
		setLayout(null);
		
		Random ran = new Random();
		random = (Math.abs((ran.nextLong()%9000L)+1000L));//S.O.PLn karun check karu shakto random no.

		JLabel formno = new JLabel("APPLICATION FORM NO." + random );
		formno.setFont(new Font("Railway",Font.BOLD,38));
		formno.setBounds (140,20,600,40);
		add(formno);
		
		JLabel persondetails = new JLabel("Page 1: Personal Details");
		persondetails.setFont(new Font("Railway",Font.BOLD,22));
		persondetails.setBounds (290,80,300,40);
		add(persondetails);
		
		JLabel name = new JLabel("Name:");
		name.setFont(new Font("Railway",Font.BOLD,20));
		name.setBounds (80,150,80,30);
		add(name);
		
		nameTextFeild = new JTextField();
		nameTextFeild.setFont(new Font("Raleway",Font.BOLD,20));
		nameTextFeild.setBounds(300,150,400,30);
		add(nameTextFeild);
		
		
		JLabel fname = new JLabel("Father's  Name:");
		fname.setFont(new Font("Railway",Font.BOLD,20));
		fname.setBounds (80,200,150,30);
		add(fname);
		
		fnameTextField = new JTextField();
		fnameTextField.setFont(new Font("Raleway",Font.BOLD,20));
		fnameTextField.setBounds (300, 200, 400, 30);
		add(fnameTextField);
		
		JLabel dob = new JLabel("Date Of Birth:");
		dob.setFont(new Font("Railway",Font.BOLD,20));
		dob.setBounds (80,250,150,30);
		add(dob);
		
		dateChooser = new JDateChooser();
		dateChooser.setBounds(300,250,400,30);
		dateChooser.setForeground(new Color (105,105,105));
		add(dateChooser);
		
		JLabel gender = new JLabel("Gender:");
		gender.setFont(new Font("Railway",Font.BOLD,20));
		gender.setBounds (80,300,150,30);
		add(gender);
		
		male = new JRadioButton("Male");
		male.setBounds (300,300,60,30);
		male.setBackground(Color.white);
		add(male);
		
		female =new JRadioButton("Female");
		female.setBounds (450,300,70,30);
		female.setBackground(Color.white);
		add(female);
		
		OTHER =new JRadioButton("Other");
		OTHER.setBounds (600,300,70,30);
		OTHER.setBackground(Color.white);
		add(OTHER);
		
		ButtonGroup gendergroup =new ButtonGroup();
		gendergroup.add(male);
		gendergroup.add(female);
		gendergroup.add(OTHER);
		
		JLabel email = new JLabel("Email Address:");
		email.setFont(new Font("Railway",Font.BOLD,20));
		email.setBounds (80,350,150,30);
		add(email);
		
		emailTextField = new JTextField();
		emailTextField.setFont(new Font("Raleway",Font.BOLD,20));
		emailTextField.setBounds (300,350,400,30);
		add(emailTextField);
		
		JLabel marital = new JLabel("Marital Status:");
		marital.setFont(new Font("Railway",Font.BOLD,20));
		marital.setBounds (80,400,150,30);
		add(marital);
		 
		married = new JRadioButton("Married"); 
		married.setBounds(300,400,100,30);
		married.setBackground(Color.white);
		add(married);
		
		unmarried = new JRadioButton("Unmarried"); 
		unmarried.setBounds(450,400,100,30);
		unmarried.setBackground(Color.white);
		add(unmarried);
		
		other = new JRadioButton("Other"); 
		other.setBounds(600,400,100,30);
		other.setBackground(Color.white);
		add(other);
		
		ButtonGroup marriedgroup = new ButtonGroup();
		marriedgroup.add(married);
		marriedgroup.add(unmarried);
		marriedgroup.add(other);
		
		JLabel address = new JLabel("Address:");
		address.setFont(new Font("Railway",Font.BOLD,20));
		address.setBounds (80,450,150,30);
		add(address);
		
		addressTextField = new JTextField();
		addressTextField.setFont(new Font("Raleway",Font.BOLD,20));
		addressTextField.setBounds (300,450,400,30);
		add(addressTextField);
		
		JLabel city = new JLabel("City:");
		city.setFont(new Font("Railway",Font.BOLD,20));
		city.setBounds (80,500,150,30);
		add(city);
		
		cityTextField = new JTextField();
		cityTextField.setFont(new Font("Raleway",Font.BOLD,20));
		cityTextField.setBounds (300,500,400,30);
		add(cityTextField);
		
		JLabel state= new JLabel("State");
		state.setFont(new Font("Railway",Font.BOLD,20));
		state.setBounds(80,550,150,30);
		add(state);
		
		stateTextField = new JTextField();
		stateTextField.setFont(new Font("Raleway",Font.BOLD,20));
		stateTextField.setBounds (300,550,400,30);
		add(stateTextField);
		
		JLabel pin= new JLabel("Pin Code");
		pin.setFont(new Font("Railway",Font.BOLD,20));
		pin.setBounds(80,600,150,30);
		add(pin);
		
		pinTextField = new JTextField();
		pinTextField.setFont(new Font("Raleway",Font.BOLD,20));
		pinTextField.setBounds (300,600,400,30);
		add(pinTextField);
		
		
		
		next =new JButton("Next");
		next.setBackground (Color.BLACK);
		next.setForeground (Color.WHITE);
		next.setFont (new Font ("Raleway",Font.BOLD,10));
		next.setBounds(600,670,100,30);
		next.addActionListener(this);
		add(next);
		
		getContentPane().setBackground(Color.WHITE);
		
		setSize(850,800);
		setLocation(350,10);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		String formno = " "+ random;//long no la ("") ni concatination kela tar te string madhe convert hota..
		String name = nameTextFeild.getText();
		String fname = fnameTextField.getText();
		String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
		String gender = null;
		if (male.isSelected()) {
			gender ="Male";			
		} else if (female.isSelected()) {
			gender ="Female";
		}else if (other.isSelected()) {
			gender ="Other";
		}
		
		String email = emailTextField.getText();
		String marital =null;
		if(married.isSelected()) {
			marital = "Married";
		} else if(unmarried.isSelected()) {
			marital = "Unmarried";
		}else if (other.isSelected()) {
			marital ="Other";
		}
		String address = addressTextField.getText();
		String city = cityTextField.getText();
		String state =stateTextField.getText();
		String pin = pinTextField.getText();
		
		
		try {
			if(name.equals("")) {
				JOptionPane.showMessageDialog(null, "Name is requird");//validation mhanta
			}
			else if(fname.equals("")) {
				JOptionPane.showMessageDialog(null,"Father name is requird");
			}else {
				Conn c = new Conn();
				String query = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
				c.s.executeUpdate(query);
				
				setVisible(false);
				new SignupTwo(formno).setVisible(true);
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
			
	}
	
	
	
	public static void main(String[]args) { 
		
		new SignupOne();
	}

}
