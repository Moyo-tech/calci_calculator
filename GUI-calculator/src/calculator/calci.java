package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class calci {

	//Variables being declared 
	private JFrame frame;
	private JTextField textField;
	private JButton btn7;
	private JButton btn4;
	private JButton btn1;
	private JButton btnPercentage;
	private JButton btnClear;
	private JButton btn8;
	private JButton btn5;
	private JButton btn2;
	private JButton btn0;
	private JButton btn00;
	private JButton btn9;
	private JButton btn6;
	private JButton btn3;
	private JButton btnDot;
	private JButton btnPlus;
	private JButton btnSub;
	private JButton btnMul;
	private JButton btnDiv;
	private JButton btnEqual;
	
	double first; //Holds the first number the user enters 
	double second; //Holds the second number the user enters 
	double result; //Holds the result of the first and second number
	String operation; // Holds the operation to be done, so subtraction, addition, multiply or division
	String answer; // Returns the final answer 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calci window = new calci();
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
	public calci() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 283, 372);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setBounds(10, 11, 249, 85);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		//Code for the Backspace button 
		JButton btnBack = new JButton("\uF0E7");
		btnBack.addActionListener(new ActionListener() {
			//Creating an event to make the backspace button work
			public void actionPerformed(ActionEvent e) {
				String backSpace =null;
				//Checking if the code is working 
				if (textField.getText().length()>0) {
					/*  String builder to modify string characters in place
					 * so we can delete the characters.*/
					StringBuilder str =new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace = str.toString();
					textField.setText(backSpace);
					
				}
				
			}
		});
		btnBack.setForeground(Color.BLACK);
		btnBack.setFont(new Font("Wingdings", Font.BOLD, 15));
		btnBack.setBounds(10, 113, 62, 38);
		frame.getContentPane().add(btnBack);
		
		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//CREATING AN EVENT SO THE BUTTON WORKS WHEN CLICKED
				String number =textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setForeground(Color.BLACK);
		btn7.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn7.setBounds(10, 156, 62, 38);
		frame.getContentPane().add(btn7);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		//CREATING AN EVENT SO THE BUTTON WORKS WHEN CLICKED
				String number =textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setForeground(Color.BLACK);
		btn4.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn4.setBounds(10, 198, 62, 38);
		frame.getContentPane().add(btn4);
		
