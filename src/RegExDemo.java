//Alex Isaac
//M4-A5 RegExDemo
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegExDemo {

	private JFrame frmAlexIsaacRegex;
	private JTextField txtFirstname;
	private JTextField txtLastName;
	private JTextField txtStreet;
	private JTextField txtCity;
	private JTextField txtState;
	private JTextField txtZip;
	private JTextField txtCellPhone;
	private JTextField txtEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegExDemo window = new RegExDemo();
					window.frmAlexIsaacRegex.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RegExDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAlexIsaacRegex = new JFrame();
		frmAlexIsaacRegex.setTitle("Alex Isaac RegEx Demo");
		frmAlexIsaacRegex.setBounds(100, 100, 536, 404);
		frmAlexIsaacRegex.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAlexIsaacRegex.getContentPane().setLayout(null);
		
		txtFirstname = new JTextField();
		txtFirstname.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				if(txtFirstname.getText().matches("[A-Z]{1}[A-Za-z]+"))
				{
					txtFirstname.transferFocus();
				}
				else
				{
					JOptionPane.showMessageDialog(null, txtFirstname.getText() + " is not a valid First Name!");
					txtFirstname.setText("");
				}
			}
		});
		txtFirstname.setBounds(15, 57, 203, 26);
		frmAlexIsaacRegex.getContentPane().add(txtFirstname);
		txtFirstname.setColumns(10);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(15, 32, 103, 20);
		frmAlexIsaacRegex.getContentPane().add(lblFirstName);
		
		txtLastName = new JTextField();
		txtLastName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				if (txtLastName.getText().matches("[A-Z]{1}[a-zA-Z']+"))
				{
					txtLastName.transferFocus();
				}
				else
				{
					JOptionPane.showMessageDialog(null, txtLastName.getText() + " is not a valid Last Name!");
					txtLastName.setText("");
				}
			}
		});
		txtLastName.setBounds(281, 57, 203, 26);
		frmAlexIsaacRegex.getContentPane().add(txtLastName);
		txtLastName.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(283, 32, 92, 20);
		frmAlexIsaacRegex.getContentPane().add(lblLastName);
		
		txtStreet = new JTextField();
		txtStreet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if (txtStreet.getText().matches("[0-9]{2,4}\\s+[a-zA-Z0-9'-]+(\\s*[a-zA-Z0-9]*)*"))
				{
					txtStreet.transferFocus();
				}
				else
				{
					JOptionPane.showMessageDialog(null, txtStreet.getText() + " is not a valid address!");
					txtStreet.setText("");
				}
			}
		});
		txtStreet.setBounds(15, 130, 469, 26);
		frmAlexIsaacRegex.getContentPane().add(txtStreet);
		txtStreet.setColumns(10);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(15, 106, 69, 20);
		frmAlexIsaacRegex.getContentPane().add(lblAddress);
		
		txtCity = new JTextField();
		txtCity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if (txtCity.getText().matches("[a-zA-Z\\s]+"))
				{
					txtCity.transferFocus();
				}
				else
				{
					JOptionPane.showMessageDialog(null, txtCity.getText() + " is not a valid City!");
					txtCity.setText("");
				}
			}
		});
		txtCity.setBounds(15, 205, 169, 26);
		frmAlexIsaacRegex.getContentPane().add(txtCity);
		txtCity.setColumns(10);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setBounds(15, 180, 69, 20);
		frmAlexIsaacRegex.getContentPane().add(lblCity);
		
		txtState = new JTextField();
		txtState.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(txtState.getText().matches("[A-Z]{2}"))
				{
					txtState.transferFocus();
				}
				else
				{
					JOptionPane.showMessageDialog(null, txtState.getText() + " is not a valid state!");
					txtState.setText("");
				}
			}
		});
		txtState.setBounds(238, 205, 43, 26);
		frmAlexIsaacRegex.getContentPane().add(txtState);
		txtState.setColumns(10);
		
		JLabel lblState = new JLabel("State");
		lblState.setBounds(238, 180, 69, 20);
		frmAlexIsaacRegex.getContentPane().add(lblState);
		
		txtZip = new JTextField();
		txtZip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(txtZip.getText().matches("[0-9]{5}(-[0-9]{4})?"))
				{
					txtZip.transferFocus();
				}
				else
				{
					JOptionPane.showMessageDialog(null, txtZip.getText() + " is not a valid zip code!");
					txtZip.setText("");
				}
			}
		});
		txtZip.setBounds(338, 205, 146, 26);
		frmAlexIsaacRegex.getContentPane().add(txtZip);
		txtZip.setColumns(10);
		
		JLabel lblZip = new JLabel("Zip");
		lblZip.setBounds(338, 180, 69, 20);
		frmAlexIsaacRegex.getContentPane().add(lblZip);
		
		txtCellPhone = new JTextField();
		txtCellPhone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(txtCellPhone.getText().matches("(\\(\\d{3}\\)\\d{3}-\\d{4})|(\\d{3}-\\d{3}-\\d{4})|(\\d{3}\\.\\d{3}\\.\\d{4})|(\\d{3}-\\d{3}-\\d{4})"))
				{
					txtCellPhone.transferFocus();
				}
				else
				{
					JOptionPane.showMessageDialog(null, txtCellPhone.getText() + " is not a valid phone number!");
					txtCellPhone.setText("");
				}
			}
		});
		txtCellPhone.setBounds(15, 282, 169, 26);
		frmAlexIsaacRegex.getContentPane().add(txtCellPhone);
		txtCellPhone.setColumns(10);
		
		JLabel lblCellPhone = new JLabel("Cell Phone");
		lblCellPhone.setBounds(15, 258, 103, 20);
		frmAlexIsaacRegex.getContentPane().add(lblCellPhone);
		
		txtEmail = new JTextField();
		txtEmail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if (txtEmail.getText().matches("([a-zA-Z0-9]+|[a-zA-Z0-9]+\\.[a-zA-Z0-9]+)@[a-zA-Z]+\\.(com|biz|gov|net){1}"))
				{
					JOptionPane.showMessageDialog(null, "All fields are valid!");
				}
				else
				{
					JOptionPane.showMessageDialog(null, txtEmail.getText() + " is not a valid Email");
					txtEmail.setText("");
				}
			}
		});
		txtEmail.setBounds(338, 282, 146, 26);
		frmAlexIsaacRegex.getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(338, 258, 69, 20);
		frmAlexIsaacRegex.getContentPane().add(lblEmail);
	}
}
