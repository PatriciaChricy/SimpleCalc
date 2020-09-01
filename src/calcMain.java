//package calcDesign;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Window.Type;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class calcMain {

	private JFrame frmCalculator;
	private JTextField calcResult;
	
	String display = "";
	
	double num1;
	double num2;
	double result;
	double total;
	String operation;
	
	boolean resultclicked = true;
	
	/**
	 * Launch the application.
	 */
	public static void main (String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calcMain window = new calcMain();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calcMain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setType(Type.UTILITY);
		frmCalculator.setTitle("Calculator");
		frmCalculator.setResizable(false);
		frmCalculator.setBounds(100, 100, 350, 434);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		frmCalculator.setLocationRelativeTo(null);
				
		calcResult = new JTextField();		
		calcResult.setEditable(false);
		calcResult.setFont(new Font("Tahoma", Font.BOLD, 24));
		calcResult.setHorizontalAlignment(SwingConstants.RIGHT);
		//calcResult.setBorder(null);
		calcResult.setBounds(10, 11, 315, 88);
		frmCalculator.getContentPane().add(calcResult);
		calcResult.setColumns(10);
				
		/*======================= ROW 1 =======================*/
		
		//Button7
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(resultclicked) {
					calcResult.setText(null);
					resultclicked = false;
					
					display = calcResult.getText();
		            calcResult.setText(display + "7");
		            //lblComputation.
				} else {			
					display = calcResult.getText();
		            calcResult.setText(display + "7");
				}
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(10, 110, 55, 61);
		frmCalculator.getContentPane().add(btn7);
		
		//Button8
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(resultclicked) {
					calcResult.setText(null);
					resultclicked = false;
					
					display = calcResult.getText();
		            calcResult.setText(display + "8");
				} else {			
					display = calcResult.getText();
		            calcResult.setText(display + "8");
				}
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(75, 110, 55, 61);
		frmCalculator.getContentPane().add(btn8);
		
		//Button9
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				if(resultclicked) {
					calcResult.setText(null);
					resultclicked = false;
					
					display = calcResult.getText();
		            calcResult.setText(display + "9");
				} else {			
					display = calcResult.getText();
		            calcResult.setText(display + "9");
				}
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(140, 110, 55, 61);
		frmCalculator.getContentPane().add(btn9);
		
		//ButtonDivision
		JButton btnDivision = new JButton("/");
		btnDivision.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {	
				if (calcResult.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Please input value.","Warning",1);
				} else {
					num1 = Double.parseDouble(calcResult.getText());
			        calcResult.setText("");
			        operation = "/";
				}
			}
		});
		btnDivision.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDivision.setBounds(205, 110, 55, 61);
		frmCalculator.getContentPane().add(btnDivision);
		
		//ButtonClear
		JButton btnClear = new JButton("C");
		
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnClear.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
	            calcResult.setText("");
			}
		});
		btnClear.setBounds(270, 110, 55, 61);
		frmCalculator.getContentPane().add(btnClear);
				
		/*======================= ROW 2 =======================*/
		
		//Button4
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				if(resultclicked) {
					calcResult.setText(null);
					resultclicked = false;
					
					display = calcResult.getText();
		            calcResult.setText(display + "4");
				} else {			
					display = calcResult.getText();
		            calcResult.setText(display + "4");
				}
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(10, 179, 55, 61);
		frmCalculator.getContentPane().add(btn4);
		
		//Button5
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				if(resultclicked) {
					calcResult.setText(null);
					resultclicked = false;
					
					display = calcResult.getText();
		            calcResult.setText(display + "5");
				} else {			
					display = calcResult.getText();
		            calcResult.setText(display + "5");
				}
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(75, 179, 55, 61);
		frmCalculator.getContentPane().add(btn5);
		
		//BUtton6
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				if(resultclicked) {
					calcResult.setText(null);
					resultclicked = false;
					
					display = calcResult.getText();
		            calcResult.setText(display + "6");
				} else {			
					display = calcResult.getText();
		            calcResult.setText(display + "6");
				}
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(140, 180, 55, 61);
		frmCalculator.getContentPane().add(btn6);
		
		//ButtonMultiply
		JButton btnMultiply = new JButton("*");
		btnMultiply.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				if (calcResult.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Please input value.","Warning",1);
				} else {
					num1 = Double.parseDouble(calcResult.getText());
			        calcResult.setText("");
			        operation = "*";
				}
			}
		});		
		btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMultiply.setBounds(205, 179, 55, 61);
		frmCalculator.getContentPane().add(btnMultiply);
		
		//ButtonBack
		JButton btnBack = new JButton("\u2190");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 calcResult.setText(calcResult.getText().substring(0, calcResult.getText().length() - 1));
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBack.setBounds(270, 179, 55, 61);
		frmCalculator.getContentPane().add(btnBack);
		
		/*======================= ROW 3 =======================*/
		
		//Button1
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				if(resultclicked) {
					calcResult.setText(null);
					resultclicked = false;
					
					display = calcResult.getText();
		            calcResult.setText(display + "1");
				} else {			
					display = calcResult.getText();
		            calcResult.setText(display + "1");
				}
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(10, 251, 55, 61);
		frmCalculator.getContentPane().add(btn1);
		
		//Button2
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				if(resultclicked) {
					calcResult.setText(null);
					resultclicked = false;
					
					display = calcResult.getText();
		            calcResult.setText(display + "2");
				} else {			
					display = calcResult.getText();
		            calcResult.setText(display + "2");
				}
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(75, 251, 55, 61);
		frmCalculator.getContentPane().add(btn2);
		
		//Button3
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				if(resultclicked) {
					calcResult.setText(null);
					resultclicked = false;
					
					display = calcResult.getText();
		            calcResult.setText(display + "3");
				} else {			
					display = calcResult.getText();
		            calcResult.setText(display + "3");
				}
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(140, 252, 55, 61);
		frmCalculator.getContentPane().add(btn3);

		//ButtonSubtract
		JButton btnSubtract = new JButton("-");
		btnSubtract.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				if (calcResult.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Please input value.","Warning",1);
				} else {
					num1 = Double.parseDouble(calcResult.getText());
			        calcResult.setText("");
			        operation = "-";
				}
			}
		});
		btnSubtract.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSubtract.setBounds(205, 251, 55, 61);
		frmCalculator.getContentPane().add(btnSubtract);
		
		/*======================= ROW 4 =======================*/
		
		//Button0
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				if(resultclicked) {
					calcResult.setText(null);
					resultclicked = false;
					
					display = calcResult.getText();
		            calcResult.setText(display + "0");
				} else {			
					display = calcResult.getText();
		            calcResult.setText(display + "0");
				}
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(10, 323, 120, 61);
		frmCalculator.getContentPane().add(btn0);
		
		//ButtonPeriod
		JButton btnPeriod = new JButton(".");
		btnPeriod.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				display = calcResult.getText();
	            calcResult.setText(display + ".");
			}
		});
		btnPeriod.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPeriod.setBounds(140, 324, 55, 61);
		frmCalculator.getContentPane().add(btnPeriod);
		
		
		//ButtonSum
		JButton btnSum = new JButton("+");
		btnSum.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				if (calcResult.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Please input value.","Warning",1);
				} else {
					num1 = Double.parseDouble(calcResult.getText());
			        calcResult.setText("");
			        operation = "+";
				}
			}
		});
		btnSum.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSum.setBounds(205, 323, 55, 61);
		frmCalculator.getContentPane().add(btnSum);
		
		
		//ButtonTotal
		JButton btnTotal = new JButton("=");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String result;
				num2 = Double.parseDouble(calcResult.getText());
				resultclicked = true;
				
				if (operation == "+")
				{
					total = num1 + num2;
					result = String.format("%.2f", total);
					calcResult.setText(result);
				} else if (operation == "-")
				{
					total = num1 - num2;
					result = String.format("%.2f", total);
					calcResult.setText(result);
				}else if (operation == "*")
				{
					total = num1 * num2;
					result = String.format("%.2f", total);
					calcResult.setText(result);
				}else if (operation == "/")
				{
					total = num1 / num2;
					result = String.format("%.2f", total);
					calcResult.setText(result);
				}
			}
		});
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnTotal.setBounds(270, 251, 55, 133);
		frmCalculator.getContentPane().add(btnTotal);
		
		
	}
}
