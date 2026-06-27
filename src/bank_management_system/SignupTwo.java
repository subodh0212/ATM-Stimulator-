package bank_management_system;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener{

	JTextField panTextField,aadharTextField;
	JButton next;
	JRadioButton  yes,no,existing,existingN ;
	JComboBox religion,category,income,education,occupation;
	String formno;
	 
	SignupTwo(String formno){
		this.formno = formno;
		
		setLayout(null);
		
		setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
		
		JLabel additionaldetails = new JLabel("Page 2: Additional Details");
		additionaldetails.setFont(new Font("Railway",Font.BOLD,22));
		additionaldetails.setBounds (290,80,300,40);
		add(additionaldetails);
		
		JLabel name = new JLabel("Religion:");
		name.setFont(new Font("Railway",Font.BOLD,20));
		name.setBounds (80,150,120,30);
		add(name);
		
		String valReligion[]={"Hindu","Muslim","Sikh","Christian","Other"};
		religion = new JComboBox(valReligion);
		religion.setBounds(300,150,400,30);
		//religion.setBackground(Color.WHITE);
		add(religion);
		
		JLabel fname = new JLabel("Category:");
		fname.setFont(new Font("Railway",Font.BOLD,20));
		fname.setBounds (80,200,150,30);
		add(fname);
		
		String valcategory[]= {"General","OBC","NT","SC","ST","Other"};
		category = new JComboBox(valcategory);
		category.setBounds(300,200,400,30);
//		category.setBackground(Color.white);
		add(category);
		
		JLabel salary = new JLabel("Income:");
		salary.setFont(new Font("Railway",Font.BOLD,20));
		salary.setBounds (80,250,150,30);
		add(salary);
		
		
		String incomecategory[]= {"less than 200000","200000-450000","450000-650000","650000-850000","850000-1000000","100000-1200000","more than 1200000"};
		income = new JComboBox(incomecategory);
		income.setBounds(300,250,400,30);
		add(income);
		
		JLabel educational = new JLabel("Educational:");
		educational.setFont(new Font("Railway",Font.BOLD,20));
		educational.setBounds (80,300,150,30);
		add(educational);
		
		JLabel qualification = new JLabel("Qualification:");
		qualification.setFont(new Font("Railway",Font.BOLD,20));
		qualification.setBounds (80,325,150,30);
		add(qualification);
		
		String educationvalues[] ={"Non-Graduate","Graduate","Post-Graduation","Doctrate","Other"};
		education = new JComboBox(educationvalues);
		education.setBounds(300,320,400,30);
		add(education);
		
		JLabel job = new JLabel("Occupation:");
		job.setFont(new Font("Railway",Font.BOLD,20));
		job.setBounds (80,400,150,30);
		add(job);
		
		String occupationvalues[] ={"Engineer","Teacher","Bussiness","Manager","Employee","Student","Retired","Other"};
		occupation = new JComboBox(occupationvalues);
		occupation.setBounds(300,400,400,30);
		add(occupation);
		
		JLabel pan = new JLabel("Pan Number:");
		pan.setFont(new Font("Railway",Font.BOLD,20));
		pan.setBounds (80,450,150,30);
		add(pan);
		
		panTextField = new JTextField();
		panTextField.setFont(new Font("Raleway",Font.BOLD,20));
		panTextField.setBounds (300,450,400,30);
		add(panTextField);
		
		JLabel aadhar = new JLabel("Aadhar Number:");
		aadhar.setFont(new Font("Railway",Font.BOLD,20));
		aadhar.setBounds (80,500,180,30);
		add(aadhar);
		
		aadharTextField = new JTextField();
		aadharTextField.setFont(new Font("Raleway",Font.BOLD,20));
		aadharTextField.setBounds (300,500,400,30);
		add(aadharTextField);
		
		JLabel state= new JLabel("Senior citizen:");
		state.setFont(new Font("Railway",Font.BOLD,20));
		state.setBounds(80,550,150,30);
		add(state);
		
		yes = new JRadioButton("YES");
		yes.setBounds(300,550,100,30);
		yes.setBackground(Color.white);
		add(yes);
		
		no = new JRadioButton("NO"); 
		no.setBounds(450,550,100,30);
		no.setBackground(Color.white);
		add(no);
		
		ButtonGroup group = new ButtonGroup();
		group.add(yes);
		group.add(no);
		
		
		JLabel existingACC= new JLabel("Existing Account:");
		existingACC.setFont(new Font("Railway",Font.BOLD,20));
		existingACC.setBounds(80,600,180,30);
		add(existingACC);
				
		existing = new JRadioButton("YES");
		existing.setBounds(300,600,100,30);
		existing.setBackground(Color.white);
		add(existing);
		
		existingN = new JRadioButton("NO"); 
		existingN.setBounds(450,600,100,30);
		existingN.setBackground(Color.white);
		add(existingN);
		
		ButtonGroup Group = new ButtonGroup();
		Group.add(yes);
		Group.add(no);
		
		
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
		
		String sreligion = (String) religion.getSelectedItem();
		String scategory = (String) category.getSelectedItem();
		String sincome = (String) income.getSelectedItem();
		String seducation = (String) education.getSelectedItem();
		String soccupation =(String) occupation.getSelectedItem();
		
		String seniorcitizen = null;
		if (yes.isSelected()) {
			seniorcitizen ="yes";			
		} else if (no.isSelected()) {
			seniorcitizen ="no";
		}
		
		String existingACC =null;
		if(existing.isSelected()) {
			existingACC = "YES";
		} else if(existingN.isSelected()) {
			existingACC = "NO";
		}
		String pan = panTextField.getText();
		String aadhar = aadharTextField.getText();
		
		
		try {
				Conn c = new Conn();
				String query = "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+pan+"','"+aadhar+"','"+seniorcitizen+"','"+existingACC+"')";
				c.s.executeUpdate(query);
				
				//Signup3 Object
				setVisible(false);
				new SignupThree(formno).setVisible(true);
				
		}catch(Exception e) {
			System.out.println(e);
		}
			
	}
	
	
	
	public static void main(String[]args) { 
		
		new SignupTwo("");
	}

}
