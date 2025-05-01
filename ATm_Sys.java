package ATM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;

public class ATm_Sys {

	private JFrame frame;
	private JTextField jlblDisplay;
	private JTextField jtxtEnter;
	private JTextField jtxtnumberofyears;
	private JTextField jtxtEnterloanamount;
	private JTextField jtxtmonthlyPayment;
	private JTextField jtxttotalPayment;
	private JTextField jlblDisplayID;
	private JTextField textField_1;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	
	/*private JButton btnExit;
	private JButton btnReset;
	private JButton btnLoan;
	private JButton btnReceipt;
	
	private JButton jbtnLoan;
	private JButton jbtnWithdrawal;
	private JButton jbtnBalance;
	private JButton jbtnDeposit;*/
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ATm_Sys window = new ATm_Sys();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ATm_Sys() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1060, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(152, 251, 152));
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(143, 22, 183, 180);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblBalance = new JLabel("Balance");
		lblBalance.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblBalance.setBounds(6, 21, 61, 16);
		panel_1.add(lblBalance);
		
		JLabel lblLoan = new JLabel("Loan");
		lblLoan.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblLoan.setBounds(116, 21, 61, 16);
		panel_1.add(lblLoan);
		
		JLabel lblWithdrawal = new JLabel("Withdrawal");
		lblWithdrawal.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblWithdrawal.setBounds(6, 139, 86, 16);
		panel_1.add(lblWithdrawal);
		
		JLabel lblDeposit = new JLabel("Deposit");
		lblDeposit.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblDeposit.setBounds(116, 139, 61, 16);
		panel_1.add(lblDeposit);
		
		jlblDisplay = new JTextField();
		jlblDisplay.setBounds(16, 91, 148, 26);
		panel_1.add(jlblDisplay);
		jlblDisplay.setColumns(10);
		
		jlblDisplayID = new JTextField();
		jlblDisplayID.setColumns(10);
		jlblDisplayID.setBounds(16, 53, 148, 26);
		panel_1.add(jlblDisplayID);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1_1.setBounds(338, 22, 100, 180);
		frame.getContentPane().add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JButton jbtnLoan = new JButton("");
		jbtnLoan.setEnabled(false);
		jbtnLoan.setIcon(new ImageIcon(ATm_Sys.class.getResource("/ATM/Screen Shot 2020-04-28 at 4.23.49 PM.png")));
		jbtnLoan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*btnExit.setEnabled(true);
				btnReset.setEnabled(true);
				btnLoan.setEnabled(true);
				btnReceipt.setEnabled(true);*/
				
			}
		});
		jbtnLoan.setBounds(6, 6, 90, 70);
		panel_1_1.add(jbtnLoan);
		
		JButton jbtnDeposit = new JButton("");
		jbtnDeposit.setEnabled(false);
		jbtnDeposit.setIcon(new ImageIcon(ATm_Sys.class.getResource("/ATM/Screen Shot 2020-04-28 at 4.23.49 PM.png")));
		jbtnDeposit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		jbtnDeposit.setBounds(6, 104, 90, 70);
		panel_1_1.add(jbtnDeposit);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1_2.setBounds(31, 403, 407, 342);
		frame.getContentPane().add(panel_1_2);
		panel_1_2.setLayout(null);
		
		JButton jbtn1 = new JButton("");
		jbtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = jlblDisplay.getText() +"1";
				jlblDisplay.setText(Enternumber);
				
			}
		});
		jbtn1.setIcon(new ImageIcon(ATm_Sys.class.getResource("/ATM/Screen Shot 2020-04-28 at 4.04.06 PM.png")));
		jbtn1.setBounds(6, 23, 90, 70);
		panel_1_2.add(jbtn1);
		
		JButton jbtn2 = new JButton("");
		jbtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = jlblDisplay.getText() +"2";
				jlblDisplay.setText(Enternumber);
			}
		});
		jbtn2.setIcon(new ImageIcon(ATm_Sys.class.getResource("/ATM/Screen Shot 2020-04-28 at 4.04.15 PM.png")));
		jbtn2.setBounds(102, 23, 90, 70);
		panel_1_2.add(jbtn2);
		
		JButton jbtn3 = new JButton("");
		jbtn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = jlblDisplay.getText() +"3";
				jlblDisplay.setText(Enternumber);
			}
		});
		jbtn3.setIcon(new ImageIcon(ATm_Sys.class.getResource("/ATM/Screen Shot 2020-04-28 at 4.04.21 PM.png")));
		jbtn3.setBounds(197, 23, 90, 70);
		panel_1_2.add(jbtn3);
		
		JButton jbtnCancel = new JButton("");
		jbtnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jlblDisplay.setText("");
				jlblDisplayID.setText("");
				textField_1.setText("");
				textField.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				
				
			}
		});
		jbtnCancel.setIcon(new ImageIcon(ATm_Sys.class.getResource("/ATM/Screen Shot 2020-04-28 at 4.05.49 PM.png")));
		jbtnCancel.setBounds(294, 23, 90, 70);
		panel_1_2.add(jbtnCancel);
		
		JButton jbtn4 = new JButton("");
		jbtn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = jlblDisplay.getText() +"4";
				jlblDisplay.setText(Enternumber);
			}
		});
		jbtn4.setIcon(new ImageIcon(ATm_Sys.class.getResource("/ATM/Screen Shot 2020-04-28 at 4.05.12 PM.png")));
		jbtn4.setBounds(6, 105, 90, 70);
		panel_1_2.add(jbtn4);
		
		JButton jbtn5 = new JButton("");
		jbtn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = jlblDisplay.getText() +"5";
				jlblDisplay.setText(Enternumber);
			}
		});
		jbtn5.setIcon(new ImageIcon(ATm_Sys.class.getResource("/ATM/Screen Shot 2020-04-28 at 4.05.18 PM.png")));
		jbtn5.setBounds(102, 105, 90, 70);
		panel_1_2.add(jbtn5);
		
		JButton jbtn6 = new JButton("");
		jbtn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = jlblDisplay.getText() +"6";
				jlblDisplay.setText(Enternumber);
			}
		});
		jbtn6.setIcon(new ImageIcon(ATm_Sys.class.getResource("/ATM/Screen Shot 2020-04-28 at 4.05.24 PM.png")));
		jbtn6.setBounds(197, 105, 90, 70);
		panel_1_2.add(jbtn6);
		
		JButton jbtnClear = new JButton("");
		jbtnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jlblDisplay.setText("");
				jlblDisplayID.setText("");
				textField_1.setText("");
				textField.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				
			}
		});
		jbtnClear.setIcon(new ImageIcon(ATm_Sys.class.getResource("/ATM/Screen Shot 2020-04-28 at 4.05.54 PM.png")));
		jbtnClear.setBounds(294, 105, 90, 70);
		panel_1_2.add(jbtnClear);
		
		JButton jbtn7 = new JButton("");
		jbtn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = jlblDisplay.getText() +"7";
				jlblDisplay.setText(Enternumber);
			}
		});
		jbtn7.setIcon(new ImageIcon(ATm_Sys.class.getResource("/ATM/Screen Shot 2020-04-28 at 4.05.30 PM.png")));
		jbtn7.setBounds(6, 187, 90, 70);
		panel_1_2.add(jbtn7);
		
		JButton jbtn8 = new JButton("");
		jbtn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = jlblDisplay.getText() +"8";
				jlblDisplay.setText(Enternumber);
			}
		});
		jbtn8.setIcon(new ImageIcon(ATm_Sys.class.getResource("/ATM/Screen Shot 2020-04-28 at 4.05.35 PM.png")));
		jbtn8.setBounds(102, 187, 90, 70);
		panel_1_2.add(jbtn8);
		
		JButton jbtn9 = new JButton("");
		jbtn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = jlblDisplay.getText() +"9";
				jlblDisplay.setText(Enternumber);
			}
		});
		jbtn9.setIcon(new ImageIcon(ATm_Sys.class.getResource("/ATM/Screen Shot 2020-04-28 at 4.05.40 PM.png")));
		jbtn9.setBounds(197, 187, 90, 70);
		panel_1_2.add(jbtn9);
		
		JButton jbtnEnter = new JButton("");
		jbtnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int pin1 =Integer.parseInt(jlblDisplay.getText());
				int id1 = Integer.parseInt(jlblDisplayID.getText());
				 
				if((pin1 == 1234 && id1==100) ||(pin1 == 3216 && id1==101)||(pin1 == 1349 && id1==102))
				{
					//jbtnLoan_1.setEnabled(true);
					//btnEnter_2.setEnabled(true);
					
					lblBalance.setVisible(true);
					lblLoan.setVisible(true);
					lblWithdrawal.setVisible(true);
					lblDeposit.setVisible(true);
					jlblDisplay.setText("Enter QRCode");
					jlblDisplayID.setText("");
					
				}
				else
				{
					jlblDisplay.setText("Invalid");
					jlblDisplayID.setText("");
				}
				
			}
		});
		jbtnEnter.setIcon(new ImageIcon(ATm_Sys.class.getResource("/ATM/Screen Shot 2020-04-28 at 4.06.00 PM.png")));
		jbtnEnter.setBounds(294, 187, 90, 70);
		panel_1_2.add(jbtnEnter);
		
		JButton btnNewButton_12 = new JButton("");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_12.setBounds(6, 274, 90, 70);
		panel_1_2.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = jlblDisplay.getText() +"0";
				jlblDisplay.setText(Enternumber);
			}
		});
		btnNewButton_13.setIcon(new ImageIcon(ATm_Sys.class.getResource("/ATM/Screen Shot 2020-04-28 at 4.05.44 PM.png")));
		btnNewButton_13.setBounds(102, 269, 90, 70);
		panel_1_2.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("");
		btnNewButton_14.setBounds(197, 269, 90, 70);
		panel_1_2.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("");
		btnNewButton_15.setBounds(294, 269, 90, 70);
		panel_1_2.add(btnNewButton_15);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(450, 35, 592, 630);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblInterestRate = new JLabel("Interest Rate");
		lblInterestRate.setBounds(44, 56, 102, 28);
		panel_2.add(lblInterestRate);
		
		JLabel lblNumberOfYears = new JLabel("Number of years");
		lblNumberOfYears.setBounds(44, 129, 113, 28);
		panel_2.add(lblNumberOfYears);
		
		JLabel lblAmountOfLoan = new JLabel("Amount of loan");
		lblAmountOfLoan.setBounds(44, 205, 124, 28);
		panel_2.add(lblAmountOfLoan);
		
		JLabel lblMonthlyPayment = new JLabel("Monthly payment");
		lblMonthlyPayment.setBounds(44, 281, 124, 28);
		panel_2.add(lblMonthlyPayment);
		
		jtxtEnter = new JTextField();
		jtxtEnter.setBounds(169, 57, 102, 26);
		panel_2.add(jtxtEnter);
		jtxtEnter.setColumns(10);
		
		jtxtnumberofyears = new JTextField();
		jtxtnumberofyears.setColumns(10);
		jtxtnumberofyears.setBounds(169, 130, 102, 26);
		panel_2.add(jtxtnumberofyears);
		
		jtxtEnterloanamount = new JTextField();
		jtxtEnterloanamount.setColumns(10);
		jtxtEnterloanamount.setBounds(169, 206, 102, 26);
		panel_2.add(jtxtEnterloanamount);
		
		jtxtmonthlyPayment = new JTextField();
		jtxtmonthlyPayment.setColumns(10);
		jtxtmonthlyPayment.setBounds(169, 282, 100, 26);
		panel_2.add(jtxtmonthlyPayment);
		
		JLabel lblTotalPayment = new JLabel("Total payment");
		lblTotalPayment.setBounds(44, 351, 102, 28);
		panel_2.add(lblTotalPayment);
		
		jtxttotalPayment = new JTextField();
		jtxttotalPayment.setColumns(10);
		jtxttotalPayment.setBounds(169, 352, 102, 26);
		panel_2.add(jtxttotalPayment);
		
		JTextArea jtxtReceipt = new JTextArea();
		jtxtReceipt.setBounds(283, 56, 303, 319);
		panel_2.add(jtxtReceipt);
		
		JButton btnLoan = new JButton("Loan");
		btnLoan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double annualInterestRate = Double.parseDouble(jtxtEnter.getText());
				double monthlyInterestRate = annualInterestRate/1200 ;
				int numberOfYears= Integer.parseInt(jtxtnumberofyears.getText());
				int loanAmount= Integer.parseInt(jtxtEnterloanamount.getText());
				
				double monthlyPayment= loanAmount * monthlyInterestRate/(1 -1 /Math.pow(1 +
						monthlyInterestRate,
						numberOfYears *12));
				String imonthlyPayment;
				imonthlyPayment = Double.toString(monthlyPayment);
				imonthlyPayment = String.format("Rs%.2f",monthlyPayment);
				jtxtmonthlyPayment.setText(imonthlyPayment);
				double totalPayment = monthlyPayment * numberOfYears *12;
				String itotalPayment;
				itotalPayment = String.format("Rs%.2f",totalPayment);
				jtxttotalPayment.setText(itotalPayment);
				

				
			}
		});
		btnLoan.setBounds(20, 407, 113, 70);
		panel_2.add(btnLoan);
		
		JButton btnReceipt = new JButton("Receipt");
		btnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String annualInterestRate = String.format(jtxtEnter.getText());
				String numberOfYears = String.format(jtxtnumberofyears.getText());
				String loanAmount = String.format(jtxtEnterloanamount.getText());
				String monthlyPayment = String.format(jtxtmonthlyPayment.getText());
				String totalPayment = String.format(jtxttotalPayment.getText());
				
				//===================================================
				 int refs = 1325 +(int)(Math.random()*4238);
				 //==================================================
				 Calendar timer = Calendar.getInstance();
				 timer.getTime();
				 SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
				 tTime.format(timer.getTime());
				 SimpleDateFormat Tdate = new SimpleDateFormat("dd-MMM-yyyy");
				 Tdate.format(timer.getTime());
				 
				 //====================================================
				 jtxtReceipt.append("ATM System\n"+
				    "Reference: "+ refs+
				    "\n==================================\t"+
				    "\n Interest rate:\t"+ annualInterestRate +
				    "\n Repayment years:\t"+  numberOfYears +
				    "\n Amount of loan:\t"+ " Rs"+ loanAmount +
				    "\n Monthly Paymnt:\t"+ monthlyPayment +
				    "\n Amount of loan:\t"+ " Rs"+ loanAmount +
				    "\n Total Payment:\t"+ totalPayment +
				    "\n===================================\t" +
				    "\nDate: " + Tdate.format(timer.getTime()) +
				    "\nTime: " + tTime.format(timer.getTime()) +
				    "\n\nThank you\n");
				 
				
			}
		});
		btnReceipt.setBounds(145, 407, 113, 70);
		panel_2.add(btnReceipt);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtxtEnter.setText(null);
				jtxtnumberofyears.setText(null);
				jtxtEnterloanamount.setText(null);
				jtxtmonthlyPayment.setText(null);
				jtxttotalPayment.setText(null);
				jtxtReceipt.setText(null);
   
			}
		});
		btnReset.setBounds(283, 407, 113, 70);
		panel_2.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit",
						"ATM Systems",
						JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
				{
					System.exit(0);
				}
				
			}
		});
		btnExit.setBounds(409, 407, 113, 70);
		panel_2.add(btnExit);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1_1_1.setBounds(31, 22, 100, 180);
		frame.getContentPane().add(panel_1_1_1);
		
		JButton jbtnBalance = new JButton("");
		jbtnBalance.setEnabled(false);
		jbtnBalance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtxtReceipt.append("Your Balance is"+10000); 
			}
		});
		jbtnBalance.setIcon(new ImageIcon(ATm_Sys.class.getResource("/ATM/Screen Shot 2020-04-28 at 4.18.02 PM.png")));
		jbtnBalance.setBounds(6, 6, 90, 70);
		panel_1_1_1.add(jbtnBalance);
		
		JButton jbtnWithdrawal = new JButton("");
		jbtnWithdrawal.setEnabled(false);
		jbtnWithdrawal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtxtReceipt.append("Welcome \n Enter the amount you wish to withdraw\n in the left corner text box."); 
				
			}
		});
		jbtnWithdrawal.setIcon(new ImageIcon(ATm_Sys.class.getResource("/ATM/Screen Shot 2020-04-28 at 4.18.02 PM.png")));
		jbtnWithdrawal.setBounds(6, 104, 90, 70);
		panel_1_1_1.add(jbtnWithdrawal);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBounds(31, 268, 407, 55);
		frame.getContentPane().add(panel_3);
		
		JLabel lblWithdrawal_1 = new JLabel("Withdrawal");
		lblWithdrawal_1.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		panel_3.add(lblWithdrawal_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		panel_3.add(textField_1);
		
		JButton btnEnter = new JButton("ENTER");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int wt =Integer.parseInt(textField_1.getText());
				//jtxtReceipt.append("kk"+wt);
				
				
				int balance=10000,twt=0,j=0;
				if(wt>balance)
		         {
					jtxtReceipt.append("\nYour withdrawal money is greater\n than your balance" );
		          
		         }
				else
				{
					if(wt>=2000)
			           {
			             while(wt>=2000)
			             {
			               wt=wt-2000;
			               j++;
			             }
			             jtxtReceipt.append("\n The no of 2000 notes you get is "+j);
			             twt = twt +(j*2000);
			             j=0;
			           }
					if(wt>=500)
		            {
		              while(wt>=500)
		              {
		               wt=wt-500;
		               j++;
		              }
		              jtxtReceipt.append("\n The no of 500 notes you get is "+j);
		              twt = twt +(j*500);
		              j=0;
		            }
					if(wt>=200)
		            {
		              while(wt>=200)
		              {
		               wt=wt-200;
		               j++;
		              }
		              jtxtReceipt.append("\n The no of 200 notes you get is "+j);
		              twt = twt +(j*200);
		              j=0;
		            }
					if(wt>=100)
		            {
		              while(wt>=100)
		              {
		               wt=wt-100;
		               j++;
		              }
		              jtxtReceipt.append("\n The no of 100 notes you get is "+j);
		              twt = twt +(j*100);
		              j=0;
		            }
					if(wt !=0)
		            {
						jtxtReceipt.append("\n The System cannot fulfill the balance of"+wt);
		            }
					jtxtReceipt.append("\n The money you withdrawl is"+twt);
		             balance= balance- twt;
		             jtxtReceipt.append("\n The current balance is "+balance);
				}
			}
		});
		panel_3.add(btnEnter);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3_1.setBounds(31, 326, 407, 74);
		frame.getContentPane().add(panel_3_1);
		
		JLabel lblDeposit_1 = new JLabel("Deposit");
		lblDeposit_1.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		panel_3_1.add(lblDeposit_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		panel_3_1.add(textField);
		
		JButton btnEnter_1 = new JButton("ENTER");
		btnEnter_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int balance=10000;
				jtxtReceipt.append("Welcome");
				int dt =Integer.parseInt(textField.getText());
				jtxtReceipt.append("\nTo add your money please select\n the note which you want to deposit");
				jtxtReceipt.append("\n2000 \n500 \n100");
				int n =Integer.parseInt(textField_2.getText());
				jtxtReceipt.append("\nEnter the number of notes\n you wish to deposit");
				int no =Integer.parseInt(textField_3.getText());
				jtxtReceipt.append("\nYour money has been deposited");

	             balance= balance + (n*no);
	             jtxtReceipt.append("\n Your new balance is"+balance);
			}
		});
		panel_3_1.add(btnEnter_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		panel_3_1.add(textField_2);
		
		JLabel lblDeposit_1_1 = new JLabel("NOTES");
		lblDeposit_1_1.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		panel_3_1.add(lblDeposit_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		panel_3_1.add(textField_3);
		
		JLabel lblDeposit_1_1_1 = new JLabel("NUMBER");
		lblDeposit_1_1_1.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		panel_3_1.add(lblDeposit_1_1_1);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3_2.setBounds(31, 201, 407, 55);
		frame.getContentPane().add(panel_3_2);
		
		JLabel lblWithdrawal_1_1 = new JLabel("QRcode");
		lblWithdrawal_1_1.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		panel_3_2.add(lblWithdrawal_1_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		panel_3_2.add(textField_4);
		
		JButton btnEnter_2 = new JButton("ENTER");
		btnEnter_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Qr =Integer.parseInt(textField_4.getText());
				if(Qr==7368 || Qr==1734)
				{
				jbtnLoan.setEnabled(true);
				jbtnWithdrawal.setEnabled(true);
				jbtnDeposit.setEnabled(true);
				jbtnBalance.setEnabled(true);
				}
				else
				{
					textField_4.setText("Invalid");
				}
				
			}
		});
		panel_3_2.add(btnEnter_2);
	}
}