//		BUTTON  1
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				CREATING AN EVENT SO THE BUTTON WORKS WHEN CLICKED
				String number =textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setForeground(Color.BLACK);
		btn1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn1.setBounds(10, 242, 62, 38);
		frame.getContentPane().add(btn1);
		
		//Percentage operator 
		btnPercentage = new JButton("%"); 
		btnPercentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "%";
			}
			
		});
		btnPercentage.setForeground(Color.BLACK);
		btnPercentage.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnPercentage.setBounds(10, 284, 62, 38);
		frame.getContentPane().add(btnPercentage);
		
		//Code for clear 
		btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Creating the event to make the clear button work 
				textField.setText(null); //Would clear the screen of the calculator 
			}
		});
		btnClear.setForeground(Color.BLACK); // Color of the button
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 17)); //Font style, size and weight of the button
		btnClear.setBounds(72, 113, 62, 38);
		frame.getContentPane().add(btnClear);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//CREATING AN EVENT SO THE BUTTON WORKS WHEN CLICKED
				String number =textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setForeground(Color.BLACK);
		btn8.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn8.setBounds(72, 156, 62, 38);
		frame.getContentPane().add(btn8);
		
		//Button 5
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//CREATING AN EVENT SO THE BUTTON WORKS WHEN CLICKED
				String number =textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setForeground(Color.BLACK);
		btn5.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn5.setBounds(72, 198, 62, 38);
		frame.getContentPane().add(btn5);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CREATING AN EVENT SO THE BUTTON WORKS WHEN CLICKED
				String number =textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setForeground(Color.BLACK);
		btn2.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn2.setBounds(72, 242, 62, 38);
		frame.getContentPane().add(btn2);
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//CREATING AN EVENT SO THE BUTTON WORKS WHEN CLICKED
				String number =textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setForeground(Color.BLACK);
		btn0.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn0.setBounds(72, 284, 62, 38);
		frame.getContentPane().add(btn0);
		
		btn00 = new JButton("00\r\n");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//CREATING AN EVENT SO THE BUTTON WORKS WHEN CLICKED
				String number =textField.getText()+btn00.getText();
				textField.setText(number);
			}
			
		});
		btn00.setForeground(Color.BLACK);
		btn00.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn00.setBounds(135, 113, 62, 38);
		frame.getContentPane().add(btn00);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//CREATING AN EVENT SO THE BUTTON WORKS WHEN CLICKED
				String number =textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setForeground(Color.BLACK);
		btn9.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn9.setBounds(135, 156, 62, 38);
		frame.getContentPane().add(btn9);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//CREATING AN EVENT SO THE BUTTON WORKS WHEN CLICKED
				String number =textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setForeground(Color.BLACK);
		btn6.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn6.setBounds(135, 198, 62, 38);
		frame.getContentPane().add(btn6);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//CREATING AN EVENT SO THE BUTTON WORKS WHEN CLICKED
				String number =textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setForeground(Color.BLACK);
		btn3.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn3.setBounds(135, 242, 62, 38);
		frame.getContentPane().add(btn3);
		
		btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//CREATING AN EVENT SO THE BUTTON WORKS WHEN CLICKED
				String number =textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setForeground(Color.BLACK);
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnDot.setBounds(135, 284, 62, 38);
		frame.getContentPane().add(btnDot);
		
		/* CODE FOR THE OPERATIONS */
		
		//Plus operator 
		btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//It takes the first number from the user and clears the texfield
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";		
		
			}
			
		});
		btnPlus.setForeground(Color.BLACK);
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnPlus.setBounds(197, 113, 62, 38);
		frame.getContentPane().add(btnPlus);
		
		//Minus Operator 
		btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		btnSub.setForeground(Color.BLACK);
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnSub.setBounds(197, 156, 62, 38);
		frame.getContentPane().add(btnSub);
		
		//Multiply operator 
		btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		btnMul.setForeground(Color.BLACK);
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnMul.setBounds(197, 198, 62, 38);
		frame.getContentPane().add(btnMul);
		
		//Divide operator 
		btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		btnDiv.setForeground(Color.BLACK);
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnDiv.setBounds(197, 242, 62, 38);
		frame.getContentPane().add(btnDiv);
		
		btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer; 
				second =Double.parseDouble(textField.getText()); //To get the second number 
				
				//Checking which operator was chosen
				if (operation == "+") {
					result = first+second; // adding the first and second number and saving it to result 
					answer = String.format("%.2f",result); //Converting the result
					textField.setText(answer); //To display the answer on the text field T
				}
				
				else if (operation == "-") {
					result = first-second; // subtracting the first and second number and saving it to result 
					answer = String.format("%.2f",result); //Converting the result
					textField.setText(answer); //To display the answer on the text field T
				}
				
				
				else if (operation == "*") {
					result = first*second; // multiplying the first and second number and saving it to result 
					answer = String.format("%.2f",result); //Converting the result
					textField.setText(answer); //To display the answer on the text field T
				}
				
				
				else if (operation == "/") {
					result = first/second; // dividing the first and second number and saving it to result 
					answer = String.format("%.2f",result); //Converting the result
					textField.setText(answer); //To display the answer on the text field T
				}
				
				else if (operation == "%") {
					result = first%second; // finding the percentage of the two numbers and saving it to result 
					answer = String.format("%.2f",result); //Converting the result
					textField.setText(answer); //To display the answer on the text field T
				}
				
				
				
			}
		});
		btnEqual.setForeground(Color.BLACK);
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnEqual.setBounds(197, 284, 62, 38);
		frame.getContentPane().add(btnEqual);
	}
}
